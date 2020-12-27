package com.my_motors.halamotor.presnter;

import com.my_motors.halamotor.model.CityModel;
import com.my_motors.halamotor.model.ItemFilterModel;
import com.my_motors.halamotor.model.Neighborhood;

public interface Filter {

    void onFilterClick(ItemFilterModel filterModel,String filterType);

    void onFilterCancel();

    void onFilterCityClick(CityModel cityModel);

    void onFilterCityCancel(Boolean cancel);

    void onFilterNeighborhoodClick(Neighborhood neighborhood);

    void onFilterNeighborhoodCancel(Boolean cancel);

    //CityModel
}
