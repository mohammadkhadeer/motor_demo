package com.my_motors.halamotor.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CarLicensed implements Parcelable {
    String carLicensedStr,carLicensedStrS;

    public CarLicensed(String carLicensedStr, String carLicensedStrS) {
        this.carLicensedStr = carLicensedStr;
        this.carLicensedStrS = carLicensedStrS;
    }

    protected CarLicensed(Parcel in) {
        carLicensedStr = in.readString();
        carLicensedStrS = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(carLicensedStr);
        dest.writeString(carLicensedStrS);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CarLicensed> CREATOR = new Creator<CarLicensed>() {
        @Override
        public CarLicensed createFromParcel(Parcel in) {
            return new CarLicensed(in);
        }

        @Override
        public CarLicensed[] newArray(int size) {
            return new CarLicensed[size];
        }
    };

    public String getCarLicensedStr() {
        return carLicensedStr;
    }

    public void setCarLicensedStr(String carLicensedStr) {
        this.carLicensedStr = carLicensedStr;
    }

    public String getCarLicensedStrS() {
        return carLicensedStrS;
    }

    public void setCarLicensedStrS(String carLicensedStrS) {
        this.carLicensedStrS = carLicensedStrS;
    }
}
