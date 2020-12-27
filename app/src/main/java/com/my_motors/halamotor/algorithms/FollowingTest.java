package com.my_motors.halamotor.algorithms;

import android.content.Context;
import android.database.Cursor;

import static com.my_motors.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;

public class FollowingTest {
    //3. Check if user follow some well test here

    public static boolean checkIfFollow(Context context, String itemID) {
        Cursor res = getDataBaseInstance(context).descendingFollowing();
        boolean flag = false;
        while (res.moveToNext()) {
            if (res.getString(3).replace("\n", "").equals(itemID))
            {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
