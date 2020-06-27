package com.cars.halamotor.model;

public class CityModel {
    String city,cityS;

    public CityModel(String city, String cityS) {
        this.city = city;
        this.cityS = cityS;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityS() {
        return cityS;
    }

    public void setCityS(String cityS) {
        this.cityS = cityS;
    }
}
