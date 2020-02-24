package com.cars.halamotor.view.activity;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
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

import com.cars.halamotor.R;
import com.cars.halamotor.view.adapters.AdapterWheelsInches;
import com.cars.halamotor.view.adapters.adapterInCarDetails.AdapterCarFuel;

import java.util.ArrayList;

import static com.cars.halamotor.functions.Functions.changeFontBold;
import static com.cars.halamotor.functions.Functions.fillWheelsInchesArrayL;

public class WheelsRim extends AppCompatActivity {

    public ArrayList<String> wheelsInchesArrayL  = new ArrayList<String>();
    RecyclerView recyclerView;
    AdapterWheelsInches adapterWheelsInches;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wheels_rim);

        statusBarColor();
        actionBarTitle();
        inti();
        actionListenerToSearchEdt();
        createRV();
    }

    private void createRV() {
        wheelsInchesArrayL =fillWheelsInchesArrayL(wheelsInchesArrayL,this);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterWheelsInches = new AdapterWheelsInches(this, wheelsInchesArrayL);
        recyclerView.setAdapter(adapterWheelsInches);
    }


    private void actionListenerToSearchEdt() {
        searchEdt.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                if (cs.length() != 0)
                    makeCancelTitleIVVISIBLE();
                else
                    makeCancelTitleIVGONE();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int arg1, int arg2, int arg3) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }

        });
    }

    private void filter(String text) {
        ArrayList<String> carKilometersArrayList2  = new ArrayList<String>();
        for (String Kilometers : wheelsInchesArrayL) {
            if (Kilometers.toLowerCase().contains(text.toLowerCase())) {
                carKilometersArrayList2.add(Kilometers);
            }
        }
        adapterWheelsInches.filterList(carKilometersArrayList2);
    }

    private void makeCancelTitleIVGONE() {
        cancelIV.setVisibility(View.GONE);
    }

    private void makeCancelTitleIVVISIBLE() {
        cancelIV.setVisibility(View.VISIBLE);
    }

    private void actionListenerToRemoveTextInSearchEdt() {
        cancelRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchEdt.setText("");
            }
        });
    }

    private void inti() {
        recyclerView = (RecyclerView) findViewById(R.id.activity_wheels_rim_RV);
        searchEdt = (EditText) findViewById(R.id.activity_wheels_rim_searchEdt);
        cancelRL = (RelativeLayout) findViewById(R.id.fragment_wheels_rim_RL);
        cancelIV = (ImageView) findViewById(R.id.activity_wheels_rim_ImageV);
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
        textviewTitle.setText(getResources().getString(R.string.detect_wheels_siz));
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
