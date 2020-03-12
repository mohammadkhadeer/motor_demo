package com.cars.halamotor.fireBaseDB;

import android.util.Log;

import com.cars.halamotor.model.AccAndJunk;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CarPlatesModel;
import com.cars.halamotor.model.WheelsRimModel;
import com.cars.halamotor.view.activity.WheelsRim;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class ReadFromFireBase {

    public static List<CCEMT> getCarForSaleItems(final List<CCEMT> carForSaleL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Car_For_Sale").limitToLast(2);
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

    public static List<CCEMT> getCarForRentItems(final List<CCEMT> carForRentL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Car_For_Rent").limitToLast(2);
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot carForRentList: dataSnapshot.getChildren()) {
                    CCEMT ccemt = carForRentList.getValue(CCEMT.class);
                    carForRentL.add(ccemt);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("TAG ERROR", databaseError.toString());

            }

        });
        return carForRentL;
    }

    public static List<CCEMT> getCarForExchangeItems(final List<CCEMT> carForExchangeL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Car_For_Exchange").limitToLast(2);
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot carForExchangeList: dataSnapshot.getChildren()) {
                    CCEMT ccemt = carForExchangeList.getValue(CCEMT.class);
                    carForExchangeL.add(ccemt);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("TAG ERROR", databaseError.toString());

            }

        });
        return carForExchangeL;
    }

    public static List<CCEMT> getMotorcycleItems(final List<CCEMT> motorcycleArrayL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Motorcycle").limitToLast(1);
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot motorcycleList: dataSnapshot.getChildren()) {
                    CCEMT ccemt = motorcycleList.getValue(CCEMT.class);
                    motorcycleArrayL.add(ccemt);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("TAG ERROR", databaseError.toString());

            }

        });
        return motorcycleArrayL;
    }

    public static List<CCEMT> getTruckItems(final List<CCEMT> trucksArrayL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Trucks").limitToLast(1);
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot trucksList: dataSnapshot.getChildren()) {
                    CCEMT ccemt = trucksList.getValue(CCEMT.class);
                    trucksArrayL.add(ccemt);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("TAG ERROR", databaseError.toString());

            }

        });
        return trucksArrayL;
    }

    public static List<CarPlatesModel> getPlatesItems(final List<CarPlatesModel> platesArrayL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Plates").limitToLast(1);
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot carPlatesList: dataSnapshot.getChildren()) {
                    CarPlatesModel carPlatesModel = carPlatesList.getValue(CarPlatesModel.class);
                    platesArrayL.add(carPlatesModel);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("TAG ERROR", databaseError.toString());

            }

        });
        return platesArrayL;
    }

    public static List<WheelsRimModel> getWheelsRimItems(final List<WheelsRimModel> wheelsRimArrayL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Wheels_Rim").limitToLast(1);
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot wheelsRimList: dataSnapshot.getChildren()) {
                    WheelsRimModel wheelsRim = wheelsRimList.getValue(WheelsRimModel.class);
                    wheelsRimArrayL.add(wheelsRim);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("TAG ERROR", databaseError.toString());

            }

        });
        return wheelsRimArrayL;
    }
    public static List<AccAndJunk> getAccessoriesItems(final List<AccAndJunk> accessoriesArrayL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Accessories").limitToLast(1);
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot accessoriesList: dataSnapshot.getChildren()) {
                    AccAndJunk accAndJunk = accessoriesList.getValue(AccAndJunk.class);
                    accessoriesArrayL.add(accAndJunk);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("TAG ERROR", databaseError.toString());

            }

        });
        return accessoriesArrayL;
    }

    public static List<AccAndJunk> getJunkCarItems(final List<AccAndJunk> junkArrayL) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("JunkCar").limitToLast(1);
        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot junkList: dataSnapshot.getChildren()) {
                    AccAndJunk accAndJunk = junkList.getValue(AccAndJunk.class);
                    junkArrayL.add(accAndJunk);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.i("TAG ERROR", databaseError.toString());

            }

        });
        return junkArrayL;
    }
}
