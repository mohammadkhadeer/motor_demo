package com.cars.halamotor.fireBaseDB;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.util.Log;
import com.cars.halamotor.model.UserInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import static com.cars.halamotor.fireBaseDB.FireBaseDB.insertNewUser;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.saveServerIDInfoInSP;

public class InsertToFireBase {

    public static void addNewUser(UserInfo newUser, SharedPreferences rgSharedPreferences,
                                  SharedPreferences.Editor rgEditor, Context context) {
        insertNewUser().push().setValue(newUser);
        String key = insertNewUser().push().getKey();
        saveServerIDInfoInSP(context,rgSharedPreferences,rgEditor,key);
    }
}
