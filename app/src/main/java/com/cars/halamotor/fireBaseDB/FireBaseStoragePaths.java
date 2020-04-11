package com.cars.halamotor.fireBaseDB;

import android.os.Build;
import android.support.annotation.RequiresApi;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import static com.cars.halamotor.functions.Functions.getTime;
import static com.cars.halamotor.functions.Functions.getTimeStamp;

public class FireBaseStoragePaths {
    public static StorageReference getStorageInstance() {
        StorageReference mStorageRef;
        mStorageRef = FirebaseStorage.getInstance().getReference();
        return  mStorageRef;
    }

    public static StorageReference carForSalePath() {
        return  getStorageInstance().child("images");
    }

}
