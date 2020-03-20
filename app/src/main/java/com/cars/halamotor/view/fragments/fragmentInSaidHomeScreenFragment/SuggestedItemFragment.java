package com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CCEMTFirestCase;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.view.adapters.AdapterInsurance;
import com.cars.halamotor.view.adapters.AdapterSuggestedItem;
import com.cars.halamotor.view.adapters.adapterMainScreen.AdapterCarForSale;

import java.util.ArrayList;

import static com.cars.halamotor.dataBase.ReadFunction.getCarForSaleDatabase;
import static com.cars.halamotor.dataBase.ReadFunction.getSuggestedItemFromDatabase;

public class SuggestedItemFragment extends Fragment {

    public SuggestedItemFragment(){}
    View view;
    ArrayList<SuggestedItem> suggestedItemsArrayL = new ArrayList<SuggestedItem>();
    ArrayList<String> insuranceArrayL = new ArrayList<String>();
    RecyclerView suggestedItemRecyclerView,insuranceRecyclerView,carForSaleRecyclerView;
    AdapterSuggestedItem adapterSuggestedItem;
    RecyclerView.LayoutManager layoutManagerSuggested,layoutManagerInsurance,layoutManagerCarForSale;
    TextView suggestedTV,SeeAllTV;
    AdapterInsurance adapterInsurance;

    ArrayList<CCEMTFirestCase> carForSaleArrayL = new ArrayList<CCEMTFirestCase>();
    AdapterCarForSale adapterCarForSale;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        suggestedItemsArrayL = new ArrayList<SuggestedItem>();
        suggestedItemsArrayL = getSuggestedItemFromDatabase(context);
        carForSaleArrayL = getCarForSaleDatabase(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_suggested_item, container, false);
        inti();
        createSuggestedItemRV();
        createInsuranceRV();
        createCarForSaleRV();
        return view;
    }

    private void createCarForSaleRV() {
        carForSaleRecyclerView.setHasFixedSize(true);
        layoutManagerCarForSale = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        carForSaleRecyclerView.setLayoutManager(layoutManagerCarForSale);
        adapterCarForSale =new AdapterCarForSale(getActivity()
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

        suggestedTV = (TextView) view.findViewById(R.id.fragment_suggested_item_suggested_tv);
        SeeAllTV = (TextView) view.findViewById(R.id.fragment_suggested_item_see_all_tv);
    }

}
