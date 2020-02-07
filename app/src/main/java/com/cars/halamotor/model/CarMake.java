package com.cars.halamotor.model;

public class CarMake {
    int imageIdInt;
    String makeStr;

    public  CarMake(int imageIdInt,String makeStr)
    {
        this.imageIdInt = imageIdInt;
        this.makeStr = makeStr;
    }

    public int getImageIdInt() {
        return imageIdInt;
    }

    public void setImageIdInt(int imageIdInt) {
        this.imageIdInt = imageIdInt;
    }

    public String getMakeStr() {
        return makeStr;
    }

    public void setMakeStr(String makeStr) {
        this.makeStr = makeStr;
    }
}
