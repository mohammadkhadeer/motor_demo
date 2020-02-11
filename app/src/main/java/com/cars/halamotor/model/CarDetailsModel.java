package com.cars.halamotor.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class CarDetailsModel implements Parcelable {


    String carMakeStr;
    String carColorStr;
    String modelStr,yearStr,carOptionsStr,conditionStr,kilometersStr,transmissionStr
            ,fuelStr,licenseStr,insurance,paymentMethod;

    public CarDetailsModel(){}

    public CarDetailsModel(String carMakeStr,String carOptionsStr, String carColorStr, String modelStr, String yearStr
            , String conditionStr, String kilometersStr, String transmissionStr, String fuelStr, String licenseStr
            , String insurance, String paymentMethod)
    {
        this.carMakeStr = carMakeStr;
        this.carOptionsStr = carOptionsStr;
        this.carColorStr = carColorStr;
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

    protected CarDetailsModel(Parcel in) {
        carMakeStr = in.readString();
        carColorStr = in.readString();
        modelStr = in.readString();
        yearStr = in.readString();
        carOptionsStr = in.readString();
        conditionStr = in.readString();
        kilometersStr = in.readString();
        transmissionStr = in.readString();
        fuelStr = in.readString();
        licenseStr = in.readString();
        insurance = in.readString();
        paymentMethod = in.readString();
    }

    public static final Creator<CarDetailsModel> CREATOR = new Creator<CarDetailsModel>() {
        @Override
        public CarDetailsModel createFromParcel(Parcel in) {
            return new CarDetailsModel(in);
        }

        @Override
        public CarDetailsModel[] newArray(int size) {
            return new CarDetailsModel[size];
        }
    };

    public String getCarMakeStr() {
        return carMakeStr;
    }

    public void setCarMakeStr(String carMakeStr) {
        this.carMakeStr = carMakeStr;
    }

    public String getCarColorStr() {
        return carColorStr;
    }

    public void setCarColorStr(String carColorStr) {
        this.carColorStr = carColorStr;
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

    public String getCarOptionsStr() {
        return carOptionsStr;
    }

    public void setCarOptionsStr(String carOptionsStr) {
        this.carOptionsStr = carOptionsStr;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(carMakeStr);
        dest.writeString(carColorStr);
        dest.writeString(modelStr);
        dest.writeString(yearStr);
        dest.writeString(carOptionsStr);
        dest.writeString(conditionStr);
        dest.writeString(kilometersStr);
        dest.writeString(transmissionStr);
        dest.writeString(fuelStr);
        dest.writeString(licenseStr);
        dest.writeString(insurance);
        dest.writeString(paymentMethod);
    }
}
