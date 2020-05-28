package com.cars.halamotor.functions;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

import com.cars.halamotor.R;

public class NewFunction {

    public static int handelNumberOfObject(int x ,int y) {
        if (y ==0)
        {
            x =0;
        }else{
            if (y > 10)
            {
                if (x >= y)
                {
                    x=x;
//                    Log.i("TAG","x >= y");
                }else {
                    int d = y - x;
                    if (d >= 10)
                    {
//                        Log.i("TAG","x = x+10");
                        x = x+10;
                    }else {
//                        Log.i("TAG","x = x+d");
                        x = x +d;
                    }
                }
            }else {
                x = y;
            }
        }
        return x;
    }

    public static String actionBarTitleInFCS(Context context,String FCSType){
        String fcsType="";
        if (FCSType.equals("favorite"))
        {
            fcsType = context.getResources().getString(R.string.favourite_ads);
        }

        if (FCSType.equals("call"))
        {
            fcsType = context.getResources().getString(R.string.call);
        }

        if (FCSType.equals("message"))
        {
            fcsType = context.getResources().getString(R.string.tab_message);
        }

        if (FCSType.equals("search"))
        {
            fcsType = context.getResources().getString(R.string.just_search);
        }

        if (FCSType.equals("seen"))
        {
            fcsType = context.getResources().getString(R.string.seen);
        }

        return fcsType;
    }

    @SuppressLint("MissingPermission")
    public static void callAds(Context context, String phoneNumber) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:" + phoneNumber));
        context.startActivity(callIntent);
    }
}
