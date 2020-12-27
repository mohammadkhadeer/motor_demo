package com.my_motors.halamotor.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CarCondition implements Parcelable {
    String carConditionStr,carConditionStrS;

    public CarCondition(String carConditionStr, String carConditionStrS) {
        this.carConditionStr = carConditionStr;
        this.carConditionStrS = carConditionStrS;
    }

    protected CarCondition(Parcel in) {
        carConditionStr = in.readString();
        carConditionStrS = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(carConditionStr);
        dest.writeString(carConditionStrS);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CarCondition> CREATOR = new Creator<CarCondition>() {
        @Override
        public CarCondition createFromParcel(Parcel in) {
            return new CarCondition(in);
        }

        @Override
        public CarCondition[] newArray(int size) {
            return new CarCondition[size];
        }
    };

    public String getCarConditionStr() {
        return carConditionStr;
    }

    public void setCarConditionStr(String carConditionStr) {
        this.carConditionStr = carConditionStr;
    }

    public String getCarConditionStrS() {
        return carConditionStrS;
    }

    public void setCarConditionStrS(String carConditionStrS) {
        this.carConditionStrS = carConditionStrS;
    }
}
