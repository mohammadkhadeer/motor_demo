package com.cars.halamotor.model;

public class CarCondition {
    String carConditionStr,carConditionStrS;

    public CarCondition(String carConditionStr, String carConditionStrS) {
        this.carConditionStr = carConditionStr;
        this.carConditionStrS = carConditionStrS;
    }

    public String getCarConditionStr() {
        return carConditionStr;
    }

    public void setCarConditionStr(String carConditionStr) {
        this.carConditionStr = carConditionStr;
    }

    public String getCarConditionStrS() {
        return carConditionStrS;
    }

    public void setCarConditionStrS(String carConditionStrS) {
        this.carConditionStrS = carConditionStrS;
    }
}
