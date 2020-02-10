package com.cars.halamotor.view.fragments.carDetailsFragment;

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

import com.cars.halamotor.R;
import com.cars.halamotor.view.activity.CarDetails;
import com.cars.halamotor.view.adapters.adapterInCarDetails.AdapterCarFuel;
import com.cars.halamotor.view.adapters.adapterInCarDetails.AdapterPaymentMethod;

import java.util.ArrayList;

import static com.cars.halamotor.functions.Functions.fillFuelArrayL;
import static com.cars.halamotor.functions.Functions.fillPaymentArrayL;

public class FragmentPaymentMethod extends Fragment implements AdapterPaymentMethod.PassPayment{

    public ArrayList<String> carPaymentArrayL  = new ArrayList<String>();
    RecyclerView recyclerView;
    AdapterPaymentMethod adapterPaymentMethod;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;
    View view;

    public FragmentPaymentMethod(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_payment_method, container, false);

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
        ArrayList<String> carPaymentArrayList2  = new ArrayList<String>();
        for (String payment : carPaymentArrayL) {
            if (payment.toLowerCase().contains(text.toLowerCase())) {
                carPaymentArrayList2.add(payment);
            }
        }
        adapterPaymentMethod.filterList(carPaymentArrayList2);
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
        carPaymentArrayL =fillPaymentArrayL(carPaymentArrayL,getActivity());
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterPaymentMethod = new AdapterPaymentMethod(getActivity(), carPaymentArrayL,this);
        recyclerView.setAdapter(adapterPaymentMethod);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_car_payment_RV);
        searchEdt = (EditText) view.findViewById(R.id.fragment_car_payment_searchEdt);
        cancelRL = (RelativeLayout) view.findViewById(R.id.fragment_car_payment_RL);
        cancelIV = (ImageView) view.findViewById(R.id.fragment_car_payment_ImageV);
    }

    @Override
    public void onPaymentClicked(String carPaymentStr) {

    }
}