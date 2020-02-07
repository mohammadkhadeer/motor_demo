package com.cars.halamotor.view.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.CarMake;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentCarMake;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentModel;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentYear;

public class CarDetails extends AppCompatActivity {

   RelativeLayout backRl,cancelRl;
   TextView titleTV;

    final Fragment fragmentCarMake = new FragmentCarMake();
    final Fragment fragmentModel = new FragmentModel();
    final Fragment fragmentYear = new FragmentYear();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragmentCarMake;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        statusBarColor();
        init();
        changeFontType();
        moveBetweenFragment();
        changeHeadTitale(getResources().getString(R.string.car_make));

    }

    private void changeHeadTitale(String title) {
        titleTV.setText(title);
    }

    public void getCarMakeObjFromFragmentCarMake(CarMake carMake)
    {
        fm.beginTransaction().hide(active).setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentModel).commit();
        active = fragmentModel;

    }

    private void moveBetweenFragment() {
        fm.beginTransaction().add(R.id.car_details_container, fragmentYear, "3").hide(fragmentYear).commit();
        fm.beginTransaction().add(R.id.car_details_container, fragmentModel, "2").hide(fragmentModel).commit();
        fm.beginTransaction().add(R.id.car_details_container,fragmentCarMake, "1").commit();
    }


    private void changeFontType() {
        titleTV.setTypeface(Functions.changeFontBold(getApplicationContext()));
    }

    private void init() {
        backRl = (RelativeLayout) findViewById(R.id.car_details_activity_back_RL);
        cancelRl = (RelativeLayout) findViewById(R.id.car_details_activity_cancel_RL);
        titleTV = (TextView) findViewById(R.id.car_details_activity_title_TV);

    }

    private void statusBarColor() {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }

}
