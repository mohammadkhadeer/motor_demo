package com.cars.halamotor.view.activity;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.FCSFunctions;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.FavouriteCallSearch;
import com.cars.halamotor.model.Paging;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.presnter.FCSItems;
import com.cars.halamotor.view.adapters.adapterShowFCS.AdapterShowFCSItems;
import com.cars.halamotor.view.adapters.adapterShowFCS.PaginationListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.cars.halamotor.dataBase.ReadFunction.getFavouriteCallSearch;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getFCSItems;
import static com.cars.halamotor.functions.FCSFunctions.convertCat;
import static com.cars.halamotor.functions.NewFunction.actionBarTitleInFCS;
import static com.cars.halamotor.functions.NewFunction.getNumberOfObject;
import static com.cars.halamotor.functions.NewFunction.handelNumberOfObject;
import static com.cars.halamotor.functions.NewFunction.nowNumberOfObject;
import static com.cars.halamotor.view.adapters.adapterShowFCS.PaginationListener.PAGE_START;

public class ShowFCS extends AppCompatActivity {
    String fcsTypeStr;
    ArrayList<FavouriteCallSearch> favouriteCallSearchesArrayList;
    ArrayList<FavouriteCallSearch> favouriteCallSearchesArrayListNew;
    public List<SuggestedItem> suggestedItemsArrayListTest;
    public List<SuggestedItem> suggestedItemsArrayListDO;
    TextView messageTV;
    ProgressBar progressBar;
     int numberOfObjectNow = 0;
     int numberOfObjectReturn = 0;
    FCSItems fcsItems;
    private int currentPage = PAGE_START;
    RecyclerView fcsItemsRecyclerView;
    private boolean isLastPage = false;
    private boolean isLoading = false;
    LinearLayoutManager layoutManager;
    AdapterShowFCSItems adapterShowFCSItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_fcs);

        statusBarColor();
        init();
        changeFont();
        getInfoFromIntent();
        actionBarTitle();
        favouriteCallSearchesArrayList = new ArrayList<FavouriteCallSearch>();
        favouriteCallSearchesArrayList = getFavouriteCallSearch(getApplicationContext(),fcsTypeStr);
//        numberOfObjectNow =handelNumberOfObject(numberOfObjectNow,favouriteCallSearchesArrayList.size());
        checkIfHaveFavOrNot();

        createRV();
        getData();
        doApiCall();
        actionListenerToRV();
    }

    private void actionListenerToRV() {
        fcsItemsRecyclerView.addOnScrollListener(new PaginationListener(layoutManager) {
            @Override
            protected void loadMoreItems() {
                isLoading = true;
                numberOfObjectNow =handelNumberOfObject(numberOfObjectNow,favouriteCallSearchesArrayList.size());
                currentPage++;
                getData();
                doApiCall();
            }

            @Override
            public boolean isLastPage() {
                return isLastPage;
            }

            @Override
            public boolean isLoading() {
                return isLoading;
            }
        });
    }

    private void checkIfHaveFavOrNot() {
        if (favouriteCallSearchesArrayList.size()==0)
        messageTV.setText(getResources().getString(R.string.no_favorite));
    }

    private void changeFont() {
        if (numberOfObjectNow == 0)
            messageTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
    }

    private void init() {
        messageTV = (TextView) findViewById(R.id.show_fcs_messageTV);
        fcsItemsRecyclerView = (RecyclerView) findViewById(R.id.show_fcs_RV);
        progressBar = (ProgressBar) findViewById(R.id.show_fcs_progress);
    }

    private void getInfoFromIntent() {
        Bundle bundle = getIntent().getExtras();
        fcsTypeStr =bundle.getString("fcsTypeStr");
    }

    private void statusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorRed));
        }
    }

    private void actionBarTitle() {
        Typeface typeface;
        final ActionBar abar = getSupportActionBar();
        View viewActionBar = getLayoutInflater().inflate(R.layout.actionbar_custom_title_view_centered, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(//Center the textview in the ActionBar !
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        if (Locale.getDefault().getLanguage().equals("ar")) {
            typeface = Typeface.createFromAsset(getAssets(), "GE_DINAR_ONE_LIGHT.TTF");
        }else{
            typeface = Typeface.createFromAsset(getAssets(), "NTAILU.TTF");
        }
        TextView textviewTitle = (TextView) viewActionBar.findViewById(R.id.actionbar_textview);
        textviewTitle.setText(actionBarTitleInFCS(getApplicationContext(),fcsTypeStr));
        textviewTitle.setTypeface(typeface);
        abar.setCustomView(viewActionBar, params);
        abar.setDisplayShowCustomEnabled(true);
        abar.setDisplayShowTitleEnabled(false);
        abar.setDisplayHomeAsUpEnabled(false);
        abar.setHomeButtonEnabled(false);
    }

    private void createRV() {
        fcsItemsRecyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        fcsItemsRecyclerView.setLayoutManager(layoutManager);
        adapterShowFCSItems = new AdapterShowFCSItems(new ArrayList<SuggestedItem>(),this,fcsTypeStr);
        fcsItemsRecyclerView.setAdapter(adapterShowFCSItems);
    }

    private void doApiCall() {
        suggestedItemsArrayListDO = new ArrayList<>();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
                suggestedItemsArrayListDO.addAll(suggestedItemsArrayListTest);
                if (currentPage != PAGE_START) adapterShowFCSItems.removeLoading();
                adapterShowFCSItems.addItems(suggestedItemsArrayListDO);
                if (numberOfObjectNow != favouriteCallSearchesArrayList.size()) {
                    adapterShowFCSItems.addLoading();
                } else {
                    isLastPage = true;
                }
                isLoading = false;
            }
        }, 3100);
    }

    private void getData() {
        final List<SuggestedItem> fcsItemsArrayList = new ArrayList<>();
        suggestedItemsArrayListTest = new ArrayList<>();
        favouriteCallSearchesArrayListNew = new ArrayList<>();
        int numberOfObject = nowNumberOfObject(numberOfObjectNow,favouriteCallSearchesArrayList.size());
        favouriteCallSearchesArrayListNew = getCategoryList(numberOfObject);
        if (numberOfObject!=1000)
        {
            for (int i =0;i<numberOfObject;i++)
            {
                final String category = convertCat(favouriteCallSearchesArrayListNew.get(i).getItemType());
                final String categoryBefore = favouriteCallSearchesArrayListNew.get(i).getItemType();
                Query mRef = null;
                mRef = FirebaseDatabase.getInstance().getReference().child("category")
                        .child(category)
                        .child(favouriteCallSearchesArrayListNew.get(i).getIdInDatabase());
                mRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        fcsItemsArrayList.add(FCSFunctions.handelNumberOfObject(dataSnapshot,categoryBefore));
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }
                });
            }
        }

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                suggestedItemsArrayListTest.addAll(fcsItemsArrayList);
            }
        }, 3000);
    }

    private ArrayList<FavouriteCallSearch> getCategoryList(int condition) {
        ArrayList<FavouriteCallSearch> newCat = new ArrayList<>();
        for (int j=0;j<condition;j++)
        {
            if (numberOfObjectReturn < favouriteCallSearchesArrayList.size())
            {
                newCat.add(favouriteCallSearchesArrayList.get(numberOfObjectReturn));
                numberOfObjectReturn++;
            }
        }
        return newCat;
    }
}