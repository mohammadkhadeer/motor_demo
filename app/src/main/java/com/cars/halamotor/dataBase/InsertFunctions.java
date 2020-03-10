package com.cars.halamotor.dataBase;

import android.widget.Toast;

import com.cars.halamotor.model.BoostPost;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CommentsComp;

import java.util.ArrayList;

public class InsertFunctions {

    public static boolean insertCarForSaleToItemTable(CCEMT ccemt,DBHelper database) {

        boolean isInserted = database.insertDataItem(
                boostOrNot(ccemt.getBoostPostsArrayL())
                ,itemBoostType(ccemt.getBoostPostsArrayL())
                ,ccemt.getCategoryName(),ccemt.getPersonOrGallery()
                ,ccemt.getItemID(),ccemt.getCarMake(),ccemt.getCarModel(),ccemt.getYear()
                ,ccemt.getCondition(),ccemt.getKilometers(),ccemt.getTransmission()
                ,ccemt.getFuel(),ccemt.getCarLicense(),ccemt.getInsurance()
                ,ccemt.getColor(),ccemt.getPaymentMethod(),ccemt.getCarOptions()
                ,numberOfComment(ccemt.getCommentsArrayL())
                ,imagePath(ccemt.getImagePathArrayL()),ccemt.getCity()
                ,ccemt.getNeighborhood(),ccemt.getTimePost(),ccemt.getPhoneNumber()
                ,ccemt.getItemName(),numberOfImage(ccemt.getImagePathArrayL())
                ,ccemt.getItemDescription(),ccemt.getUserImage(),ccemt.getUserName()
                ,ccemt.getPostEdit(),ccemt.getNewPrice(),"0","0"
                ,"0","0"
                , String.valueOf(ccemt.getBurnedPrice())
        );
        return isInserted;
    }

    public static String boostOrNot(ArrayList<BoostPost> boostPostsArrayL) {
        String boostOrNotStr = null;
        if (boostPostsArrayL.size() == 1)
            return boostOrNotStr = "no";
        else
            return String.valueOf(boostPostsArrayL.size());
    }

    public static String itemBoostType(ArrayList<BoostPost> boostPostsArrayL) {
        String itemBoostTypeStr = null;
        if (boostPostsArrayL.size() == 1)
            return itemBoostTypeStr = "empty";
        else
            return boostPostsArrayL.get(boostPostsArrayL.size()).getBoostType();
    }

    public static String numberOfComment(ArrayList<CommentsComp> commentsCompsArrayL) {
        String itemBoostTypeStr = null;
        if (commentsCompsArrayL.size() == 1)
            return itemBoostTypeStr = "0";
        else
            return String.valueOf(commentsCompsArrayL.size());
    }

    public static String numberOfImage(ArrayList<String> imageArrayL) {
        String itemImageStr = null;
        if (imageArrayL.size() == 1)
            return itemImageStr = "0";
        else
            return String.valueOf(imageArrayL.size());
    }

    public static String imagePath(ArrayList<String> imageArrayL) {
        String itemImageStr = null;
        if (imageArrayL.size() == 1)
            return itemImageStr = "https://firebasestorage.googleapis.com/v0/b/hala-motor.appspot.com/o/images%2FnoImage.png?alt=media&token=4e02ba52-69dd-447b-9c66-4a26df53a80d";
        else
            return imageArrayL.get(imageArrayL.size()-1);
    }

}
