package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.SuggestedItem;

import java.util.ArrayList;

public class FragmentFollowUser extends Fragment {

    public FragmentFollowUser(){}

    String test;
    View view;
    TextView userNameTV,numberOfPostsTV,postsTV,numberOfFollowersTV,followersTV
            ,numberOfFollowingTV,followingTV,followTV;
    RelativeLayout userStatusRL,followRL;
    ImageView userImageIV;

    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            test = getArguments().getString("category");
        }
        super.onAttach(context);
    }

    private void inti() {
        userImageIV = (ImageView) view.findViewById(R.id.fragment_follow_image_IV);
        userNameTV = (TextView) view.findViewById(R.id.fragment_follow_user_name_TV);
        userStatusRL = (RelativeLayout) view.findViewById(R.id.fragment_follow_status);
        numberOfPostsTV = (TextView) view.findViewById(R.id.fragment_follow_number_post_TV);
        postsTV = (TextView) view.findViewById(R.id.fragment_follow_post_TV);
        numberOfFollowersTV = (TextView) view.findViewById(R.id.fragment_follow_number_followers_TV);
        followersTV = (TextView) view.findViewById(R.id.fragment_follow_followers_TV);
        numberOfFollowingTV = (TextView) view.findViewById(R.id.fragment_follow_number_following_TV);
        followingTV = (TextView) view.findViewById(R.id.fragment_follow_following_TV);
        followTV = (TextView) view.findViewById(R.id.fragment_follow_follow_TV);
        followRL = (RelativeLayout) view.findViewById(R.id.fragment_follow_follow_RL);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_follow_user, container, false);
        Log.i("TAG","User info");
        Log.i("TAG",test);
        inti();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        changeFont();
    }

    private void changeFont() {
        userNameTV.setTypeface(Functions.changeFontBold(getActivity()));
        numberOfPostsTV.setTypeface(Functions.changeFontBold(getActivity()));
        postsTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        numberOfFollowersTV.setTypeface(Functions.changeFontBold(getActivity()));
        followersTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        numberOfFollowingTV.setTypeface(Functions.changeFontBold(getActivity()));
        followingTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        followTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        // userStatusTV.setTypeface(Functions.changeFontGeneral(getActivity()));
    }
}
