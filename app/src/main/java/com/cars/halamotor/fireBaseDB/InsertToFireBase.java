package com.cars.halamotor.fireBaseDB;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.FCWSU;
import com.cars.halamotor.model.ItemAccAndJunk;
import com.cars.halamotor.model.ItemCCEMT;
import com.cars.halamotor.model.ItemPlates;
import com.cars.halamotor.model.ItemWheelsRim;
import com.cars.halamotor.model.UserInfo;
import com.google.android.gms.tasks.OnCompleteListener;
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

    public static void addCarForExchangeStore(final ItemCCEMT itemCCEMT) {
        carForExchange().add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        Log.i("TAG","itemID: "+uniqueKey);
                        carForExchange().document(uniqueKey).update("itemID",uniqueKey);
                    }
                }
            }
        });
    }

    public static void addCarForSaleStore(final ItemCCEMT itemCCEMT) {
        carForSale().add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        carForSale().document(uniqueKey).update("itemID",uniqueKey);

                    }
                }
            }
        });
    }

    public static void addCarForRentStore(final ItemCCEMT itemCCEMT) {
        carForRent().add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        carForRent().document(uniqueKey).update("itemID",uniqueKey);

                    }
                }
            }
        });
    }

    public static void addMotorcycle(final ItemCCEMT itemCCEMT) {
        motorcycle().add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        motorcycle().document(uniqueKey).update("itemID",uniqueKey);

                    }
                }
            }
        });
    }

    public static void addTrucks(final ItemCCEMT itemCCEMT) {
        trucks().add(itemCCEMT).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        trucks().document(uniqueKey).update("itemID",uniqueKey);

                    }
                }
            }
        });
    }

    public static void addItemPlates(final ItemPlates itemPlates) {
        platesPath().add(itemPlates).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        platesPath().document(uniqueKey).update("itemID",uniqueKey);

                    }
                }
            }
        });
    }

    public static void addWheelsRim(final ItemWheelsRim itemWheelsRim) {
        wheelsRimPath().add(itemWheelsRim).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        wheelsRimPath().document(uniqueKey).update("itemID",uniqueKey);

                    }
                }
            }
        });
    }

    public static void addAccessories(final ItemAccAndJunk itemAccAndJunk) {
        accessoriesPath().add(itemAccAndJunk).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        accessoriesPath().document(uniqueKey).update("itemID",uniqueKey);

                    }
                }
            }
        });
    }

    public static void addJunkCar(final ItemAccAndJunk itemAccAndJunk) {
        junkCarPath().add(itemAccAndJunk).addOnCompleteListener(new OnCompleteListener<DocumentReference>() {
            @Override
            public void onComplete(@NonNull Task<DocumentReference> task) {
                if (task.isSuccessful()) {
                    DocumentReference document = task.getResult();
                    if (document != null) {
                        String uniqueKey = document.getId(); //Do what you need to do with the document id
                        junkCarPath().document(uniqueKey).update("itemID",uniqueKey);

                    }
                }
            }
        });
    }
}
