package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;
import com.cars.halamotor.dataBase.DBHelper;
import com.cars.halamotor.model.AccAndJunk;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CarPlatesModel;
import com.cars.halamotor.model.SimilarItem;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.model.WheelsRimModel;
import com.cars.halamotor.view.adapters.AdapterSimilarAds;

import java.util.ArrayList;
import java.util.List;

import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.dataBase.InsertFunctions.insertAccAndJunkSimilarTable;
import static com.cars.halamotor.dataBase.InsertFunctions.insertCCEMTSimilarTable;
import static com.cars.halamotor.dataBase.ReadFunction.getSimilarFromDatabase;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getCarForExchangeItems;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getJunkCarItems;

public class FragmentSuggestedAntherItems extends Fragment {

    public FragmentSuggestedAntherItems(){}

    String category;
    DBHelper myDB;
    RecyclerView similarAds1,similarAds2,similarAds3;
    AdapterSimilarAds adapterSimilarAds;

    View view;
    List<CCEMT> carForRentList = new ArrayList<>();
    List<CCEMT> carForSaleList = new ArrayList<>();
    List<CCEMT> carForExchangeList = new ArrayList<>();
    List<CCEMT> motorcycleList = new ArrayList<>();
    List<CCEMT> truckList = new ArrayList<>();
    List<CarPlatesModel> carPlatesList = new ArrayList<>();
    List<WheelsRimModel> wheelsRimList = new ArrayList<>();
    List<AccAndJunk> accessoriesArrayL = new ArrayList<>();
    List<AccAndJunk> junkArrayL = new ArrayList<>();

    ArrayList<SimilarItem> similar1ArrayL = new ArrayList<SimilarItem>();
    ArrayList<SimilarItem> similar2ArrayL = new ArrayList<SimilarItem>();
    ArrayList<SimilarItem> similar3ArrayL = new ArrayList<SimilarItem>();

    RecyclerView.LayoutManager layoutManagerSimilar1,layoutManagerSimilar2,layoutManagerSimilar3;

    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            category = getArguments().getString("category");
            category = "Car_For_Exchange";
        }
        super.onAttach(context);
        myDB = getDataBaseInstance(getActivity());
        detectItemCategoryAndGetDataFromServer();
        //similar1ArrayL = getCarForExchangeItems(similar1ArrayL,2);

    }

    private void detectItemCategoryAndGetDataFromServer() {
        if (category.equals("JunkCar"))
        {
            getJunkCar();
        }
        if (category.equals("Accessories"))
        {

        }
        if (category.equals("Wheels_Rim"))
        {

        }
        if (category.equals("Plates"))
        {

        }
        if (category.equals("Trucks"))
        {

        }
        if (category.equals("Motorcycle"))
        {

        }
        if (category.equals("Car_For_Exchange"))
        {
            getCarExchange();
        }
        if (category.equals("Car_For_Rent"))
        {

        }
        if (category.equals("Car_For_Sale"))
        {

        }
    }

    private void getCarExchange() {
        carForExchangeList = getCarForExchangeItems(carForExchangeList,15);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() { insertCarForExchangeToDataBase();
            }
        }, 2700);
    }

    private void insertCarForExchangeToDataBase() {
        for (int i=0;i<carForExchangeList.size();i++)
        {
            insertCCEMTSimilarTable(carForExchangeList.get(i),myDB);
        }
    }

    private void getJunkCar() {
        junkArrayL = getJunkCarItems(junkArrayL,9);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                insertJunkRimToDataBase();
            }
        }, 2700);
    }

    private void insertJunkRimToDataBase() {
        for (int i=0;i<junkArrayL.size();i++)
        {
            insertAccAndJunkSimilarTable(junkArrayL.get(i),myDB);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_item_selected_suggested, container, false);
        Log.i("TAG","********");
        Log.i("TAG",category);
        inti();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createSimilarRV();
    }

    private void createSimilarRV() {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                similar1ArrayL = new ArrayList<SimilarItem>();
                similar1ArrayL = getSimilarFromDatabase(getActivity());
                similarAds1.setHasFixedSize(true);
                layoutManagerSimilar1 = new LinearLayoutManager(getActivity(),
                        LinearLayoutManager.HORIZONTAL, false);

                similarAds1.setLayoutManager(layoutManagerSimilar1);
                adapterSimilarAds =new AdapterSimilarAds(getActivity(),similar1ArrayL);
                similarAds1.setAdapter(adapterSimilarAds);
            }
        }, 2700);
    }

    private void inti() {
        similarAds1 = (RecyclerView) view.findViewById(R.id.fragment_similar_1_RV);
        similarAds2 = (RecyclerView) view.findViewById(R.id.fragment_similar_2_RV);
        similarAds3 = (RecyclerView) view.findViewById(R.id.fragment_similar_3_RV);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getDataBaseInstance(getActivity()).deleteSimilarAds();

    }
}
