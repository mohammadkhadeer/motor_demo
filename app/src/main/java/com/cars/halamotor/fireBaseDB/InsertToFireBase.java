package com.cars.halamotor.fireBaseDB;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.cars.halamotor.model.UserInfo;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.insertNewUser;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.saveServerIDInfoInSP;

public class InsertToFireBase {

    public static void addNewUser(UserInfo newUser, final SharedPreferences rgSharedPreferences,
                                  final SharedPreferences.Editor rgEditor, final Context context) {
        Log.i("TAG ","Add new user");
        Log.i("TAG ",newUser.getIDImagePathStr());
        Log.i("TAG ",newUser.getSurNameStr());

        insertNewUser().push().setValue(newUser, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError,
                                   DatabaseReference databaseReference) {
                Log.i("TAG ","In said");
                String uniqueKey = databaseReference.getKey();
                insertNewUser().child(uniqueKey).child("authenticationIDStr").setValue(uniqueKey);
                saveServerIDInfoInSP(context,rgSharedPreferences,rgEditor,uniqueKey);
                Log.i("TAG User key",uniqueKey);
            }
        });
        //String key = insertNewUser().push().getKey();
    }
}
