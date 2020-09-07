package com.cars.halamotor.view.fragments.fragmentInSaidHomeScreenFragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.cars.halamotor.R;
import com.cars.halamotor.model.CarFuel;
import com.cars.halamotor.model.ItemSelectedFilterModel;
import com.cars.halamotor.model.SearchCar;
import com.cars.halamotor.view.activity.CarDetails;
import com.cars.halamotor.view.adapters.AdapterSearch;
import com.cars.halamotor.view.adapters.adapterInCarDetails.AdapterCarFuel;

import java.util.ArrayList;

import static com.cars.halamotor.functions.FillCarModel.fillAllCarArrayL2;
import static com.cars.halamotor.functions.Functions.fillFuelArrayL;

public class FragmentSearch extends Fragment implements AdapterSearch.PassSearch{

    public ArrayList<SearchCar> searchCarsArrayL  = new ArrayList<SearchCar>();
    RecyclerView recyclerView;
    AdapterSearch adapterSearch;
    View view;
    ArrayList<ItemSelectedFilterModel> itemTypeFromFilterAdapter = new ArrayList<>();

    public FragmentSearch(){}
    private FragmentSearchListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentSearchListener) {
            listener = (FragmentSearchListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement FragmentAListener");
        }
    }
    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_search, container, false);

        inti();
        createRV();

        return view;
    }


    public void filter(String text) {
        ArrayList<SearchCar> searchCarsArrayList2  = new ArrayList<SearchCar>();
        for (SearchCar searchCar : searchCarsArrayL) {
            if (searchCar.getCarModel().toLowerCase().contains(text.toLowerCase())) {
                searchCarsArrayList2.add(searchCar);
            }
        }
        adapterSearch.filterList(searchCarsArrayList2);
    }

    private void createRV() {
        searchCarsArrayL =fillAllCarArrayL2(getActivity());
        recyclerView.setHasFixedSize(true);
        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);
        recyclerView.setLayoutManager(mLayoutManager);
        adapterSearch = new AdapterSearch(getActivity(), searchCarsArrayL,this);
        recyclerView.setAdapter(adapterSearch);
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_search_RV);
    }

    @Override
    public void onSearchClicked(SearchCar searchCar) {
        Log.i("TAG",searchCar.getCarModel());
        itemTypeFromFilterAdapter.add(new ItemSelectedFilterModel(searchCar.getCategory(),searchCar.getCategoryS(),searchCar.getCategory()));

        itemTypeFromFilterAdapter.add(new ItemSelectedFilterModel("0.0","0.0",searchCar.getCategory()));
        itemTypeFromFilterAdapter.add(new ItemSelectedFilterModel("100000000.0","100000000.0",searchCar.getCategory()));

        itemTypeFromFilterAdapter.add(new ItemSelectedFilterModel(searchCar.getCarMake(),searchCar.getCarMakeS(),searchCar.getCategory()));
        itemTypeFromFilterAdapter.add(new ItemSelectedFilterModel(searchCar.getCarModel(),searchCar.getCarModelS(),searchCar.getCategory()));
        listener.onInputSearchSent(itemTypeFromFilterAdapter);
    }

    public interface FragmentSearchListener {
        void onInputSearchSent(ArrayList<ItemSelectedFilterModel> itemTypeFromFilterAdapter);
    }
}