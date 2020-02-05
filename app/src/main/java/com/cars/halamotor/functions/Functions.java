package com.cars.halamotor.functions;


import android.content.Context;
import android.graphics.Typeface;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CategoryComp;

import java.util.ArrayList;

public class Functions {
    public static Typeface changeFontAppName(Context context) {
        Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "Pacifico.ttf");
        return typeFace;
    }

    public static Typeface changeFontGeneral(Context context) {
        Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "GE_DINAR_ONE_LIGHT.TTF");
        return typeFace;
    }

    public static ArrayList<CategoryComp> fillCategoryArrayList(ArrayList<CategoryComp> categoryCompsArrayL,Context context) {
        categoryCompsArrayL = new ArrayList<CategoryComp>();
        CategoryComp carForSaleCCAL = new CategoryComp(R.drawable.car_for_sale,context.getResources().getString(R.string.car_for_sale));
        CategoryComp carForRentCCAL = new CategoryComp(R.drawable.car_rent,context.getResources().getString(R.string.car_for_rent));
        CategoryComp carForExchangeCCAL = new CategoryComp(R.drawable.exchange_car,context.getResources().getString(R.string.exchange_car));
        CategoryComp motorcycleCCAL = new CategoryComp(R.drawable.motorcycle,context.getResources().getString(R.string.motorcycle));
        CategoryComp carPlatesCCAL = new CategoryComp(R.drawable.vip,context.getResources().getString(R.string.car_plates));
        CategoryComp accessoriesCCAL = new CategoryComp(R.drawable.accessories,context.getResources().getString(R.string.accessories));
        CategoryComp wheelsRimCCAL = new CategoryComp(R.drawable.wheels_rim,context.getResources().getString(R.string.wheels_rim));
        CategoryComp truckComp = new CategoryComp(R.drawable.trucks,context.getResources().getString(R.string.trucks));
        CategoryComp junkCarComp = new CategoryComp(R.drawable.junk_car,context.getResources().getString(R.string.junk_car));
        categoryCompsArrayL.add(carForSaleCCAL);
        categoryCompsArrayL.add(carForRentCCAL);
        categoryCompsArrayL.add(carForExchangeCCAL);
        categoryCompsArrayL.add(motorcycleCCAL);
        categoryCompsArrayL.add(carPlatesCCAL);
        categoryCompsArrayL.add(accessoriesCCAL);
        categoryCompsArrayL.add(wheelsRimCCAL);
        categoryCompsArrayL.add(truckComp);
        categoryCompsArrayL.add(junkCarComp);

        return categoryCompsArrayL;
    }


}
