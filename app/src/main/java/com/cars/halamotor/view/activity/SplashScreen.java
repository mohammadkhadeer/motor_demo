package com.cars.halamotor.view.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.cars.halamotor.R;
import com.cars.halamotor.dataBase.DBHelper;
import com.cars.halamotor.model.CCEMT;

import java.util.ArrayList;
import java.util.List;

import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.dataBase.InsertFunctions.insertCarForSaleToItemTable;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getCarForRentItems;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getCarForSaleItems;

public class SplashScreen extends AppCompatActivity {

    List<CCEMT> carForRentList = new ArrayList<>();
    List<CCEMT> carForSaleList = new ArrayList<>();
    DBHelper myDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        myDB = getDataBaseInstance(getApplicationContext());
        getCarForRent();
        getCarForSale();
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right_to_left, R.anim.no_animation);
                finish();
            }
        }, 4000);

    }

    private void getCarForSale() {
        carForSaleList = getCarForSaleItems(carForSaleList);
        //set Handler to get items
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                insertCarForSaleToDataBase();
            }
        }, 2700);
    }

    private void insertCarForSaleToDataBase() {
        for (int i=0;i<carForRentList.size();i++)
        {
            insertCarForSaleToItemTable(carForSaleList.get(i),myDB);
            Log.d("TAG Insert CarForSale",String.valueOf(insertCarForSaleToItemTable(carForSaleList.get(i),myDB)));
        }
    }

    private void getCarForRent() {
        carForRentList = getCarForRentItems(carForRentList);
        //set Handler to get items
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                insertCarForRentToDataBase();
            }
        }, 2700);
    }

    private void insertCarForRentToDataBase() {
        for (int i=0;i<carForRentList.size();i++)
        {
            insertCarForSaleToItemTable(carForRentList.get(i),myDB);
            Log.d("TAG Insert CarForRent",String.valueOf(insertCarForSaleToItemTable(carForRentList.get(i),myDB)));
        }
    }

}
