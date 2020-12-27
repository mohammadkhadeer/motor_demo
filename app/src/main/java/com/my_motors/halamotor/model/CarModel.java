package com.my_motors.halamotor.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CarModel implements Parcelable {
    String carModelStr,carModelStrS,carModelStrAr;

    public CarModel(String carModelStr, String carModelStrS, String carModelStrAr) {
        this.carModelStr = carModelStr;
        this.carModelStrS = carModelStrS;
        this.carModelStrAr = carModelStrAr;
    }

    protected CarModel(Parcel in) {
        carModelStr = in.readString();
        carModelStrS = in.readString();
        carModelStrAr = in.readString();
    }

    public static final Creator<CarModel> CREATOR = new Creator<CarModel>() {
        @Override
        public CarModel createFromParcel(Parcel in) {
            return new CarModel(in);
        }

        @Override
        public CarModel[] newArray(int size) {
            return new CarModel[size];
        }
    };

    public String getCarModelStr() {
        return carModelStr;
    }

    public void setCarModelStr(String carModelStr) {
        this.carModelStr = carModelStr;
    }

    public String getCarModelStrS() {
        return carModelStrS;
    }

    public void setCarModelStrS(String carModelStrS) {
        this.carModelStrS = carModelStrS;
    }

    public String getCarModelStrAr() {
        return carModelStrAr;
    }

    public void setCarModelStrAr(String carModelStrAr) {
        this.carModelStrAr = carModelStrAr;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(carModelStr);
        dest.writeString(carModelStrS);
        dest.writeString(carModelStrAr);
    }
}
