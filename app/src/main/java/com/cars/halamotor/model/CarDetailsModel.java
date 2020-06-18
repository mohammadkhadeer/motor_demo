package com.cars.halamotor.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class CarDetailsModel implements Parcelable {

    CarMake carMake;
    String carColorStr;
    CarModel carModel;
    String yearStr,carOptionsStr;
    CarCondition carCondition;
    String kilometersStr,transmissionStr;
    CarFuel carFuel;
    CarLicensed carLicensed;
    CarInsurance carInsurance;
    PaymentMethod paymentMethod;

    public CarDetailsModel(){}

    public CarDetailsModel(CarMake carMake,String carOptionsStr, String carColorStr, CarModel carModel, String yearStr
            , CarCondition conditionStr, String kilometersStr, String transmissionStr, CarFuel fuelStr, CarLicensed licenseStr
            , CarInsurance insurance, PaymentMethod paymentMethod)
    {
        this.carMake = carMake;
        this.carOptionsStr = carOptionsStr;
        this.carColorStr = carColorStr;
        this.carModel = carModel;
        this.yearStr = yearStr;
        this.carCondition = conditionStr;
        this.kilometersStr = kilometersStr;
        this.transmissionStr = transmissionStr;
        this.carFuel = fuelStr;
        this.carLicensed = licenseStr;
        this.carInsurance = insurance;
        this.paymentMethod = paymentMethod;
    }


    protected CarDetailsModel(Parcel in) {
        carMake = in.readParcelable(CarMake.class.getClassLoader());
        carColorStr = in.readString();
        carModel = in.readParcelable(CarModel.class.getClassLoader());
        yearStr = in.readString();
        carOptionsStr = in.readString();
        carCondition = in.readParcelable(CarCondition.class.getClassLoader());
        kilometersStr = in.readString();
        transmissionStr = in.readString();
        carFuel = in.readParcelable(CarFuel.class.getClassLoader());
        carLicensed = in.readParcelable(CarLicensed.class.getClassLoader());
        carInsurance = in.readParcelable(CarInsurance.class.getClassLoader());
        paymentMethod = in.readParcelable(PaymentMethod.class.getClassLoader());
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

    public CarMake getCarMakeStr() {
        return carMake;
    }

    public void setCarMakeStr(CarMake carMake) {
        this.carMake = carMake;
    }

    public String getCarColorStr() {
        return carColorStr;
    }

    public void setCarColorStr(String carColorStr) {
        this.carColorStr = carColorStr;
    }

    public CarModel getModelStr() {
        return carModel;
    }

    public void setModelStr(CarModel carModel) {
        this.carModel = carModel;
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

    public CarCondition getConditionStr() {
        return carCondition;
    }

    public void setConditionStr(CarCondition conditionStr) {
        this.carCondition = conditionStr;
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

    public CarFuel getFuelStr() {
        return carFuel;
    }

    public void setFuelStr(CarFuel fuelStr) {
        this.carFuel = fuelStr;
    }

    public CarLicensed getLicenseStr() {
        return carLicensed;
    }

    public void setLicenseStr(CarLicensed licenseStr) {
        this.carLicensed = licenseStr;
    }

    public CarInsurance getInsurance() {
        return carInsurance;
    }

    public void setInsurance(CarInsurance insurance) {
        this.carInsurance = insurance;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(carMake,flags);
        dest.writeString(carColorStr);
        dest.writeParcelable(carModel,flags);
        dest.writeString(yearStr);
        dest.writeString(carOptionsStr);
        dest.writeParcelable(carCondition,flags);
        dest.writeString(kilometersStr);
        dest.writeString(transmissionStr);
        dest.writeParcelable(carFuel,flags);
        dest.writeParcelable(carLicensed,flags);
        dest.writeParcelable(carInsurance,flags);
        dest.writeParcelable(paymentMethod,flags);
    }
}
