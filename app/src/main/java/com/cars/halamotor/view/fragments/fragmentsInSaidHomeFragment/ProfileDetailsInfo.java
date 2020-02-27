package com.cars.halamotor.view.fragments.fragmentsInSaidHomeFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.UserFaceBookInfo;
import com.cars.halamotor.view.activity.CarPlates;
import com.cars.halamotor.view.activity.LoginWithSocialMedia;
import com.squareup.picasso.Picasso;

import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.checkFBLoginOrNot;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.getUserFBInfo;


public class ProfileDetailsInfo extends Fragment {

    View view;
    RelativeLayout loginWithSocialMedeaBtn,buildTrustRL;
    CardView registerWithSocialMideaCV,userInfoCV;
    ImageView userImageIV;
    TextView userNameTV,editProfileTV,buildTrustTV;

    public ProfileDetailsInfo(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.profile_details_info, container, false);

        inti();
        checkIfRegisterOrNot();
        actionListener();
        changeFont();

        return view;
    }

    private void actionListener() {
        actionListenerToLoginWithSM();
        actionListenerBuildTrust();
    }

    private void actionListenerBuildTrust() {
        buildTrustRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToLoginWithSocialMedia();
            }
        });
    }

    private void changeFont() {
        userNameTV.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    private void checkIfRegisterOrNot() {
        if (checkFBLoginOrNot(getActivity()))
        {
            makeUserInfoOn();
            fillUserInfoFromFB();
            makeRegisterOff();
        }else{
            makeRegisterOn();
            makeUserInfoOff();
        }
    }

    private void fillUserInfoFromFB() {
        UserFaceBookInfo userFaceBookInfo = getUserFBInfo(getActivity());
        userNameTV.setText(userFaceBookInfo.getFirstNameStr());
        fillImageUser(userFaceBookInfo.getUserImageStr());
    }

    private void fillImageUser(String userImageStr) {
        Picasso.with(getActivity()).load(userImageStr)
                .fit()
                .centerCrop()
                .into(userImageIV);
    }

    private void makeUserInfoOn() {
        userInfoCV.setVisibility(View.VISIBLE);
    }

    private void makeUserInfoOff() {
        userInfoCV.setVisibility(View.GONE);
    }

    private void makeRegisterOff() {
        registerWithSocialMideaCV.setVisibility(View.GONE);
    }

    private void makeRegisterOn() {
        registerWithSocialMideaCV.setVisibility(View.VISIBLE);
    }

    private void actionListenerToLoginWithSM() {
        loginWithSocialMedeaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToLoginWithSocialMedia();
            }
        });
    }

    private void moveToLoginWithSocialMedia() {
        Intent intent = new Intent(getActivity(), LoginWithSocialMedia.class);
        startActivityForResult(intent , 10);
        getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
    }

    private void inti() {
        loginWithSocialMedeaBtn = (RelativeLayout) view.findViewById(R.id.profile_details_info_RL);
        registerWithSocialMideaCV = (CardView) view.findViewById(R.id.profile_details_info_register_CV);
        userInfoCV = (CardView) view.findViewById(R.id.profile_details_info_details_CV);
        userImageIV = (ImageView) view.findViewById(R.id.profile_details_user_image_IV);
        userNameTV = (TextView) view.findViewById(R.id.profile_details_user_name_TV);
        editProfileTV = (TextView) view.findViewById(R.id.profile_details_info_edit_profile_TV);
        buildTrustTV = (TextView) view.findViewById(R.id.profile_details_info_build_trust_TV);
        buildTrustRL = (RelativeLayout) view.findViewById(R.id.profile_details_info_build_trust_RL);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 10) {
            if (null!=data)
            {
                checkIfRegisterOrNot();
            }
        }
    }
}