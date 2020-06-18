package com.cars.halamotor.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CarInsurance implements Parcelable {
    String carInsuranceStr,carInsuranceStrS;

    public CarInsurance(String carInsuranceStr, String carInsuranceStrS) {
        this.carInsuranceStr = carInsuranceStr;
        this.carInsuranceStrS = carInsuranceStrS;
    }

    protected CarInsurance(Parcel in) {
        carInsuranceStr = in.readString();
        carInsuranceStrS = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(carInsuranceStr);
        dest.writeString(carInsuranceStrS);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CarInsurance> CREATOR = new Creator<CarInsurance>() {
        @Override
        public CarInsurance createFromParcel(Parcel in) {
            return new CarInsurance(in);
        }

        @Override
        public CarInsurance[] newArray(int size) {
            return new CarInsurance[size];
        }
    };

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
