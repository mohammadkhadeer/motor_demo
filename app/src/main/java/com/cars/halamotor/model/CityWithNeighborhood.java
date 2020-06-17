package com.cars.halamotor.model;

public class CityWithNeighborhood {
    String cityStr,neighborhoodStr,cityStrS,neighborhoodStrS;

    public CityWithNeighborhood(String cityStr, String neighborhoodStr, String cityStrS, String neighborhoodStrS) {
        this.cityStr = cityStr;
        this.neighborhoodStr = neighborhoodStr;
        this.cityStrS = cityStrS;
        this.neighborhoodStrS = neighborhoodStrS;
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

    public String getCityStrS() {
        return cityStrS;
    }

    public void setCityStrS(String cityStrS) {
        this.cityStrS = cityStrS;
    }

    public String getNeighborhoodStrS() {
        return neighborhoodStrS;
    }

    public void setNeighborhoodStrS(String neighborhoodStrS) {
        this.neighborhoodStrS = neighborhoodStrS;
    }
}
