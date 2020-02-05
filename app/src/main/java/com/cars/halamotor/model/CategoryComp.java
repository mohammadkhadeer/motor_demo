package com.cars.halamotor.model;

public class CategoryComp {
    int imageIdInt;
    String categoryNameStr;

    public CategoryComp (int imageIdInt,String categoryNameStr)
    {
        this.imageIdInt = imageIdInt;
        this.categoryNameStr = categoryNameStr;
    }

    public int getImageIdInt() {
        return imageIdInt;
    }

    public void setImageIdInt(int imageIdInt) {
        this.imageIdInt = imageIdInt;
    }

    public String getCategoryNameStr() {
        return categoryNameStr;
    }

    public void setCategoryNameStr(String categoryNameStr) {
        this.categoryNameStr = categoryNameStr;
    }
}
