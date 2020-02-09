package com.cars.halamotor.model;

public class CarOption {
    String carOptionStr;
    boolean selectedOrNot;

    public CarOption(String carOptionStr,boolean selectedOrNot)
    {
        this.carOptionStr=carOptionStr;
        this.selectedOrNot=selectedOrNot;
    }

    public String getCarOptionStr() {
        return carOptionStr;
    }

    public void setCarOptionStr(String carOptionStr) {
        this.carOptionStr = carOptionStr;
    }

    public boolean isSelectedOrNot() {
        return selectedOrNot;
    }

    public void setSelectedOrNot(boolean selectedOrNot) {
        this.selectedOrNot = selectedOrNot;
    }
}
