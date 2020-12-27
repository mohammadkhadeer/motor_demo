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
import com.my_motors.halamotor.view.activity.CarDetails;
import com.my_motors.halamotor.view.adapters.adapterInCarDetails.AdapterCarKilometers;
import java.util.ArrayList;
import static com.my_motors.halamotor.functions.Functions.fillKilometersArrayL;

public class FragmentKilometers extends Fragment implements AdapterCarKilometers.PassKilometers{

    public ArrayList<String> carKilometersArrayL  = new ArrayList<String>();
    RecyclerView recyclerView;
    AdapterCarKilometers adapterCarKilometers;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;
    View view;

    public FragmentKilometers(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_kilometers, container, false);

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
        ArrayList<String> carKilometersArrayList2  = new ArrayList<String>();
        for (String Kilometers : carKilometersArrayL) {
            if (Kilometers.toLowerCase().contains(text.toLowerCase())) {
                carKilometersArrayList2.add(Kilometers);
            }
        }
        adapterCarKilometers.filterList(carKilometersArrayList2);
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
        carKilometersArrayL =fillKilometersArrayL(carKilometersArrayL,getActivity());
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterCarKilometers = new AdapterCarKilometers(getActivity(), carKilometersArrayL,this);
        recyclerView.setAdapter(adapterCarKilometers);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_car_kilometers_RV);
        searchEdt = (EditText) view.findViewById(R.id.fragment_car_kilometers_searchEdt);
        cancelRL = (RelativeLayout) view.findViewById(R.id.fragment_kilometers_cancel_RL);
        cancelIV = (ImageView) view.findViewById(R.id.fragment_car_kilometers_ImageV);
    }

    @Override
    public void onKilometersClicked(String carKilometersStr) {
        CarDetails carDetails = (CarDetails) getActivity();
        carDetails.getCarKilometersStrFromFragmentKilometersAndMoveToFragmentTransmission(carKilometersStr);
    }
}