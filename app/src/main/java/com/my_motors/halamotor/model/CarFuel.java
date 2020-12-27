package com.my_motors.halamotor.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CarFuel implements Parcelable {
    String carFuelStr,carFuelStrS;

    public CarFuel(String carFuelStr, String carFuelStrS) {
        this.carFuelStr = carFuelStr;
        this.carFuelStrS = carFuelStrS;
    }

    protected CarFuel(Parcel in) {
        carFuelStr = in.readString();
        carFuelStrS = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(carFuelStr);
        dest.writeString(carFuelStrS);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CarFuel> CREATOR = new Creator<CarFuel>() {
        @Override
        public CarFuel createFromParcel(Parcel in) {
            return new CarFuel(in);
        }

        @Override
        public CarFuel[] newArray(int size) {
            return new CarFuel[size];
        }
    };

    public String getCarFuelStr() {
        return carFuelStr;
    }

    public void setCarFuelStr(String carFuelStr) {
        this.carFuelStr = carFuelStr;
    }

    public String getCarFuelStrS() {
        return carFuelStrS;
    }

    public void setCarFuelStrS(String carFuelStrS) {
        this.carFuelStrS = carFuelStrS;
    }
}
