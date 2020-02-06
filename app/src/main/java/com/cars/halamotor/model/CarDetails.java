package com.cars.halamotor.model;

public class CarDetails {
    String titleStr,subTitleStr;
    public CarDetails(String titleStr,String subTitleStr)
    {
        this.titleStr=titleStr;
        this.subTitleStr=subTitleStr;
    }

    public String getTitleStr() {
        return titleStr;
    }

    public void setTitleStr(String titleStr) {
        this.titleStr = titleStr;
    }

    public String getSubTitleStr() {
        return subTitleStr;
    }

    public void setSubTitleStr(String subTitleStr) {
        this.subTitleStr = subTitleStr;
    }
}
