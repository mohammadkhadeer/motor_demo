package com.cars.halamotor.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
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
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.FavouriteCallSearch;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.presnter.FCSItems;
import com.cars.halamotor.view.adapters.adapterShowFCS.AdapterFCSItems;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static com.cars.halamotor.dataBase.ReadFunction.getFavouriteCallSearch;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getFCSItems;
import static com.cars.halamotor.functions.NewFunction.actionBarTitleInFCS;
import static com.cars.halamotor.functions.NewFunction.handelNumberOfObject;

public class ShowFCS extends AppCompatActivity implements FCSItems {

    String fcsTypeStr;
    ArrayList<FavouriteCallSearch> favouriteCallSearchesArrayList;
    ArrayList<SuggestedItem> suggestedItemsArrayList;
    TextView messageTV;
    ProgressBar progressBar;
    static int numberOfObjectNow = 0;
    FCSItems fcsItems;

    RecyclerView fcsItemsRecyclerView;
    RecyclerView.LayoutManager layoutManagerFCSItems;
    AdapterFCSItems adapterFCSItems;
    
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
        numberOfObjectNow =handelNumberOfObject(numberOfObjectNow,favouriteCallSearchesArrayList.size());
        checkIfHaveFavOrNot();
        // create object from fcsItem interFace
        fcsItems = (FCSItems) this;
        getFCSItems(favouriteCallSearchesArrayList,fcsItems,numberOfObjectNow,numberOfObjectNow);
    }

    private void checkIfHaveFavOrNot() {
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
//        Bundle bundle = getIntent().getExtras();
//        fcsTypeStr =bundle.getString("fcsTypeStr");
        fcsTypeStr = "favorite";
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

    @Override
    public void getItemsObject(List<SuggestedItem> items) {
        suggestedItemsArrayList = new ArrayList<>();
        suggestedItemsArrayList = new ArrayList<SuggestedItem>(items);

        progressBar.setVisibility(View.GONE);
        fcsItemsRecyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        fcsItemsRecyclerView.setLayoutManager(mLayoutManager);
        adapterFCSItems = new AdapterFCSItems(this, suggestedItemsArrayList);
        fcsItemsRecyclerView.setAdapter(adapterFCSItems);
    }

}
