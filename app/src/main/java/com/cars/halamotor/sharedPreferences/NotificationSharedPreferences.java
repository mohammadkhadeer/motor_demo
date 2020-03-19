package com.cars.halamotor.sharedPreferences;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class NotificationSharedPreferences {

    private static final String NOTIFICATION = "NOTIFICATION";

    public static void updateNumberUnreadNotifications(Context context
            , SharedPreferences SharedPreferences, SharedPreferences.Editor editor
            , String unreadNumber) {
        SharedPreferences = context.getSharedPreferences(NOTIFICATION, MODE_PRIVATE);
        editor = SharedPreferences.edit();
        editor.putString("unread_notifications",unreadNumber);
        editor.commit();
    }

    public static String getUnreadNotificationsInSP(Context context) {
        String unreadNumber;
        SharedPreferences shared = context.getSharedPreferences(NOTIFICATION, MODE_PRIVATE);
        //can use any comp from user info to check
        unreadNumber = (shared.getString("unread_notifications", ""));
        if (unreadNumber.equals("") || unreadNumber == null) {
            return  null;
        }
        else {
            if (unreadNumber.equals("0"))
                return "0";
            else
                return  unreadNumber;
        }
    }

    public static void updateAllUnreadNotificationsToChecked(Context context
            , SharedPreferences SharedPreferences
            , SharedPreferences.Editor editor, String unreadNumber) {
        SharedPreferences = context.getSharedPreferences(NOTIFICATION, MODE_PRIVATE);
        editor = SharedPreferences.edit();
        editor.putString("unread_notifications",unreadNumber);
        editor.commit();
    }

}
