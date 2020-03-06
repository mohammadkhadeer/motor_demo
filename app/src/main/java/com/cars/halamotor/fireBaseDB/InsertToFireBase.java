package com.cars.halamotor.fireBaseDB;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.util.Log;
import com.cars.halamotor.model.UserInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;

import static com.cars.halamotor.fireBaseDB.FireBaseDB.insertNewUser;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.saveServerIDInfoInSP;

public class InsertToFireBase {

    public static void addNewUser(UserInfo newUser, final SharedPreferences rgSharedPreferences,
                                  final SharedPreferences.Editor rgEditor, final Context context) {
        insertNewUser().push().setValue(newUser, new DatabaseReference.CompletionListener() {
            @Override
            public void onComplete(DatabaseError databaseError,
                                   DatabaseReference databaseReference) {
                String uniqueKey = databaseReference.getKey();
                saveServerIDInfoInSP(context,rgSharedPreferences,rgEditor,uniqueKey);
            }
        });
        //String key = insertNewUser().push().getKey();
    }
}
