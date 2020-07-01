package com.cars.halamotor.view.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
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
import com.cars.halamotor.model.CityModel;
import com.cars.halamotor.model.ItemFilterModel;
import com.cars.halamotor.model.ItemSelectedFilterModel;
import com.cars.halamotor.model.Neighborhood;
import com.cars.halamotor.presnter.Filter;
import com.cars.halamotor.utils.App;
import com.cars.halamotor.view.adapters.adapterFilterFragment.AdapterFiltersCity;
import com.cars.halamotor.view.adapters.adapterFilterFragment.AdapterFiltersItem;
import com.cars.halamotor.view.adapters.adapterFilterFragment.AdapterFiltersNeighborhood;
import com.cars.halamotor.view.adapters.adapterFilterFragment.AdapterSelectedFilters;
import com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment.FiltersFragment;
import com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment.FragmentResults;
import com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment.ListsMainScreenFragment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static com.cars.halamotor.functions.FillFilters.fillFilter;
import static com.cars.halamotor.functions.FillNeighborhood.fillCityArrayL;
import static com.cars.halamotor.functions.FillNeighborhood.fillNeighborhoodArrayL;
import static com.cars.halamotor.functions.FillNeighborhood.resortNeighborhoodArrayL;

public class FragmentHomeScreen extends Fragment{
    FiltersFragment filtersFragment = new FiltersFragment();
    ArrayList<ItemSelectedFilterModel> itemFilterArrayList = new ArrayList<ItemSelectedFilterModel>();

    public FragmentHomeScreen(){}
    View view;
    ListsMainScreenFragment listsMainScreenFragment = new ListsMainScreenFragment();
    FragmentResults fragmentResults = new FragmentResults();

    Boolean citySelected;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        createFilterFragment();
        createMain();
        return view;
    }

    public void onCityClicked(CityModel cityModel) {
        fragmentResults.onCityClicked(cityModel);
        citySelected = true;
        createFragmentResults();
    }

    public void onCityCanceled(Boolean isCanceled) {
        citySelected = isCanceled;
        fragmentResults.onCityCanceled(isCanceled);
        checkDef();
    }

    public void onNeighborhoodClicked(Neighborhood neighborhood) {
        fragmentResults.onNeighborhoodClicked(neighborhood);
    }

    public void onNeighborhoodCanceled(Boolean isCanceled) {
        fragmentResults.onNeighborhoodCanceled(isCanceled);
    }

    ////////////////////////+++++++++++++++++++
    public void onFilterClicked(ItemFilterModel itemFilterModel,String filterType) {
        itemFilterArrayList.add(new ItemSelectedFilterModel(itemFilterModel.getFilter(),itemFilterModel.getFilterS(),filterType));
        fragmentResults.onFilterClicked(itemFilterModel,filterType);
        createFragmentResults();
    }

    ///////////////////////---------------------
    public void onFilterCanceled() {
        itemFilterArrayList.remove(itemFilterArrayList.size()-1);
        fragmentResults.onFilterCanceled();
        checkDef();
    }



    private void createFilterFragment() {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_home_fragment_filters_container, filtersFragment);
        transaction.commit();
    }

    private void createMain() {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_home_fragment_suggested_item_container, listsMainScreenFragment);
        transaction.commit();
    }

        private void createFragmentResults() {
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_home_fragment_suggested_item_container, fragmentResults);
        transaction.commit();
    }

    private void checkDef() {
        if (itemFilterArrayList.isEmpty() && citySelected==null)
        {
            createMain();
        }else{
            if (itemFilterArrayList.size() ==0 && citySelected == false)
            {
                createMain();
            }
        }
    }

}
