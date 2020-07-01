package com.cars.halamotor.presnter;

import com.cars.halamotor.model.CityModel;
import com.cars.halamotor.model.ItemFilterModel;
import com.cars.halamotor.model.ItemSelectedFilterModel;
import com.cars.halamotor.model.Neighborhood;

public interface Filter {

    void onFilterClick(ItemFilterModel filterModel,String filterType);

    void onFilterCancel();

    void onFilterCityClick(CityModel cityModel);

    void onFilterCityCancel(Boolean cancel);

    void onFilterNeighborhoodClick(Neighborhood neighborhood);

    void onFilterNeighborhoodCancel(Boolean cancel);

    //CityModel
}
