package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;

public class FragmentUserInfoAndMainButton extends Fragment {

    public FragmentUserInfoAndMainButton(){}

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
        View view = inflater.inflate(R.layout.fragment_user_info_and_main_button, container, false);
        Log.i("TAG","********");
        Log.i("TAG",test);
        return view;
    }
}
