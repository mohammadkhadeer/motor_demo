package com.cars.halamotor.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.cars.halamotor.model.Follower;

import static android.content.Context.MODE_PRIVATE;

public class UserInfoSP {

    private static final String REGISTER = "REGISTER";

    public static Follower getUserInfoFromSP(Context context) {
        String followerName,followerID,followerToken,followerImage,followerEmail
                ,followerCity,followerNeighborhood;
        SharedPreferences shared = context.getSharedPreferences(REGISTER, MODE_PRIVATE);
        followerName = (shared.getString("firstName", ""))
                +" "+ (shared.getString("lastName", ""));
        followerID = (shared.getString("serverID", ""));
        followerToken = (shared.getString("userToken", ""));
        followerImage = (shared.getString("imageURL", ""));
        followerEmail = (shared.getString("email", ""));
        followerCity = (shared.getString("userCity", ""));
        followerNeighborhood = (shared.getString("userNeighborhood", ""));

        Follower followerInfo = new Follower(followerName,followerID,followerToken
                        ,followerImage,followerEmail,followerCity,followerNeighborhood);
        return followerInfo;
    }
}
