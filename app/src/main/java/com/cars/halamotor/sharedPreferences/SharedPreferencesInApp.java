package com.cars.halamotor.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import static android.content.Context.MODE_PRIVATE;

public class SharedPreferencesInApp {

    private static final String REGISTER = "REGISTER";
    private static final String FB_INFO = "FB_INFO";

    public static boolean checkIfUserRegisterOrNotFromSP(Context context) {
        String registerOrNotYetStr;
        SharedPreferences shared = context.getSharedPreferences(REGISTER, MODE_PRIVATE);
        registerOrNotYetStr = (shared.getString("registerOrNotYet", ""));
        if (registerOrNotYetStr.equals("") || registerOrNotYetStr == null) {
            return  false;
        }
        else {
            return  true;
        }
    }

    public static void checkFBLoginOrNot(Context context,SharedPreferences fbSharedPreferences,
                                      SharedPreferences.Editor fbEditor,String status) {
        fbSharedPreferences = context.getSharedPreferences(FB_INFO, MODE_PRIVATE);
        fbEditor = fbSharedPreferences.edit();
        fbEditor.putString("loginOrNot",status);
        fbEditor.commit();
    }

    public static void saveFBInfoInSP(Context context,SharedPreferences fbSharedPreferences,
                                      SharedPreferences.Editor fbEditor,String firstNameStr,String lastNameStr
                                      ,String emailStr,String idStr,String birthdayStr,String imageURLStr) {
        fbSharedPreferences = context.getSharedPreferences(FB_INFO, MODE_PRIVATE);
        fbEditor = fbSharedPreferences.edit();
        fbEditor.putString("firstName",firstNameStr);
        fbEditor.putString("lastName",lastNameStr);
        fbEditor.putString("email",emailStr);
        fbEditor.putString("id",idStr);
        fbEditor.putString("birthday",birthdayStr);
        fbEditor.putString("imageURL",imageURLStr);
        fbEditor.commit();
    }
}
