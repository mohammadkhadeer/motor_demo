package com.cars.halamotor.fireBaseDB;

import android.util.Log;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.FCWSU;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.getUserPathInServerFB;
import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.insertCarForSale;

public class UploadModelsToFireBase {

    public static void addNewItem(CCEMT ccemt, final String category, final String userID, final int numberOfAdsToUser) {
        insertCarForSale().child(category).push().setValue(ccemt,new DatabaseReference.CompletionListener() {
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
                getUserPathInServerFB(userID).child("numberOfAds").setValue(numberOfAdsToUser+1);
                //Log.i("TAG product key",uniqueKey);
            }
        });
        //String key = insertCarForSale().push().getKey();
        //Log.i("TAG product key",key);
    }
}
