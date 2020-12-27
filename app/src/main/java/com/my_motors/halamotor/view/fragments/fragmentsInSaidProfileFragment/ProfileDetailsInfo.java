package com.my_motors.halamotor.view.fragments.fragmentsInSaidProfileFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.Functions;
import com.my_motors.halamotor.model.Following;
import com.my_motors.halamotor.model.UserFaceBookInfo;
import com.my_motors.halamotor.view.activity.FollowingActivity;
import com.my_motors.halamotor.view.activity.LoginWithSocialMedia;
import com.my_motors.halamotor.view.activity.ShowPostsActivity;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import static com.my_motors.halamotor.dataBase.ReadFunction.getFollowing;
import static com.my_motors.halamotor.fireBaseDB.FireBaseDBPaths.getUserPathInServer;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.checkFBLoginOrNot;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.checkIfUserRegisterOrNotFromSP;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.getUserIdInServerFromSP;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.getUserImage;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.getUserInfo;

public class ProfileDetailsInfo extends Fragment {

    View view;
    RelativeLayout buildTrustRL,numberOfPostRL,numberOfFollowerRL,numberOfFollowingRL;
    CardView userInfoCV;
    ImageView userImageIV;
    TextView userNameTV,editProfileTV,buildTrustTV,numberOfPostTV,postTV
            ,numberOfFollowingTV,followingTV,followerTV,numberOfFollowerTV;
    ArrayList<Following> followingArrayList = new ArrayList<Following>();
    public ProfileDetailsInfo(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.profile_details_info, container, false);

        inti();
        checkIfRegisterOrNot();
        actionListener();
        changeFont();
        getNumberOfOldAds();

        return view;
    }

    private void getNumberOfOldAds() {
        getUserPathInServer(getUserIdInServerFromSP(getActivity())).child("numberOfAds")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            numberOfPostTV.setText(dataSnapshot.getValue().toString());
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }

                });
    }

    private void actionListener() {
        actionListenerBuildTrust();
        actionListenerToPosts();
        actionListenerToFollowing();
    }

    private void actionListenerToFollowing() {
        numberOfFollowingRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberOfPostTV.getText().toString().equals("0"))
                {
                    Toast.makeText(getActivity(),getResources().getString(R.string.no_favorite),Toast.LENGTH_SHORT).show();
                }else{
//                    Bundle bundle = new Bundle();
//                    bundle.putString("userID", getUserIdInServerFromSP(getActivity()));

                    Intent intent = new Intent(getActivity(), FollowingActivity.class);
//                    intent.putExtras(bundle);
                    getActivity().startActivity(intent);
                    getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
                }
            }
        });
    }

    private void actionListenerToPosts() {
        numberOfPostRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberOfPostTV.getText().toString().equals("0"))
                {
                    Toast.makeText(getActivity(),getResources().getString(R.string.no_favorite),Toast.LENGTH_SHORT).show();
                }else{
//                    Bundle bundle = new Bundle();
//                    bundle.putString("userID", getUserIdInServerFromSP(getActivity()));

                    Intent intent = new Intent(getActivity(), ShowPostsActivity.class);
//                    intent.putExtras(bundle);
                    getActivity().startActivity(intent);
                    getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
                }
            }
        });
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
        numberOfPostTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        postTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        numberOfFollowingTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        followingTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        followerTV.setTypeface(Functions.changeFontGeneral(getActivity()));
        numberOfFollowerTV.setTypeface(Functions.changeFontGeneral(getActivity()));
    }

    private void checkIfRegisterOrNot() {
        if (checkIfUserRegisterOrNotFromSP(getActivity()))
        {
            makeUserInfoOn();
            fillUserInfoFromFB();
        }else{
            makeUserInfoOff();
        }
    }

    private void fillUserInfoFromFB() {
        followingArrayList =getFollowing(getActivity());
        UserFaceBookInfo userFaceBookInfo = getUserInfo(getActivity());
        userNameTV.setText(userFaceBookInfo.getFirstNameStr());
        followingTV.setText(String.valueOf(followingArrayList.size()));
        fillImageUser(userFaceBookInfo.getUserImageStr());
    }

    private void fillImageUser(String userImageStr) {
        if (getUserImage(getActivity()) != null)
        {
            Picasso.get()
                    .load(userImageStr)
                    .fit()
                    .centerCrop()
                    .into(userImageIV);
                }
    }

    private void makeUserInfoOn() {
        userInfoCV.setVisibility(View.VISIBLE);
    }

    private void makeUserInfoOff() {
        userInfoCV.setVisibility(View.GONE);
    }

    private void moveToLoginWithSocialMedia() {
        Bundle bundle = new Bundle();
        bundle.putString("address", "build");

        Intent intent = new Intent(getActivity(), LoginWithSocialMedia.class);
        intent.putExtras(bundle);
        startActivityForResult(intent , 10);
        getActivity().overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
    }

    private void inti() {
        userInfoCV = (CardView) view.findViewById(R.id.profile_details_info_details_CV);
        userImageIV = (ImageView) view.findViewById(R.id.profile_details_user_image_IV);
        userNameTV = (TextView) view.findViewById(R.id.profile_details_user_name_TV);
        editProfileTV = (TextView) view.findViewById(R.id.profile_details_info_edit_profile_TV);
        buildTrustTV = (TextView) view.findViewById(R.id.profile_details_info_build_trust_TV);
        buildTrustRL = (RelativeLayout) view.findViewById(R.id.profile_details_info_build_trust_RL);
        numberOfPostRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_post_RL);
        numberOfFollowerRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_u_i_a_m_share_RL);
        numberOfFollowingRL = (RelativeLayout) view.findViewById(R.id.fragment_profile_u_i_a_m_report_RL);
        numberOfPostTV = (TextView) view.findViewById(R.id.fragment_profile_number_post_TV);
        postTV = (TextView) view.findViewById(R.id.fragment_profile_post_TV);
        numberOfFollowerTV = (TextView) view.findViewById(R.id.fragment_profile_number_followers_TV);
        followerTV = (TextView) view.findViewById(R.id.fragment_profile_followers_TV);
        followingTV = (TextView) view.findViewById(R.id.fragment_profile_number_following_TV);
        numberOfFollowingTV = (TextView) view.findViewById(R.id.fragment_profile_following_TV);
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