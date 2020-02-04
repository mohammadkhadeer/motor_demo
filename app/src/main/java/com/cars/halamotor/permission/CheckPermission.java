package com.cars.halamotor.permission;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;

import com.cars.halamotor.functions.Action;
import com.cars.halamotor.view.addItem.AddItem;

public class CheckPermission {

    private static final int PICK_FROM_GALLERY = 1;

    public static boolean checkPermissionMethodToSelectPhoto(Activity activity) {

        try {
            if (ActivityCompat.checkSelfPermission(activity,
                    Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(activity
                        , new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}
                        , PICK_FROM_GALLERY);

                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}

