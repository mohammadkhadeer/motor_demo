package com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;
import com.cars.halamotor.view.adapters.AdapterFilters;
import com.cars.halamotor.view.adapters.AdapterSelectedFilters;

import java.util.ArrayList;

public class FiltersFragment extends Fragment {

    public FiltersFragment(){}
    View view;
    ArrayList<String> emiratesItemsArrayL = new ArrayList<String>();
    ArrayList<String> selectedFilterArrayL = new ArrayList<String>();
    ArrayList<String> categoryItemsArrayL = new ArrayList<String>();
    AdapterFilters adapterFilters;
    AdapterSelectedFilters adapterSelectedFilters;
    RecyclerView filter1RV,selectedFilterRV,filter2RV;
    RecyclerView.LayoutManager layoutManagerSuggested,layoutManagerSelected;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_filters_fragment, container, false);
        init();
        createFilterOneRV();
        createSelectedFilterRV();
        createFilterTowRV();
        return view;
    }

    private void createFilterTowRV() {
        fillCategory();
        filter2RV.setHasFixedSize(true);
        layoutManagerSuggested = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        filter2RV.setLayoutManager(layoutManagerSuggested);
        adapterFilters =new AdapterFilters(getActivity()
                , categoryItemsArrayL,"main_screen");
        filter2RV.setAdapter(adapterFilters);
    }

    private void fillCategory() {
        categoryItemsArrayL = new ArrayList<String>();
        categoryItemsArrayL.add(getActivity().getResources().getString(R.string.car_for_sale));
        categoryItemsArrayL.add(getActivity().getResources().getString(R.string.car_for_rent));
        categoryItemsArrayL.add(getActivity().getResources().getString(R.string.exchange_car));
        categoryItemsArrayL.add(getActivity().getResources().getString(R.string.motorcycle));
        categoryItemsArrayL.add(getActivity().getResources().getString(R.string.car_plates));
        categoryItemsArrayL.add(getActivity().getResources().getString(R.string.accessories));
        categoryItemsArrayL.add(getActivity().getResources().getString(R.string.wheels_rim));
        categoryItemsArrayL.add(getActivity().getResources().getString(R.string.trucks));
        categoryItemsArrayL.add(getActivity().getResources().getString(R.string.junk_car));
    }

    private void createSelectedFilterRV() {
        fillSelected();
        selectedFilterRV.setHasFixedSize(true);
        layoutManagerSelected = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        selectedFilterRV.setLayoutManager(layoutManagerSelected);
        adapterSelectedFilters =new AdapterSelectedFilters(getActivity()
                ,selectedFilterArrayL,"main_screen");
        selectedFilterRV.setAdapter(adapterSelectedFilters);
    }

    private void fillSelected() {
        selectedFilterArrayL = new ArrayList<String>();
        selectedFilterArrayL.add(getActivity().getResources().getString(R.string.all));
    }

    private void createFilterOneRV() {
        fillEmirates();
        filter1RV.setHasFixedSize(true);
        layoutManagerSuggested = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        filter1RV.setLayoutManager(layoutManagerSuggested);
        adapterFilters =new AdapterFilters(getActivity()
                , emiratesItemsArrayL,"main_screen");
        filter1RV.setAdapter(adapterFilters);
    }

    private void fillEmirates() {
        emiratesItemsArrayL = new ArrayList<String>();
        emiratesItemsArrayL.add(getActivity().getResources().getString(R.string.abu_dhabi));
        emiratesItemsArrayL.add(getActivity().getResources().getString(R.string.dubai));
        emiratesItemsArrayL.add(getActivity().getResources().getString(R.string.sharjah));
        emiratesItemsArrayL.add(getActivity().getResources().getString(R.string.al_ain));
        emiratesItemsArrayL.add(getActivity().getResources().getString(R.string.ajman));
        emiratesItemsArrayL.add(getActivity().getResources().getString(R.string.ras_al_khaimah));
        emiratesItemsArrayL.add(getActivity().getResources().getString(R.string.um_al_quwain));
        emiratesItemsArrayL.add(getActivity().getResources().getString(R.string.fujairah));
    }

    private void init() {
        filter1RV = (RecyclerView) view.findViewById(R.id.fragment_filter_1_RV);
        selectedFilterRV = (RecyclerView) view.findViewById(R.id.fragment_selected_filter_RV);
        filter2RV = (RecyclerView) view.findViewById(R.id.fragment_filter_2_RV);
    }

}