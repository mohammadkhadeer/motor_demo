package com.cars.halamotor.view.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;


public class FragmentTitleDescriptionPrice extends Fragment {
    View view;
    EditText adTitleEdt,adDesEdt,priceEdt;
    ImageView cancelTitleIV,cancelDesIV;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_title_description_price, container, false);

        inti();
        actionListener();
        changeFontType();

        return view;
    }

    private void changeFontType() {
        adTitleEdt.setTypeface(Functions.changeFontGeneral(getActivity()));
        adDesEdt.setTypeface(Functions.changeFontGeneral(getActivity()));
        priceEdt.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    private void actionListener() {
        listenerAdTitle();
        makeCancelTitleIVDeleteTextInTitaleEdt();
        listenerAddDes();
        makeCancelDesIVDeleteTextInDesEdt();
    }

    private void inti() {
        adTitleEdt = (EditText) view.findViewById(R.id.fragment_title_description_title_Edt);
        adDesEdt = (EditText) view.findViewById(R.id.fragment_title_description_description_Edt);
        priceEdt = (EditText) view.findViewById(R.id.fragment_title_description_price_Edt);

        cancelTitleIV = (ImageView) view.findViewById(R.id.fragment_title_description_title_IV);
        cancelDesIV = (ImageView) view.findViewById(R.id.fragment_title_description_description_IV);


    }

    private void makeCancelDesIVDeleteTextInDesEdt() {
        cancelDesIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adDesEdt.setText("");
            }
        });
    }

    private void makeCancelTitleIVDeleteTextInTitaleEdt() {
        cancelTitleIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adTitleEdt.setText("");
            }
        });
    }

    private void makeCancelDesIVVISIBLE() {
        cancelDesIV.setVisibility(View.VISIBLE);
    }

    private void makeCancelDesIVGONE() {
        cancelDesIV.setVisibility(View.GONE);
    }

    private void makeCancelTitleIVVISIBLE() {
        cancelTitleIV.setVisibility(View.VISIBLE);
    }

    private void makeCancelTitleIVGONE() {
        cancelTitleIV.setVisibility(View.GONE);
    }

    private void listenerAdTitle() {
        adTitleEdt.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                if (cs.length() != 0)
                    makeCancelTitleIVVISIBLE();
                else
                    makeCancelTitleIVGONE();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int arg1, int arg2, int arg3) {

            }

            @Override
            public void afterTextChanged(Editable arg0) {
            }

        });
    }

    private void listenerAddDes() {
        adDesEdt.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                if (cs.length() != 0)
                    makeCancelDesIVVISIBLE();
                else
                    makeCancelDesIVGONE();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int arg1, int arg2, int arg3) {

            }

            @Override
            public void afterTextChanged(Editable arg0) {
            }

        });
    }

}
