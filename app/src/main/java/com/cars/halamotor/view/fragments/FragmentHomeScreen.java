package com.cars.halamotor.view.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.cars.halamotor.R;
import com.cars.halamotor.utils.App;
import com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment.FiltersFragment;
import com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment.ListsMainScreenFragment;

public class FragmentHomeScreen extends Fragment {

    public FragmentHomeScreen(){}
    View view;
    RelativeLayout filterContainerRL,suggestedContainerRL;
    ListsMainScreenFragment listsMainScreenFragment = new ListsMainScreenFragment();
    FiltersFragment filtersFragment = new FiltersFragment();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        inti();
        createFilter();
        createF();
        return view;
    }

    private void createFilter() {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_home_fragment_filters_container, filtersFragment);
        transaction.commit();
    }

    private void createF() {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_home_fragment_suggested_item_container, listsMainScreenFragment);
        transaction.commit();
    }

    private void inti() {
        //filterContainerRL = (RelativeLayout) view.findViewById(R.id.fragment_home_fragment_filters_container);
        //suggestedContainerRL = (RelativeLayout) view.findViewById(R.id.fragment_home_fragment_suggested_item_container);
    }

//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == REQUEST_SHOW_ITEM_SELECTED_DETAILS) {
//            Log.i("TAG","Update in fragment");
//
//        }
//    }
//
//    private static final int REQUEST_SHOW_ITEM_SELECTED_DETAILS = 100;

}
