package com.cars.halamotor.view.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.view.activity.AddItem;
import com.cars.halamotor.view.fragments.fragmentsInSaidProfileFragment.ProfileDetailsInfo;

import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.checkIfUserRegisterOrNotFromSP;
import static com.facebook.FacebookSdk.getApplicationContext;

public class FragmentProfile extends Fragment {

    final Fragment fragmentLoginWithSocialMedia = new ProfileDetailsInfo();

    RelativeLayout postAdRL,recentVRL,recentSRL,favouriteRL,myAdsRL
                   ,myWalletRL,inviteRL,helpRL,contactRL,aboutRL,settingRL;
    TextView postAdTV,recentVTV,recentSTV,favouriteTV,myAdsTV
            ,myWalletTV,inviteTV,helpTV,contactTV,aboutTV,settingTV;

    View view;

    public FragmentProfile(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_profile, container, false);

        inti();
        actionListener();
        head();
        changeFont();

        return view;
    }

    private void changeFont() {
        postAdTV.setTypeface(Functions.changeFontBold(getApplicationContext()));
        recentVTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
        recentSTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
        favouriteTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
        myAdsTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
        myWalletTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
        inviteTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
        helpTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
        contactTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
        aboutTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
        settingTV.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
    }

    private void actionListener() {
        actionListenerToPostAd();
    }

    private void actionListenerToPostAd() {
        postAdRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkIfUserRegisterOrNotFromSP(getActivity()) == false)
                {
                    Toast.makeText(getActivity(),getResources().getString(R.string.must_login), Toast.LENGTH_SHORT).show();
                }else{
                    moveToAddItem();
                }
            }
        });
    }

    private void moveToAddItem() {
        Intent intent = new Intent(getActivity(), AddItem.class);
        startActivity(intent);
        getActivity().overridePendingTransition(R.anim.slide_up, R.anim.no_animation);
    }

    private void inti() {
        postAdRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_post_free_RL);
        recentVRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_recent_v_RL);
        recentSRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_recent_RL);
        favouriteRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_favourite_RL);
        myAdsRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_my_ads_RL);
        myWalletRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_wallet_RL);
        inviteRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_invite_friends_RL);
        helpRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_help_RL);
        contactRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_contact_us_RL);
        aboutRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_about_app_RL);
        settingRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_setting_RL);

        postAdTV = (TextView) view.findViewById(R.id.fragment_profile_post_free_TV);
        recentVTV = (TextView) view.findViewById(R.id.fragment_profile_recent_v_TV);
        recentSTV = (TextView) view.findViewById(R.id.fragment_profile_recent_search_TV);
        favouriteTV = (TextView) view.findViewById(R.id.fragment_profile_favourite_TV);
        myAdsTV = (TextView) view.findViewById(R.id.fragment_profile_my_ads_TV);
        myWalletTV = (TextView) view.findViewById(R.id.fragment_profile_wallet_TV);
        inviteTV = (TextView) view.findViewById(R.id.fragment_profile_invite_friends_TV);
        helpTV = (TextView) view.findViewById(R.id.fragment_profile_help_TV);
        contactTV = (TextView) view.findViewById(R.id.fragment_profile_contact_us_TV);
        aboutTV = (TextView) view.findViewById(R.id.fragment_profile_about_app_TV);
        settingTV = (TextView) view.findViewById(R.id.fragment_profile_setting_TV);
    }

    private void head() {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.profile_container, fragmentLoginWithSocialMedia);
        transaction.show(fragmentLoginWithSocialMedia);
        //transaction.addToBackStack(null);
        transaction.commit();
    }
}
