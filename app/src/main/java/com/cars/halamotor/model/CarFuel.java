package com.cars.halamotor.model;

public class CarFuel {
    String carFuelStr,carFuelStrS;

    public CarFuel(String carFuelStr, String carFuelStrS) {
        this.carFuelStr = carFuelStr;
        this.carFuelStrS = carFuelStrS;
    }

    public String getCarFuelStr() {
        return carFuelStr;
    }

    public void setCarFuelStr(String carFuelStr) {
        this.carFuelStr = carFuelStr;
    }

    public String getCarFuelStrS() {
        return carFuelStrS;
    }

    public void setCarFuelStrS(String carFuelStrS) {
        this.carFuelStrS = carFuelStrS;
    }
}
