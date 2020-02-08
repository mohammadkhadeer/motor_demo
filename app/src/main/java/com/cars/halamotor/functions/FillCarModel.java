package com.cars.halamotor.functions;

import android.content.Context;

import com.cars.halamotor.R;

import java.util.ArrayList;

public class FillCarModel {

    public static ArrayList<String> fillCarMakeArrayL(ArrayList<String> carModelArrayList, Context context,String carMake) {
        carModelArrayList = new ArrayList<String>();

        if (carMake.equals(context.getString(R.string.hyundai)))
        {
            carModelArrayList.add(context.getString(R.string.h_1_starex));
            carModelArrayList.add(context.getString(R.string.i_10));
            carModelArrayList.add(context.getString(R.string.i_20));
            carModelArrayList.add(context.getString(R.string.i_30));
            carModelArrayList.add(context.getString(R.string.i_40));
            carModelArrayList.add(context.getString(R.string.atos));
            carModelArrayList.add(context.getString(R.string.azera));
            carModelArrayList.add(context.getString(R.string.accent));
            carModelArrayList.add(context.getString(R.string.h_100));
            carModelArrayList.add(context.getString(R.string.excel));
            carModelArrayList.add(context.getString(R.string.elantra));
            carModelArrayList.add(context.getString(R.string.avante));
            carModelArrayList.add(context.getString(R.string.equus));
            carModelArrayList.add(context.getString(R.string.ioniq));
            carModelArrayList.add(context.getString(R.string.porter));
            carModelArrayList.add(context.getString(R.string.pony));
            carModelArrayList.add(context.getString(R.string.trajet));
            carModelArrayList.add(context.getString(R.string.tuscani));
            carModelArrayList.add(context.getString(R.string.terracan));
            carModelArrayList.add(context.getString(R.string.tiburon));
            carModelArrayList.add(context.getString(R.string.galloper));
            carModelArrayList.add(context.getString(R.string.getz));
            carModelArrayList.add(context.getString(R.string.genesis));
            carModelArrayList.add(context.getString(R.string.genesis_coupe));
            carModelArrayList.add(context.getString(R.string.santamo));
            carModelArrayList.add(context.getString(R.string.stellar));
            carModelArrayList.add(context.getString(R.string.scoupe));
            carModelArrayList.add(context.getString(R.string.santa_fe));
            carModelArrayList.add(context.getString(R.string.centennial));
            carModelArrayList.add(context.getString(R.string.sonata));
            carModelArrayList.add(context.getString(R.string.veloster));
            carModelArrayList.add(context.getString(R.string.veracruz));
            carModelArrayList.add(context.getString(R.string.verna));
            carModelArrayList.add(context.getString(R.string.creta));
            carModelArrayList.add(context.getString(R.string.coupe));
            carModelArrayList.add(context.getString(R.string.matrix));
            carModelArrayList.add(context.getString(R.string.mighty));
            carModelArrayList.add(context.getString(R.string.kona));
            carModelArrayList.add(context.getString(R.string.eon));
            carModelArrayList.add(context.getString(R.string.palisade));
            carModelArrayList.add(context.getString(R.string.click));
            carModelArrayList.add(context.getString(R.string.entourage));
            carModelArrayList.add(context.getString(R.string.county));
        }

        return carModelArrayList;
    }

}
