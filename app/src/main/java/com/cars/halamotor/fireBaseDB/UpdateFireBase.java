package com.cars.halamotor.fireBaseDB;

import android.content.Context;
import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.insertNewUser;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.getUserIdInServerFromSP;

public class UpdateFireBase {

    public static void updateCityNeighborhood(final Context context,String city,String neighborhood) {
        String userID = getUserIdInServerFromSP(context);
        insertNewUser().child(userID).child("cityStr").setValue(city);
        insertNewUser().child(userID).child("neighbourhoodStr").setValue(neighborhood);

    }
}
