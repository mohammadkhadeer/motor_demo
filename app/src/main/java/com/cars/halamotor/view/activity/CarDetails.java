package com.cars.halamotor.view.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.CarMake;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentCarCondition;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentCarMake;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentFuel;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentKilometers;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentModel;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentTransmission;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentYear;

import java.util.ArrayList;


public class CarDetails extends AppCompatActivity {
   RelativeLayout backRl,cancelRl;
   TextView titleTV;

    ArrayList<String> carDetailsProNowArrayL = new ArrayList<String>();

    final Fragment fragmentCarMake = new FragmentCarMake();
    final Fragment fragmentModel = new FragmentModel();
    final Fragment fragmentYear = new FragmentYear();
    final Fragment fragmentCondition = new FragmentCarCondition();
    final Fragment fragmentKilometers = new FragmentKilometers();
    final Fragment fragmentTransmission = new FragmentTransmission();
    final Fragment fragmentFuel = new FragmentFuel();
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

    }

    public void getCarTransmissionStrFromFragmentTransmissionAndMoveToFragmentFuel(String carTransmission)
    {
        moveFromTransmissionFragmentToFuelFragment();
        changeHeadTitle(getResources().getString(R.string.fuel));
    }

    public void getCarKilometersStrFromFragmentKilometersAndMoveToFragmentTransmission(String carKilometers)
    {
        moveFromConditionFragmentToTransmissionFragment();
        changeHeadTitle(getResources().getString(R.string.transmission));
    }

    public void getCarConditionStrFromFragmentCarConditionAndMoveToFragmentKilometers(String carCondition)
    {
        moveFromConditionFragmentToKilometersFragment();
        changeHeadTitle(getResources().getString(R.string.kilometers));
    }

    public void getCarYearStrFromFragmentCarYearAndMoveToFragmentCondition(String carYear)
    {
        moveFromYearFragmentToCondtionFragment();
        changeHeadTitle(getResources().getString(R.string.condition));
    }

    public void getCarModelStrFromFragmentCarModelAndMoveToFragmentYear(String carModel)
    {
        moveFromModelFragmentToYearFragment();
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
        cancelRl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
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

    private void moveFromTransmissionFragmentToFuelFragment() {
        carDetailsProNowArrayL.add(getResources().getString(R.string.fuel));
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentFuel);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentFuel);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void moveFromConditionFragmentToTransmissionFragment() {
        carDetailsProNowArrayL.add(getResources().getString(R.string.transmission));
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentTransmission);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentTransmission);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void moveFromConditionFragmentToKilometersFragment() {
        carDetailsProNowArrayL.add(getResources().getString(R.string.kilometers));
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentKilometers);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentKilometers);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void moveFromYearFragmentToCondtionFragment() {
        carDetailsProNowArrayL.add(getResources().getString(R.string.condition));
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentCondition);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentCondition);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void moveFromModelFragmentToYearFragment() {
        //add car year on arrayList to check when user press back finish or move tp privuse fragment
        carDetailsProNowArrayL.add(getResources().getString(R.string.year));
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentYear);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentYear);
        transaction.addToBackStack(null);
        transaction.commit();
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
        checkIfLastFragmentFinshActivityElseMoveToPrivuseFragment();
    }
}
