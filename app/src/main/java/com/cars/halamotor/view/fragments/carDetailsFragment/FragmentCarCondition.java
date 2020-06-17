package com.cars.halamotor.view.fragments.carDetailsFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.cars.halamotor.R;
import com.cars.halamotor.model.CarCondition;
import com.cars.halamotor.view.activity.CarDetails;
import com.cars.halamotor.view.adapters.adapterInCarDetails.AdapterCarCondition;
import java.util.ArrayList;

public class FragmentCarCondition extends Fragment implements AdapterCarCondition.PassCarCondition{

    public ArrayList<CarCondition> carConditionsArrayL  = new ArrayList<CarCondition>();
    RecyclerView recyclerView;
    AdapterCarCondition adapterCarCondition;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;

    View view;

    public FragmentCarCondition(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_condition, container, false);

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
        ArrayList<CarCondition> carConditionArrayList2  = new ArrayList<CarCondition>();
        for (CarCondition carCondition : carConditionsArrayL) {
            if (carCondition.getCarConditionStr().toLowerCase().contains(text.toLowerCase())) {
                carConditionArrayList2.add(carCondition);
            }
        }
        adapterCarCondition.filterList(carConditionArrayList2);
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
        fillArrayList();
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterCarCondition = new AdapterCarCondition(getActivity(), carConditionsArrayL,this);
        recyclerView.setAdapter(adapterCarCondition);
    }

    private void fillArrayList() {
        carConditionsArrayL  = new ArrayList<CarCondition>();
        carConditionsArrayL.add(new CarCondition(getActivity().getResources().getString(R.string.used),getActivity().getResources().getString(R.string.used_s)));
        carConditionsArrayL.add(new CarCondition(getActivity().getResources().getString(R.string.car_new),getActivity().getResources().getString(R.string.car_new_s)));
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_car_condition_RV);
        searchEdt = (EditText) view.findViewById(R.id.fragment_car_condition_searchEdt);
        cancelRL = (RelativeLayout) view.findViewById(R.id.fragment_condition_cancel_RL);
        cancelIV = (ImageView) view.findViewById(R.id.fragment_car_condition_ImageV);
    }

    @Override
    public void onConditionClicked(String carCarConditionStr) {
        CarDetails carDetails = (CarDetails) getActivity();
        carDetails.getCarConditionStrFromFragmentCarConditionAndMoveToFragmentKilometers(carCarConditionStr);
    }
}
