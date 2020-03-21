package com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.model.AccAndJunkFirstCase;
import com.cars.halamotor.model.CCEMTFirestCase;
import com.cars.halamotor.model.CarPlatesFirstCase;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.model.WheelsRimFirstCase;
import com.cars.halamotor.view.adapters.AdapterInsurance;
import com.cars.halamotor.view.adapters.adapterMainScreen.AdapterAccAndJunkFirstCase;
import com.cars.halamotor.view.adapters.adapterMainScreen.AdapterCarPlatesFirstCase;
import com.cars.halamotor.view.adapters.adapterMainScreen.AdapterSuggestedItem;
import com.cars.halamotor.view.adapters.adapterMainScreen.AdapterWheelsRim;
import com.cars.halamotor.view.adapters.adapterMainScreen.AdapterCCEMTAllCases;

import java.util.ArrayList;

import static com.cars.halamotor.dataBase.ReadFunction.getAccAndJunkDatabase;
import static com.cars.halamotor.dataBase.ReadFunction.getCarForSaleDatabase;
import static com.cars.halamotor.dataBase.ReadFunction.getCarPlatesDatabase;
import static com.cars.halamotor.dataBase.ReadFunction.getSuggestedItemFromDatabase;
import static com.cars.halamotor.dataBase.ReadFunction.getWheelsRimDatabase;

public class ListesMainScreenFragment extends Fragment {

    public ListesMainScreenFragment(){}
    View view;
    ArrayList<SuggestedItem> suggestedItemsArrayL = new ArrayList<SuggestedItem>();
    ArrayList<String> insuranceArrayL = new ArrayList<String>();
    AdapterSuggestedItem adapterSuggestedItem;

    TextView suggestedTV,SeeAllTV;
    AdapterInsurance adapterInsurance;

    ArrayList<CCEMTFirestCase> carForSaleArrayL = new ArrayList<CCEMTFirestCase>();
    ArrayList<CCEMTFirestCase> carForRentArrayL = new ArrayList<CCEMTFirestCase>();
    ArrayList<CCEMTFirestCase> carExchangeArrayL = new ArrayList<CCEMTFirestCase>();
    ArrayList<CCEMTFirestCase> motorcycleArrayL = new ArrayList<CCEMTFirestCase>();
    ArrayList<CCEMTFirestCase> trucksArrayL = new ArrayList<CCEMTFirestCase>();
    ArrayList<WheelsRimFirstCase> wheelsRimArrayL = new ArrayList<WheelsRimFirstCase>();
    ArrayList<CarPlatesFirstCase> carPlatesArrayL = new ArrayList<CarPlatesFirstCase>();
    ArrayList<AccAndJunkFirstCase> accessoriesArrayL = new ArrayList<AccAndJunkFirstCase>();
    ArrayList<AccAndJunkFirstCase> junkArrayL = new ArrayList<AccAndJunkFirstCase>();

    AdapterCCEMTAllCases adapterCarForSale,getAdapterCarRentSale,adapterCarExchange,adapterCarMotorcycle
            , adapterTrucks;

    AdapterWheelsRim adapterWheelsRim;
    AdapterCarPlatesFirstCase adapterCarPlatesFirstCase;
    AdapterAccAndJunkFirstCase adapterAccessoriesFirstCase,adapterJunkFirstCase;

    RecyclerView suggestedItemRecyclerView,insuranceRecyclerView,carForSaleRecyclerView
            ,carForRentRecyclerView,carExchangeRecyclerView,motorcycleRecyclerView
            ,junkCarRecyclerView,wheelsRimRecyclerView,carPlatesRecyclerView
            ,accessoriesRecyclerView,junkRecyclerView;

    RecyclerView.LayoutManager layoutManagerSuggested,layoutManagerInsurance,layoutManagerCarForSale
            ,layoutManagerCarRentSale,layoutManagerCarExchange,layoutManagerCarMotorcycle
            , layoutManagerTrucks,layoutManagerWheelsRim,carPlatesWheelsRim
            , layoutManagerAccessories,layoutManagerJunk;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        suggestedItemsArrayL = new ArrayList<SuggestedItem>();
        suggestedItemsArrayL = getSuggestedItemFromDatabase(context);
        carForSaleArrayL = getCarForSaleDatabase(context,"Car for sale");
        carForRentArrayL = getCarForSaleDatabase(context,"Car for rent");
        carExchangeArrayL = getCarForSaleDatabase(context,"Exchange car");
        motorcycleArrayL = getCarForSaleDatabase(context,"Motorcycle");
        trucksArrayL = getCarForSaleDatabase(context,"Trucks");
        wheelsRimArrayL = getWheelsRimDatabase(context);
        carPlatesArrayL = getCarPlatesDatabase(context);
        accessoriesArrayL = getAccAndJunkDatabase(context,"Accessories");
        junkArrayL = getAccAndJunkDatabase(context,"Junk car");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_list_main_item, container, false);
        inti();
        createSuggestedItemRV();
        createInsuranceRV();
        createCarForSaleRV();
        createCarForRentRV();
        createCarExchangeRV();
        createMotorcycleRV();
        createJunkCarRV();
        createWheelsRimRV();
        createCarPlatesRV();
        createAccessoriesRV();
        createJunkRV();
        return view;
    }

    private void createJunkRV() {
        junkRecyclerView.setHasFixedSize(true);
        layoutManagerJunk = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        junkRecyclerView.setLayoutManager(layoutManagerJunk);
        adapterJunkFirstCase =new AdapterAccAndJunkFirstCase(getActivity()
                , junkArrayL,"suggested_fragment");
        junkRecyclerView.setAdapter(adapterJunkFirstCase);
    }

    private void createAccessoriesRV() {
        accessoriesRecyclerView.setHasFixedSize(true);
        layoutManagerAccessories = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        accessoriesRecyclerView.setLayoutManager(layoutManagerAccessories);
        adapterAccessoriesFirstCase =new AdapterAccAndJunkFirstCase(getActivity()
                , accessoriesArrayL,"suggested_fragment");
        accessoriesRecyclerView.setAdapter(adapterAccessoriesFirstCase);
    }

    private void createCarPlatesRV() {
        carPlatesRecyclerView.setHasFixedSize(true);
        carPlatesWheelsRim = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        carPlatesRecyclerView.setLayoutManager(carPlatesWheelsRim);
        adapterCarPlatesFirstCase =new AdapterCarPlatesFirstCase(getActivity()
                , carPlatesArrayL,"suggested_fragment");
        carPlatesRecyclerView.setAdapter(adapterCarPlatesFirstCase);
    }

    private void createWheelsRimRV() {
        wheelsRimRecyclerView.setHasFixedSize(true);
        layoutManagerWheelsRim = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        wheelsRimRecyclerView.setLayoutManager(layoutManagerWheelsRim);
        adapterWheelsRim =new AdapterWheelsRim(getActivity()
                , wheelsRimArrayL,"suggested_fragment");
        wheelsRimRecyclerView.setAdapter(adapterWheelsRim);
    }

    private void createJunkCarRV() {
        junkCarRecyclerView.setHasFixedSize(true);
        layoutManagerTrucks = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        junkCarRecyclerView.setLayoutManager(layoutManagerTrucks);
        adapterTrucks =new AdapterCCEMTAllCases(getActivity()
                , trucksArrayL,"suggested_fragment");
        junkCarRecyclerView.setAdapter(adapterTrucks);
    }

    private void createMotorcycleRV() {
        motorcycleRecyclerView.setHasFixedSize(true);
        layoutManagerCarMotorcycle = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        motorcycleRecyclerView.setLayoutManager(layoutManagerCarMotorcycle);
        adapterCarMotorcycle =new AdapterCCEMTAllCases(getActivity()
                ,motorcycleArrayL,"suggested_fragment");
        motorcycleRecyclerView.setAdapter(adapterCarMotorcycle);
    }

    private void createCarExchangeRV() {
        carExchangeRecyclerView.setHasFixedSize(true);
        layoutManagerCarExchange = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        carExchangeRecyclerView.setLayoutManager(layoutManagerCarExchange);
        adapterCarExchange =new AdapterCCEMTAllCases(getActivity()
                ,carExchangeArrayL,"suggested_fragment");
        carExchangeRecyclerView.setAdapter(adapterCarExchange);
    }

    private void createCarForRentRV() {
        carForRentRecyclerView.setHasFixedSize(true);
        layoutManagerCarRentSale = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        carForRentRecyclerView.setLayoutManager(layoutManagerCarRentSale);
        getAdapterCarRentSale =new AdapterCCEMTAllCases(getActivity()
                ,carForRentArrayL,"suggested_fragment");
        carForRentRecyclerView.setAdapter(getAdapterCarRentSale);
    }

    private void createCarForSaleRV() {
        carForSaleRecyclerView.setHasFixedSize(true);
        layoutManagerCarForSale = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        carForSaleRecyclerView.setLayoutManager(layoutManagerCarForSale);
        adapterCarForSale =new AdapterCCEMTAllCases(getActivity()
                ,carForSaleArrayL,"suggested_fragment");
        carForSaleRecyclerView.setAdapter(adapterCarForSale);
    }

    private void createInsuranceRV() {
        fillInsurance();
        insuranceRecyclerView.setHasFixedSize(true);
        layoutManagerInsurance = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        insuranceRecyclerView.setLayoutManager(layoutManagerInsurance);
        adapterInsurance =new AdapterInsurance(getActivity()
                ,insuranceArrayL);
        insuranceRecyclerView.setAdapter(adapterInsurance);
    }

    private void fillInsurance() {
        insuranceArrayL = new ArrayList<String>();
        insuranceArrayL.add("Aman");
        insuranceArrayL.add("Methaq");
        insuranceArrayL.add("Takaful");
        insuranceArrayL.add("Watania");
    }

    private void createSuggestedItemRV() {
        suggestedItemRecyclerView.setHasFixedSize(true);
        layoutManagerSuggested = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        suggestedItemRecyclerView.setLayoutManager(layoutManagerSuggested);
        adapterSuggestedItem =new AdapterSuggestedItem(getActivity()
                ,suggestedItemsArrayL,"suggested_fragment");
        suggestedItemRecyclerView.setAdapter(adapterSuggestedItem);
    }

    private void inti() {
        suggestedItemRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_suggested_item_RV);
        insuranceRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_suggested_insurance_RV);
        carForSaleRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_suggested_car_for_sale_RV);
        carForRentRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_suggested_car_for_rent_RV);
        carExchangeRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_suggested_car_exchange_RV);
        motorcycleRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_suggested_motorcycle_RV);
        junkCarRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_suggested_trucks_RV);
        wheelsRimRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_list_main_wheels_rim_RV);
        carPlatesRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_list_main_car_plates_RV);
        accessoriesRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_list_main_accessories_RV);
        junkRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_list_main_junk_RV);

        suggestedTV = (TextView) view.findViewById(R.id.fragment_suggested_item_suggested_tv);
        SeeAllTV = (TextView) view.findViewById(R.id.fragment_suggested_item_see_all_tv);
    }

}
