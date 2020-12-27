package com.my_motors.halamotor.view.fragments.carDetailsFragment;

import android.content.Context;
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

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.model.CarModel;
import com.my_motors.halamotor.view.activity.CarDetails;
import com.my_motors.halamotor.view.adapters.adapterInCarDetails.AdapterCarModel;
import java.util.ArrayList;
import static com.my_motors.halamotor.functions.FillCarModel.fillCarModelArrayL;

public class FragmentModel extends Fragment implements AdapterCarModel.PassCarModel{

    public ArrayList<CarModel> carModelArrayL  = new ArrayList<CarModel>();
    RecyclerView recyclerView;
    AdapterCarModel adapterCarModel;
    String carMakeStr;
    EditText searchEdt;
    RelativeLayout cancelRL;
    ImageView cancelIV;
    View view;

    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            carMakeStr = getArguments().getString("carMake");
        }
        super.onAttach(context);
    }

    public FragmentModel(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_model, container, false);

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
        ArrayList<CarModel> carModelArrayList2  = new ArrayList<CarModel>();
        for (CarModel carModel : carModelArrayL) {
            //if the existing elements contains the search input
            if (carModel.getCarModelStr().toLowerCase().contains(text.toLowerCase())) {
                //adding the element to filtered list
                carModelArrayList2.add(carModel);
            }
        }
        //calling a method of the adapter class and passing the filtered list
        adapterCarModel.filterList(carModelArrayList2);
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
        Log.i("TAG",carMakeStr);
        carModelArrayL= fillCarModelArrayL(carModelArrayL,getActivity(),carMakeStr);
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterCarModel = new AdapterCarModel(getActivity(), carModelArrayL,this);
        recyclerView.setAdapter(adapterCarModel);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_car_model_RV);
        searchEdt = (EditText) view.findViewById(R.id.fragment_car_model_searchEdt);
        cancelRL = (RelativeLayout) view.findViewById(R.id.fragment_car_model_cancel_RL);
        cancelIV = (ImageView) view.findViewById(R.id.fragment_car_model_ImageV);
    }

    @Override
    public void onModeClicked(CarModel carModel) {
        CarDetails carDetails = (CarDetails) getActivity();
        carDetails.getCarModelStrFromFragmentCarModelAndMoveToFragmentYear(carModel);
    }
}