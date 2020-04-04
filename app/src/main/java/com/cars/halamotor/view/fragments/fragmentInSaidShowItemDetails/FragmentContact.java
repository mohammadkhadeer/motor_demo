package com.cars.halamotor.view.fragments.fragmentInSaidShowItemDetails;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.cars.halamotor.R;

public class FragmentContact extends Fragment {

    public FragmentContact(){}
    View view;
    RelativeLayout filterContainerRL,suggestedContainerRL;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_contact, container, false);
        inti();
        return view;
    }

    private void inti() {
        filterContainerRL = (RelativeLayout) view.findViewById(R.id.fragment_home_fragment_filters_container);
        suggestedContainerRL = (RelativeLayout) view.findViewById(R.id.fragment_home_fragment_suggested_item_container);
    }

}
