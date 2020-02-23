package com.cars.halamotor.model;

public class CityWithNeighborhood {
    String cityStr,neighborhoodStr;

    public CityWithNeighborhood(String cityStr, String neighborhoodStr) {
        this.cityStr = cityStr;
        this.neighborhoodStr = neighborhoodStr;
    }

    public String getCityStr() {
        return cityStr;
    }

    public void setCityStr(String cityStr) {
        this.cityStr = cityStr;
    }

    public String getNeighborhoodStr() {
        return neighborhoodStr;
    }

    public void setNeighborhoodStr(String neighborhoodStr) {
        this.neighborhoodStr = neighborhoodStr;
    }
}
