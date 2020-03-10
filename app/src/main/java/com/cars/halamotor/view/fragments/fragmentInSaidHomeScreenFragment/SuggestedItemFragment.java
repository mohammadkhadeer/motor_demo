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

import com.cars.halamotor.R;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.view.adapters.AdapterSuggestedItem;

import java.util.ArrayList;

import static com.cars.halamotor.dataBase.ReadFunction.getSuggestedItemFromDatabase;

public class SuggestedItemFragment extends Fragment {

    public SuggestedItemFragment(){}
    View view;
    ArrayList<SuggestedItem> suggestedItemsArrayL = new ArrayList<SuggestedItem>();
    RecyclerView suggestedItemRecyclerView;
    AdapterSuggestedItem adapterSuggestedItem;
    RecyclerView.LayoutManager layoutManagerSuggested;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        suggestedItemsArrayL = new ArrayList<SuggestedItem>();
        suggestedItemsArrayL = getSuggestedItemFromDatabase(context);
        Log.d("TAG test Sug",suggestedItemsArrayL.get(0).getItemCarColor());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_suggested_item, container, false);
        inti();
        createSuggestedItemRV();
        return view;
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
    }

}
