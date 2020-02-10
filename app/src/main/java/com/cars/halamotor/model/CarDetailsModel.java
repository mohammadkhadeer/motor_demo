package com.cars.halamotor.model;

import com.cars.halamotor.view.activity.CarDetails;

public class CarDetailsModel {

    CarMake carMake;
    CarColor carColor;
    String modelStr,yearStr,carOptionsStr,conditionStr,kilometersStr,transmissionStr
            ,fuelStr,licenseStr,insurance,paymentMethod;

    public CarDetailsModel(){}

    public CarDetailsModel(CarMake carMake,String carOptionsStr, CarColor carColor, String modelStr, String yearStr
            , String conditionStr, String kilometersStr, String transmissionStr, String fuelStr, String licenseStr
            , String insurance, String paymentMethod)
    {
        this.carMake = carMake;
        this.carOptionsStr = carOptionsStr;
        this.carColor = carColor;
        this.modelStr = modelStr;
        this.yearStr = yearStr;
        this.conditionStr = conditionStr;
        this.kilometersStr = kilometersStr;
        this.transmissionStr = transmissionStr;
        this.fuelStr = fuelStr;
        this.licenseStr = licenseStr;
        this.insurance = insurance;
        this.paymentMethod = paymentMethod;
    }

    public String getCarOptionsStr() {
        return carOptionsStr;
    }

    public void setCarOptionsStr(String carOptionsStr) {
        this.carOptionsStr = carOptionsStr;
    }

    public CarMake getCarMake() {
        return carMake;
    }

    public void setCarMake(CarMake carMake) {
        this.carMake = carMake;
    }

    public CarColor getCarColor() {
        return carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    public String getModelStr() {
        return modelStr;
    }

    public void setModelStr(String modelStr) {
        this.modelStr = modelStr;
    }

    public String getYearStr() {
        return yearStr;
    }

    public void setYearStr(String yearStr) {
        this.yearStr = yearStr;
    }

    public String getConditionStr() {
        return conditionStr;
    }

    public void setConditionStr(String conditionStr) {
        this.conditionStr = conditionStr;
    }

    public String getKilometersStr() {
        return kilometersStr;
    }

    public void setKilometersStr(String kilometersStr) {
        this.kilometersStr = kilometersStr;
    }

    public String getTransmissionStr() {
        return transmissionStr;
    }

    public void setTransmissionStr(String transmissionStr) {
        this.transmissionStr = transmissionStr;
    }

    public String getFuelStr() {
        return fuelStr;
    }

    public void setFuelStr(String fuelStr) {
        this.fuelStr = fuelStr;
    }

    public String getLicenseStr() {
        return licenseStr;
    }

    public void setLicenseStr(String licenseStr) {
        this.licenseStr = licenseStr;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}
