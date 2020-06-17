package com.cars.halamotor.model;

public class PaymentMethod {
    String PaymentMethodStr,PaymentMethodStrS;

    public PaymentMethod(String paymentMethodStr, String paymentMethodStrS) {
        PaymentMethodStr = paymentMethodStr;
        PaymentMethodStrS = paymentMethodStrS;
    }

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
