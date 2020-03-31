package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;

public class FragmentShare extends Fragment {

    public FragmentShare(){}

    String test;
    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            test = getArguments().getString("category");
        }
        super.onAttach(context);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_selected_share, container, false);
        Log.i("TAG","********");
        Log.i("TAG",test);
        return view;
    }
}
