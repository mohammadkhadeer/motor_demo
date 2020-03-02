package com.cars.halamotor.fireBaseDB;

import android.content.Context;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FireBaseDB {

    public static FirebaseDatabase getDataBaseInstance() {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        return  database;
    }

    public static DatabaseReference insertNewUser() {
        DatabaseReference usersPath = getDataBaseInstance().getReference("users");
        return  usersPath;
    }
}
