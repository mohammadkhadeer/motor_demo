package com.cars.halamotor.model;

public class CarLicensed {
    String carLicensedStr,carLicensedStrS;

    public CarLicensed(String carLicensedStr, String carLicensedStrS) {
        this.carLicensedStr = carLicensedStr;
        this.carLicensedStrS = carLicensedStrS;
    }

    public String getCarLicensedStr() {
        return carLicensedStr;
    }

    public void setCarLicensedStr(String carLicensedStr) {
        this.carLicensedStr = carLicensedStr;
    }

    public String getCarLicensedStrS() {
        return carLicensedStrS;
    }

    public void setCarLicensedStrS(String carLicensedStrS) {
        this.carLicensedStrS = carLicensedStrS;
    }
}
