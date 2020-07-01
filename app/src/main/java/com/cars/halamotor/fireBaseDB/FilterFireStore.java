package com.cars.halamotor.fireBaseDB;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.FCSFunctions;
import com.cars.halamotor.model.ItemCCEMT;
import com.cars.halamotor.model.ItemSelectedFilterModel;
import com.cars.halamotor.model.SuggestedItem;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

import static com.cars.halamotor.fireBaseDB.FireStorePaths.getDataStoreInstance;
import static com.cars.halamotor.functions.FCSFunctions.convertCat;

public class FilterFireStore {

    public static void filterResult(ArrayList<ItemSelectedFilterModel> itemFilterArrayList,int burnedPrice,Context context){
        List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final String category = convertCat(itemFilterArrayList.get(0).getFilterS());
        final String categoryBefore = itemFilterArrayList.get(0).getFilterS();

        if (itemFilterArrayList.size() ==1)
        {
            Log.i("TAG","*************************************");
            Log.i("TAG","FilterNumber: "+String.valueOf(itemFilterArrayList.size()));

            resultItemsArrayList = getResult(category,categoryBefore,0.0,100000000.0,burnedPrice);
        }

        if (itemFilterArrayList.size() ==2)
        {
            Log.i("TAG","*************************************");
            Log.i("TAG","FilterNumber: "+String.valueOf(itemFilterArrayList.size()));
            resultItemsArrayList = new ArrayList<>();

            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.exchange_car)))
            {
                String carMake = itemFilterArrayList.get(1).getFilterS();
                resultItemsArrayList = getResultMake(category,categoryBefore,0.0,100000000.0,burnedPrice,carMake);

            }else{
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                Log.i("TAG","priceFrom: "+String.valueOf(priceFrom));
                resultItemsArrayList = getResult(category,categoryBefore,priceFrom,100000000.0,burnedPrice);
            }
        }

        if (itemFilterArrayList.size() ==3)
        {
            Log.i("TAG","*************************************");
            Log.i("TAG","FilterNumber: "+String.valueOf(itemFilterArrayList.size()));

            resultItemsArrayList = new ArrayList<>();
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.exchange_car)))
            {
                String carMake = itemFilterArrayList.get(1).getFilterS();
                String carModel = itemFilterArrayList.get(2).getFilterS();
                resultItemsArrayList = getResultCarModel(category,categoryBefore,0.0,100000000.0,burnedPrice,carMake,carModel);

            }else {
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());
                resultItemsArrayList = getResult(category, categoryBefore, priceFrom, priceTo, burnedPrice);
            }
        }
        if(itemFilterArrayList.size()==4)
        {
            Log.i("TAG","CarMake if car CCEMT wheelsSize carPlats city");
            Log.i("TAG","FilterNumber: "+String.valueOf(itemFilterArrayList.size()));
            resultItemsArrayList = new ArrayList<>();
            double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
            double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());

            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_rent))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.trucks))
            )
            {
                String carMake = itemFilterArrayList.get(3).getFilterS();
                resultItemsArrayList = getResultMake(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake);

            }
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.wheels_rim))
            ){
                int wheelsSize = Integer.parseInt(itemFilterArrayList.get(3).getFilterS());
                resultItemsArrayList = getWheelsSize(category,categoryBefore,priceFrom,priceTo,burnedPrice,wheelsSize);
            }
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_plates))
            ){
                String platesCity = itemFilterArrayList.get(3).getFilterS();
                resultItemsArrayList = getPlatesCity(category,categoryBefore,priceFrom,priceTo,burnedPrice,platesCity);
            }
        }

        if(itemFilterArrayList.size()==5)
        {
            Log.i("TAG","CarModel if car CCEMT wheels Type");
            Log.i("TAG","FilterNumber: "+String.valueOf(itemFilterArrayList.size()));
            resultItemsArrayList = new ArrayList<>();
            double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
            double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());

            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_rent))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.trucks))
            )
            {
                String carMake = itemFilterArrayList.get(3).getFilterS();
                String carModel = itemFilterArrayList.get(4).getFilterS();
                resultItemsArrayList = getResultCarModel(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel);

            }
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.wheels_rim))
            ){
                int wheelsSize = Integer.parseInt(itemFilterArrayList.get(3).getFilterS());
                String wheelsType = itemFilterArrayList.get(4).getFilterS();
                resultItemsArrayList = getWheelsType(category,categoryBefore,priceFrom,priceTo,burnedPrice,wheelsSize,wheelsType);
            }
        }

        if (itemFilterArrayList.size() ==6)
        {
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_rent))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.trucks))
            )
            {
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());
                String carMake = itemFilterArrayList.get(3).getFilterS();
                String carModel = itemFilterArrayList.get(4).getFilterS();
                int year = Integer.parseInt(itemFilterArrayList.get(5).getFilterS());

                resultItemsArrayList = getResultYear(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year);
            }
        }

        if (itemFilterArrayList.size() ==7)
        {
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_rent))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.trucks))
            )
            {
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());
                String carMake = itemFilterArrayList.get(3).getFilterS();
                String carModel = itemFilterArrayList.get(4).getFilterS();
                int year = Integer.parseInt(itemFilterArrayList.get(5).getFilterS());
                String carPayment = itemFilterArrayList.get(6).getFilterS();

                resultItemsArrayList = getResultPayment(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment);
            }
        }

        if (itemFilterArrayList.size() ==8)
        {
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.trucks))
            )
            {
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());
                String carMake = itemFilterArrayList.get(3).getFilterS();
                String carModel = itemFilterArrayList.get(4).getFilterS();
                int year = Integer.parseInt(itemFilterArrayList.get(5).getFilterS());
                String carPayment = itemFilterArrayList.get(6).getFilterS();
                String carCondition = itemFilterArrayList.get(7).getFilterS();

                resultItemsArrayList = getResultCondition(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition);
            }
        }

        if (itemFilterArrayList.size() ==9)
        {
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.trucks))
            )
            {
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());
                String carMake = itemFilterArrayList.get(3).getFilterS();
                String carModel = itemFilterArrayList.get(4).getFilterS();
                int year = Integer.parseInt(itemFilterArrayList.get(5).getFilterS());
                String carPayment = itemFilterArrayList.get(6).getFilterS();
                String carCondition = itemFilterArrayList.get(7).getFilterS();
                String carInsuranceS = itemFilterArrayList.get(8).getFilterS();

                resultItemsArrayList = getResultInsurance(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,carInsuranceS);
            }
        }

        if (itemFilterArrayList.size() ==10)
        {
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.trucks))
            )
            {
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());
                String carMake = itemFilterArrayList.get(3).getFilterS();
                String carModel = itemFilterArrayList.get(4).getFilterS();
                int year = Integer.parseInt(itemFilterArrayList.get(5).getFilterS());
                String carPayment = itemFilterArrayList.get(6).getFilterS();
                String carCondition = itemFilterArrayList.get(7).getFilterS();
                String carInsuranceS = itemFilterArrayList.get(8).getFilterS();
                String carLicensed = itemFilterArrayList.get(9).getFilterS();

                resultItemsArrayList = getResultLicensed(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,carInsuranceS,carLicensed);
            }
        }

        if (itemFilterArrayList.size() ==11)
        {
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.trucks))
            )
            {
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());
                String carMake = itemFilterArrayList.get(3).getFilterS();
                String carModel = itemFilterArrayList.get(4).getFilterS();
                int year = Integer.parseInt(itemFilterArrayList.get(5).getFilterS());
                String carPayment = itemFilterArrayList.get(6).getFilterS();
                String carCondition = itemFilterArrayList.get(7).getFilterS();
                String carInsuranceS = itemFilterArrayList.get(8).getFilterS();
                String carLicensed = itemFilterArrayList.get(9).getFilterS();
                String carFuel = itemFilterArrayList.get(10).getFilterS();

                resultItemsArrayList = getResultFuel(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,carInsuranceS,carLicensed,carFuel);
            }
        }

    }

    private static List<SuggestedItem> getPlatesCity(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice,String platesCity) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carPlatesCityS",platesCity )
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }

    private static List<SuggestedItem> getWheelsType(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice,int wheelsSize,String wheelsType) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("wheelSizeInt",wheelsSize )
                .whereEqualTo("wheelsTypeS",wheelsType )
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }

    private static List<SuggestedItem> getWheelsSize(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice,int wheelsSize) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("wheelSizeInt",wheelsSize )
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }

    private static List<SuggestedItem> getResult(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }

    private static List<SuggestedItem> getResultMake(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }

    private static List<SuggestedItem> getResultCarModel(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereEqualTo("carModelS",carModel)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }

    private static List<SuggestedItem> getResultYear(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereEqualTo("carModelS",carModel)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .whereEqualTo("yearS",year)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }

    private static List<SuggestedItem> getResultPayment(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereEqualTo("carModelS",carModel)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .whereEqualTo("yearS",year)
                .whereEqualTo("paymentMethod",carPayment)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }


    private static List<SuggestedItem> getResultCondition(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment,String condition) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereEqualTo("carModelS",carModel)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .whereEqualTo("yearS",year)
                .whereEqualTo("paymentMethod",carPayment)
                .whereEqualTo("conditionS",condition)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }


    private static List<SuggestedItem> getResultLicensed(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment,String condition,String insurance,String carLicensed) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereEqualTo("carModelS",carModel)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .whereEqualTo("yearS",year)
                .whereEqualTo("paymentMethod",carPayment)
                .whereEqualTo("conditionS",condition)
                .whereEqualTo("insuranceS",insurance)
                .whereEqualTo("carLicenseS",carLicensed)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }

    private static List<SuggestedItem> getResultInsurance(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment,String condition,String insurance) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereEqualTo("carModelS",carModel)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .whereEqualTo("yearS",year)
                .whereEqualTo("paymentMethod",carPayment)
                .whereEqualTo("conditionS",condition)
                .whereEqualTo("insuranceS",insurance)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }

    private static List<SuggestedItem> getResultFuel(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment,String condition,String insurance,String carLicensed,String carFuel) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereEqualTo("carModelS",carModel)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .whereEqualTo("yearS",year)
                .whereEqualTo("paymentMethod",carPayment)
                .whereEqualTo("conditionS",condition)
                .whereEqualTo("insuranceS",insurance)
                .whereEqualTo("carLicenseS",carLicensed)
                .whereEqualTo("fuelS",carFuel)
                .limit(8)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));

                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return resultItemsArrayList;
    }


}
