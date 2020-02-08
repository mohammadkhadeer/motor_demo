package com.cars.halamotor.functions;


import android.content.Context;
import android.graphics.Typeface;
import android.transition.Fade;
import android.transition.Transition;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CarDetails;
import com.cars.halamotor.model.CategoryComp;

import java.util.ArrayList;

public class Functions {
    public static Typeface changeFontAppName(Context context) {
        Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "Pacifico.ttf");
        return typeFace;
    }

    public static Typeface changeFontGeneral(Context context) {
        Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "NTAILU.TTF");
        return typeFace;
    }

    public static Typeface changeFontBold(Context context) {
        Typeface typeFace = Typeface.createFromAsset(context.getAssets(), "NTAILUB.TTF");
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

    public static ArrayList<CarDetails> fillCarDetailsArrayL(ArrayList<CarDetails> carDetailsArrayL, Context context) {
        carDetailsArrayL = new ArrayList<CarDetails>();
        CarDetails carDetails1 = new CarDetails(context.getResources().getString(R.string.category),"test");
        CarDetails carDetails2 = new CarDetails(context.getResources().getString(R.string.car_make),"test");
        CarDetails carDetails3 = new CarDetails(context.getResources().getString(R.string.model),"test");
        CarDetails carDetails4 = new CarDetails(context.getResources().getString(R.string.year),"test");
        CarDetails carDetails5 = new CarDetails(context.getResources().getString(R.string.condition),"test");
        CarDetails carDetails6 = new CarDetails(context.getResources().getString(R.string.kilometers),"test");
        CarDetails carDetails7 = new CarDetails(context.getResources().getString(R.string.transmission),"test");
        CarDetails carDetails8 = new CarDetails(context.getResources().getString(R.string.fuel),"test");
        CarDetails carDetails9 = new CarDetails(context.getResources().getString(R.string.car_options),"Test 1 | test2 | test4 | test5 | test 6| test 7");
        CarDetails carDetails10 = new CarDetails(context.getResources().getString(R.string.car_license),"test");
        CarDetails carDetails11 = new CarDetails(context.getResources().getString(R.string.insurance),"test");
        CarDetails carDetails12 = new CarDetails(context.getResources().getString(R.string.color),"test");

        carDetailsArrayL.add(carDetails1);
        carDetailsArrayL.add(carDetails2);
        carDetailsArrayL.add(carDetails3);
        carDetailsArrayL.add(carDetails4);
        carDetailsArrayL.add(carDetails5);
        carDetailsArrayL.add(carDetails6);
        carDetailsArrayL.add(carDetails7);
        carDetailsArrayL.add(carDetails8);
        carDetailsArrayL.add(carDetails9);
        carDetailsArrayL.add(carDetails10);
        carDetailsArrayL.add(carDetails11);
        carDetailsArrayL.add(carDetails12);


        return carDetailsArrayL;
    }

}
