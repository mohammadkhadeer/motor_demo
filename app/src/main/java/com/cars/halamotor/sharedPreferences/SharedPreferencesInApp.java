package com.cars.halamotor.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.cars.halamotor.model.UserFaceBookInfo;

import static android.content.Context.MODE_PRIVATE;

public class SharedPreferencesInApp {

    private static final String REGISTER = "REGISTER";
    private static final String FB_INFO = "FB_INFO";

    public static void checkIfUserRegisterOrNotFromSP(Context context,SharedPreferences rgSharedPreferences,
                                         SharedPreferences.Editor rgEditor,String status) {
        rgSharedPreferences = context.getSharedPreferences(REGISTER, MODE_PRIVATE);
        rgEditor = rgSharedPreferences.edit();
        rgEditor.putString("registerOrNotYet",status);
        rgEditor.commit();
    }

    public static boolean checkIfUserRegisterOrNotFromSP(Context context) {
        String registerOrNotYetStr;
        SharedPreferences shared = context.getSharedPreferences(REGISTER, MODE_PRIVATE);
        registerOrNotYetStr = (shared.getString("registerOrNotYet", ""));
        if (registerOrNotYetStr.equals("") || registerOrNotYetStr == null || registerOrNotYetStr.equals("0")) {
            return  false;
        }
        else {
            return  true;
        }
    }

    public static boolean checkFBLoginOrNot(Context context) {
        String loginOrNotStr;
        SharedPreferences shared = context.getSharedPreferences(FB_INFO, MODE_PRIVATE);
        loginOrNotStr = (shared.getString("loginOrNot", ""));
        if (loginOrNotStr.equals("0") || loginOrNotStr == null) {
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

    public static void saveUserInfoInSP(Context context,SharedPreferences SharedPreferences,
                                      SharedPreferences.Editor Editor,String firstNameStr,String lastNameStr
            ,String emailStr,String idStr,String birthdayStr,String imageURLStr) {
        SharedPreferences = context.getSharedPreferences(REGISTER, MODE_PRIVATE);
        Editor = SharedPreferences.edit();
        Editor.putString("firstName",firstNameStr);
        Editor.putString("lastName",lastNameStr);
        Editor.putString("email",emailStr);
        Editor.putString("id",idStr);
        Editor.putString("birthday",birthdayStr);
        Editor.putString("imageURL",imageURLStr);
        Editor.commit();
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

    public static UserFaceBookInfo getUserFBInfo(Context context) {
        String firstNameStr,lastNameStr,emailStr,idStr,userBirthdayStr,userImageStr;
        SharedPreferences shared = context.getSharedPreferences(FB_INFO, MODE_PRIVATE);
        firstNameStr = (shared.getString("firstName", ""));
        lastNameStr = (shared.getString("lastName", ""));
        emailStr = (shared.getString("email", ""));
        idStr = (shared.getString("id", ""));
        userBirthdayStr = (shared.getString("birthday", ""));
        userImageStr = (shared.getString("imageURL", ""));

        UserFaceBookInfo userFaceBookInfo = new UserFaceBookInfo(firstNameStr,lastNameStr,emailStr,idStr,userBirthdayStr,userImageStr);
        return userFaceBookInfo;
    }
}
