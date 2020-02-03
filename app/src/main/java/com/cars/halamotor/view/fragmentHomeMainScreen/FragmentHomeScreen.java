package com.cars.halamotor.view.fragmentHomeMainScreen;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cars.halamotor.R;
import com.cars.halamotor.view.mainScreem.MainActivity;

public class FragmentHomeScreen extends Fragment implements MainActivity.OnBackPressedListener{

    public FragmentHomeScreen(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }

    @Override
    public void onActivityBackPressed() {
        Toast.makeText(getActivity(), "Back pressed", Toast.LENGTH_SHORT).show();

    }

}
