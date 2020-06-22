package com.cars.halamotor.fireBaseDB;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.FCWSU;
import com.cars.halamotor.model.ItemAccAndJunk;
import com.cars.halamotor.model.ItemCCEMT;
import com.cars.halamotor.model.ItemPlates;
import com.cars.halamotor.model.ItemWheelsRim;
import com.cars.halamotor.model.UserInfo;
import com.cars.halamotor.model.UserItem;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.firestore.DocumentReference;

import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.dataBase.InsertFunctions.insertNotificationTable;
import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.getUserPathInServerFB;
import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.insertCarForSale;
import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.insertNewUser;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.accessoriesPath;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.carForExchange;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.carForRent;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.carForSale;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.getDataStoreInstance;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.insertItems;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.junkCarPath;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.motorcycle;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.platesPath;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.trucks;
import static com.cars.halamotor.fireBaseDB.FireStorePaths.wheelsRimPath;
import static com.cars.halamotor.functions.Functions.getNotification;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.saveServerIDInfoInSP;

public class InsertToFireBase {

    public static void addNewUser(UserInfo newUser, final SharedPreferences rgSharedPreferences,
                                  final SharedPreferences.Editor rgEditor, final Context context) {

        insertNewUser().push().setValue(newUser, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError,
                                   DatabaseReference databaseReference) {
                String uniqueKey = databaseReference.getKey();
                insertNewUser().child(uniqueKey).child("authenticationIDStr").setValue(uniqueKey);
                saveServerIDInfoInSP(context,rgSharedPreferences,rgEditor,uniqueKey);
            }
        });
        //String key = insertNewUser().push().getKey();
    }

    public static void addNewItemToFireStore(final ItemCCEMT itemCCEMT, final String category
            , final String userID, final int numberOfAdsToUser, final Context context) {
        getDataStoreInstance().collection(category).add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        Log.i("TAG","itemID: "+uniqueKey);
                        getDataStoreInstance().collection(category).document(uniqueKey)
                                .update("itemID",uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        UserItem userItem = new UserItem(itemCCEMT.getCategoryNameS(),uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(userItem);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser+1);
                        //insert notification here to can get item id in server
                        insertNotificationTable(getNotification(category,itemCCEMT.getCarMake() + " " +itemCCEMT.getCarModel(),context, uniqueKey,"out","item",itemCCEMT.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                }
            }
        }).addOnFailureListener(new OnFailureListener() {

            @Override
            public void onFailure(@NonNull Exception e) {
                Log.i("TAG","Error: " + "Onfailure listner"+e.toString());

            }
        });

    }


    public static void addItemPlates(final ItemPlates itemPlates, final String userID
            , final int numberOfAdsToUser, final Context context) {
        platesPath().add(itemPlates).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        platesPath().document(uniqueKey).update("itemID",uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        UserItem userItem = new UserItem(itemPlates.getCategoryNameS(),uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(userItem);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser+1);
                        //insert notification here to can get item id in server
                        insertNotificationTable(getNotification("Plates",itemPlates.getCarPlatesCity() + " " +itemPlates.getCarPlatesNum(),context, uniqueKey,"out","item",itemPlates.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                }
            }
        });
    }

    public static void addWheelsRim(final ItemWheelsRim itemWheelsRim, final String userID
           , final int numberOfAdsToUser , final Context context) {
        wheelsRimPath().add(itemWheelsRim).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        wheelsRimPath().document(uniqueKey).update("itemID",uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        UserItem userItem = new UserItem(itemWheelsRim.getCategoryNameS(),uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(userItem);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser+1);
                        //insert notification here to can get item id in server
                        insertNotificationTable(getNotification("Wheels_Rim",itemWheelsRim.getWheelSize()+" "+ context.getResources().getString(R.string.wheels_inch),context, uniqueKey,"out","item",itemWheelsRim.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                }
            }
        });
    }


    public static void addAccessories(final ItemAccAndJunk itemAccAndJunk
            , final String userID, final int numberOfAdsToUser, final Context context) {
        accessoriesPath().add(itemAccAndJunk).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        accessoriesPath().document(uniqueKey).update("itemID",uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        UserItem userItem = new UserItem(itemAccAndJunk.getCategoryNameS(),uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(userItem);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser + 1);
                        //insert notification
                        insertNotificationTable(getNotification("Accessories",itemAccAndJunk.getItemName(),context, uniqueKey,"out","item",itemAccAndJunk.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                }
            }
        });
    }

    public static void addCarForExchangeStore(final ItemCCEMT itemCCEMT, final String category
            , final String userID, final Context context, final int numberOfAdsToUser) {

        carForExchange().add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        Log.i("TAG","itemID: "+uniqueKey);
                        carForExchange().document(uniqueKey).update("itemID",uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        UserItem userItem = new UserItem(itemCCEMT.getCategoryNameS(),uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(userItem);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser+1);
                        //insert notification here to can get item id in server
                        insertNotificationTable(getNotification(category,itemCCEMT.getCarMake() + " " +itemCCEMT.getCarModel(),context, uniqueKey,"out","item",itemCCEMT.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                }
            }
        });
    }



    public static void addCarForSaleStore(final ItemCCEMT itemCCEMT, final String category
            , final String userID, final Context context, final int numberOfAdsToUser) {
        carForSale().add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    Log.i("TAG","******************"+"isSuccessful");
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        carForSale().document(uniqueKey).update("itemID",uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        UserItem userItem = new UserItem(itemCCEMT.getCategoryNameS(),uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(userItem);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser+1);
                        //insert notification here to can get item id in server
                        insertNotificationTable(getNotification(category,itemCCEMT.getCarMake() + " " +itemCCEMT.getCarModel(),context, uniqueKey,"out","item",itemCCEMT.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                }
            }
        });
    }



    public static void addCarForRentStore(final ItemCCEMT itemCCEMT, final String category
            , final String userID, final Context context, final int numberOfAdsToUser) {
                carForRent().add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        carForRent().document(uniqueKey).update("itemID",uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        UserItem userItem = new UserItem(itemCCEMT.getCategoryNameS(),uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(userItem);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser+1);
                        //insert notification here to can get item id in server
                        insertNotificationTable(getNotification(category,itemCCEMT.getCarMake() + " " +itemCCEMT.getCarModel(),context, uniqueKey,"out","item",itemCCEMT.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                }
            }
        });
    }



    public static void addMotorcycle(final ItemCCEMT itemCCEMT, final String category
            , final String userID, final Context context, final int numberOfAdsToUser) {
                motorcycle().add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        motorcycle().document(uniqueKey).update("itemID",uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        UserItem userItem = new UserItem(itemCCEMT.getCategoryNameS(),uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(userItem);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser+1);
                        //insert notification here to can get item id in server
                        insertNotificationTable(getNotification(category,itemCCEMT.getCarMake() + " " +itemCCEMT.getCarModel(),context, uniqueKey,"out","item",itemCCEMT.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                }
            }
        });
    }



    public static void addTrucks(final ItemCCEMT itemCCEMT, final String category
            , final String userID, final Context context, final int numberOfAdsToUser) {
                trucks().add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        trucks().document(uniqueKey).update("itemID",uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        UserItem userItem = new UserItem(itemCCEMT.getCategoryNameS(),uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(userItem);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser+1);
                        //insert notification here to can get item id in server
                        insertNotificationTable(getNotification(category,itemCCEMT.getCarMake() + " " +itemCCEMT.getCarModel(),context, uniqueKey,"out","item",itemCCEMT.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                }
            }
        });
    }



    public static void addJunkCar(final ItemAccAndJunk itemAccAndJunk
            , final String userID, final int numberOfAdsToUser, final Context context) {
        junkCarPath().add(itemAccAndJunk).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        junkCarPath().document(uniqueKey).update("itemID",uniqueKey);
                        //insert item to userAds in user table
                        FCWSU fcwsu = new FCWSU(uniqueKey);
                        UserItem userItem = new UserItem(itemAccAndJunk.getCategoryNameS(),uniqueKey);
                        getUserPathInServerFB(userID).child("usersAds").push().setValue(userItem);
                        //update number of ads to this user
                        getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser + 1);
                        //insert notification
                        insertNotificationTable(getNotification("junkCar",itemAccAndJunk.getItemName(),context, uniqueKey,"out","item",itemAccAndJunk.getImagePathArrayL().get(0))
                                ,getDataBaseInstance(context));
                    }
                }
            }
        });
    }
}
