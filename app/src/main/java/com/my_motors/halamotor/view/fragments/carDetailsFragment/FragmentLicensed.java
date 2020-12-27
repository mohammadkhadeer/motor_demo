package com.my_motors.halamotor.view.fragments.carDetailsFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.model.CarLicensed;
import com.my_motors.halamotor.view.activity.CarDetails;
import com.my_motors.halamotor.view.adapters.adapterInCarDetails.AdapterCarLicensed;

import java.util.ArrayList;

import static com.my_motors.halamotor.functions.Functions.fillFuelArrayL;
import static com.my_motors.halamotor.functions.Functions.fillLicensedArrayL;

public class FragmentLicensed extends Fragment implements AdapterCarLicensed.PassLicensed {

    public ArrayList<CarLicensed> carLicensedArrayL  = new ArrayList<CarLicensed>();
    RecyclerView recyclerView;
    AdapterCarLicensed adapterCarLicensed;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;
    View view;

    public FragmentLicensed(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_licensed, container, false);

        inti();
        createRV();
        actionListenerToSearchEdt();
        actionListenerToRemoveTextInSearchEdt();

        return view;
    }

    private void actionListenerToSearchEdt() {
        searchEdt.addTextChangedListener(new TextWatcher() {

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
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }

        });
    }

    private void filter(String text) {
        ArrayList<CarLicensed> carLicensedArrayL2  = new ArrayList<CarLicensed>();
        for (CarLicensed tex : carLicensedArrayL) {
            if (tex.getCarLicensedStr().toLowerCase().contains(text.toLowerCase())) {
                carLicensedArrayL2.add(tex);
            }
        }
        adapterCarLicensed.filterList(carLicensedArrayL2);
    }

    private void makeCancelTitleIVGONE() {
        cancelIV.setVisibility(View.GONE);
    }

    private void makeCancelTitleIVVISIBLE() {
        cancelIV.setVisibility(View.VISIBLE);
    }

    private void actionListenerToRemoveTextInSearchEdt() {
        cancelRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                searchEdt.setText("");
            }
        });
    }

    private void createRV() {
        carLicensedArrayL =fillLicensedArrayL(carLicensedArrayL,getActivity());
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterCarLicensed = new AdapterCarLicensed(getActivity(), carLicensedArrayL,this);
        recyclerView.setAdapter(adapterCarLicensed);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_car_licensed_RV);
        searchEdt = (EditText) view.findViewById(R.id.fragment_car_licensed_searchEdt);
        cancelRL = (RelativeLayout) view.findViewById(R.id.fragment_car_licensed_RL);
        cancelIV = (ImageView) view.findViewById(R.id.fragment_car_licensed_ImageV);
    }

    @Override
    public void onLicensedClicked(CarLicensed carLicensed) {
        CarDetails carDetails = (CarDetails) getActivity();
        carDetails.getCarLicensedStrFromFragmentLicensedAndMoveToFragmentInsurance(carLicensed);
    }
}