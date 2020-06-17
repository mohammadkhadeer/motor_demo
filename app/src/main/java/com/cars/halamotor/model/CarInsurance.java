package com.cars.halamotor.model;

public class CarInsurance {
    String carInsuranceStr,carInsuranceStrS;

    public CarInsurance(String carInsuranceStr, String carInsuranceStrS) {
        this.carInsuranceStr = carInsuranceStr;
        this.carInsuranceStrS = carInsuranceStrS;
    }

    public String getCarInsuranceStr() {
        return carInsuranceStr;
    }

    public void setCarInsuranceStr(String carInsuranceStr) {
        this.carInsuranceStr = carInsuranceStr;
    }

    public String getCarInsuranceStrS() {
        return carInsuranceStrS;
    }

    public void setCarInsuranceStrS(String carInsuranceStrS) {
        this.carInsuranceStrS = carInsuranceStrS;
    }
}
