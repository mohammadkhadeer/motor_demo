package com.my_motors.halamotor.view.activity.selectAddress.expandableList;

import android.annotation.SuppressLint;

import com.my_motors.halamotor.model.Neighborhood;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

@SuppressLint("ParcelCreator")
public class SubFavoriteType extends ExpandableGroup<Neighborhood> {

    public SubFavoriteType(String title, List<Neighborhood> items) {
        super(title, items);
    }
}

