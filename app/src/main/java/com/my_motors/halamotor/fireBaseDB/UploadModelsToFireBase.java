package com.my_motors.halamotor.fireBaseDB;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.model.AccAndJunk;
import com.my_motors.halamotor.model.CarPlatesModel;
import com.my_motors.halamotor.model.CommentsComp;
import com.my_motors.halamotor.model.FCWSU;
import com.my_motors.halamotor.model.WheelsRimModel;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import static com.my_motors.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.my_motors.halamotor.dataBase.InsertFunctions.insertNotificationTable;
import static com.my_motors.halamotor.fireBaseDB.FireBaseDBPaths.getObjectCommentPathInServer;
import static com.my_motors.halamotor.fireBaseDB.FireBaseDBPaths.getUserPathInServerFB;
import static com.my_motors.halamotor.fireBaseDB.FireBaseDBPaths.insertCarForSale;
import static com.my_motors.halamotor.functions.Functions.getNotification;

public class UploadModelsToFireBase {

    // new item type carPlates
    public static void addNewCarPlates(final CarPlatesModel carPlatesModel, final String category
            , final String userID, final int numberOfAdsToUser, final Context context) {
        insertCarForSale().child(category).push().setValue(carPlatesModel
                , new DatabaseReference.CompletionListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onComplete(DatabaseError databaseError,
                                   DatabaseReference databaseReference) {
                String uniqueKey = databaseReference.getKey();
                //update id item on server
                insertCarForSale().child(category).child(uniqueKey).child("itemID").setValue(uniqueKey);
                //insert item to userAds in user table
                FCWSU fcwsu = new FCWSU(uniqueKey);
                getUserPathInServerFB(userID).child("usersAds").push().setValue(fcwsu);
                //update number of ads to this user
                getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser + 1);
                //insert notification
                insertNotificationTable(getNotification("Plates",carPlatesModel.getCarPlatesCity() + " " +carPlatesModel.getCarPlatesNum(),context, uniqueKey,"out","item",carPlatesModel.getImagePathArrayL().get(0))
                        ,getDataBaseInstance(context));
            }
        });
    }

    // new item type wheelsRim
    public static void addNewWheelsRim(final WheelsRimModel wheelsRimModel, final String category
            , final String userID, final int numberOfAdsToUser, final Context context) {
        insertCarForSale().child(category).push().setValue(wheelsRimModel
                , new DatabaseReference.CompletionListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onComplete(DatabaseError databaseError,
                                           DatabaseReference databaseReference) {
                        String uniqueKey = databaseReference.getKey();
                        //update id item on server
                        insertCarForSale().child(category).child(uniqueKey).child("itemID").setValue(uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(fcwsu);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser + 1);
                        //insert notification
                        insertNotificationTable(getNotification("Wheels_Rim",wheelsRimModel.getWheelSize()+" "+ context.getResources().getString(R.string.wheels_inch),context, uniqueKey,"out","item",wheelsRimModel.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                });
    }

    // new item type wheelsRim
    public static void addNewAccessories(final AccAndJunk accAndJunk, final String category
            , final String userID, final int numberOfAdsToUser, final Context context) {
        insertCarForSale().child(category).push().setValue(accAndJunk
                , new DatabaseReference.CompletionListener() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onComplete(DatabaseError databaseError,
                                           DatabaseReference databaseReference) {
                        String uniqueKey = databaseReference.getKey();
                        //update id item on server
                        insertCarForSale().child(category).child(uniqueKey).child("itemID").setValue(uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(fcwsu);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser + 1);
                        //insert notification
                        insertNotificationTable(getNotification("Accessories",accAndJunk.getItemName(),context, uniqueKey,"out","item",accAndJunk.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                });
    }

    //write comment
    public static void writeComment(final CommentsComp commentsComp,String categoryName
            , final String itemID) {
        getObjectCommentPathInServer(categoryName,itemID).push().setValue(commentsComp);
    }

}
