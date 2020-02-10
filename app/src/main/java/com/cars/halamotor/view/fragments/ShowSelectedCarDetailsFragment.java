package com.cars.halamotor.view.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CarDetailsModel;
import com.cars.halamotor.model.ItemDetails;

import java.util.ArrayList;

public class ShowSelectedCarDetailsFragment extends Fragment {

    TextView carMakeTV,modelTV,yearTV,conditionTV,kilometersTV
            ,transmissionTV,fuelTV,carOptionsTV,carLicense,insuranceTV
            ,colorTV,paymentMethodTV;

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_details, container, false);

        inti();

        return view;
    }

    public static void getCarDetails(CarDetailsModel carDetailsModel)
    {
        Log.i("TAG CAR DETAILS",carDetailsModel.getFuelStr());
    }

    private void inti() {
        carMakeTV = (TextView) view.findViewById(R.id.car_details_fragment_car_make_TV);
        modelTV = (TextView) view.findViewById(R.id.car_details_fragment_model_TV);
        yearTV = (TextView) view.findViewById(R.id.car_details_fragment_year_TV);
        conditionTV = (TextView) view.findViewById(R.id.car_details_fragment_condition_TV);
        kilometersTV = (TextView) view.findViewById(R.id.car_details_fragment_kilometers_TV);
        transmissionTV = (TextView) view.findViewById(R.id.car_details_fragment_transmission_TV);
        fuelTV = (TextView) view.findViewById(R.id.car_details_fragment_fuel_TV);
        carOptionsTV = (TextView) view.findViewById(R.id.car_details_fragment_car_options_TV);
        carLicense = (TextView) view.findViewById(R.id.car_details_fragment_car_license_TV);
        insuranceTV = (TextView) view.findViewById(R.id.car_details_fragment_insurance_TV);
        colorTV = (TextView) view.findViewById(R.id.car_details_fragment_color_TV);
        paymentMethodTV = (TextView) view.findViewById(R.id.car_details_fragment_payment_method_TV);

    }

}
