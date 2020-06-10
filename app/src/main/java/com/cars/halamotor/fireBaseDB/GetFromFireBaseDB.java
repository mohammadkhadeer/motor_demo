package com.cars.halamotor.fireBaseDB;

import android.content.Context;

import com.cars.halamotor.model.AccAndJunk;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CarPlatesModel;
import com.cars.halamotor.model.WheelsRimModel;
import com.cars.halamotor.presnter.ItemModel;
import com.cars.halamotor.presnter.NumberOfAllowedAds;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.getObjectPathInServer;
import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.getUserPathInServer;
import static com.cars.halamotor.functions.Functions.replace;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.getUserIdInServerFromSP;

public class GetFromFireBaseDB {

    public static void getNumberOfAllowedAdsFromServer(Context context, final NumberOfAllowedAds numberOfAllowedAds) {
        getUserPathInServer(getUserIdInServerFromSP(context)).child("numberOfAllowedAds")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            numberOfAllowedAds.numberOfAllowedAds(dataSnapshot.getValue().toString());
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }

                });

    }

    public static void getNumberOfOldAds(Context context, final NumberOfAllowedAds numberOfAllowedAds) {
        getUserPathInServer(getUserIdInServerFromSP(context)).child("numberOfAds")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            numberOfAllowedAds.numberOfAds(dataSnapshot.getValue().toString());
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }

                });

    }

    public static void checkUserCanInsertAddOrNot(Context context, final NumberOfAllowedAds numberOfAllowedAds) {
        getUserPathInServer(getUserIdInServerFromSP(context)).child("activeToSetAdv")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            numberOfAllowedAds.canInsertAds(dataSnapshot.getValue().toString());
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }

                });

    }

    public static void checkUserCanInsertBurnedPrice(Context context, final NumberOfAllowedAds numberOfAllowedAds) {
        getUserPathInServer(getUserIdInServerFromSP(context)).child("activeToAddBurnedPrice")
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            numberOfAllowedAds.canInsertBurnedPrice(dataSnapshot.getValue().toString());
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }

                });

    }

    public static void getCCEMTObject(String category, String itemID, final ItemModel itemModel) {
        category = replace(category);
        getObjectPathInServer(category,itemID)
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            CCEMT ccemt = dataSnapshot.getValue(CCEMT.class);
                            itemModel.onReceiveCCEMTObject(ccemt);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }

                });

    }

    public static void getCarPlatesObject(String category, String itemID, final ItemModel itemModel) {
        category = replace(category);
        getObjectPathInServer(category,itemID)
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            CarPlatesModel carPlatesModel = dataSnapshot.getValue(CarPlatesModel.class);
                            itemModel.onReceiveCarPlatesObject(carPlatesModel);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }

                });

    }

    public static void getWheelsSizeObject(String category, String itemID, final ItemModel itemModel) {
        category = replace(category);
        getObjectPathInServer(category,itemID)
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            WheelsRimModel wheelsRimModel = dataSnapshot.getValue(WheelsRimModel.class);
                            itemModel.onReceiveWheelsRimObject(wheelsRimModel);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }

                });

    }

    public static void getAccAndJunkObject(String category, String itemID, final ItemModel itemModel) {
        category = replace(category);
        getObjectPathInServer(category,itemID)
                .addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {
                            AccAndJunk accAndJunk = dataSnapshot.getValue(AccAndJunk.class);
                            itemModel.onReceiveAccAndJunkObject(accAndJunk);
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                    }

                });

    }
}
