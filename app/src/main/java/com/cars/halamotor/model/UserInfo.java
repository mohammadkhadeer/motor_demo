package com.cars.halamotor.model;

public class UserInfo {
    String nameStr,userImageStr,surNameStr,emailStr,phoneNumberStr,cityStr
            ,neighbourhoodStr,authenticationIDStr,IDImagePathStr,walletCreditStr
            ,numberOfAdvStr,userTokensStr;

    public UserInfo(String nameStr, String userImageStr, String surNameStr, String emailStr, String phoneNumberStr, String cityStr, String neighbourhoodStr, String authenticationIDStr, String IDImagePathStr, String walletCreditStr, String numberOfAdvStr, String userTokensStr) {
        this.nameStr = nameStr;
        this.userImageStr = userImageStr;
        this.surNameStr = surNameStr;
        this.emailStr = emailStr;
        this.phoneNumberStr = phoneNumberStr;
        this.cityStr = cityStr;
        this.neighbourhoodStr = neighbourhoodStr;
        this.authenticationIDStr = authenticationIDStr;
        this.IDImagePathStr = IDImagePathStr;
        this.walletCreditStr = walletCreditStr;
        this.numberOfAdvStr = numberOfAdvStr;
        this.userTokensStr = userTokensStr;
    }

    public String getNameStr() {
        return nameStr;
    }

    public void setNameStr(String nameStr) {
        this.nameStr = nameStr;
    }

    public String getUserImageStr() {
        return userImageStr;
    }

    public void setUserImageStr(String userImageStr) {
        this.userImageStr = userImageStr;
    }

    public String getSurNameStr() {
        return surNameStr;
    }

    public void setSurNameStr(String surNameStr) {
        this.surNameStr = surNameStr;
    }

    public String getEmailStr() {
        return emailStr;
    }

    public void setEmailStr(String emailStr) {
        this.emailStr = emailStr;
    }

    public String getPhoneNumberStr() {
        return phoneNumberStr;
    }

    public void setPhoneNumberStr(String phoneNumberStr) {
        this.phoneNumberStr = phoneNumberStr;
    }

    public String getCityStr() {
        return cityStr;
    }

    public void setCityStr(String cityStr) {
        this.cityStr = cityStr;
    }

    public String getNeighbourhoodStr() {
        return neighbourhoodStr;
    }

    public void setNeighbourhoodStr(String neighbourhoodStr) {
        this.neighbourhoodStr = neighbourhoodStr;
    }

    public String getAuthenticationIDStr() {
        return authenticationIDStr;
    }

    public void setAuthenticationIDStr(String authenticationIDStr) {
        this.authenticationIDStr = authenticationIDStr;
    }

    public String getIDImagePathStr() {
        return IDImagePathStr;
    }

    public void setIDImagePathStr(String IDImagePathStr) {
        this.IDImagePathStr = IDImagePathStr;
    }

    public String getWalletCreditStr() {
        return walletCreditStr;
    }

    public void setWalletCreditStr(String walletCreditStr) {
        this.walletCreditStr = walletCreditStr;
    }

    public String getNumberOfAdvStr() {
        return numberOfAdvStr;
    }

    public void setNumberOfAdvStr(String numberOfAdvStr) {
        this.numberOfAdvStr = numberOfAdvStr;
    }

    public String getUserTokensStr() {
        return userTokensStr;
    }

    public void setUserTokensStr(String userTokensStr) {
        this.userTokensStr = userTokensStr;
    }
}
