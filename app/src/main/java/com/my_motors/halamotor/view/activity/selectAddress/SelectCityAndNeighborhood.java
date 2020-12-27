package com.my_motors.halamotor.view.activity.selectAddress;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;
import com.my_motors.halamotor.model.CityWithNeighborhood;
import com.my_motors.halamotor.view.activity.selectAddress.expandableList.RecyclerAdapter;
import com.my_motors.halamotor.model.Neighborhood;
import com.my_motors.halamotor.view.activity.selectAddress.expandableList.SubFavoriteType;
import com.my_motors.halamotor.view.adapters.AdapterCityWithNeighborhood;

import java.util.ArrayList;

import static com.my_motors.halamotor.functions.FillNeighborhood.fillCityAndNeighborhoodArrayL;
import static com.my_motors.halamotor.functions.FillNeighborhood.fillNeighborhoodArrayL;
import static com.my_motors.halamotor.functions.Functions.changeFontBold;

public class SelectCityAndNeighborhood extends AppCompatActivity {

    private RecyclerView recyclerView,recyclerViewAllCity;
    CardView cardViewAllCityCont,cardViewExpandableList;
    private ArrayList<SubFavoriteType> fatherSubListArrayList;
    private ArrayList<CityWithNeighborhood> cityWithNeighborhoodsArrayList;
    private RecyclerAdapter adapter;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;
    AdapterCityWithNeighborhood adapterCityWithNeighborhood;
    String whereComeFrom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city_and_neighborhood);

        getStringFromIntent();
        statusBarColor();
        actionBarTitle();
        inti();

    }

    @Override
    protected void onStart() {
        super.onStart();
        setData();
        if(whereComeFrom.equals("activity")){
            makeAllCityWithNeighborhoodVISIBLE();
            createAllCityWithNeighborhoodRV();
        }else{
            createExpandableList();
            createAllCityWithNeighborhoodRV();
        }
        actionListenerToSearchEdt();
        actionListenerToRemoveTextInSearchEdt();
        changeFont();
    }

    private void getStringFromIntent() {
        Bundle bundle = getIntent().getExtras();
        whereComeFrom =bundle.getString("whereComeFrom");
    }

    private void createAllCityWithNeighborhoodRV() {
        cityWithNeighborhoodsArrayList = fillCityAndNeighborhoodArrayL(cityWithNeighborhoodsArrayList,this);
        recyclerViewAllCity.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerViewAllCity.setLayoutManager(mLayoutManager);
        adapterCityWithNeighborhood = new AdapterCityWithNeighborhood(this,cityWithNeighborhoodsArrayList,whereComeFrom);
        recyclerViewAllCity.setAdapter(adapterCityWithNeighborhood);
    }

    private void changeFont() {
        searchEdt.setTypeface(Functions.changeFontGeneral(this));
    }

    private void actionListenerToSearchEdt() {
        searchEdt.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                if (cs.length() != 0) {
                    makeCancelTitleIVVISIBLE();
                    makeAllCityWithNeighborhoodVISIBLE();
                    makeExpandableListGONE();
                }
                else {
                    if (!whereComeFrom.equals("activity"))
                    {
                        makeCancelTitleIVGONE();
                        makeAllCityWithNeighborhoodGONE();
                        makeExpandableListVISIBLE();
                    }
                }
            }

            @Override
            public void beforeTextChanged(CharSequence s, int arg1, int arg2, int arg3) {

            }

            @Override
            public void afterTextChanged(Editable editable) { filter(editable.toString()); }

        });
    }

    private void filter(String text) {
        ArrayList<CityWithNeighborhood> cityWithNeighborhoodsArrayL2  = new ArrayList<CityWithNeighborhood>();
        for (CityWithNeighborhood cityWithNeighborhood : cityWithNeighborhoodsArrayList) {
            if (cityWithNeighborhood.getNeighborhoodStr().toLowerCase().contains(text.toLowerCase())) {
                //adding the element to filtered list
                cityWithNeighborhoodsArrayL2.add(cityWithNeighborhood);
            }
        }
        //calling a method of the adapter class and passing the filtered list
        adapterCityWithNeighborhood.filterList(cityWithNeighborhoodsArrayL2);
    }

    private void actionListenerToRemoveTextInSearchEdt() {
        cancelRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchEdt.setText("");
            }
        });
    }

    private void createExpandableList() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);

        adapter = new RecyclerAdapter(this, fatherSubListArrayList);
        recyclerView.setAdapter(adapter);
    }

    private void setData() {
        fatherSubListArrayList = new ArrayList<>();

        ArrayList<Neighborhood> neighborhoodArrayList = new ArrayList<>();

        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.dubai),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,getResources().getString(R.string.dubai))));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.abu_dhabi),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,getResources().getString(R.string.abu_dhabi))));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.sharjah),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,getResources().getString(R.string.sharjah))));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.al_ain),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,getResources().getString(R.string.al_ain))));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.ajman),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,getResources().getString(R.string.ajman))));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.ras_al_khaimah),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,getResources().getString(R.string.ras_al_khaimah))));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.um_al_quwain),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,getResources().getString(R.string.um_al_quwain))));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.fujairah),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,getResources().getString(R.string.fujairah))));
    }

    private void inti() {
        recyclerView = (RecyclerView) findViewById(R.id.select_city_rv);
        recyclerViewAllCity = (RecyclerView) findViewById(R.id.select_city_rv_all_city);
        cardViewExpandableList = (CardView) findViewById(R.id.select_city_rv_expandable_cont_CV);
        cardViewAllCityCont = (CardView) findViewById(R.id.select_city_rv_all_city_cont_CV);
        searchEdt = (EditText) findViewById(R.id.select_city_searchEdt);
        cancelRL = (RelativeLayout) findViewById(R.id.select_city_cancel_RL);
        cancelIV = (ImageView) findViewById(R.id.select_city_ImageV);
    }

    private void actionBarTitle() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ActionBar abar = getSupportActionBar();
        View viewActionBar = getLayoutInflater().inflate(R.layout.actionbar_custom_title_view_centered, null);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(//Center the textview in the ActionBar !
                ActionBar.LayoutParams.WRAP_CONTENT,
                ActionBar.LayoutParams.MATCH_PARENT,
                Gravity.CENTER);
        TextView textviewTitle = (TextView) viewActionBar.findViewById(R.id.actionbar_textview);
        textviewTitle.setText(getResources().getString(R.string.detect_address));
        textviewTitle.setTypeface(changeFontBold(this));
        abar.setCustomView(viewActionBar, params);
        abar.setDisplayShowCustomEnabled(true);
        abar.setDisplayShowTitleEnabled(false);
        abar.setDisplayHomeAsUpEnabled(true);
        abar.setHomeButtonEnabled(true);
    }

    private void statusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(ContextCompat.getColor(this, R.color.colorRed));
        }
    }

    private void makeExpandableListVISIBLE() {
        cardViewExpandableList.setVisibility(View.VISIBLE);
    }

    private void makeExpandableListGONE() {
        cardViewExpandableList.setVisibility(View.GONE);
    }

    private void makeAllCityWithNeighborhoodGONE() {
        cardViewAllCityCont.setVisibility(View.GONE);
    }

    private void makeAllCityWithNeighborhoodVISIBLE() {
        cardViewAllCityCont.setVisibility(View.VISIBLE);
    }

    private void makeCancelTitleIVGONE() {
        cancelIV.setVisibility(View.GONE);
    }

    private void makeCancelTitleIVVISIBLE() {
        cancelIV.setVisibility(View.VISIBLE);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
