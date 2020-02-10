package com.cars.halamotor.model;

public class CarColor {
    String colorNameStr;
    int colorIDInt ;
    public CarColor(String colorNameStr,int colorIDInt)
    {
        this.colorNameStr=colorNameStr;
        this.colorIDInt = colorIDInt;
    }

    public String getColorNameStr() {
        return colorNameStr;
    }

    public void setColorNameStr(String colorNameStr) {
        this.colorNameStr = colorNameStr;
    }

    public int getColorIDInt() {
        return colorIDInt;
    }

    public void setColorIDInt(int colorIDInt) {
        this.colorIDInt = colorIDInt;
    }
}
