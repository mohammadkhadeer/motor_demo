package com.cars.halamotor.view.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CarDetailsModel;
import com.cars.halamotor.model.ItemDetails;
import com.cars.halamotor.view.activity.CarDetails;

import java.util.ArrayList;

public class ShowSelectedCarDetailsFragment extends Fragment {

    TextView carMakeTV,modelTV,yearTV,conditionTV,kilometersTV
            ,transmissionTV,fuelTV,carOptionsTV,carLicenseTV,insuranceTV
            ,colorTV,paymentMethodTV,categoryTV;
    RelativeLayout carMakeRL,modelRL,yearRL,conditionRL,kilometersRL
            ,transmissionRL,fuelRL,carOptionsRL,carLicenseRL,insuranceRL
            ,colorRL,paymentMethodRL,categoryRL;

    View view;

    private static final int STATIC_BACK_VALUE = 3;

    CarDetailsModel carDetailsModel= new CarDetailsModel();
    String categoryStr;

    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            categoryStr = getArguments().getString("category");
        }
        super.onAttach(context);
        Intent i = getActivity().getIntent();
        carDetailsModel = (CarDetailsModel)i.getParcelableExtra("carDetailsObject");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_details, container, false);

        inti();
        fillDetails();
        actionsLister();

        return view;
    }

    private void actionsLister() {
        carMakeRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAddItem");
            }
        });
        modelRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("model");
            }
        });
    }

    private void moveToCarDetalisSpecificFragment(String fromAddItem) {
        Bundle bundle= new Bundle();
        bundle.putString("whereComeFrom",fromAddItem);
        Intent intent = new Intent(getActivity(), CarDetails.class);
        intent.putExtras(bundle);
        startActivityForResult(intent , STATIC_BACK_VALUE);
        getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
    }

    private void fillDetails() {
        categoryTV.setText(categoryStr);
        carMakeTV.setText(carDetailsModel.getCarMakeStr());
        modelTV.setText(carDetailsModel.getModelStr());
        conditionTV.setText(carDetailsModel.getConditionStr());
        kilometersTV.setText(carDetailsModel.getKilometersStr());
        transmissionTV.setText(carDetailsModel.getTransmissionStr());
        fuelTV.setText(carDetailsModel.getFuelStr());
        carOptionsTV.setText(carDetailsModel.getCarOptionsStr());
        carLicenseTV.setText(carDetailsModel.getLicenseStr());
        insuranceTV.setText(carDetailsModel.getInsurance());
        colorTV.setText(carDetailsModel.getCarColorStr());
    }


    private void inti() {
        categoryTV = (TextView) view.findViewById(R.id.car_details_fragment_category_TV);
        carMakeTV = (TextView) view.findViewById(R.id.car_details_fragment_car_make_TV);
        modelTV = (TextView) view.findViewById(R.id.car_details_fragment_model_TV);
        yearTV = (TextView) view.findViewById(R.id.car_details_fragment_year_TV);
        conditionTV = (TextView) view.findViewById(R.id.car_details_fragment_condition_TV);
        kilometersTV = (TextView) view.findViewById(R.id.car_details_fragment_kilometers_TV);
        transmissionTV = (TextView) view.findViewById(R.id.car_details_fragment_transmission_TV);
        fuelTV = (TextView) view.findViewById(R.id.car_details_fragment_fuel_TV);
        carOptionsTV = (TextView) view.findViewById(R.id.car_details_fragment_car_options_TV);
        carLicenseTV = (TextView) view.findViewById(R.id.car_details_fragment_car_license_TV);
        insuranceTV = (TextView) view.findViewById(R.id.car_details_fragment_insurance_TV);
        colorTV = (TextView) view.findViewById(R.id.car_details_fragment_color_TV);
        paymentMethodTV = (TextView) view.findViewById(R.id.car_details_fragment_payment_method_TV);

        categoryRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_category_RL);
        carMakeRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_car_make_RL);
        modelRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_model_RL);
        yearRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_year_RL);
        conditionRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_condition_RL);
        kilometersRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_kilometers_RL);
        transmissionRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_transmission_RL);
        fuelRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_fuel_RL);
        carOptionsRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_car_options_RL);
        carLicenseRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_car_license_RL);
        insuranceRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_insurance_RL);
        colorRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_color_RL);
        paymentMethodRL = (RelativeLayout) view.findViewById(R.id.car_details_fragment_payment_method_RL);
    }

}
