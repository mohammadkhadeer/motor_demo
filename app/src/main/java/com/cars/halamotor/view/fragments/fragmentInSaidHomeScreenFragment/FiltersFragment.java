package com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.cars.halamotor.R;
import com.cars.halamotor.functions.Functions;
import com.cars.halamotor.model.CityModel;
import com.cars.halamotor.model.ItemFilterModel;
import com.cars.halamotor.model.ItemSelectedFilterModel;
import com.cars.halamotor.model.Neighborhood;
import com.cars.halamotor.view.adapters.adapterFilterFragment.AdapterFiltersCity;
import com.cars.halamotor.view.adapters.adapterFilterFragment.AdapterFiltersItem;
import com.cars.halamotor.view.adapters.adapterFilterFragment.AdapterSelectedFilters;
import com.cars.halamotor.view.adapters.adapterFilterFragment.AdapterFiltersNeighborhood;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static com.cars.halamotor.functions.FillFilters.fillCategory;
import static com.cars.halamotor.functions.FillFilters.fillFilter;
import static com.cars.halamotor.functions.FillNeighborhood.fillCityArrayL;
import static com.cars.halamotor.functions.FillNeighborhood.fillNeighborhoodArrayL;
import static com.cars.halamotor.functions.FillNeighborhood.resortNeighborhoodArrayL;
import static com.cars.halamotor.functions.Functions.splitString;
import static com.facebook.FacebookSdk.getApplicationContext;

public class FiltersFragment extends Fragment implements AdapterFiltersCity.PassCity
            , AdapterFiltersNeighborhood.PassNeighborhood,AdapterFiltersItem.PassFilter
            ,AdapterSelectedFilters.PassCancelItem{

    public FiltersFragment(){}
    View view;
    ArrayList<CityModel> emiratesItemsArrayL = new ArrayList<CityModel>();
    ArrayList<ItemSelectedFilterModel> selectedFilterArrayL = new ArrayList<ItemSelectedFilterModel>();
    ArrayList<ItemFilterModel> filterItemsArrayL = new ArrayList<ItemFilterModel>();
    AdapterFiltersCity adapterFilters;
    AdapterSelectedFilters adapterSelectedFilters;
    RecyclerView filter1RV,selectedFilterRV,filter2RV,recyclerViewNeighborhood;
    RecyclerView.LayoutManager layoutManagerSuggested,layoutManagerSelected,layoutManagerNeighborhood;

    RelativeLayout cancelCityRL,cancelNeighborhoodRL;
    CardView selectedCityCV,selectedNeighborhoodCV;
    TextView cityNameTV,neighborhoodNameTV;

    ArrayList<Neighborhood> cityNeighborhoodArrayL = new ArrayList<Neighborhood>();
    AdapterFiltersNeighborhood adapterFiltersNeighborhood;
    String selectedCityStr;
    ArrayList<ItemSelectedFilterModel> itemTypeFromFilterAdapter = new ArrayList<ItemSelectedFilterModel>();


    AdapterFiltersItem adapterFiltersItem;
    int numberOfSelectedFilter=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_filters_fragment, container, false);
        init();
//        changeFont();
        createFilterOneRV();
        createFilterTowRV();
        createSelectedFilterRV();
        actionListener();
        return view;
    }

//    private void changeFont() {
//        textViewFilterName.setTypeface(Functions.changeFontGeneral(getApplicationContext()));
//    }

    private void actionListenerToCancelNeighborhood() {
        cancelNeighborhoodRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedNeighborhoodCV.setVisibility(View.GONE);
                recyclerViewNeighborhood.setVisibility(View.VISIBLE);
//                createNeighborhoodRV(selectedCityStr);
            }
        });
    }

    private void actionListenerToCancelCity() {
        cancelCityRL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedNeighborhoodCV.setVisibility(View.GONE);
                recyclerViewNeighborhood.setVisibility(View.GONE);

                selectedCityCV.setVisibility(View.GONE);
                filter1RV.setVisibility(View.VISIBLE);
            }
        });
    }

    private void createFilterTowRV() {
        filterItemsArrayL = fillFilter(getActivity(),numberOfSelectedFilter,itemTypeFromFilterAdapter);
        filter2RV.setHasFixedSize(true);
        layoutManagerSuggested = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        filter2RV.setLayoutManager(layoutManagerSuggested);
        adapterFiltersItem =new AdapterFiltersItem(getActivity()
                , filterItemsArrayL,"category",this);
        filter2RV.setAdapter(adapterFiltersItem);
    }


    private void createSelectedFilterRV() {
        fillSelected();
        selectedFilterRV.setHasFixedSize(true);
        layoutManagerSelected = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        selectedFilterRV.setLayoutManager(layoutManagerSelected);
        adapterSelectedFilters =new AdapterSelectedFilters(getActivity()
                ,selectedFilterArrayL,"main_screen",this);
        selectedFilterRV.setAdapter(adapterSelectedFilters);
    }

    private void fillSelected() {
        if (numberOfSelectedFilter==0)
        {
            selectedFilterArrayL = new ArrayList<ItemSelectedFilterModel>();
            selectedFilterArrayL.add(new ItemSelectedFilterModel(getActivity().getResources().getString(R.string.all),getActivity().getResources().getString(R.string.all),"empty" ));
        }
    }

    private void createFilterOneRV() {
        emiratesItemsArrayL = fillCityArrayL(getActivity());
        filter1RV.setHasFixedSize(true);
        layoutManagerSuggested = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        filter1RV.setLayoutManager(layoutManagerSuggested);
        adapterFilters =new AdapterFiltersCity(getActivity()
                , emiratesItemsArrayL,"main_screen",this);
        filter1RV.setAdapter(adapterFilters);
    }


    private void init() {
        filter1RV = (RecyclerView) view.findViewById(R.id.fragment_filter_1_RV);
        selectedFilterRV = (RecyclerView) view.findViewById(R.id.fragment_selected_filter_RV);
        filter2RV = (RecyclerView) view.findViewById(R.id.fragment_filter_2_RV);

        recyclerViewNeighborhood = (RecyclerView) view.findViewById(R.id.fragment_filter_neighborhood_RV);

        selectedCityCV = (CardView) view.findViewById(R.id.fragment_filter_selected_city);
        cancelCityRL = (RelativeLayout) view.findViewById(R.id.fragment_filter_selected_cancel_city);
        cityNameTV = (TextView) view.findViewById(R.id.fragment_filter_selected_content_text_view);

        selectedNeighborhoodCV = (CardView) view.findViewById(R.id.fragment_filter_selected_neighborhood);
        cancelNeighborhoodRL = (RelativeLayout) view.findViewById(R.id.fragment_filter_selected_cancel_neighborhood);
        neighborhoodNameTV = (TextView) view.findViewById(R.id.fragment_filter_selected_neighborhood_text_view);
    }

    private void actionListener() {
        actionListenerToCancelCity();
        actionListenerToCancelNeighborhood();
    }

    @Override
    public void onCityClicked(CityModel cityModel) {
        cityNameTV.setText(cityModel.getCity());
        selectedCityCV.setVisibility(View.VISIBLE);
        filter1RV.setVisibility(View.GONE);

        selectedCityStr = cityModel.getCity();
        createNeighborhoodRV(cityModel.getCity());
    }

    private void createNeighborhoodRV(String city) {
        recyclerViewNeighborhood.setVisibility(View.VISIBLE);
        cityNeighborhoodArrayL = fillNeighborhoodArrayL(cityNeighborhoodArrayL,getActivity(),city);

        Collections.sort(cityNeighborhoodArrayL, new Comparator<Neighborhood>() {
            @Override
            public int compare(Neighborhood lhs, Neighborhood rhs) {
                return lhs.getNeighborhood().compareTo(rhs.getNeighborhood());
            }
        });

        cityNeighborhoodArrayL =resortNeighborhoodArrayL(cityNeighborhoodArrayL,getActivity());
        recyclerViewNeighborhood.setHasFixedSize(true);
        layoutManagerNeighborhood = new LinearLayoutManager(getActivity(),
                LinearLayoutManager.HORIZONTAL, false);

        recyclerViewNeighborhood.setLayoutManager(layoutManagerNeighborhood);
        adapterFiltersNeighborhood =new AdapterFiltersNeighborhood(getActivity()
                , cityNeighborhoodArrayL,"main_screen",this);
        recyclerViewNeighborhood.setAdapter(adapterFiltersNeighborhood);
    }

    @Override
    public void onNeighborhoodClicked(Neighborhood neighborhood) {
        neighborhoodNameTV.setText(neighborhood.getNeighborhood());
        selectedNeighborhoodCV.setVisibility(View.VISIBLE);
        recyclerViewNeighborhood.setVisibility(View.GONE);
    }

    /////////////////////////////+
    @Override
    public void onFilterClicked(ItemFilterModel itemFilterModel) {
        if (numberOfSelectedFilter==0)
        {
            selectedFilterArrayL.remove(selectedFilterArrayL.size()-1);
            adapterSelectedFilters.notifyDataSetChanged();
        }

        numberOfSelectedFilter =numberOfSelectedFilter+1;

        itemTypeFromFilterAdapter.add(new ItemSelectedFilterModel(itemFilterModel.getFilter(),itemFilterModel.getFilterS(),itemFilterModel.getFilter()));

        selectedFilterArrayL.add(new ItemSelectedFilterModel(itemFilterModel.getFilter(),itemFilterModel.getFilterS(),itemTypeFromFilterAdapter.get(itemTypeFromFilterAdapter.size()-1).getFilterType()));
        adapterSelectedFilters.notifyDataSetChanged();

        createFilterTowRV();

    }

    @Override
    public void onFilterClicked(ItemSelectedFilterModel itemSelectedFilterModel) {
        numberOfSelectedFilter =numberOfSelectedFilter-1;
        //itemTypeFromFilterAdapter = itemSelectedFilterModel.getFilterS();

        if (numberOfSelectedFilter==0)
        {
            itemTypeFromFilterAdapter.clear();
            selectedFilterArrayL.remove(selectedFilterArrayL.size()-1);
            selectedFilterArrayL.add(new ItemSelectedFilterModel(getActivity().getResources().getString(R.string.all),getActivity().getResources().getString(R.string.all),"empty" ));
            adapterSelectedFilters.notifyDataSetChanged();
        }else{
            itemTypeFromFilterAdapter.remove(itemTypeFromFilterAdapter.size()-1);

            selectedFilterArrayL.remove(selectedFilterArrayL.size()-1);
            adapterSelectedFilters.notifyDataSetChanged();
        }

        createFilterTowRV();
    }
}