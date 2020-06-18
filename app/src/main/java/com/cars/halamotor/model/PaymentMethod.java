package com.cars.halamotor.model;

import android.os.Parcel;
import android.os.Parcelable;

public class PaymentMethod implements Parcelable {
    String PaymentMethodStr,PaymentMethodStrS;

    public PaymentMethod(String paymentMethodStr, String paymentMethodStrS) {
        PaymentMethodStr = paymentMethodStr;
        PaymentMethodStrS = paymentMethodStrS;
    }

    protected PaymentMethod(Parcel in) {
        PaymentMethodStr = in.readString();
        PaymentMethodStrS = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(PaymentMethodStr);
        dest.writeString(PaymentMethodStrS);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<PaymentMethod> CREATOR = new Creator<PaymentMethod>() {
        @Override
        public PaymentMethod createFromParcel(Parcel in) {
            return new PaymentMethod(in);
        }

        @Override
        public PaymentMethod[] newArray(int size) {
            return new PaymentMethod[size];
        }
    };

    public String getPaymentMethodStr() {
        return PaymentMethodStr;
    }

    public void setPaymentMethodStr(String paymentMethodStr) {
        PaymentMethodStr = paymentMethodStr;
    }

    public String getPaymentMethodStrS() {
        return PaymentMethodStrS;
    }

    public void setPaymentMethodStrS(String paymentMethodStrS) {
        PaymentMethodStrS = paymentMethodStrS;
    }
}
