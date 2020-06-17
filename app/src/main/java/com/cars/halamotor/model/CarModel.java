package com.cars.halamotor.model;

public class CarModel {
    String carModelStr,carModelStrS;

    public CarModel(String carModelStr, String carModelStrS) {
        this.carModelStr = carModelStr;
        this.carModelStrS = carModelStrS;
    }

    public String getCarModelStr() {
        return carModelStr;
    }

    public void setCarModelStr(String carModelStr) {
        this.carModelStr = carModelStr;
    }

    public String getCarModelStrS() {
        return carModelStrS;
    }

    public void setCarModelStrS(String carModelStrS) {
        this.carModelStrS = carModelStrS;
    }
}
