package com.my_motors.halamotor.fireBaseDB;

import android.content.Context;

import com.my_motors.halamotor.model.FavouriteCallSearch;

import static com.my_motors.halamotor.fireBaseDB.FireBaseDBPaths.insertNewUser;
import static com.my_motors.halamotor.sharedPreferences.SharedPreferencesInApp.getUserIdInServerFromSP;

public class UpdateFireBase {

    public static void updateCityNeighborhood(final Context context,String city,String neighborhood) {
        String userID = getUserIdInServerFromSP(context);
        insertNewUser().child(userID).child("cityStr").setValue(city);
        insertNewUser().child(userID).child("neighbourhoodStr").setValue(neighborhood);
    }

    public static void setFavouriteCallSearchOnServer(final Context context, final String itemID
                            , String category, String fscType) {
        FavouriteCallSearch favouriteCallSearch = new FavouriteCallSearch(itemID,category,fscType);
        String userID = getUserIdInServerFromSP(context);
        insertNewUser().child(userID).child("FavouriteCallSearch").push().setValue(favouriteCallSearch);
    }
}
