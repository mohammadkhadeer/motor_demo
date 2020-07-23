package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails.userAds;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cars.halamotor.R;

public class FragmentSuggestedAds extends Fragment {

    RecyclerView recyclerView;
    public FragmentSuggestedAds(){}

    String test;
    View view;

    @Override
    public void onAttach(Context context) {
        if (getArguments() != null) {
            test = getArguments().getString("category");
        }
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_suggested_ads, container, false);
//        Log.i("TAG",test);
        inti();
        return view;
    }

    private void inti() {
        recyclerView = (RecyclerView) view.findViewById(R.id.fragment_similar_item_suggested_rv);
    }
}
