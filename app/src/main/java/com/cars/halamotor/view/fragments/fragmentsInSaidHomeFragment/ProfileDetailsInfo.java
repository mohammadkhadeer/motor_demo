package com.cars.halamotor.view.fragments.fragmentsInSaidHomeFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.cars.halamotor.R;
import com.cars.halamotor.view.activity.CarPlates;
import com.cars.halamotor.view.activity.LoginWithSocialMedia;


public class ProfileDetailsInfo extends Fragment {

    View view;
    RelativeLayout loginWithSocialMedeaBtn;

    public ProfileDetailsInfo(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.profile_details_info, container, false);

        inti();
        actionListenerToLoginWithSM();

        return view;
    }

    private void actionListenerToLoginWithSM() {
        loginWithSocialMedeaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LoginWithSocialMedia.class);
                startActivityForResult(intent , 10);
                getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
            }
        });
    }

    private void inti() {
        loginWithSocialMedeaBtn = (RelativeLayout) view.findViewById(R.id.profile_details_info_RL);
    }

}