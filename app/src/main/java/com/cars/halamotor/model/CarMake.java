package com.cars.halamotor.model;

public class CarMake {
    int imageIdInt;
    String makeStr,makeStrS;

    public CarMake(int imageIdInt, String makeStr, String makeStrS) {
        this.imageIdInt = imageIdInt;
        this.makeStr = makeStr;
        this.makeStrS = makeStrS;
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

    public String getMakeStrS() {
        return makeStrS;
    }

    public void setMakeStrS(String makeStrS) {
        this.makeStrS = makeStrS;
    }
}
