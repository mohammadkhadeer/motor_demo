package com.cars.halamotor.functions;


import android.content.Context;
import android.graphics.Typeface;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CarColor;
import com.cars.halamotor.model.CarOption;
import com.cars.halamotor.model.CategoryComp;

import java.util.ArrayList;
import java.util.Calendar;

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

//    public static ArrayList<ItemDetails> fillCarDetailsArrayL(ArrayList<ItemDetails> carDetailsArrayL, Context context) {
//        carDetailsArrayL = new ArrayList<ItemDetails>();
//        ItemDetails carDetails1 = new ItemDetails(context.getResources().getString(R.string.category),"test");
//        ItemDetails carDetails2 = new ItemDetails(context.getResources().getString(R.string.car_make),"test");
//        ItemDetails carDetails3 = new ItemDetails(context.getResources().getString(R.string.model),"test");
//        ItemDetails carDetails4 = new ItemDetails(context.getResources().getString(R.string.year),"test");
//        ItemDetails carDetails5 = new ItemDetails(context.getResources().getString(R.string.condition),"test");
//        ItemDetails carDetails6 = new ItemDetails(context.getResources().getString(R.string.kilometers),"test");
//        ItemDetails carDetails7 = new ItemDetails(context.getResources().getString(R.string.transmission),"test");
//        ItemDetails carDetails8 = new ItemDetails(context.getResources().getString(R.string.fuel),"test");
//        ItemDetails carDetails9 = new ItemDetails(context.getResources().getString(R.string.car_options),"Test 1 | test2 | test4 | test5 | test 6| test 7");
//        ItemDetails carDetails10 = new ItemDetails(context.getResources().getString(R.string.car_license),"test");
//        ItemDetails carDetails11 = new ItemDetails(context.getResources().getString(R.string.insurance),"test");
//        ItemDetails carDetails12 = new ItemDetails(context.getResources().getString(R.string.color),"test");
//
//        carDetailsArrayL.add(carDetails1);
//        carDetailsArrayL.add(carDetails2);
//        carDetailsArrayL.add(carDetails3);
//        carDetailsArrayL.add(carDetails4);
//        carDetailsArrayL.add(carDetails5);
//        carDetailsArrayL.add(carDetails6);
//        carDetailsArrayL.add(carDetails7);
//        carDetailsArrayL.add(carDetails8);
//        carDetailsArrayL.add(carDetails9);
//        carDetailsArrayL.add(carDetails10);
//        carDetailsArrayL.add(carDetails11);
//        carDetailsArrayL.add(carDetails12);
//
//
//        return carDetailsArrayL;
//    }

    public static ArrayList<String> fillCarYearArrayList(ArrayList<String> carYearArrayL,Context context) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        carYearArrayL = new ArrayList<String>();

        for (int i=year;i>=1970;i--)
        {
            carYearArrayL.add(String.valueOf(i));
        }

        return carYearArrayL;
    }

    public static ArrayList<String> fillKilometersArrayL(ArrayList<String> carKilometersArrayL, Context context) {
        carKilometersArrayL = new ArrayList<String>();

        carKilometersArrayL.add(context.getResources().getString(R.string.k_0));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_1K_10K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_20K_30K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_30K_40K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_40K_50K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_50K_60K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_60K_70K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_70K_80K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_80K_90K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_90K_100K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_100K_110K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_120K_130K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_130K_140K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_140K_150K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_150K_160K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_160K_170K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_170K_180K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_180K_190K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_190K_200K));
        carKilometersArrayL.add(context.getResources().getString(R.string.k_up_200K));

        return carKilometersArrayL;
    }

    public static ArrayList<String> fillTransmissionArrayL(ArrayList<String> carTransmissionArrayL, Context context) {
        carTransmissionArrayL = new ArrayList<String>();

        carTransmissionArrayL.add(context.getResources().getString(R.string.automatic));
        carTransmissionArrayL.add(context.getResources().getString(R.string.manual));
        carTransmissionArrayL.add(context.getResources().getString(R.string.other));

        return carTransmissionArrayL;
    }

    public static ArrayList<String> fillFuelArrayL(ArrayList<String> carFuelArrayL, Context context) {
        carFuelArrayL = new ArrayList<String>();

        carFuelArrayL.add(context.getResources().getString(R.string.gasoline));
        carFuelArrayL.add(context.getResources().getString(R.string.diesel));
        carFuelArrayL.add(context.getResources().getString(R.string.hybrid));
        carFuelArrayL.add(context.getResources().getString(R.string.electric));

        return carFuelArrayL;
    }

    public static ArrayList<String> fillInsuranceArrayL(ArrayList<String> fillInsuranceArrayL, Context context) {
        fillInsuranceArrayL = new ArrayList<String>();

        fillInsuranceArrayL.add(context.getResources().getString(R.string.insurance_compulsory));
        fillInsuranceArrayL.add(context.getResources().getString(R.string.insurance_comprehensive));
        fillInsuranceArrayL.add(context.getResources().getString(R.string.insurance_not));

        return fillInsuranceArrayL;
    }

    public static ArrayList<CarColor> fillColorArrayL(ArrayList<CarColor> fillColorArrayL, Context context) {
        fillColorArrayL = new ArrayList<CarColor>();

        CarColor carColor1 = new CarColor(context.getResources().getString(R.string.color_beige)
                ,context.getResources().getColor(R.color.colorBeige));
        CarColor carColor2 = new CarColor(context.getResources().getString(R.string.color_black)
                ,context.getResources().getColor(R.color.colorBlack));
        CarColor carColor3 = new CarColor(context.getResources().getString(R.string.color_blue)
                ,context.getResources().getColor(R.color.colorBlue_));
        CarColor carColor4 = new CarColor(context.getResources().getString(R.string.color_brown)
                ,context.getResources().getColor(R.color.colorBrown));
        CarColor carColor5 = new CarColor(context.getResources().getString(R.string.color_green)
                ,context.getResources().getColor(R.color.colorGreen_));
        CarColor carColor6 = new CarColor(context.getResources().getString(R.string.color_grey)
                ,context.getResources().getColor(R.color.colorGrey));
        CarColor carColor7 = new CarColor(context.getResources().getString(R.string.color_maroon)
                ,context.getResources().getColor(R.color.colorMaroon));
        CarColor carColor8 = new CarColor(context.getResources().getString(R.string.color_orange)
                ,context.getResources().getColor(R.color.colorOrange));
        CarColor carColor9 = new CarColor(context.getResources().getString(R.string.color_pink)
                ,context.getResources().getColor(R.color.colorPink));
        CarColor carColor10 = new CarColor(context.getResources().getString(R.string.color_purple)

                ,context.getResources().getColor(R.color.colorPurple));
        CarColor carColor11 = new CarColor(context.getResources().getString(R.string.color_red)
                ,context.getResources().getColor(R.color.colorRed));
        CarColor carColor12 = new CarColor(context.getResources().getString(R.string.color_silver)
                ,context.getResources().getColor(R.color.colorSilver_));
        CarColor carColor13 = new CarColor(context.getResources().getString(R.string.color_turquoise)
                ,context.getResources().getColor(R.color.colorTurquoise));
        CarColor carColor14 = new CarColor(context.getResources().getString(R.string.color_white)
                ,context.getResources().getColor(R.color.colorWhite));
        CarColor carColor15 = new CarColor(context.getResources().getString(R.string.color_yellow)
                ,context.getResources().getColor(R.color.colorYellow));
        CarColor carColor16 = new CarColor(context.getResources().getString(R.string.color_gold)
                ,context.getResources().getColor(R.color.colorGold));

        fillColorArrayL.add(carColor1);
        fillColorArrayL.add(carColor2);
        fillColorArrayL.add(carColor3);
        fillColorArrayL.add(carColor4);
        fillColorArrayL.add(carColor5);
        fillColorArrayL.add(carColor6);
        fillColorArrayL.add(carColor7);
        fillColorArrayL.add(carColor8);
        fillColorArrayL.add(carColor9);
        fillColorArrayL.add(carColor10);
        fillColorArrayL.add(carColor11);
        fillColorArrayL.add(carColor12);
        fillColorArrayL.add(carColor13);
        fillColorArrayL.add(carColor14);
        fillColorArrayL.add(carColor15);
        fillColorArrayL.add(carColor16);

        return fillColorArrayL;
    }

    public static ArrayList<CarOption> fillOptionsArrayL(ArrayList<CarOption> carOptionsArrayL, Context context) {
        carOptionsArrayL = new ArrayList<CarOption>();

        CarOption carOption1 = new CarOption(context.getResources().getString(R.string.option_1),0);
        CarOption carOption2 = new CarOption(context.getResources().getString(R.string.option_2),0);
        CarOption carOption3 = new CarOption(context.getResources().getString(R.string.option_3),0);
        CarOption carOption4 = new CarOption(context.getResources().getString(R.string.option_4),0);
        CarOption carOption5 = new CarOption(context.getResources().getString(R.string.option_5),0);
        CarOption carOption6 = new CarOption(context.getResources().getString(R.string.option_6),0);
        CarOption carOption7 = new CarOption(context.getResources().getString(R.string.option_7),0);
        CarOption carOption8 = new CarOption(context.getResources().getString(R.string.option_8),0);
        CarOption carOption9 = new CarOption(context.getResources().getString(R.string.option_9),0);
        CarOption carOption10 = new CarOption(context.getResources().getString(R.string.option_10),0);
        CarOption carOption11 = new CarOption(context.getResources().getString(R.string.option_11),0);
        CarOption carOption12 = new CarOption(context.getResources().getString(R.string.option_12),0);
        CarOption carOption13 = new CarOption(context.getResources().getString(R.string.option_13),0);
        CarOption carOption14 = new CarOption(context.getResources().getString(R.string.option_14),0);
        CarOption carOption15 = new CarOption(context.getResources().getString(R.string.option_15),0);
        CarOption carOption16 = new CarOption(context.getResources().getString(R.string.option_16),0);
        CarOption carOption17 = new CarOption(context.getResources().getString(R.string.option_17),0);
        CarOption carOption18 = new CarOption(context.getResources().getString(R.string.option_18),0);

        carOptionsArrayL.add(carOption1);
        carOptionsArrayL.add(carOption2);
        carOptionsArrayL.add(carOption3);
        carOptionsArrayL.add(carOption4);
        carOptionsArrayL.add(carOption5);
        carOptionsArrayL.add(carOption6);
        carOptionsArrayL.add(carOption7);
        carOptionsArrayL.add(carOption8);
        carOptionsArrayL.add(carOption9);
        carOptionsArrayL.add(carOption10);
        carOptionsArrayL.add(carOption11);
        carOptionsArrayL.add(carOption12);
        carOptionsArrayL.add(carOption13);
        carOptionsArrayL.add(carOption14);
        carOptionsArrayL.add(carOption15);
        carOptionsArrayL.add(carOption16);
        carOptionsArrayL.add(carOption17);
        carOptionsArrayL.add(carOption18);


        return carOptionsArrayL;
    }

    public static ArrayList<String> fillLicensedArrayL(ArrayList<String> carLicensedArrayL, Context context) {
        carLicensedArrayL = new ArrayList<String>();

        carLicensedArrayL.add(context.getResources().getString(R.string.licensed));
        carLicensedArrayL.add(context.getResources().getString(R.string.no_licensed));


        return carLicensedArrayL;
    }

    public static ArrayList<String> fillPaymentArrayL(ArrayList<String> carPaymentArrayL, Context context) {
        carPaymentArrayL = new ArrayList<String>();

        carPaymentArrayL.add(context.getResources().getString(R.string.payment_method_1));
        carPaymentArrayL.add(context.getResources().getString(R.string.payment_method_2));
        carPaymentArrayL.add(context.getResources().getString(R.string.payment_method_3));


        return carPaymentArrayL;
    }

    public static ArrayList<String> fillOptionArrayL(ArrayList<String> carOptionsArrayL, String optionsListStr) {
        carOptionsArrayL = new ArrayList<String>();

        String[] arr = optionsListStr.split("[|]+");
        for(int i = 0; i < arr.length-1; i += 1)
        {
            carOptionsArrayL.add(arr[i]);
        }
        return carOptionsArrayL;
    }

    public static String check(int size, Context context) {
        String city = "";
        if (size == 125)
        {
            city = context.getResources().getString(R.string.dubai);
        }
        if (size == 90)
        {
            city = context.getResources().getString(R.string.abu_dhabi);
        }
        if (size == 69)
        {
            city = context.getResources().getString(R.string.sharjah);
        }
        if (size == 23)
        {
            city = context.getResources().getString(R.string.al_ain);
        }
        if (size == 34)
        {
            city = context.getResources().getString(R.string.ajman);
        }
        if (size == 25)
        {
            city = context.getResources().getString(R.string.ras_al_khaimah);
        }
        if (size == 21)
        {
            city = context.getResources().getString(R.string.um_al_quwain);
        }
        if (size == 12)
        {
            city = context.getResources().getString(R.string.fujairah);
        }
        return city;
    }
}
