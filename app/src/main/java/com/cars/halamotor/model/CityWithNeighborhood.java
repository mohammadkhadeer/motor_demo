package com.cars.halamotor.model;

public class CityWithNeighborhood {
    String cityStr,neighborhoodStr,cityStrS,neighborhoodStrS,cityStrAr,neighborhoodStrAr;

    public CityWithNeighborhood(String cityStr, String neighborhoodStr, String cityStrS, String neighborhoodStrS, String cityStrAr, String neighborhoodStrAr) {
        this.cityStr = cityStr;
        this.neighborhoodStr = neighborhoodStr;
        this.cityStrS = cityStrS;
        this.neighborhoodStrS = neighborhoodStrS;
        this.cityStrAr = cityStrAr;
        this.neighborhoodStrAr = neighborhoodStrAr;
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

    public String getCityStrAr() {
        return cityStrAr;
    }

    public void setCityStrAr(String cityStrAr) {
        this.cityStrAr = cityStrAr;
    }

    public String getNeighborhoodStrAr() {
        return neighborhoodStrAr;
    }

    public void setNeighborhoodStrAr(String neighborhoodStrAr) {
        this.neighborhoodStrAr = neighborhoodStrAr;
    }
}
