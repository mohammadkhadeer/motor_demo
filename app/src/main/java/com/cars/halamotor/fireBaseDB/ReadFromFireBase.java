package com.cars.halamotor.fireBaseDB;

import android.os.Handler;
import android.util.Log;

import com.cars.halamotor.model.AccAndJunk;
import com.cars.halamotor.model.BoostPost;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CCEMTFirestCase;
import com.cars.halamotor.model.CarPlatesModel;
import com.cars.halamotor.model.FavouriteCallSearch;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.model.WheelsRimModel;
import com.cars.halamotor.presnter.FCSItems;
import com.cars.halamotor.presnter.NumberOfAllowedAds;
import com.cars.halamotor.view.activity.WheelsRim;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.getUserPathInServer;
import static com.cars.halamotor.functions.FCSFunctions.convertCat;
import static com.cars.halamotor.functions.FCSFunctions.handelNumberOfObject;

public class ReadFromFireBase {

    public static void getFCSItems(final List<FavouriteCallSearch> favouriteCallSearches
            ,final FCSItems fcsItemsPresenter
            ,int numberOfObject) {
        final List<SuggestedItem> fcsItemsArrayList = new ArrayList<>();

        for (int i =0;i<numberOfObject;i++)
        {
            final String category = convertCat(favouriteCallSearches.get(i).getItemType());
            final String categoryBefore = favouriteCallSearches.get(i).getItemType();
            Log.i("TAG","Cat "+categoryBefore);
            Query mRef = null;
            mRef = FirebaseDatabase.getInstance().getReference().child("category")
                    .child(category)
                    .child(favouriteCallSearches.get(i).getIdInDatabase());
            mRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    fcsItemsArrayList.add(handelNumberOfObject(dataSnapshot,categoryBefore));
                }
                @Override
                public void onCancelled(DatabaseError databaseError) {
                }
            });
        }
        new Handler().postDelayed(new Runnable() {
            @Override public void run() { fcsItemsPresenter.getItemsObject(fcsItemsArrayList); }}, 3000);
    }

    public static List<CCEMT> getCarForSaleItems(final List<CCEMT> carForSaleL,int numberOfCarFromServer) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Car_For_Sale");
//        .limitToLast(numberOfCarFromServer);
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

    public static List<CCEMT> getCarForRentItems(final List<CCEMT> carForRentL,int numberOfCarFromServer) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Car_For_Rent").limitToLast(numberOfCarFromServer);
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

    public static List<CCEMT> getCarForExchangeItems(final List<CCEMT> carForExchangeL
            , int numberOfCarFromServer) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Car_For_Exchange").limitToLast(numberOfCarFromServer);
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

    public static List<CCEMT> getCarForExchangeItemsSearch(final List<CCEMT> carForExchangeL
            , int numberOfCarFromServer,String category,String carMake,String carModel,String year
            ,String carCondition,String carKilometers,String carTransmission
            ,String carFuel,String carColor) {
        Query mRef = null;
         mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child(category);

        mRef.limitToFirst(numberOfCarFromServer);
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

    public static List<CCEMT> getMotorcycleItems(final List<CCEMT> motorcycleArrayL,int numberOfMotorFromServer) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Motorcycle").limitToLast(numberOfMotorFromServer);
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

    public static List<CCEMT> getTruckItems(final List<CCEMT> trucksArrayL,int numberOfTruckFromServer) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Trucks").limitToLast(numberOfTruckFromServer);
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

    public static List<CarPlatesModel> getPlatesItems(final List<CarPlatesModel> platesArrayL,int numberOfCarPlatesFromServer) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Plates").limitToLast(numberOfCarPlatesFromServer);
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

    public static List<WheelsRimModel> getWheelsRimItems(final List<WheelsRimModel> wheelsRimArrayL,int numberOfWheelsFromServer) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Wheels_Rim").limitToLast(numberOfWheelsFromServer);
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

    public static List<AccAndJunk> getAccessoriesItems(final List<AccAndJunk> accessoriesArrayL,int numberOfAccessoriesFromServer) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("Accessories").limitToLast(numberOfAccessoriesFromServer);
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

    public static List<AccAndJunk> getJunkCarItems(final List<AccAndJunk> junkArrayL,int numberOfJunkCarFromServer) {
        Query mRef = FirebaseDatabase.getInstance().getReference()
                .child("category").child("JunkCar").limitToLast(numberOfJunkCarFromServer);
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
