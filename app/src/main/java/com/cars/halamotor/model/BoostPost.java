package com.cars.halamotor.model;

public class BoostPost {
    String boostType,postID;

    public BoostPost(){}

    public BoostPost(String boostType, String postID) {
        this.boostType = boostType;
        this.postID = postID;
    }

    public String getBoostType() {
        return boostType;
    }

    public void setBoostType(String boostType) {
        this.boostType = boostType;
    }

    public String getPostID() {
        return postID;
    }

    public void setPostID(String postID) {
        this.postID = postID;
    }
}
