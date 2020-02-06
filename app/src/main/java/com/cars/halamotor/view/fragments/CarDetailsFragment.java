package com.cars.halamotor.view.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CarDetails;
import com.cars.halamotor.view.adapters.AdapterCarDetails;

import java.util.ArrayList;

import static com.cars.halamotor.functions.Functions.fillCarDetailsArrayL;

public class CarDetailsFragment extends Fragment {

    public CarDetailsFragment(){}

    AdapterCarDetails adapterCarDetails;
    RecyclerView recyclerView;
    public ArrayList<CarDetails> carDetailsArrayList ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_car_details_fragment, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.car_details_fragment_RV);

        CreateRV();

        return view;
    }

    private void CreateRV() {
        carDetailsArrayList = fillCarDetailsArrayL(carDetailsArrayList,getActivity());
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);


        adapterCarDetails = new AdapterCarDetails(getActivity(),carDetailsArrayList);
        recyclerView.setAdapter(adapterCarDetails);
    }


}
