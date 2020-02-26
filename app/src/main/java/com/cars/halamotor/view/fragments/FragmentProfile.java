package com.cars.halamotor.view.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;
import com.cars.halamotor.view.fragments.fragmentsInSaidHomeFragment.ProfileDetailsInfo;

import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.checkIfUserRegisterOrNotFromSP;

public class FragmentProfile extends Fragment {

    final Fragment fragmentLoginWithSocialMedia = new ProfileDetailsInfo();

    public FragmentProfile(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        createSMLoginFragment();

        return view;
    }

    private void checkWf() {
        if (checkIfUserRegisterOrNotFromSP(getActivity()))
        {
            createSMLoginFragment();
        }
    }

    private void createSMLoginFragment() {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.profile_container, fragmentLoginWithSocialMedia);
        transaction.show(fragmentLoginWithSocialMedia);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
