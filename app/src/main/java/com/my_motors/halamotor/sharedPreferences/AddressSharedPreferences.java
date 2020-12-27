package com.my_motors.halamotor.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class AddressSharedPreferences {
    private static final String REGISTER = "REGISTER";


    public static void saveUserInfoInSP(Context context, SharedPreferences SharedPreferences
            , SharedPreferences.Editor Editor, String city, String neighborhood
            ,String cityS,String neighborhoodS,String cityAr,String neighborhoodAr) {
        SharedPreferences = context.getSharedPreferences(REGISTER, MODE_PRIVATE);
        Editor = SharedPreferences.edit();
        Editor.putString("userCity",city);
        Editor.putString("userNeighborhood",neighborhood);
        Editor.putString("userCityS",cityS);
        Editor.putString("userNeighborhoodS",neighborhoodS);
        Editor.putString("userCityAr",cityAr);
        Editor.putString("userNeighborhoodAr",neighborhoodAr);

        Editor.commit();
    }

    public static String getUserAddressFromSP(Context context) {
        String userCity,userNeighborhood,userAddress;
        SharedPreferences shared = context.getSharedPreferences(REGISTER, MODE_PRIVATE);
        //can use any comp from user info to check
        userCity = (shared.getString("userCity", ""));
        userNeighborhood = (shared.getString("userNeighborhood", ""));
        userAddress = userCity + userNeighborhood ;
        if (userAddress.equals("") || userAddress == null) {
            return  null;
        }
        else {
            return  userAddress;
        }
    }

    public static String getUserNeighborhoodFromSP(Context context) {
        String userNeighborhood;
        SharedPreferences shared = context.getSharedPreferences(REGISTER, MODE_PRIVATE);
        //can use any comp from user info to check
        userNeighborhood = (shared.getString("userNeighborhood", ""));
        if (userNeighborhood.equals("") || userNeighborhood == null) {
            return  null;
        }
        else {
            return  userNeighborhood;
        }
    }

}
