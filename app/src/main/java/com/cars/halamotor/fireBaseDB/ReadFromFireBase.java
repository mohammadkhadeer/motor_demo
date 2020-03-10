package com.cars.halamotor.fireBaseDB;

import android.util.Log;

import com.cars.halamotor.model.CCEMT;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class ReadFromFireBase {

    public static List<CCEMT> getCarForSaleItems(final List<CCEMT> carForSaleL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Car_For_Sale");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot carForSaleList: dataSnapshot.getChildren()) {
                    CCEMT ccemt = carForSaleList.getValue(CCEMT.class);
                    carForSaleL.add(ccemt);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("TAG ERROR", databaseError.toString());

            }

        });
        return carForSaleL;
    }

    public static List<CCEMT> getCarForRentItems(final List<CCEMT> carForSaleL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Car_For_Rent");
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot carForSaleList: dataSnapshot.getChildren()) {
                    CCEMT ccemt = carForSaleList.getValue(CCEMT.class);
                    carForSaleL.add(ccemt);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("TAG ERROR", databaseError.toString());

            }

        });
        return carForSaleL;
    }
}
