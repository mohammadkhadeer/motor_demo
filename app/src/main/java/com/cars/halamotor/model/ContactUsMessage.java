package com.cars.halamotor.model;

public class ContactUsMessage {
    String name,email,phoneNumber,userToken,userID,message,title,titleS,date,messageIdOnServer;
    int seenOrNot;

    public ContactUsMessage(String name, String email, String phoneNumber, String userToken, String userID, String message, String title, String titleS, String date, String messageIdOnServer, int seenOrNot) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userToken = userToken;
        this.userID = userID;
        this.message = message;
        this.title = title;
        this.titleS = titleS;
        this.date = date;
        this.messageIdOnServer = messageIdOnServer;
        this.seenOrNot = seenOrNot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleS() {
        return titleS;
    }

    public void setTitleS(String titleS) {
        this.titleS = titleS;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessageIdOnServer() {
        return messageIdOnServer;
    }

    public void setMessageIdOnServer(String messageIdOnServer) {
        this.messageIdOnServer = messageIdOnServer;
    }

    public int getSeenOrNot() {
        return seenOrNot;
    }

    public void setSeenOrNot(int seenOrNot) {
        this.seenOrNot = seenOrNot;
    }
}
