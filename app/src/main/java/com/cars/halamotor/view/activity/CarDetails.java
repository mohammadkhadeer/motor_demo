package com.cars.halamotor.view.activity;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

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
        intiCarMakeFragment();
        actionListener();
        changeFontType();
        moveBetweenFragment();

    }

    public void getCarModelStrFromFragmentCarModelAndMoveToFragmentYear(String carModel)
    {
        moveFromModelGragmentToEarFragment();
        changeHeadTitle(getResources().getString(R.string.year));
    }

    public void getCarMakeObjFromFragmentCarMakeAndMoveToFragmentModel(CarMake carMake)
    {
        passCarMakeToModeFragmentAndMove(carMake);
        changeHeadTitle(getResources().getString(R.string.model));
    }

    private void actionListener() {
        backRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkIfLastFragmentFinshActivityElseMoveToPrivuseFragment();
            }
        });
    }

    private void intiCarMakeFragment() {
        fm.beginTransaction().add(R.id.car_details_container,fragmentCarMake, "1").commit();
        changeHeadTitle(getResources().getString(R.string.car_make));
        carDetailsProNowArrayL.add(getResources().getString(R.string.car_make));
    }

    private void changeHeadTitle(String title) {
        titleTV.setText(title);
    }

    private void passCarMakeToModeFragmentAndMove(CarMake carMake) {
        // add fragment and translate to next fragment

        //add car model on arrayList to check when user press back finsh or move tp privuse fragment
        carDetailsProNowArrayL.add(getResources().getString(R.string.model));
        //pass value to model fragment
        Bundle bundle = new Bundle();
        bundle.putString("carMake", carMake.getMakeStr());
        fragmentModel.setArguments(bundle);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentModel);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentModel);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void moveFromModelGragmentToEarFragment() {
        //add car year on arrayList to check when user press back finish or move tp privuse fragment
        carDetailsProNowArrayL.add(getResources().getString(R.string.year));

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentYear);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentYear);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void moveBetweenFragment() {
        //fm.beginTransaction().add(R.id.car_details_container, fragmentYear, "3").hide(fragmentYear).commit();
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

    private void checkIfLastFragmentFinshActivityElseMoveToPrivuseFragment() {
        if (carDetailsProNowArrayL != null && !carDetailsProNowArrayL.isEmpty()) {
            String lastFragment = carDetailsProNowArrayL.get(carDetailsProNowArrayL.size()-1);
            if (lastFragment.equals(getResources().getString(R.string.car_make)))
            {
                finish();
            } else
            {
                fm.popBackStack();
                changeHeadTitle(carDetailsProNowArrayL.get(carDetailsProNowArrayL.size()-2));
                carDetailsProNowArrayL.remove(carDetailsProNowArrayL.size()-1);
            }

        }
    }

    boolean doubleBackToExitPressedOnce = false;
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }
        if(!carDetailsProNowArrayL.get(carDetailsProNowArrayL.size()-2).equals(getResources().getString(R.string.car_make)))
        {
            this.doubleBackToExitPressedOnce = false;
            finish();
        }else{
            fm.popBackStack();
            this.doubleBackToExitPressedOnce = true;
            changeHeadTitle(carDetailsProNowArrayL.get(carDetailsProNowArrayL.size()-2));
        }

        this.doubleBackToExitPressedOnce = true;

    }
}
