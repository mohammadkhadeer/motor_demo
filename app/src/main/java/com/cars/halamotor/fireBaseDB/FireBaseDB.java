package com.cars.halamotor.fireBaseDB;

import android.content.Context;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.getUserIdInServerFromSP;

public class FireBaseDB {

    public static FirebaseDatabase getDataBaseInstance() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        return  database;
    }

    public static DatabaseReference insertNewUser() {
        DatabaseReference usersPath = getDataBaseInstance().getReference("users");
        return  usersPath;
    }

    public static DatabaseReference insertCarForSale() {
        DatabaseReference carForSalePath = getDataBaseInstance()
                .getReference("category");
        return  carForSalePath;
    }

    public static DatabaseReference getUserPathInServer(String userIDInServer) {
        DatabaseReference usersPath = getDataBaseInstance()
                .getReference("users").child(userIDInServer);
        return  usersPath;
    }

    public static DatabaseReference getUserPathInServerFB(String userID) {
        DatabaseReference usersPath = getDataBaseInstance().getReference("users")
                .child(userID);
        return  usersPath;
    }
}
