package com.cars.halamotor.view.activity.selectAddress;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.cars.halamotor.R;
import com.cars.halamotor.view.activity.selectAddress.expandableList.RecyclerAdapter;
import com.cars.halamotor.model.Neighborhood;
import com.cars.halamotor.view.activity.selectAddress.expandableList.SubFavoriteType;
import java.util.ArrayList;

import static com.cars.halamotor.functions.FillNeighborhood.fillNeighborhoodArrayL;
import static com.cars.halamotor.functions.Functions.changeFontBold;

public class SelectCityAndNeighborhood extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<SubFavoriteType> fatherSubListArrayList;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_city_and_neighborhood);

        statusBarColor();
        actionBarTitle();
        inti();
        setData();
        createExpandableList();
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
                fillNeighborhoodArrayL(neighborhoodArrayList,this,"dubai")));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.abu_dhabi),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,"abu_dhabi")));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.sharjah),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,"dubai")));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.al_ain),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,"dubai")));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.ajman),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,"dubai")));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.ras_al_khaimah),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,"dubai")));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.um_al_quwain),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,"dubai")));
        fatherSubListArrayList.add(new SubFavoriteType(getResources().getString(R.string.fujairah),
                fillNeighborhoodArrayL(neighborhoodArrayList,this,"dubai")));
    }

    private void inti() {
        recyclerView = (RecyclerView) findViewById(R.id.select_city_rv);
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

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
