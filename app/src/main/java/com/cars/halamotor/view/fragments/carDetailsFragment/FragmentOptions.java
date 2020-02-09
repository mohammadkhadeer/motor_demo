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
import com.cars.halamotor.model.CarOption;
import com.cars.halamotor.view.activity.CarDetails;
import com.cars.halamotor.view.adapters.adapterInCarDetails.AdapterCarFuel;
import com.cars.halamotor.view.adapters.adapterInCarDetails.AdapterCarOptions;

import java.util.ArrayList;

import static com.cars.halamotor.functions.Functions.fillFuelArrayL;
import static com.cars.halamotor.functions.Functions.fillOptionsArrayL;

public class FragmentOptions extends Fragment implements AdapterCarOptions.PassOptions{

    public ArrayList<CarOption> carOptionsArrayL  = new ArrayList<CarOption>();
    public ArrayList<String> carSelectedOptionsArrayL  = new ArrayList<String>();
    RecyclerView recyclerView;
    AdapterCarOptions adapterCarOptions;
    EditText searchEdt;
    RelativeLayout cancelRL,resetRL,nextRL;
    ImageView cancelIV;
    View view;

    public FragmentOptions(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_car_options, container, false);

        inti();
        createRV();
        actionListenerToSearchEdt();
        actionListenerToRemoveTextInSearchEdt();
        actionListenerToResetAndNextButton();
        return view;
    }

    private void actionListenerToResetAndNextButton() {
        resetRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<CarOption> carOptionsArrayListRest = new ArrayList<CarOption>();
                carOptionsArrayListRest   =fillOptionsArrayL(carOptionsArrayListRest,getActivity());
                adapterCarOptions.filterList(carOptionsArrayListRest);
            }
        });

        nextRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarDetails carDetails = (CarDetails) getActivity();
                if (carSelectedOptionsArrayL.size() == 0)
                {
                    carDetails.getCarOptionsStrFromFragmentOptionsAndMoveToFragmentOptions("empty");
                    Log.i("TAG1" , "Empty");
                }else{
                    if (carSelectedOptionsArrayL.size() == 1)
                    {
                        carDetails.getCarOptionsStrFromFragmentOptionsAndMoveToFragmentOptions(carSelectedOptionsArrayL.get(1));
                        Log.i("TAG1" , carSelectedOptionsArrayL.get(1));
                    }else {
                        String options = "";
                        for (int i =0 ;i<carSelectedOptionsArrayL.size();i++)
                        {
                            options = options + carSelectedOptionsArrayL.get(i) + "|";
                        }
                        carDetails.getCarOptionsStrFromFragmentOptionsAndMoveToFragmentOptions(options);
                        Log.i("TAG1" , options);
                    }
                }
            }
        });
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
        ArrayList<CarOption> carOptionsArrayList2  = new ArrayList<CarOption>();
        for (CarOption carOption : carOptionsArrayL) {
            if (carOption.getCarOptionStr().toLowerCase().contains(text.toLowerCase())) {
                carOptionsArrayList2.add(carOption);
            }
        }
        adapterCarOptions.filterList(carOptionsArrayList2);
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
        carOptionsArrayL =fillOptionsArrayL(carOptionsArrayL,getActivity());
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterCarOptions = new AdapterCarOptions(getActivity(), carOptionsArrayL,this);
        recyclerView.setAdapter(adapterCarOptions);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_car_options_RV);
        searchEdt = (EditText) view.findViewById(R.id.fragment_car_options_searchEdt);
        cancelRL = (RelativeLayout) view.findViewById(R.id.fragment_car_options_RL);
        resetRL = (RelativeLayout) view.findViewById(R.id.fragment_car_options_resetRL);
        nextRL = (RelativeLayout) view.findViewById(R.id.fragment_car_options_nextRL);
        cancelIV = (ImageView) view.findViewById(R.id.fragment_car_options_ImageV);
    }

    @Override
    public void onOptionClicked(String carOptionStr) {
        for (int i =0 ; i<carSelectedOptionsArrayL.size();i++)
        {
            if (carOptionStr.equals(carSelectedOptionsArrayL.get(i)))
            {
                carSelectedOptionsArrayL.remove(carSelectedOptionsArrayL.get(i));
            }else{
                carSelectedOptionsArrayL.add(carOptionStr);
            }
        }
    }
}