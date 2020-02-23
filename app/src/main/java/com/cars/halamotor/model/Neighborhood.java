package com.cars.halamotor.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Neighborhood implements Parcelable {
    private String neighborhood;

    public static Creator<Neighborhood> getCREATOR() {
        return CREATOR;
    }

    public Neighborhood(Parcel in) {
        neighborhood = in.readString();
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String type) {
        this.neighborhood = type;
    }

    public Neighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(neighborhood);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Neighborhood> CREATOR = new Creator<Neighborhood>() {
        @Override
        public Neighborhood createFromParcel(Parcel in) {
            return new Neighborhood(in);
        }

        @Override
        public Neighborhood[] newArray(int size) {
            return new Neighborhood[size];
        }
    };
}
