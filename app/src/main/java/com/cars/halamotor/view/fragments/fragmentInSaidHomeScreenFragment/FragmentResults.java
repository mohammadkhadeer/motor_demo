package com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CityModel;
import com.cars.halamotor.model.ItemFilterModel;
import com.cars.halamotor.model.ItemSelectedFilterModel;
import com.cars.halamotor.model.Neighborhood;

import java.util.ArrayList;

import static com.cars.halamotor.fireBaseDB.FilterFireStore.filterResult;

public class FragmentResults extends Fragment {

    public FragmentResults(){}
    View view;
    Boolean citySelected;
    ArrayList<ItemSelectedFilterModel> itemFilterArrayList = new ArrayList<ItemSelectedFilterModel>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_results, container, false);

        return view;
    }

    public void onCityClicked(CityModel cityModel) {
        Log.i("TAG","Child Fragment city "+cityModel.getCity());
        citySelected = true;
    }

    public void onCityCanceled(Boolean isCanceled) {
        citySelected = isCanceled;
    }

    public void onNeighborhoodClicked(Neighborhood neighborhood) {

    }

    public void onNeighborhoodCanceled(Boolean isCanceled) {

    }

    ////////////////////////+++++++++++++++++++
    public void onFilterClicked(ItemFilterModel itemFilterModel, String filterType) {
        itemFilterArrayList.add(new ItemSelectedFilterModel(itemFilterModel.getFilter(),itemFilterModel.getFilterS(),filterType));
        Log.i("TAG","Fragment child Category: "+filterType);
        filterResult(itemFilterArrayList,0,getActivity());
    }

    ///////////////////////---------------------
    public void onFilterCanceled() {
        itemFilterArrayList.remove(itemFilterArrayList.size()-1);

    }

}
