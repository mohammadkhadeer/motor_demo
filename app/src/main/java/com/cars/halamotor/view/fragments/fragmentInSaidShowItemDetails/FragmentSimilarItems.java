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
import com.cars.halamotor.model.AccAndJunkFirstCase;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CCEMTFirestCase;
import com.cars.halamotor.model.CarPlatesFirstCase;
import com.cars.halamotor.model.CarPlatesModel;
import com.cars.halamotor.model.ItemAccAndJunk;
import com.cars.halamotor.model.ItemCCEMT;
import com.cars.halamotor.model.ItemPlates;
import com.cars.halamotor.model.ItemWheelsRim;
import com.cars.halamotor.model.SimilarItem;
import com.cars.halamotor.model.WheelsRimFirstCase;
import com.cars.halamotor.model.WheelsRimModel;
import com.cars.halamotor.view.adapters.adapterShowItemDetails.AdapterSimilarAds;
import java.util.ArrayList;
import java.util.List;
import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.dataBase.InsertFunctions.insertAccAndJunkSimilarTable;
import static com.cars.halamotor.dataBase.InsertFunctions.insertCCEMTSimilarTable;
import static com.cars.halamotor.dataBase.InsertFunctions.insertCarPlatesSimilarTable;
import static com.cars.halamotor.dataBase.InsertFunctions.insertWheelsRimSimilarTable;
import static com.cars.halamotor.dataBase.ReadFunction.getSimilarFromDatabase;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getAccessoriesItems;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getCarForExchangeItems;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getCarForExchangeItemsSearch;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getJunkCarItems;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getPlatesItems;
import static com.cars.halamotor.fireBaseDB.ReadFromFireBase.getWheelsRimItems;
import static com.cars.halamotor.fireBaseDB.ReadFromFireStore.getAccessoriesFireStore;
import static com.cars.halamotor.fireBaseDB.ReadFromFireStore.getCarForSaleExchangeFireStore;
import static com.cars.halamotor.fireBaseDB.ReadFromFireStore.getCarForSaleRentFireStore;
import static com.cars.halamotor.fireBaseDB.ReadFromFireStore.getJunkCarPath;
import static com.cars.halamotor.fireBaseDB.ReadFromFireStore.getMotorcycleFireStore;
import static com.cars.halamotor.fireBaseDB.ReadFromFireStore.getPlatesFireStore;
import static com.cars.halamotor.fireBaseDB.ReadFromFireStore.getTrucksFireStore;
import static com.cars.halamotor.fireBaseDB.ReadFromFireStore.getWheelsRimFireStore;
import static com.cars.halamotor.functions.Functions.replace;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getAccAndJunkFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getCCEMTFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getCarPlatesFirstCaseFromDB;
import static com.cars.halamotor.functions.HandelItemObjectBeforePass.getWheelsRimFirstCaseFromDB;

public class FragmentSimilarItems extends Fragment {

    public FragmentSimilarItems(){}

    String categoryStr,itemIDStr;
    DBHelper myDB;
    RecyclerView similarAds1,similarAds2,similarAds3;
    AdapterSimilarAds adapterSimilarAds,adapterSimilarAds2,adapterSimilarAds3;

    View view;
    List<ItemCCEMT> carForRentList = new ArrayList<>();
    List<ItemCCEMT> carForSaleList = new ArrayList<>();
    List<ItemCCEMT> carForExchangeList = new ArrayList<>();
    List<ItemCCEMT> motorcycleList = new ArrayList<>();
    List<ItemCCEMT> truckList = new ArrayList<>();
    List<ItemPlates> carPlatesList = new ArrayList<>();
    List<ItemWheelsRim> wheelsRimList = new ArrayList<>();
    List<ItemAccAndJunk> accessoriesArrayL = new ArrayList<>();
    List<ItemAccAndJunk> junkArrayL = new ArrayList<>();

    ArrayList<SimilarItem> similarContainerArrayL = new ArrayList<SimilarItem>();
    ArrayList<SimilarItem> similar1ArrayL = new ArrayList<SimilarItem>();
    ArrayList<SimilarItem> similar2ArrayL = new ArrayList<SimilarItem>();
    ArrayList<SimilarItem> similar3ArrayL = new ArrayList<SimilarItem>();

    RecyclerView.LayoutManager layoutManagerSimilar1,layoutManagerSimilar2,layoutManagerSimilar3;
    int dataComeFromServer=0;

    CCEMTFirestCase ccemtFirestCase;
    CarPlatesFirstCase carPlatesFirstCase;
    WheelsRimFirstCase wheelsRimFirstCase;
    AccAndJunkFirstCase accAndJunkFirstCase;

    @Override
    public void onAttach(Context context) {
        if (dataComeFromServer ==1)
        dataComeFromServer=0;
        if (getArguments() != null) {
            categoryStr = getArguments().getString("category");
            categoryStr = replace(categoryStr);
            itemIDStr = getArguments().getString("itemID");
//            categoryStr = "Car_For_Exchange";
        }
        super.onAttach(context);
        myDB = getDataBaseInstance(getActivity());
        detectObject();
        detectItemCategoryAndGetDataFromServer();
    }

    private void detectObject() {
        if (categoryStr.equals("Car for sale")
                ||categoryStr.equals("Car for rent")
                ||categoryStr.equals("Exchange car")
                ||categoryStr.equals("Motorcycle")
                ||categoryStr.equals("Trucks")
        ) {
            ccemtFirestCase =getCCEMTFirstCaseFromDB(itemIDStr,getActivity());
        }
        if (categoryStr.equals("Car plates"))
        {
            carPlatesFirstCase =getCarPlatesFirstCaseFromDB(itemIDStr,getActivity());
        }
        if (categoryStr.equals("Wheels rim"))
        {
            wheelsRimFirstCase =getWheelsRimFirstCaseFromDB(itemIDStr,getActivity());
        }
        if (categoryStr.equals("Accessories") || categoryStr.equals("Junk car"))
        {
            accAndJunkFirstCase =getAccAndJunkFirstCaseFromDB(itemIDStr,getActivity());
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_item_selected_suggested, container, false);
//        Log.i("TAG",category);
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
        createSimilarAdsRV();

    }

    private void createSimilarAdsRV() {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                if (dataComeFromServer ==0)
                {
                    createSimilarRV();
                    createSimilarRV2();
                    createSimilarRV3();
                }
            }
        }, 2900);
    }

    private void createSimilarRV3() {
        similar3ArrayL = fillSimilar3ArrayL();
        similarAds3.setHasFixedSize(true);
        layoutManagerSimilar3 = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        similarAds3.setLayoutManager(layoutManagerSimilar3);
        adapterSimilarAds3 =new AdapterSimilarAds(getActivity(),similar3ArrayL
                ,"loaded");
        similarAds3.setAdapter(adapterSimilarAds3);
    }

    private void createSimilarRV2() {
        similar2ArrayL = fillSimilar2ArrayL();
        similarAds2.setHasFixedSize(true);
        layoutManagerSimilar2 = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        similarAds2.setLayoutManager(layoutManagerSimilar2);
        adapterSimilarAds2 =new AdapterSimilarAds(getActivity(),similar2ArrayL
                ,"loaded");
        similarAds2.setAdapter(adapterSimilarAds2);
    }


    private void fillSimilarLists() {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                if (dataComeFromServer == 0)
                {
                    similarContainerArrayL = getSimilarFromDatabase(getActivity());
                }
            }
        }, 2800);
    }

    private void createSimilarRV() {
        similar1ArrayL = fillSimilar1ArrayL();
        similarAds1.setHasFixedSize(true);
        layoutManagerSimilar1 = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        similarAds1.setLayoutManager(layoutManagerSimilar1);
        adapterSimilarAds =new AdapterSimilarAds(getActivity(),similar1ArrayL
                ,"loaded");
        similarAds1.setAdapter(adapterSimilarAds);
    }

    private void inti() {
        similarAds1 = (RecyclerView) view.findViewById(R.id.fragment_similar_1_RV);
        similarAds2 = (RecyclerView) view.findViewById(R.id.fragment_similar_2_RV);
        similarAds3 = (RecyclerView) view.findViewById(R.id.fragment_similar_3_RV);
    }

    private void getCarExchange() {
//        carForExchangeList = getCarForExchangeItemsSearch(carForExchangeList,15
//        ,ccemtFirestCase.getItemCarMake(),ccemtFirestCase.getItemCarModel()
//        ,ccemtFirestCase.getItemCarYeay(),ccemtFirestCase.getItemCarCondition()
//        ,ccemtFirestCase.getItemCarKilometers(),ccemtFirestCase.getItemCarTransmission()
//        ,ccemtFirestCase.getItemCarFuel(),ccemtFirestCase.getItemCarColor());

        carForExchangeList = getCarForSaleExchangeFireStore(15);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                    insertCarForExchangeToDataBase(carForExchangeList);
            }
        }, 2700);
    }

    private void insertCarForExchangeToDataBase(List<ItemCCEMT> list) {
        for (int i=0;i<list.size();i++)
        {
            insertCCEMTSimilarTable(list.get(i),myDB);
        }
    }


    private void detectItemCategoryAndGetDataFromServer() {
        if (categoryStr.equals("JunkCar"))
        {
            getJunk();
        }
        if (categoryStr.equals("Accessories"))
        {
            getAcc();
        }
        if (categoryStr.equals("Wheels_Rim"))
        {
            getWheelsRim();
        }
        if (categoryStr.equals("Plates"))
        {
            getCarPlates();
        }
        if (categoryStr.equals("Trucks"))
        {
            getTrucks();
        }
        if (categoryStr.equals("Motorcycle"))
        {
            getMotorcycle();
        }
        if (categoryStr.equals("Car_For_Exchange"))
        {
            getCarExchange();
        }
        if (categoryStr.equals("Car_For_Rent"))
        {
            getCarForRent();
        }
        if (categoryStr.equals("Car_For_Sale"))
        {
            getCarForSale();
        }
    }

    private void getJunk() {
        junkArrayL = getJunkCarPath(15);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                insertAccAndJunkTable(junkArrayL);
            }
        }, 2700);
    }

    private void getAcc() {
        accessoriesArrayL = getAccessoriesFireStore(15);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                insertAccAndJunkTable(accessoriesArrayL);
            }
        }, 2700);
    }

    private void insertAccAndJunkTable(List<ItemAccAndJunk> list) {
        for (int i=0;i<list.size();i++)
        {
            insertAccAndJunkSimilarTable(list.get(i),myDB);
        }
    }

    private void getWheelsRim() {
        wheelsRimList = getWheelsRimFireStore(15);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                insertWheelsimilarTable(wheelsRimList);
            }
        }, 2700);
    }

    private void insertWheelsimilarTable(List<ItemWheelsRim> wheelsRimList) {
        for (int i=0;i<wheelsRimList.size();i++)
        {
            insertWheelsRimSimilarTable(wheelsRimList.get(i),myDB);
        }
    }

    private void getCarPlates() {
        carPlatesList = getPlatesFireStore(15);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                insertPlatesSimilarTable(carPlatesList);
            }
        }, 2700);
    }

    private void insertPlatesSimilarTable(List<ItemPlates> carPlatesList) {
        for (int i=0;i<carPlatesList.size();i++)
        {
            insertCarPlatesSimilarTable(carPlatesList.get(i),myDB);
        }
    }

    private void getTrucks() {
        truckList = getTrucksFireStore(15);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                insertCarForExchangeToDataBase(truckList);
            }
        }, 2700);
    }

    private void getMotorcycle() {
        motorcycleList = getMotorcycleFireStore(15);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                insertCarForExchangeToDataBase(motorcycleList);
            }
        }, 2700);
    }

    private void getCarForSale() {
        carForSaleList = getCarForSaleExchangeFireStore(15);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                insertCarForExchangeToDataBase(carForSaleList);
            }
        }, 2700);
    }

    private void getCarForRent() {
        carForRentList = getCarForSaleRentFireStore(15);
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                insertCarForExchangeToDataBase(carForRentList);
            }
        }, 2700);
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
        similar3ArrayL.add(similarContainerArrayL.get(14));

        return similar3ArrayL;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getDataBaseInstance(getActivity()).deleteSimilarAds();
        dataComeFromServer=1;
    }

}
