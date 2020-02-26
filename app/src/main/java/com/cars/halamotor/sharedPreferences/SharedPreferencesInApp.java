package com.cars.halamotor.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import static android.content.Context.MODE_PRIVATE;

public class SharedPreferencesInApp {

    private static final String LANGUAGE = "REGISTER";

    public static boolean checkIfUserRegisterOrNotFromSP(Context context) {
        String registerOrNotYetStr;
        SharedPreferences shared = context.getSharedPreferences(LANGUAGE, MODE_PRIVATE);
        registerOrNotYetStr = (shared.getString("registerOrNotYet", ""));
        if (registerOrNotYetStr.equals("") || registerOrNotYetStr == null) {
            return  false;
        }
        else {
            return  true;
        }
    }
}
