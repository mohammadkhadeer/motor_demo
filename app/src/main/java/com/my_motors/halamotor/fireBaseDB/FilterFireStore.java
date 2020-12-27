package com.my_motors.halamotor.fireBaseDB;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.Log;

import com.my_motors.halamotor.R;
import com.my_motors.halamotor.functions.FCSFunctions;
import com.my_motors.halamotor.model.ItemSelectedFilterModel;
import com.my_motors.halamotor.model.ResultFilter;
import com.my_motors.halamotor.model.SuggestedItem;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

import static com.my_motors.halamotor.fireBaseDB.FireStorePaths.getDataStoreInstance;
import static com.my_motors.halamotor.functions.FCSFunctions.convertCat;

public class FilterFireStore {
    public static ResultFilter filterResult(ArrayList<ItemSelectedFilterModel> itemFilterArrayList
            , int burnedPrice, Context context, String city, String neighborhood,int numberResult){
        /*
        I return data from server as a object coz i well needed if user have to get more
        data same data must to base 1.CollectionReference "bath data coz we have categories"
        2.DocumentSnapshot "array list" coz can't base DocumentSnapshot as single value
        in fireStore so we us it as arrayList well needed if user try to get more data
        must start return new data from end first response best way to do this send
        last DocumentSnapshot as filter
        3.list of object of response
        we use a number of filter depend list to can fill a next filter
         */

        ResultFilter resultFilter = null;

        final String category = convertCat(itemFilterArrayList.get(0).getFilterType());
        final String categoryBefore = itemFilterArrayList.get(0).getFilterType();
        if (itemFilterArrayList.size() ==1)
        {
            if (city.equals("empty")){
                resultFilter = getResult(category,categoryBefore,0.0,100000000.0,burnedPrice,numberResult);
            }else{
                resultFilter = getResultWithCityOrNeighborhood(category,categoryBefore,0.0,100000000.0,burnedPrice,city,neighborhood,numberResult);
            }
        }

        if (itemFilterArrayList.size() ==2)
        {
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.exchange_car)))
            {
                String carMake = itemFilterArrayList.get(1).getFilterS();
                if (city.equals("empty")) {
                    resultFilter = getResultMake(category, categoryBefore, 0.0, 100000000.0, burnedPrice, carMake,numberResult);
                }else{
                    resultFilter = getResultMakeWithCityOrNeighborhood(category, categoryBefore, 0.0, 100000000.0, burnedPrice, carMake,city,neighborhood,numberResult);
                }
            }else{
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                if (city.equals("empty")) {
                    resultFilter = getResult(category, categoryBefore, priceFrom, 100000000.0, burnedPrice,numberResult);
                    }else{
                    resultFilter = getResultWithCityOrNeighborhood(category, categoryBefore, priceFrom, 100000000.0, burnedPrice,city,neighborhood,numberResult);
                    }
                }
        }

        if (itemFilterArrayList.size() ==3)
        {
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.exchange_car)))
            {
                String carMake = itemFilterArrayList.get(1).getFilterS();
                String carModel = itemFilterArrayList.get(2).getFilterS();
                if (city.equals("empty")) {
                    resultFilter = getResultCarModel(category, categoryBefore, 0.0, 100000000.0, burnedPrice, carMake, carModel,numberResult);
                }else{
                    resultFilter = getResultCarModelWithCityOrNeighborhood(category, categoryBefore, 0.0, 100000000.0, burnedPrice, carMake, carModel,city,neighborhood,numberResult);
                }
            }else {
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());
                if (city.equals("empty")) {
                    resultFilter = getResult(category, categoryBefore, priceFrom, priceTo, burnedPrice,numberResult);
                }else{
                    resultFilter = getResultWithCityOrNeighborhood(category, categoryBefore, priceFrom, priceTo, burnedPrice,city,neighborhood,numberResult);
                }
            }
        }

        if(itemFilterArrayList.size()==4)
        {
            double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
            double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());

            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_rent))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.trucks))
            )
            {
                String carMake = itemFilterArrayList.get(3).getFilterS();
                if (city.equals("empty"))
                {
                    resultFilter = getResultMake(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,numberResult);
                }else{
                    resultFilter = getResultMakeWithCityOrNeighborhood(category, categoryBefore, 0.0, 100000000.0, burnedPrice, carMake,city,neighborhood,numberResult);
                }
            }

            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.wheels_rim))
            ){
                int wheelsSize = Integer.parseInt(itemFilterArrayList.get(3).getFilterS());
                if (city.equals("empty"))
                {
                    resultFilter = getWheelsSize(category,categoryBefore,priceFrom,priceTo,burnedPrice,wheelsSize,numberResult);
                }else{
                    resultFilter = getWheelsSizeWithCityOrNeighborhood(category,categoryBefore,priceFrom,priceTo,burnedPrice,wheelsSize,city,neighborhood,numberResult);
                }
            }

            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_plates))
            ){
                String platesCity = itemFilterArrayList.get(3).getFilterS();
                if (city.equals("empty"))
                {
                    resultFilter = getPlatesCity(category,categoryBefore,priceFrom,priceTo,burnedPrice,platesCity,numberResult);
                }else{
                    resultFilter = getPlatesCityWithCityOrNeighborhood(category,categoryBefore,priceFrom,priceTo,burnedPrice,platesCity,city,neighborhood,numberResult);
                }
            }

        }

        if(itemFilterArrayList.size()==5)
        {
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
                if (city.equals("empty"))
                {
                    resultFilter = getResultCarModel(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,numberResult);
                }else{
                    resultFilter = getResultCarModelWithCityOrNeighborhood(category, categoryBefore, 0.0, 100000000.0, burnedPrice, carMake, carModel,city,neighborhood,numberResult);
                }

            }

            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.wheels_rim)))
            {
                int wheelsSize = Integer.parseInt(itemFilterArrayList.get(3).getFilterS());
                String wheelsType = itemFilterArrayList.get(4).getFilterS();
                if (city.equals("empty"))
                {
                    resultFilter = getWheelsType(category,categoryBefore,priceFrom,priceTo,burnedPrice,wheelsSize,wheelsType,numberResult);
                }else{
                    resultFilter = getWheelsTypeWithCityOrNeighborhood(category,categoryBefore,priceFrom,priceTo,burnedPrice,wheelsSize,wheelsType,city,neighborhood,numberResult);
                }
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

                if (city.equals("empty"))
                {
                    resultFilter = getResultYear(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,numberResult);
                }else{
                    resultFilter = getResultYearWithCityOrNeighborhood(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,city,neighborhood,numberResult);
                }
            }

        }

        if (itemFilterArrayList.size() ==7)
        {
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_rent))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
            )
            {
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());
                String carMake = itemFilterArrayList.get(3).getFilterS();
                String carModel = itemFilterArrayList.get(4).getFilterS();
                int year = Integer.parseInt(itemFilterArrayList.get(5).getFilterS());
                String carPayment = itemFilterArrayList.get(6).getFilterS();

                if (city.equals("empty")){
                    resultFilter = getResultPayment(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,numberResult);
                }else{
                    resultFilter = getResultPaymentWithCityOrNeighborhood(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,city,neighborhood,numberResult);
                }
            }
        }

        if (itemFilterArrayList.size() ==8)
        {
            if (itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.car_for_sale))
                    || itemFilterArrayList.get(0).getFilterType().equals(context.getResources().getString(R.string.motorcycle))
            )
            {
                double priceFrom = Double.parseDouble(itemFilterArrayList.get(1).getFilterS());
                double priceTo = Double.parseDouble(itemFilterArrayList.get(2).getFilterS());
                String carMake = itemFilterArrayList.get(3).getFilterS();
                String carModel = itemFilterArrayList.get(4).getFilterS();
                int year = Integer.parseInt(itemFilterArrayList.get(5).getFilterS());
                String carPayment = itemFilterArrayList.get(6).getFilterS();
                String carCondition = itemFilterArrayList.get(7).getFilterS();

                if (city.equals("empty")){
                    resultFilter = getResultCondition(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,numberResult);
                }else{
                    resultFilter = getResultConditionWithCityOrNeighborhood(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,city,neighborhood,numberResult);
                }
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

                if (city.equals("empty")){
                    resultFilter = getResultInsurance(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,carInsuranceS,numberResult);
                }else{
                    resultFilter = getResultInsuranceWithCityOrNeighborhood(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,carInsuranceS,city,neighborhood,numberResult);
                }
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

                if (city.equals("empty")){
                    resultFilter = getResultLicensed(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,carInsuranceS,carLicensed,numberResult);
                }else{
                    resultFilter = getResultLicensedWithCityOrNeighborhood(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,carInsuranceS,carLicensed,city,neighborhood,numberResult);
                }
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

                if (city.equals("empty")){
                    resultFilter = getResultFuel(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,carInsuranceS,carLicensed,carFuel,numberResult);
                }else{
                    resultFilter = getResultFuelWithCityOrNeighborhood(category,categoryBefore,priceFrom,priceTo,burnedPrice,carMake,carModel,year,carPayment,carCondition,carInsuranceS,carLicensed,carFuel,city,neighborhood,numberResult);
                }
            }
        }

        return resultFilter;
    }

    private static ResultFilter getPlatesCity(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice,String platesCity,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carPlatesCityS",platesCity )
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }

    private static ResultFilter getWheelsType(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice,int wheelsSize,String wheelsType,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("wheelSizeInt",wheelsSize )
                .whereEqualTo("wheelsTypeS",wheelsType )
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }

    private static ResultFilter getWheelsSize(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice,int wheelsSize,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("wheelSizeInt",wheelsSize )
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }

    private static ResultFilter getResult(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice,int numberResult) {

        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             // we set on list cos no way to bas last documentSnapshots to start from it when load more
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 });
        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }

    private static ResultFilter getResultMake(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(numberResult)
                .orderBy("price")
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }

    private static ResultFilter getResultCarModel(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereEqualTo("carModelS",carModel)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }

    private static ResultFilter getResultYear(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereEqualTo("carModelS",carModel)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .whereEqualTo("yearS",year)
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }

    private static ResultFilter getResultPayment(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

        CollectionReference mRef = getDataStoreInstance().collection(category);
        mRef.whereEqualTo("activeOrNotS", "1")
                .whereEqualTo("burnedPrice",burnedPrice )
                .whereEqualTo("carMakeS",carMake)
                .whereEqualTo("carModelS",carModel)
                .whereGreaterThan("price",priceFrom)
                .whereLessThanOrEqualTo("price",priceTo)
                .whereEqualTo("yearS",year)
                .whereEqualTo("paymentMethod",carPayment)
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }


    private static ResultFilter getResultCondition(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment,String condition,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

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
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);

                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }


    private static ResultFilter getResultLicensed(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment,String condition,String insurance,String carLicensed,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

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
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }

    private static ResultFilter getResultInsurance(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment,String condition,String insurance,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

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
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }

    private static ResultFilter getResultFuel(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment,String condition,String insurance,String carLicensed,String carFuel,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();

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
                .limit(numberResult)
                .get().addOnSuccessListener
                (new OnSuccessListener<QuerySnapshot>() {
                     @Override
                     public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                         for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                             Log.i("TAG", "Object " + documentSnapshots);
                             resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                             documentSnapshotsArrayL.add(documentSnapshots);
                         }
                     }
                 }
                ).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.d("ERROR fireStore", e.toString());
            }
        });

        return new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
    }

    private static ResultFilter getResultWithCityOrNeighborhood(String category
            , final String categoryBefore, Double priceFrom, Double priceTo
            ,int burnedPrice,String city,String neighborhood,int numberResult) {

        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        ResultFilter resultFilter = null;
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();


        if (neighborhood.equals("empty"))
        {
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }


        return resultFilter;
    }

    private static ResultFilter getWheelsSizeWithCityOrNeighborhood(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice,int wheelsSize,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter =null;

        if (neighborhood.equals("empty"))
        {
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("wheelSizeInt",wheelsSize )
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("wheelSizeInt",wheelsSize )
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }

        return resultFilter;
    }

    private static ResultFilter getPlatesCityWithCityOrNeighborhood(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice,String platesCity,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter = null;

        if (neighborhood.equals("empty"))
        {
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carPlatesCityS",platesCity )
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carPlatesCityS",platesCity )
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }

        return resultFilter;
    }

    private static ResultFilter getWheelsTypeWithCityOrNeighborhood(String category, final String categoryBefore, Double priceFrom, Double priceTo,int burnedPrice,int wheelsSize,String wheelsType,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter = null;

        if (neighborhood.equals("empty"))
        {
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("wheelSizeInt",wheelsSize )
                    .whereEqualTo("wheelsTypeS",wheelsType )
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("wheelSizeInt",wheelsSize )
                    .whereEqualTo("wheelsTypeS",wheelsType )
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }

        return resultFilter;
    }

    private static ResultFilter getResultMakeWithCityOrNeighborhood(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter =null;
        if (neighborhood.equals("empty"))
        {
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }

        return resultFilter;
    }

    private static ResultFilter getResultCarModelWithCityOrNeighborhood(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter =null;

        if (neighborhood.equals("empty"))
        {
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }

        return resultFilter;
    }

    private static ResultFilter getResultYearWithCityOrNeighborhood(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake
            ,String carModel,int year,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter=null;

        if (neighborhood.equals("empty"))
        {
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }

        return resultFilter;
    }

    private static ResultFilter getResultPaymentWithCityOrNeighborhood(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake
            ,String carModel,int year,String carPayment,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter=null;

        if (neighborhood.equals("empty")){
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .whereEqualTo("paymentMethod",carPayment)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .whereEqualTo("paymentMethod",carPayment)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }

        return resultFilter;
    }

    private static ResultFilter getResultConditionWithCityOrNeighborhood(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel
            ,int year,String carPayment,String condition,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter=null;

        if (neighborhood.equals("empty")){
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .whereEqualTo("paymentMethod",carPayment)
                    .whereEqualTo("conditionS",condition)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);

                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .whereEqualTo("paymentMethod",carPayment)
                    .whereEqualTo("conditionS",condition)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);

                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }

        return resultFilter;
    }

    private static ResultFilter getResultInsuranceWithCityOrNeighborhood(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel
            ,int year,String carPayment,String condition,String insurance,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter=null;

        if (neighborhood.equals("empty")){
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .whereEqualTo("paymentMethod",carPayment)
                    .whereEqualTo("conditionS",condition)
                    .whereEqualTo("insuranceS",insurance)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .whereEqualTo("paymentMethod",carPayment)
                    .whereEqualTo("conditionS",condition)
                    .whereEqualTo("insuranceS",insurance)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }

        return resultFilter;
    }

    private static ResultFilter getResultLicensedWithCityOrNeighborhood(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel,int year,String carPayment
            ,String condition,String insurance,String carLicensed,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter=null;

        if (neighborhood.equals("empty")){
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .whereEqualTo("paymentMethod",carPayment)
                    .whereEqualTo("conditionS",condition)
                    .whereEqualTo("insuranceS",insurance)
                    .whereEqualTo("carLicenseS",carLicensed)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .whereEqualTo("paymentMethod",carPayment)
                    .whereEqualTo("conditionS",condition)
                    .whereEqualTo("insuranceS",insurance)
                    .whereEqualTo("carLicenseS",carLicensed)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }

        return resultFilter;
    }

    private static ResultFilter getResultFuelWithCityOrNeighborhood(String category, final String categoryBefore
            , Double priceFrom, Double priceTo,int burnedPrice,String carMake,String carModel
            ,int year,String carPayment,String condition,String insurance
            ,String carLicensed,String carFuel,String city,String neighborhood,int numberResult) {
        final List<SuggestedItem> resultItemsArrayList = new ArrayList<>();
        final List<DocumentSnapshot> documentSnapshotsArrayL = new ArrayList<>();
        ResultFilter resultFilter=null;

        if (neighborhood.equals("empty")){
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .whereEqualTo("paymentMethod",carPayment)
                    .whereEqualTo("conditionS",condition)
                    .whereEqualTo("insuranceS",insurance)
                    .whereEqualTo("carLicenseS",carLicensed)
                    .whereEqualTo("fuelS",carFuel)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }else{
            CollectionReference mRef = getDataStoreInstance().collection(category);
            mRef.whereEqualTo("activeOrNotS", "1")
                    .whereEqualTo("burnedPrice",burnedPrice )
                    .whereEqualTo("carMakeS",carMake)
                    .whereEqualTo("carModelS",carModel)
                    .whereEqualTo("cityS",city )
                    .whereEqualTo("neighborhoodS",neighborhood )
                    .whereGreaterThan("price",priceFrom)
                    .whereLessThanOrEqualTo("price",priceTo)
                    .whereEqualTo("yearS",year)
                    .whereEqualTo("paymentMethod",carPayment)
                    .whereEqualTo("conditionS",condition)
                    .whereEqualTo("insuranceS",insurance)
                    .whereEqualTo("carLicenseS",carLicensed)
                    .whereEqualTo("fuelS",carFuel)
                    .limit(numberResult)
                    .get().addOnSuccessListener
                    (new OnSuccessListener<QuerySnapshot>() {
                         @Override
                         public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                             for (QueryDocumentSnapshot documentSnapshots : queryDocumentSnapshots) {
//                                 Log.i("TAG", "Object " + documentSnapshots);
                                 resultItemsArrayList.add(FCSFunctions.handelNumberOfObject(documentSnapshots,categoryBefore));
                                 documentSnapshotsArrayL.add(documentSnapshots);
                             }
                         }
                     }
                    ).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.d("ERROR fireStore", e.toString());
                }
            });
            resultFilter = new ResultFilter(resultItemsArrayList,documentSnapshotsArrayL,mRef);
        }
        return resultFilter;
    }

}
