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
import com.my_motors.halamotor.model.CarInsurance;
import com.my_motors.halamotor.view.activity.CarDetails;
import com.my_motors.halamotor.view.adapters.adapterInCarDetails.AdapterCarInsurance;

import java.util.ArrayList;

import static com.my_motors.halamotor.functions.Functions.fillInsuranceArrayL;

public class FragmentInsurance extends Fragment implements AdapterCarInsurance.PassIncense{

    public ArrayList<CarInsurance> carInsuranceArrayL = new ArrayList<CarInsurance>();
    RecyclerView recyclerView;
    AdapterCarInsurance adapterCarInsurance;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;
    View view;

    public FragmentInsurance(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_insurance, container, false);

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
        ArrayList<CarInsurance> carInsuranceArrayList2  = new ArrayList<CarInsurance>();
        for (CarInsurance carInsurance : carInsuranceArrayL) {
            if (carInsurance.getCarInsuranceStr().toLowerCase().contains(text.toLowerCase())) {
                carInsuranceArrayList2.add(carInsurance);
            }
        }
        adapterCarInsurance.filterList(carInsuranceArrayList2);
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
        carInsuranceArrayL =fillInsuranceArrayL(carInsuranceArrayL,getActivity());
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterCarInsurance = new AdapterCarInsurance(getActivity(), carInsuranceArrayL,this);
        recyclerView.setAdapter(adapterCarInsurance);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_car_insurance_RV);
        searchEdt = (EditText) view.findViewById(R.id.fragment_car_insurance_searchEdt);
        cancelRL = (RelativeLayout) view.findViewById(R.id.fragment_car_insurance_RL);
        cancelIV = (ImageView) view.findViewById(R.id.fragment_car_insurance_ImageV);
    }

    @Override
    public void onIncenseClicked(CarInsurance carIncense) {
        CarDetails carDetails = (CarDetails) getActivity();
        carDetails.getCarInsuranceStrFromFragmentInsuranceAndMoveToFragmentColor(carIncense);
    }
}