package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;

public class FragmentItemSelectedDetails extends Fragment {

    public FragmentItemSelectedDetails(){}

    String test;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_selected_details, container, false);
        Log.i("TAG","********");
        return view;
    }
}
