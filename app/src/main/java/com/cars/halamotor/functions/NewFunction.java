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
import com.cars.halamotor.model.BrowsingFilter;
import com.cars.halamotor.model.Paging;
import com.cars.halamotor.view.fragments.browsingFragment.BrowsingItems;

import java.util.ArrayList;

public class NewFunction {

    private static final int PAGE_SIZEH = 8;

    public static ArrayList<BrowsingFilter> fillBrowsingArrayL(Context context)
    {
        ArrayList<BrowsingFilter> browsingArrayL = new ArrayList<BrowsingFilter>();

//        BrowsingFilter browsingItemsAll = new BrowsingFilter("all", context.getResources().getString(R.string.all),true);
        BrowsingFilter browsingItemsCall = new BrowsingFilter("call", context.getResources().getString(R.string.call),false);
        BrowsingFilter browsingItemsFavorite = new BrowsingFilter("favorite", context.getResources().getString(R.string.favourite),false);
        BrowsingFilter browsingItemsMessage = new BrowsingFilter("message", context.getResources().getString(R.string.tab_message),false);
        BrowsingFilter browsingItemsSearch = new BrowsingFilter("search", context.getResources().getString(R.string.recent_searches),false);
        BrowsingFilter browsingItemsSeen = new BrowsingFilter("seen", context.getResources().getString(R.string.seen),false);

//        browsingArrayL.add(browsingItemsAll);
        browsingArrayL.add(browsingItemsCall);
        browsingArrayL.add(browsingItemsFavorite);
        browsingArrayL.add(browsingItemsMessage);
        browsingArrayL.add(browsingItemsSearch);
        browsingArrayL.add(browsingItemsSeen);


        return browsingArrayL;
    }

    public static int handelNumberOfObject(int x ,int y) {
        if (y ==0)
        {
            x =0;
        }else{
            if (y > PAGE_SIZEH)
            {
                if (x >= y)
                {
                    x=x;
//                    Log.i("TAG","x >= y");
                }else {
                    int d = y - x;
                    if (d >= PAGE_SIZEH)
                    {
//                        Log.i("TAG","x = x+10");
                        x = x+PAGE_SIZEH;
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

    public static int nowNumberOfObject(int x , int y) {
        int z =0;
        if (y ==0)
        {
            z =0;
        }else{
            if (y > PAGE_SIZEH)
            {
                if (x >= y)
                {
                    z =1000;
                }else {
                    int d = y - x;
                    if (d >= PAGE_SIZEH)
                    {
//                        Log.i("TAG","x = x+10");
                        z =PAGE_SIZEH;
                    }else {
//                        Log.i("TAG","x = x+d");
                        z =d;
                    }
                }
            }else {
                z =y;
            }
        }
        return z;
    }

    public static boolean getNumberOfObject(int x , int y) {
        Boolean isLastPage;
        if (y ==0)
        {
            isLastPage =true;
        }else{
            if (y > PAGE_SIZEH)
            {
                if (x >= y)
                {
                    isLastPage =true;
                }else {
                    int d = y - x;
                    if (d >= PAGE_SIZEH)
                    {
                        isLastPage =false;
                    }else {
                        isLastPage =true;
                    }
                }
            }else {
                isLastPage =true;
            }
        }
        return isLastPage;
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
