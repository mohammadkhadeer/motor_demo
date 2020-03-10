package com.cars.halamotor.fireBaseDB;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class FireBaseDBPaths {

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

    public static Query getDataBase() {
        Query mRef = FirebaseDatabase.getInstance().getReference();
        return mRef;
    }
}
