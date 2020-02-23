package com.cars.halamotor.view.fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.Fade;
import android.transition.Transition;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.view.activity.AddItem;
import com.cars.halamotor.view.activity.CarDetails;
import com.cars.halamotor.view.activity.selectAddress.SelectCityAndNeighborhood;

public class FragmentCityPhoneNumber extends Fragment {
    CardView cityCV,phoneCV;
    TextView cityTV;
    EditText phoneNumberEdt;
    ImageView cityArrowIV,cancelPhoneIV;

    View view;

    public FragmentCityPhoneNumber(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_city_phone_number, container, false);
        inti();
        actionListener();
        changeFontType();
        return view;
    }

    private void actionListener() {
        makeCancelPhoneNumIVDeleteTextInPhoneNumEdt();
        listenerAdPhone();
        selectCityActionListener();
    }

    private void selectCityActionListener() {
        cityCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Transition fade = new Fade();
                fade.excludeTarget(android.R.id.statusBarBackground, true);
                getActivity().getWindow().setExitTransition(fade);

                moveToSelectCity();
            }
        });
    }

    private void moveToSelectCity() {
        Intent intent = new Intent(getActivity(), SelectCityAndNeighborhood.class);
        startActivityForResult(intent , 5);
        getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 5 && resultCode == Activity.RESULT_OK) {
            cityTV.setText(data.getExtras().getString("city") + " >> " + data.getExtras().getString("nei"));
        }
    }

    private void listenerAdPhone() {
        phoneNumberEdt.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                if (cs.length() != 0)
                    makeCancelPhoneIVVISIBLE();
                else
                    makeCancelPhoneIVGONE();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int arg1, int arg2, int arg3) {

            }

            @Override
            public void afterTextChanged(Editable arg0) {
            }

        });
    }

    private void makeCancelPhoneIVVISIBLE() {
        cancelPhoneIV.setVisibility(View.VISIBLE);
    }

    private void makeCancelPhoneIVGONE() {
        cancelPhoneIV.setVisibility(View.GONE);
    }

    private void makeCancelPhoneNumIVDeleteTextInPhoneNumEdt() {
        cancelPhoneIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phoneNumberEdt.setText("");
            }
        });
    }

    private void changeFontType() {
        cityTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        phoneNumberEdt.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    private void inti() {
        cityTV = (TextView) view.findViewById(R.id.fragment_city_phone_number_city_TV);
        phoneNumberEdt = (EditText) view.findViewById(R.id.fragment_city_phone_number_city_phone_number_Edt);

        cityArrowIV = (ImageView) view.findViewById(R.id.fragment_city_phone_number_city_IV);
        cancelPhoneIV = (ImageView) view.findViewById(R.id.fragment_city_phone_number_city_phone_number_TV);

        cityCV = (CardView) view.findViewById(R.id.fragment_city_phone_number_city);
        phoneCV = (CardView) view.findViewById(R.id.fragment_city_phone_number_PN);
    }
}