package com.cars.halamotor.functions;

import android.content.Context;
import android.util.Log;

import com.cars.halamotor.R;
import com.cars.halamotor.model.BoostPost;
import com.cars.halamotor.model.SuggestedItem;
import com.google.firebase.database.DataSnapshot;

public class FCSFunctions {

    public static SuggestedItem handelNumberOfObject(DataSnapshot dataSnapshot , String category) {
        SuggestedItem suggestedItem = null;
        if (category.equals("Car for sale")
                ||category.equals("Car for rent")
                ||category.equals("Exchange car")
                ||category.equals("Motorcycle")
                ||category.equals("Trucks")
        ) {
            String idInDatabase = (String) dataSnapshot.child("itemID").getValue();
            BoostPost boostPost = dataSnapshot.child("boostPostsArrayL").child("0").getValue(BoostPost.class);
            String itemBoostType = boostPost.getBoostType();
            String itemType = (String) dataSnapshot.child("categoryName").getValue();

            String itemPersonGallery = (String) dataSnapshot.child("personOrGallery").getValue();
            String itemIdInServer = (String) dataSnapshot.child("itemID").getValue();
            String itemCarMake = (String) dataSnapshot.child("carMake").getValue();
            String itemCarModel = (String) dataSnapshot.child("carModel").getValue();
            String itemCarYear = (String) dataSnapshot.child("year").getValue();

            String itemCarCondition = (String) dataSnapshot.child("condition").getValue();
            String itemCarKilometers = (String) dataSnapshot.child("kilometers").getValue();
            String itemCarTransmission = (String) dataSnapshot.child("transmission").getValue();
            String itemCarFuel = (String) dataSnapshot.child("fuel").getValue();
            String itemCarLicense = (String) dataSnapshot.child("carLicense").getValue();

            String itemCarInsurance = (String) dataSnapshot.child("insurance").getValue();
            String itemCarColor = (String) dataSnapshot.child("color").getValue();
            String itemCarPaymentMethod = (String) dataSnapshot.child("paymentMethod").getValue();
            String itemCarOptions = (String) dataSnapshot.child("carOptions").getValue();
            String itemNumberOfComment = "0";

            String itemNumberOfImage = "0";
            String itemCity = (String) dataSnapshot.child("city").getValue();
            String itemNeighborhood = (String) dataSnapshot.child("neighborhood").getValue();
            String itemTimePost = (String) dataSnapshot.child("timePost").getValue();
            String itemUserPhoneNumber = (String) dataSnapshot.child("phoneNumber").getValue();

            String itemName = (String) dataSnapshot.child("itemName").getValue();
            String itemImage = (String) dataSnapshot.child("imagePathArrayL").child("0").getValue();
            String itemDescription = (String) dataSnapshot.child("itemDescription").getValue();
            String userImage = (String) dataSnapshot.child("userImage").getValue();
            String userName = (String) dataSnapshot.child("userName").getValue();

            String itemPostEdit = (String) dataSnapshot.child("postEdit").getValue();
            String itemNewPrice = (String) dataSnapshot.child("newPrice").getValue();
            String itemWheelsSize = "empty";
            String itemCarPlatesCity = "empty";
            String itemCarPlatesNumber = "empty";

            String itemCarPlatesSpecial = "empty";
            Long itemBurnedPrice = (Long) dataSnapshot.child("burnedPrice").getValue();
            Long itemPrice = (Long) dataSnapshot.child("price").getValue();
            Long itemActiveOrNot = (Long) dataSnapshot.child("auctionOrNot").getValue();
            String userID = (String) dataSnapshot.child("userIDPathInServer").getValue();

//            Log.i("TAG","itemID  "+idInDatabase);
//            Log.i("TAG","itemBoostType  "+itemBoostType);
//            Log.i("TAG","itemType  "+itemType);
//            Log.i("TAG","itemPersonGallery  "+itemPersonGallery);
//            Log.i("TAG","itemIdInServer  "+itemIdInServer);
//            Log.i("TAG","itemCarMake  "+itemCarMake);
//            Log.i("TAG","itemCarModel  "+itemCarModel);
//            Log.i("TAG","itemCarYear  "+itemCarYear);
//            Log.i("TAG","itemCarCondition  "+itemCarCondition);
//            Log.i("TAG","itemCarKilometers  "+itemCarKilometers);
//            Log.i("TAG","itemCarTransmission  "+itemCarTransmission);
//            Log.i("TAG","itemCarFuel  "+itemCarFuel);
//            Log.i("TAG","itemCarLicense  "+itemCarLicense);
//            Log.i("TAG","itemCarInsurance  "+itemCarInsurance);
//            Log.i("TAG","itemCarColor  "+itemCarColor);
//
//            Log.i("TAG","itemCarPaymentMethod  "+itemCarPaymentMethod);
//            Log.i("TAG","itemCarOptions  "+itemCarOptions);
//            Log.i("TAG","itemNumberOfComment  "+itemNumberOfComment);
//            Log.i("TAG","itemNumberOfImage  "+itemNumberOfImage);
//            Log.i("TAG","itemCity  "+itemCity);
//            Log.i("TAG","itemNeighborhood  "+itemNeighborhood);
//            Log.i("TAG","itemTimePost  "+itemTimePost);
//            Log.i("TAG","itemUserPhoneNumber  "+itemUserPhoneNumber);
//            Log.i("TAG","itemName  "+itemName);
//            Log.i("TAG","itemImage  "+itemImage);
//
//            Log.i("TAG","itemDescription  "+itemDescription);
//            Log.i("TAG","userImage  "+userImage);
//            Log.i("TAG","userName  "+userName);
//            Log.i("TAG","itemPostEdit  "+itemPostEdit);
//            Log.i("TAG","itemNewPrice  "+itemNewPrice);
//            Log.i("TAG","itemWheelsSize  "+itemWheelsSize);
//            Log.i("TAG","itemCarPlatesCity  "+itemCarPlatesCity);
//            Log.i("TAG","itemCarPlatesNumber  "+itemCarPlatesNumber);
//            Log.i("TAG","itemCarPlatesSpecial  "+itemCarPlatesSpecial);
//            Log.i("TAG","itemBurnedPrice  "+String.valueOf(itemBurnedPrice));
//            Log.i("TAG","************  "+itemPrice);
//            Log.i("TAG","itemActiveOrNot  "+String.valueOf(itemActiveOrNot));
//            Log.i("TAG","userID  "+userID);

            suggestedItem = new SuggestedItem(
                    idInDatabase
                    ,itemBoostType
                    ,itemType

                    ,itemPersonGallery
                    ,itemIdInServer
                    ,itemCarMake
                    ,itemCarModel
                    ,itemCarYear

                    ,itemCarCondition
                    ,itemCarKilometers
                    ,itemCarTransmission
                    ,itemCarFuel
                    ,itemCarLicense

                    ,itemCarInsurance
                    ,itemCarColor
                    ,itemCarPaymentMethod
                    ,itemCarOptions
                    ,itemNumberOfComment

                    ,itemNumberOfImage
                    ,itemCity
                    ,itemNeighborhood
                    ,itemTimePost
                    ,itemUserPhoneNumber

                    ,itemName
                    ,itemImage
                    ,itemDescription
                    ,userImage
                    ,userName

                    ,itemPostEdit
                    ,itemNewPrice
                    ,itemWheelsSize
                    ,itemCarPlatesCity
                    ,itemCarPlatesNumber

                    ,itemCarPlatesSpecial
                    ,String.valueOf(itemBurnedPrice)
                    ,String.valueOf(itemPrice)
                    ,userID
                    ,String.valueOf(itemActiveOrNot)

            );
        }
        if (category.equals("Plates"))
        {
            BoostPost boostPost = dataSnapshot.child("boostPostsArrayL").child("0").getValue(BoostPost.class);
            String itemBoostType = boostPost.getBoostType();
            String itemPersonGallery = (String) dataSnapshot.child("personOrGallery").getValue();
            String itemIdInServer = (String) dataSnapshot.child("itemID").getValue();

            String itemCity = (String) dataSnapshot.child("city").getValue();
            String itemNeighborhood = (String) dataSnapshot.child("neighborhood").getValue();
            String itemTimePost = (String) dataSnapshot.child("timePost").getValue();
            String itemUserPhoneNumber = (String) dataSnapshot.child("phoneNumber").getValue();

            String itemName = (String) dataSnapshot.child("itemName").getValue();
            String itemImage = (String) dataSnapshot.child("imagePathArrayL").child("0").getValue();
            String itemDescription = (String) dataSnapshot.child("itemDescription").getValue();
            String userImage = (String) dataSnapshot.child("userImage").getValue();
            String userName = (String) dataSnapshot.child("userName").getValue();

            String itemPostEdit = (String) dataSnapshot.child("postEdit").getValue();
            String itemNewPrice = (String) dataSnapshot.child("newPrice").getValue();

            String carPlatesCity = (String) dataSnapshot.child("carPlatesCity").getValue();
            String carPlatesNumber = (String) dataSnapshot.child("carPlatesNumber").getValue();
            Long specialOrNot = (Long) dataSnapshot.child("specialOrNot").getValue();

            Long itemBurnedPrice = (Long) dataSnapshot.child("burnedPrice").getValue();
            Long itemPrice = (Long) dataSnapshot.child("price").getValue();
            String userID = (String) dataSnapshot.child("userIDPathInServer").getValue();
            Long itemActiveOrNot = (Long) dataSnapshot.child("auctionOrNot").getValue();

            suggestedItem = new SuggestedItem(
                    itemBoostType
                    ,itemBoostType
                    ,"Plates"
                    ,itemPersonGallery
                    ,itemIdInServer
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"0"
                    ,"0"
                    ,itemCity
                    ,itemNeighborhood
                    ,itemTimePost
                    ,itemUserPhoneNumber
                    ,itemName
                    ,itemImage
                    ,itemDescription
                    ,userImage
                    ,userName
                    ,itemPostEdit
                    ,itemNewPrice
                    ,"empty"
                    ,carPlatesCity
                    ,carPlatesNumber
                    , String.valueOf(specialOrNot)
                    , String.valueOf(itemBurnedPrice)
                    , String.valueOf(itemPrice)
                    , userID
                    , String.valueOf(itemActiveOrNot)

            );
        }
        if (category.equals("Wheels_Rim"))
        {
            BoostPost boostPost = dataSnapshot.child("boostPostsArrayL").child("0").getValue(BoostPost.class);
            String itemBoostType = boostPost.getBoostType();
            String itemPersonGallery = (String) dataSnapshot.child("personOrGallery").getValue();
            String itemIdInServer = (String) dataSnapshot.child("itemID").getValue();

            String itemCity = (String) dataSnapshot.child("city").getValue();
            String itemNeighborhood = (String) dataSnapshot.child("neighborhood").getValue();
            String itemTimePost = (String) dataSnapshot.child("timePost").getValue();
            String itemUserPhoneNumber = (String) dataSnapshot.child("phoneNumber").getValue();

            String itemName = (String) dataSnapshot.child("itemName").getValue();
            String itemImage = (String) dataSnapshot.child("imagePathArrayL").child("0").getValue();
            String itemDescription = (String) dataSnapshot.child("itemDescription").getValue();
            String userImage = (String) dataSnapshot.child("userImage").getValue();
            String userName = (String) dataSnapshot.child("userName").getValue();

            String itemPostEdit = (String) dataSnapshot.child("postEdit").getValue();
            String itemNewPrice = (String) dataSnapshot.child("newPrice").getValue();
            Long itemWheelsSize = (Long) dataSnapshot.child("wheelSizeInt").getValue();
            Long itemBurnedPrice = (Long) dataSnapshot.child("burnedPrice").getValue();
            Long itemPrice = (Long) dataSnapshot.child("price").getValue();
            String userID = (String) dataSnapshot.child("userIDPathInServer").getValue();
            Long itemActiveOrNot = (Long) dataSnapshot.child("auctionOrNot").getValue();

            suggestedItem = new SuggestedItem(
                    itemBoostType
                    ,itemBoostType
                    ,"Wheels_Rim"
                    ,itemPersonGallery
                    ,itemIdInServer
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"0"
                    ,"0"
                    ,itemCity
                    ,itemNeighborhood
                    ,itemTimePost
                    ,itemUserPhoneNumber
                    ,itemName
                    ,itemImage
                    ,itemDescription
                    ,userImage
                    ,userName
                    ,itemPostEdit
                    ,itemNewPrice
                    ,String.valueOf(itemWheelsSize)
                    ,"empty"
                    ,"empty"
                    , "empty"
                    , String.valueOf(itemBurnedPrice)
                    , String.valueOf(itemPrice)
                    , userID
                    , String.valueOf(itemActiveOrNot)

            );
        }
        if (category.equals("Accessories") || category.equals("Junk car"))
        {
            BoostPost boostPost = dataSnapshot.child("boostPostsArrayL").child("0").getValue(BoostPost.class);
            String itemBoostType = boostPost.getBoostType();
            String itemPersonGallery = (String) dataSnapshot.child("personOrGallery").getValue();
            String itemIdInServer = (String) dataSnapshot.child("itemID").getValue();

            String itemCity = (String) dataSnapshot.child("city").getValue();
            String itemNeighborhood = (String) dataSnapshot.child("neighborhood").getValue();
            String itemTimePost = (String) dataSnapshot.child("timePost").getValue();
            String itemUserPhoneNumber = (String) dataSnapshot.child("phoneNumber").getValue();

            String itemName = (String) dataSnapshot.child("itemName").getValue();
            String itemImage = (String) dataSnapshot.child("imagePathArrayL").child("0").getValue();
            String itemDescription = (String) dataSnapshot.child("itemDescription").getValue();
            String userImage = (String) dataSnapshot.child("userImage").getValue();
            String userName = (String) dataSnapshot.child("userName").getValue();

            String itemPostEdit = (String) dataSnapshot.child("postEdit").getValue();
            String itemNewPrice = (String) dataSnapshot.child("newPrice").getValue();
            Long itemBurnedPrice = (Long) dataSnapshot.child("burnedPrice").getValue();
            Long itemPrice = (Long) dataSnapshot.child("price").getValue();
            String userID = (String) dataSnapshot.child("userIDPathInServer").getValue();
            Long itemActiveOrNot = (Long) dataSnapshot.child("auctionOrNot").getValue();

            suggestedItem = new SuggestedItem(
                    itemBoostType
                    ,itemBoostType
                    ,category
                    ,itemPersonGallery
                    ,itemIdInServer
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    ,"0"
                    ,"0"
                    ,itemCity
                    ,itemNeighborhood
                    ,itemTimePost
                    ,itemUserPhoneNumber
                    ,itemName
                    ,itemImage
                    ,itemDescription
                    ,userImage
                    ,userName
                    ,itemPostEdit
                    ,itemNewPrice
                    ,"empty"
                    ,"empty"
                    ,"empty"
                    , "empty"
                    , String.valueOf(itemBurnedPrice)
                    , String.valueOf(itemPrice)
                    , userID
                    , String.valueOf(itemActiveOrNot)

            );
        }
        return suggestedItem;
    }

    public static String convertCat(String category){
        String CategoryAfterConvert = null;
        if (category.equals("Car for sale"))
        {
            CategoryAfterConvert = "Car_For_Sale";
        }
        if (category.equals("Car for rent"))
        {
            CategoryAfterConvert = "Car_For_Rent";
        }
        if (category.equals("Exchange car"))
        {
            CategoryAfterConvert = "Car_For_Exchange";
        }
        if (category.equals("Motorcycle"))
        {
            CategoryAfterConvert = "Motorcycle";
        }
        if (category.equals("Trucks"))
        {
            CategoryAfterConvert = "Trucks";
        }
        if (category.equals("Plates"))
        {
            CategoryAfterConvert = "Plates";
        }
        if (category.equals("Wheels_Rim"))
        {
            CategoryAfterConvert = "Wheels_Rim";
        }
        if (category.equals("Accessories"))
        {
            CategoryAfterConvert = "Accessories";
        }
        if (category.equals("Junk car"))
        {
            CategoryAfterConvert = "JunkCar";
        }
        return CategoryAfterConvert;
    }

}
