package com.cars.halamotor.model;

public class FCWSU {
    //this is use to save 1.favourite item 2.call item
    //3.watches item 4.user inset item

    String itemID;

    public FCWSU(){}

    public FCWSU(String itemID) {
        this.itemID = itemID;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
}
