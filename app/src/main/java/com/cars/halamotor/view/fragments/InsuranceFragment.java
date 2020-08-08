package com.cars.halamotor.view.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.view.activity.AddItem;
import com.cars.halamotor.view.activity.Insurance;
import com.cars.halamotor.view.activity.MainActivity;

public class InsuranceFragment extends Fragment {

    public InsuranceFragment(){}
    View view;
    TextView insuranceTV,completeProcessTV;
    ImageView imageView;
    RelativeLayout relativeLayout;
    LinearLayout linearLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_insurance, container, false);

        init();
        changeFont();
        actionListenerToLinerLayout();
        return view;
    }

    private void actionListenerToLinerLayout() {
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToCompleteInsuranceDetails();
            }
        });
    }

    private void moveToCompleteInsuranceDetails() {
        Intent intent = new Intent(getActivity(), Insurance.class);
        startActivity(intent);
        getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
    }

    private void changeFont() {
        insuranceTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        completeProcessTV.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    private void init() {
        insuranceTV = (TextView) view.findViewById(R.id.insurance_fragment_complete_process_main_tv);
        completeProcessTV = (TextView) view.findViewById(R.id.insurance_fragment_complete_process_tv);
        imageView = (ImageView) view.findViewById(R.id.insurance_fragment_complete_process_iv);
        relativeLayout = (RelativeLayout) view.findViewById(R.id.insurance_fragment_complete_process_rl);
        linearLayout = (LinearLayout) view.findViewById(R.id.insurance_fragment_complete_process_main_ll);
    }
}
