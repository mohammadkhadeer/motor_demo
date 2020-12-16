package com.cars.halamotor.model;

import android.os.Parcel;
import android.os.Parcelable;

public class CarMake implements Parcelable {
    int imageIdInt;
    String makeStr,makeStrS,makeAr;

    public CarMake(int imageIdInt, String makeStr, String makeStrS, String makeAr) {
        this.imageIdInt = imageIdInt;
        this.makeStr = makeStr;
        this.makeStrS = makeStrS;
        this.makeAr = makeAr;
    }

    protected CarMake(Parcel in) {
        imageIdInt = in.readInt();
        makeStr = in.readString();
        makeStrS = in.readString();
        makeAr = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imageIdInt);
        dest.writeString(makeStr);
        dest.writeString(makeStrS);
        dest.writeString(makeAr);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<CarMake> CREATOR = new Creator<CarMake>() {
        @Override
        public CarMake createFromParcel(Parcel in) {
            return new CarMake(in);
        }

        @Override
        public CarMake[] newArray(int size) {
            return new CarMake[size];
        }
    };

    public int getImageIdInt() {
        return imageIdInt;
    }

    public void setImageIdInt(int imageIdInt) {
        this.imageIdInt = imageIdInt;
    }

    public String getMakeStr() {
        return makeStr;
    }

    public void setMakeStr(String makeStr) {
        this.makeStr = makeStr;
    }

    public String getMakeStrS() {
        return makeStrS;
    }

    public void setMakeStrS(String makeStrS) {
        this.makeStrS = makeStrS;
    }

    public String getMakeAr() {
        return makeAr;
    }

    public void setMakeAr(String makeAr) {
        this.makeAr = makeAr;
    }
}
