package com.cars.halamotor.fireBaseDB;

import android.content.Context;
import android.content.SharedPreferences;

import com.cars.halamotor.model.UserInfo;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.getUserPathInServer;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.getUserIdInServerFromSP;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.saveIfUserCanAddAdsInSP;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.saveNumberOfAdsInSP;

public class GetFromFireBaseDB {

    public static void getNumberOfUserAds(final Context context, final SharedPreferences sharedPreferences, final SharedPreferences.Editor editor) {
        //save on SP because when save in value can't do it this
        //because this use this track
        getUserPathInServer(getUserIdInServerFromSP(context))
                .addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {
                    UserInfo userInfo = dataSnapshot.getValue(UserInfo.class);
                    saveNumberOfAdsInSP(context,sharedPreferences,editor,
                            userInfo.getNumberOfAds());
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {}

        });
    }


    public static void getIfUserCanAddAdsOrNot(final Context context, final SharedPreferences sharedPreferences, final SharedPreferences.Editor editor) {
        //use this because may insert sex adv or any reason from 5 reason
        getUserPathInServer(getUserIdInServerFromSP(context))
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            UserInfo userInfo = dataSnapshot.getValue(UserInfo.class);
                            saveIfUserCanAddAdsInSP(context,sharedPreferences,editor,
                                    userInfo.getActiveToSetAdv());
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {}

                });
    }
}
