package com.cars.halamotor.view.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;
import com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment.SuggestedItemFragment;

public class FragmentHomeScreen extends Fragment {

    public FragmentHomeScreen(){}
    View view;
    SuggestedItemFragment suggestedItemFragment = new SuggestedItemFragment();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        createSuggestedItemFragment();

        return view;
    }

    private void createSuggestedItemFragment() {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.home_screen_container, suggestedItemFragment);
        //transaction.addToBackStack(null);
        transaction.commit();
    }
}
