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
import com.cars.halamotor.model.CarColor;
import com.cars.halamotor.view.activity.CarDetails;
import com.cars.halamotor.view.adapters.adapterInCarDetails.AdapterCarColor;
import com.cars.halamotor.view.adapters.adapterInCarDetails.AdapterCarFuel;

import java.util.ArrayList;

import static com.cars.halamotor.functions.Functions.fillColorArrayL;
import static com.cars.halamotor.functions.Functions.fillFuelArrayL;

public class FragmentColor extends Fragment implements AdapterCarColor.PassColor{

    public ArrayList<CarColor> carColorsArrayL  = new ArrayList<CarColor>();
    RecyclerView recyclerView;
    AdapterCarColor adapterCarColor;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;
    View view;

    public FragmentColor(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_color, container, false);

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
        ArrayList<CarColor> carColorsArrayList2  = new ArrayList<CarColor>();
        for (CarColor carColor : carColorsArrayL) {
            if (carColor.getColorNameStr().toLowerCase().contains(text.toLowerCase())) {
                carColorsArrayList2.add(carColor);
            }
        }
        adapterCarColor.filterList(carColorsArrayList2);
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
        carColorsArrayL =fillColorArrayL(carColorsArrayL,getActivity());
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterCarColor = new AdapterCarColor(getActivity(), carColorsArrayL,this);
        recyclerView.setAdapter(adapterCarColor);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_car_color_RV);
        searchEdt = (EditText) view.findViewById(R.id.fragment_car_color_searchEdt);
        cancelRL = (RelativeLayout) view.findViewById(R.id.fragment_car_color_RL);
        cancelIV = (ImageView) view.findViewById(R.id.fragment_car_color_ImageV);
    }

    @Override
    public void onColorClicked(CarColor carColor) {
        CarDetails carDetails = (CarDetails) getActivity();
        carDetails.getCarColorStrFromFragmentColorAndMoveToFragmentPaymentMethod(carColor);
    }
}