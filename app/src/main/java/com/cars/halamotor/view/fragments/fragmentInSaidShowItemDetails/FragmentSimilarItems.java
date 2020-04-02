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

public class FragmentSimilarItems extends Fragment {

    public FragmentSimilarItems(){}

    String category;
    DBHelper myDB;
    RecyclerView similarAds1,similarAds2,similarAds3;
    AdapterSimilarAds adapterSimilarAds,adapterSimilarAds2,adapterSimilarAds3;

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

    ArrayList<SimilarItem> similarContainerArrayL = new ArrayList<SimilarItem>();
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_item_selected_suggested, container, false);
        Log.i("TAG","Similar fragment");
        Log.i("TAG",category);
        inti();
        creteLoadSimilarList1();
        creteLoadSimilarList2();
        creteLoadSimilarList3();
        return view;
    }

    private void creteLoadSimilarList3() {
        similarAds3.setHasFixedSize(true);
        layoutManagerSimilar3 = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        similarAds3.setLayoutManager(layoutManagerSimilar3);
        adapterSimilarAds3 =new AdapterSimilarAds(getActivity(),similar3ArrayL
                ,"downloading");
        similarAds3.setAdapter(adapterSimilarAds3);
    }

    private void creteLoadSimilarList2() {
        similarAds2.setHasFixedSize(true);
        layoutManagerSimilar2 = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        similarAds2.setLayoutManager(layoutManagerSimilar2);
        adapterSimilarAds2 =new AdapterSimilarAds(getActivity(),similar2ArrayL
                ,"downloading");
        similarAds2.setAdapter(adapterSimilarAds2);
    }

    private void creteLoadSimilarList1() {
        similarAds1.setHasFixedSize(true);
        layoutManagerSimilar1 = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        similarAds1.setLayoutManager(layoutManagerSimilar1);
        adapterSimilarAds =new AdapterSimilarAds(getActivity(),similar1ArrayL
                ,"downloading");
        similarAds1.setAdapter(adapterSimilarAds);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fillSimilarLists();
        createSimilarRV();
        createSimilarRV2();
        createSimilarRV3();
    }

    private void createSimilarRV3() {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                similar3ArrayL = fillSimilar3ArrayL();
                similarAds3.setHasFixedSize(true);
                layoutManagerSimilar3 = new LinearLayoutManager(getActivity(),
                        LinearLayoutManager.HORIZONTAL, false);

                similarAds3.setLayoutManager(layoutManagerSimilar3);
                adapterSimilarAds3 =new AdapterSimilarAds(getActivity(),similar3ArrayL
                        ,"loaded");
                similarAds3.setAdapter(adapterSimilarAds3);
            }
        }, 2900);
    }

    private void createSimilarRV2() {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                similar2ArrayL = fillSimilar2ArrayL();
                similarAds2.setHasFixedSize(true);
                layoutManagerSimilar2 = new LinearLayoutManager(getActivity(),
                        LinearLayoutManager.HORIZONTAL, false);

                similarAds2.setLayoutManager(layoutManagerSimilar2);
                adapterSimilarAds2 =new AdapterSimilarAds(getActivity(),similar2ArrayL
                        ,"loaded");
                similarAds2.setAdapter(adapterSimilarAds2);
            }
        }, 2900);
    }

    private void fillSimilarLists() {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                similarContainerArrayL = getSimilarFromDatabase(getActivity());
            }
        }, 2800);
    }

    private void createSimilarRV() {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                similar1ArrayL = fillSimilar1ArrayL();
                similarAds1.setHasFixedSize(true);
                layoutManagerSimilar1 = new LinearLayoutManager(getActivity(),
                        LinearLayoutManager.HORIZONTAL, false);

                similarAds1.setLayoutManager(layoutManagerSimilar1);
                adapterSimilarAds =new AdapterSimilarAds(getActivity(),similar1ArrayL
                        ,"loaded");
                similarAds1.setAdapter(adapterSimilarAds);
            }
        }, 2900);
    }

    private void inti() {
        similarAds1 = (RecyclerView) view.findViewById(R.id.fragment_similar_1_RV);
        similarAds2 = (RecyclerView) view.findViewById(R.id.fragment_similar_2_RV);
        similarAds3 = (RecyclerView) view.findViewById(R.id.fragment_similar_3_RV);
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

    private void detectItemCategoryAndGetDataFromServer() {
        if (category.equals("JunkCar"))
        {

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

    private ArrayList<SimilarItem> fillSimilar1ArrayL() {
        similar1ArrayL = new ArrayList<SimilarItem>();

        similar1ArrayL.add(similarContainerArrayL.get(0));
        similar1ArrayL.add(similarContainerArrayL.get(1));
        similar1ArrayL.add(similarContainerArrayL.get(2));
        similar1ArrayL.add(similarContainerArrayL.get(3));
        similar1ArrayL.add(similarContainerArrayL.get(4));

        return similar1ArrayL;
    }

    private ArrayList<SimilarItem> fillSimilar2ArrayL() {
        similar2ArrayL = new ArrayList<SimilarItem>();

        similar2ArrayL.add(similarContainerArrayL.get(5));
        similar2ArrayL.add(similarContainerArrayL.get(6));
        similar2ArrayL.add(similarContainerArrayL.get(7));
        similar2ArrayL.add(similarContainerArrayL.get(8));
        similar2ArrayL.add(similarContainerArrayL.get(9));

        return similar2ArrayL;
    }

    private ArrayList<SimilarItem> fillSimilar3ArrayL() {
        similar3ArrayL = new ArrayList<SimilarItem>();

        similar3ArrayL.add(similarContainerArrayL.get(10));
        similar3ArrayL.add(similarContainerArrayL.get(11));
        similar3ArrayL.add(similarContainerArrayL.get(12));
        similar3ArrayL.add(similarContainerArrayL.get(13));
        similar3ArrayL.add(similarContainerArrayL.get(13));

        return similar3ArrayL;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getDataBaseInstance(getActivity()).deleteSimilarAds();

    }
}
