package com.cars.halamotor.view.activity;

import android.app.Activity;
import android.content.Intent;
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
import com.cars.halamotor.model.CarColor;
import com.cars.halamotor.model.CarDetailsModel;
import com.cars.halamotor.model.CarMake;
import com.cars.halamotor.view.fragments.ShowSelectedCarDetailsFragment;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentCarCondition;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentCarMake;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentColor;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentFuel;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentInsurance;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentKilometers;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentLicensed;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentModel;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentOptions;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentPaymentMethod;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentTransmission;
import com.cars.halamotor.view.fragments.carDetailsFragment.FragmentYear;

import java.io.Serializable;
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
    final Fragment fragmentOptions = new FragmentOptions();
    final Fragment fragmentLicensed = new FragmentLicensed();
    final Fragment fragmentInsurance = new FragmentInsurance();
    final Fragment fragmentColor = new FragmentColor();
    final Fragment fragmentPaymentMethod = new FragmentPaymentMethod();
    final FragmentManager fm = getSupportFragmentManager();
    Fragment active = fragmentCarMake;
    String whereComeFromStr;
    CarDetailsModel carDetailsModel= new CarDetailsModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_details);

        statusBarColor();
        init();
        getStringFromIntent();
        checkComeFromWhereAndIntiStratFragment();
        actionListener();
        changeFontType();
    }

    private void checkComeFromWhereAndIntiStratFragment() {
        if (whereComeFromStr.equals("fromAddItem"))
        {
            intiCarMakeFragmentSpecific(fragmentCarMake,getResources().getString(R.string.car_make));
        }
        if (whereComeFromStr.equals("model"))
        {
            intiCarMakeFragmentSpecific(fragmentModel,getResources().getString(R.string.car_make));
        }
    }

    private void intiCarMakeFragmentSpecific(Fragment fragment,String titleStr) {
        //pass value to model fragment
        Bundle bundle = new Bundle();
        bundle.putString("whereComeFrom", "fromFragment");
        fragmentModel.setArguments(bundle);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragment);
        transaction.show(fragment);
        transaction.addToBackStack(null);
        transaction.commit();

        changeHeadTitle(titleStr);
    }


    private void getStringFromIntent() {
        Bundle bundle = getIntent().getExtras();
        whereComeFromStr =bundle.getString("whereComeFrom");
    }

    public void getCarPaymentStrFromFragmentPaymentMethodAndFinish(String paymentStr)
    {
        carDetailsModel.setPaymentMethod(paymentStr);
        Intent resultIntent = new Intent();
        resultIntent.putExtra("carDetailsObject", carDetailsModel);
        setResult(Activity.RESULT_OK, resultIntent);
        finish();
    }

    public void getCarColorStrFromFragmentColorAndMoveToFragmentPaymentMethod(CarColor carColor)
    {
        moveFromColorFragmentToPaymentFragment();
        changeHeadTitle(getResources().getString(R.string.payment_method));
        carDetailsModel.setCarColorStr(carColor.getColorNameStr());
    }

    public void getCarInsuranceStrFromFragmentInsuranceAndMoveToFragmentColor(String carInsuranceStr)
    {
        moveFromInsuranceFragmentToColorFragment();
        changeHeadTitle(getResources().getString(R.string.color));
        carDetailsModel.setInsurance(carInsuranceStr);
    }

    public void getCarLicensedStrFromFragmentLicensedAndMoveToFragmentInsurance(String carLicensedStr)
    {
        moveFromLicensedFragmentToInsuranceFragment();
        changeHeadTitle(getResources().getString(R.string.insurance));
        carDetailsModel.setLicenseStr(carLicensedStr);
    }

    public void getCarOptionsStrFromFragmentOptionsAndMoveToFragmentOptions(String carOptionsStr)
    {
        moveFromOptionsFragmentToLicensedFragment();
        changeHeadTitle(getResources().getString(R.string.car_license));
        carDetailsModel.setCarOptionsStr(carOptionsStr);
    }

    public void getCarFuelStrFromFragmentFuelAndMoveToFragmentOptions(String carFuelStr)
    {
        moveFromFuelFragmentToOptionsFragment();
        changeHeadTitle(getResources().getString(R.string.car_options));
        carDetailsModel.setFuelStr(carFuelStr);
    }

    public void getCarTransmissionStrFromFragmentTransmissionAndMoveToFragmentFuel(String carTransmission)
    {
        moveFromTransmissionFragmentToFuelFragment();
        changeHeadTitle(getResources().getString(R.string.fuel));
        carDetailsModel.setTransmissionStr(carTransmission);
    }

    public void getCarKilometersStrFromFragmentKilometersAndMoveToFragmentTransmission(String carKilometers)
    {
        moveFromConditionFragmentToTransmissionFragment();
        changeHeadTitle(getResources().getString(R.string.transmission));
        carDetailsModel.setKilometersStr(carKilometers);
    }

    public void getCarConditionStrFromFragmentCarConditionAndMoveToFragmentKilometers(String carCondition)
    {
        moveFromConditionFragmentToKilometersFragment();
        changeHeadTitle(getResources().getString(R.string.kilometers));
        carDetailsModel.setConditionStr(carCondition);
    }

    public void getCarYearStrFromFragmentCarYearAndMoveToFragmentCondition(String carYear)
    {
        moveFromYearFragmentToCondtionFragment();
        changeHeadTitle(getResources().getString(R.string.condition));
        carDetailsModel.setYearStr(carYear);
    }

    public void getCarModelStrFromFragmentCarModelAndMoveToFragmentYear(String carModel)
    {
        moveFromModelFragmentToYearFragment();
        changeHeadTitle(getResources().getString(R.string.year));
        carDetailsModel.setModelStr(carModel);
    }

    public void getCarMakeObjFromFragmentCarMakeAndMoveToFragmentModel(CarMake carMake)
    {
        passCarMakeToModeFragmentAndMove(carMake);
        changeHeadTitle(getResources().getString(R.string.model));
        carDetailsModel.setCarMakeStr(carMake.getMakeStr());
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

    private void moveFromColorFragmentToPaymentFragment() {
        carDetailsProNowArrayL.add(getResources().getString(R.string.payment_method));
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentPaymentMethod);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentPaymentMethod);
        transaction.addToBackStack(null);
        transaction.commit();
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

    private void moveFromInsuranceFragmentToColorFragment() {
        carDetailsProNowArrayL.add(getResources().getString(R.string.color));
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentColor);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentColor);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void moveFromLicensedFragmentToInsuranceFragment() {
        carDetailsProNowArrayL.add(getResources().getString(R.string.insurance));
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentInsurance);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentInsurance);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void moveFromOptionsFragmentToLicensedFragment() {
        carDetailsProNowArrayL.add(getResources().getString(R.string.car_license));
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentLicensed);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentLicensed);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void moveFromFuelFragmentToOptionsFragment() {
        carDetailsProNowArrayL.add(getResources().getString(R.string.car_options));
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.car_details_container, fragmentOptions);
        transaction.setCustomAnimations
                (R.anim.right_to_left, R.anim.no_animation).show(fragmentOptions);
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
