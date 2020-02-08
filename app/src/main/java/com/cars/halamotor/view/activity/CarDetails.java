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

import java.util.ArrayList;


public class CarDetails extends AppCompatActivity {
   RelativeLayout backRl,cancelRl;
   TextView titleTV;

    ArrayList<String> carDetailsProNowArrayL = new ArrayList<String>();

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
        intiCarMake();
        actionListener();
        changeFontType();
        moveBetweenFragment();

    }

    private void actionListener() {
        backRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (carDetailsProNowArrayL != null && !carDetailsProNowArrayL.isEmpty()) {
                    String lastFragment = carDetailsProNowArrayL.get(carDetailsProNowArrayL.size()-1);
                    if (lastFragment.equals("carMake"))
                    {
                        finish();
                    }
                    if (lastFragment.equals("carModel"))
                    {
                        fm.beginTransaction().hide(active).setCustomAnimations
                                (R.anim.left_to_right, R.anim.no_animation).show(fragmentCarMake).commit();
                        active = fragmentCarMake;
                        carDetailsProNowArrayL.remove(carDetailsProNowArrayL.size()-1);
                    }

                }
            }
        });
    }

    private void intiCarMake() {
        changeHeadTitle(getResources().getString(R.string.car_make));
        carDetailsProNowArrayL.add("carMake");
    }

    private void changeHeadTitle(String title) {
        titleTV.setText(title);
    }

    public void getCarMakeObjFromFragmentCarMakeAndMoveToFragmentModel(CarMake carMake)
    {
       // add fragment and translate to next fragment
            carDetailsProNowArrayL.add("carModel");
            //pass value to model fragment
            Bundle bundle = new Bundle();
            bundle.putString("carMake", carMake.getMakeStr());

            fragmentModel.setArguments(bundle);
            //add fragment to fragment manager
            fm.beginTransaction().add(R.id.car_details_container, fragmentModel, "2").hide(fragmentModel).commit();

            fm.beginTransaction().hide(active).setCustomAnimations
                    (R.anim.right_to_left, R.anim.no_animation).show(fragmentModel).commit();
            active = fragmentModel;

    }

    private void moveBetweenFragment() {
        //fm.beginTransaction().add(R.id.car_details_container, fragmentYear, "3").hide(fragmentYear).commit();
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

    boolean doubleBackToExitPressedOnce = false;

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        if (doubleBackToExitPressedOnce) {
//            super.onBackPressed();
//            return;
//        }
//        this.doubleBackToExitPressedOnce = true;
//
//        Log.i("Last fragment",carDetailsProNowArrayL.get(carDetailsProNowArrayL.size()-1));
//
//        if (carDetailsProNowArrayL != null && !carDetailsProNowArrayL.isEmpty()) {
//            String lastFragment = carDetailsProNowArrayL.get(carDetailsProNowArrayL.size()-1);
//            if (lastFragment.equals("carMake"))
//            {
//                this.doubleBackToExitPressedOnce = false;
//                finish();
//            }
//            if (lastFragment.equals("carModel"))
//            {
//                fm.beginTransaction().hide(active).setCustomAnimations
//                        (R.anim.left_to_right, R.anim.no_animation).show(fragmentModel).commit();
//                active = fragmentModel;
//                carDetailsProNowArrayL.remove(carDetailsProNowArrayL.size()-1);
//            }
//
//        }
//    }
}
