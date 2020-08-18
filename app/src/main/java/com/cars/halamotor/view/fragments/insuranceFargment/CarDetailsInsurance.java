package com.cars.halamotor.view.fragments.insuranceFargment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.view.activity.CompleteInsuranceInfo;
import com.cars.halamotor.view.activity.Insurance;

import static com.cars.halamotor.dataBase.ReadFunction.checkIfCarDetailsProcessCreated;

public class CarDetailsInsurance extends Fragment {

    public CarDetailsInsurance(){}
    View view;
    TextView textViewCompleteCarDetails;
    LinearLayout linearLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_details_incurance, container, false);

        init();
        createCarDetailsProcessIfNotHaveIt();
        changeFont();
        actionListenerToRL();
        return view;
    }

    private void createCarDetailsProcessIfNotHaveIt() {
        //1.carMake 2.carModel 3.car year 4. carCondition 5.silnderNumber 6.lastLisence(search in ur car licince)
        //7.city 8.Dose the car modified or not follow Gulf Cooperation Council
        //9.Current policy is "Third party liability only
        //10.Do your current policy include agency repair
        //11.is your insurance policy expired
//        Log.i("TAG","Number: "+String.valueOf(checkIfCarDetailsProcessCreated(getActivity())));
    }

    private void actionListenerToRL() {
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCompleteInsuranceDetails();
            }
        });
    }

    private void moveToCompleteInsuranceDetails() {
        Bundle bundle = new Bundle();
        bundle.putString("partType","2");
        bundle.putString("from","main");


        Intent intent = new Intent(getActivity(), CompleteInsuranceInfo.class);
        intent.putExtras(bundle);
        startActivity(intent);
        getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
    }

    private void changeFont() {
        textViewCompleteCarDetails.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    private void init() {
        textViewCompleteCarDetails = (TextView) view.findViewById(R.id.car_details_insurance_complete_info_tv);
        linearLayout = (LinearLayout) view.findViewById(R.id.car_details_insurance_complete_info_ll);
    }
}
