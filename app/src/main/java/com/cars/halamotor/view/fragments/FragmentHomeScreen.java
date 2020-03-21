package com.cars.halamotor.view.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.cars.halamotor.R;

public class FragmentHomeScreen extends Fragment {

    public FragmentHomeScreen(){}
    View view;
    RelativeLayout filterContainerRL,suggestedContainerRL;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        inti();
        return view;
    }

    private void inti() {
        filterContainerRL = (RelativeLayout) view.findViewById(R.id.fragment_home_fragment_filters_container);
        suggestedContainerRL = (RelativeLayout) view.findViewById(R.id.fragment_home_fragment_suggested_item_container);
    }

}
