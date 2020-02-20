package com.cars.halamotor.model;

public class CarOption {
    String carOptionStr;
    int isSelected;

    public CarOption(String carOptionStr, int isSelected) {
        this.carOptionStr = carOptionStr;
        this.isSelected = isSelected;
    }

    public String getCarOptionStr() {
        return carOptionStr;
    }

    public void setCarOptionStr(String carOptionStr) {
        this.carOptionStr = carOptionStr;
    }

    public int getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(int isSelected) {
        this.isSelected = isSelected;
    }
}
