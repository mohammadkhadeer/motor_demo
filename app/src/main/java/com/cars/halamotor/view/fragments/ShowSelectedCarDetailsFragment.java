package com.cars.halamotor.view.fragments;

import android.app.Activity;
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

    CarDetailsModel carDetailsModel= new CarDetailsModel();
    String categoryStr,carMakeStr,whatUserWantToChangeStr;

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
                //moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.car_make),"make");
            }
        });
        modelRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carMakeStr = carDetailsModel.getCarMakeStr();
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.model),"model");
            }
        });
        yearRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.year),"year");
            }
        });
        conditionRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.condition),"condition");
            }
        });
        kilometersRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.kilometers),"kilometers");
            }
        });
        transmissionRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.transmission),"transmission");
            }
        });
        fuelRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.fuel),"fuel");
            }
        });
        carOptionsRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.car_options),"options");
            }
        });
        carLicenseRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.car_license),"licensed");
            }
        });
        insuranceRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.insurance),"insurance");
            }
        });
        colorRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.color),"color");
            }
        });
        paymentMethodRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCarDetalisSpecificFragment("fromAShowSelected",getActivity().getResources().getString(R.string.payment_method),"payment");
            }
        });

    }

    private void moveToCarDetalisSpecificFragment(String fromAddItem,String fragmentType,String dictionaryStr) {
        // lazam tt3'er fe onActivityResult becous this is differnt respons from and deffernt action
        // in first case pass object in secand case send value
        whatUserWantToChangeStr = dictionaryStr;
        if (fragmentType.equals(getActivity().getResources().getString(R.string.model)) || fragmentType.equals(getActivity().getResources().getString(R.string.car_options)))
        {
            if (fragmentType.equals(getActivity().getResources().getString(R.string.model)))
            {
                Bundle bundle= new Bundle();
                bundle.putString("whereComeFrom",fromAddItem);
                bundle.putString("specificFragmentType",fragmentType);
                bundle.putString("ifPressModelPassCarMake",carMakeStr);
                Intent intent = new Intent(getActivity(), CarDetails.class);
                intent.putExtras(bundle);
                startActivityForResult(intent , 4);
                getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
            }
            if (fragmentType.equals(getActivity().getResources().getString(R.string.car_options)))
            {
                Bundle bundle= new Bundle();
                bundle.putString("whereComeFrom",fromAddItem);
                bundle.putString("specificFragmentType",fragmentType);
                bundle.putString("options",carDetailsModel.getCarOptionsStr());
                Intent intent = new Intent(getActivity(), CarDetails.class);
                intent.putExtras(bundle);
                startActivityForResult(intent , 4);
                getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
            }
        }else{
            Bundle bundle= new Bundle();
            bundle.putString("whereComeFrom",fromAddItem);
            bundle.putString("specificFragmentType",fragmentType);
            Intent intent = new Intent(getActivity(), CarDetails.class);
            intent.putExtras(bundle);
            this.startActivityForResult(intent , 4);
            getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
        }
    }

    private void fillDetails() {
        categoryTV.setText(categoryStr);
        carMakeTV.setText(carDetailsModel.getCarMakeStr());
        modelTV.setText(carDetailsModel.getModelStr());
        yearTV.setText(carDetailsModel.getYearStr());
        conditionTV.setText(carDetailsModel.getConditionStr());
        kilometersTV.setText(carDetailsModel.getKilometersStr());
        transmissionTV.setText(carDetailsModel.getTransmissionStr());
        fuelTV.setText(carDetailsModel.getFuelStr());
        carOptionsTV.setText(carDetailsModel.getCarOptionsStr());
        carLicenseTV.setText(carDetailsModel.getLicenseStr());
        insuranceTV.setText(carDetailsModel.getInsurance());
        colorTV.setText(carDetailsModel.getCarColorStr());
        paymentMethodTV.setText(carDetailsModel.getPaymentMethod());
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

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 4) {
            if (null!=data)
            {
                String value = data.getStringExtra(whatUserWantToChangeStr);
                String makeStr = data.getStringExtra("make");
                checkWhereAChangeHappenedAndChangeIt(value,makeStr);
            }
        }
    }

    private void checkWhereAChangeHappenedAndChangeIt(String value,String makeStr) {
        if (whatUserWantToChangeStr.equals("make"))
        {
            carMakeTV.setText(makeStr);
            modelTV.setText(value);
        }

        if (whatUserWantToChangeStr.equals("model"))
        {
            modelTV.setText(value);
        }
        if (whatUserWantToChangeStr.equals("year"))
        {
            yearTV.setText(value);
        }
        if (whatUserWantToChangeStr.equals("condition"))
        {
            conditionTV.setText(value);
        }
        if (whatUserWantToChangeStr.equals("kilometers"))
        {
            kilometersTV.setText(value);
        }
        if (whatUserWantToChangeStr.equals("transmission"))
        {
            transmissionTV.setText(value);
        }
        if (whatUserWantToChangeStr.equals("fuel"))
        {
            fuelTV.setText(value);
        }
        if (whatUserWantToChangeStr.equals("options"))
        {
            carOptionsTV.setText(value);
        }
        if (whatUserWantToChangeStr.equals("licensed"))
        {
            carLicenseTV.setText(value);
        }
        if (whatUserWantToChangeStr.equals("insurance"))
        {
            insuranceTV.setText(value);
        }
        if (whatUserWantToChangeStr.equals("color"))
        {
            colorTV.setText(value);
        }
        if (whatUserWantToChangeStr.equals("payment"))
        {
            paymentMethodTV.setText(value);
        }
    }

}
