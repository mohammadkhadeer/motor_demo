package com.cars.halamotor.dataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/*
in database not allowed to save object then well
save common item we need to show in fires
well save all type
1.USER_ADS 2.FAVOURITE 3.CALL_ITEMS 4.WATCHED_ITEMS 5.SEARCH_ITEMS
this well save as item type in data base
well use item saved to create suggested items to user depend
item table
item table we saved before user used app can tke its init items
*/

public class DBHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="hala_motor.db";

    public static final String TABLE_ITEM="item_table";
    public static final String COL_ITEM_id="ID";
    public static final String COL_ITEM_BOOST_OR_NOT="BOOST_OR_NOT";
    public static final String COL_ITEM_BOOST_TYPE="BOOST_TYPE";
    public static final String COL_ITEM_TYPE="TYPE";
    public static final String COL_ITEM_PERSON_GALLERY="PERSON_GALLERY";
    public static final String COL_ITEM_ID_IN_SERVER="ITEM_ID_IN_SERVER";
    public static final String COL_ITEM_CAR_MAKE="ITEM_CAR_MAKE";
    public static final String COL_ITEM_CAR_MODEL="ITEM_CAR_MODEL";
    public static final String COL_ITEM_CAR_YEAR="ITEM_CAR_YEAR";
    public static final String COL_ITEM_CAR_CONDITION="ITEM_CAR_CONDITION";
    public static final String COL_ITEM_CAR_KILOMETERS="ITEM_CAR_KILOMETERS";
    public static final String COL_ITEM_CAR_TRANSMISSION="ITEM_CAR_TRANSMISSION";
    public static final String COL_ITEM_CAR_FUEL="ITEM_CAR_FUEL";
    public static final String COL_ITEM_CAR_LICENSE="ITEM_CAR_LICENSE";
    public static final String COL_ITEM_CAR_INSURANCE="ITEM_CAR_INSURANCE";
    public static final String COL_ITEM_CAR_COLOR="ITEM_CAR_COLOR";
    public static final String COL_ITEM_CAR_PAYMENT_METHOD="ITEM_CAR_PAYMENT_METHOD";
    public static final String COL_ITEM_CAR_OPTIONS="ITEM_CAR_OPTIONS";
    public static final String COL_ITEM_NUMBER_OF_COMMENT="ITEM_NUMBER_OF_COMMENT";
    public static final String COL_ITEM_NUMBER_OF_IMAGE="ITEM_NUMBER_OF_IMAGE";
    public static final String COL_ITEM_CITY="ITEM_CITY";
    public static final String COL_ITEM_NEIGHBORHOOD="ITEM_NEIGHBORHOOD";
    public static final String COL_ITEM_TIME_POST="ITEM_TIME_POST";
    public static final String COL_ITEM_USER_PHONE_NUMBER="ITEM_USER_PHONE_NUMBER";
    public static final String COL_ITEM_ITEM_NAME="ITEM_NAME";
    public static final String COL_ITEM_ITEM_IMAGE="ITEM_IMAGE";
    public static final String COL_ITEM_ITEM_DESCRIPTION="ITEM_DESCRIPTION";
    public static final String COL_ITEM_USER_IMAGE="ITEM_USER_IMAGE";
    public static final String COL_ITEM_ITEM_USER_NAME="ITEM_USER_NAME";
    public static final String COL_ITEM_ITEM_POST_EDIT="ITEM_POST_EDIT";
    public static final String COL_ITEM_ITEM_NEW_PRICE="ITEM_NEW_PRICE";
    public static final String COL_ITEM_ITEM_WHEELS_SIZE="ITEM_WHEELS_SIZE";
    public static final String COL_ITEM_ITEM_CAR_PLATES_CITY="ITEM_CAR_PLATES_CITY";
    public static final String COL_ITEM_ITEM_CAR_PLATES_NUMBER="ITEM_CAR_PLATES_NUMBER";
    public static final String COL_ITEM_ITEM_CAR_PLATES_SPECIAL_OR_NOT="ITEM_CAR_PLATES_SPECIAL_OR_NOT";
    public static final String COL_ITEM_ITEM_BURNED_PRICE="ITEM_BURNED_PRICE";
    public static final String COL_ITEM_ITEM_PRICE="ITEM_PRICE";
    public static final String COL_ITEM_ITEM_ACTIVE_OR_NOT="ITEM_NAME_ACTIVE_OR_NOT";

    public static final String TABLE_SUGGESTED="item_suggested_table";
    public static final String COL_SUGGESTED_id="ID";
    public static final String COL_SUGGESTED_BOOST_OR_NOT="BOOST_OR_NOT";
    public static final String COL_SUGGESTED_BOOST_TYPE="BOOST_TYPE";
    public static final String COL_SUGGESTED_TYPE="TYPE";
    public static final String COL_SUGGESTED_PERSON_GALLERY="PERSON_GALLERY";
    public static final String COL_SUGGESTED_ID_IN_SERVER="ITEM_ID_IN_SERVER";
    public static final String COL_SUGGESTED_CAR_MAKE="ITEM_CAR_MAKE";
    public static final String COL_SUGGESTED_CAR_MODEL="ITEM_CAR_MODEL";
    public static final String COL_SUGGESTED_CAR_YEAR="ITEM_CAR_YEAR";
    public static final String COL_SUGGESTED_CAR_CONDITION="ITEM_CAR_CONDITION";
    public static final String COL_SUGGESTED_CAR_KILOMETERS="ITEM_CAR_KILOMETERS";
    public static final String COL_SUGGESTED_CAR_TRANSMISSION="ITEM_CAR_TRANSMISSION";
    public static final String COL_SUGGESTED_CAR_FUEL="ITEM_CAR_FUEL";
    public static final String COL_SUGGESTED_CAR_LICENSE="ITEM_CAR_LICENSE";
    public static final String COL_SUGGESTED_CAR_INSURANCE="ITEM_CAR_INSURANCE";
    public static final String COL_SUGGESTED_CAR_COLOR="ITEM_CAR_COLOR";
    public static final String COL_SUGGESTED_CAR_PAYMENT_METHOD="ITEM_CAR_PAYMENT_METHOD";
    public static final String COL_SUGGESTED_CAR_OPTIONS="ITEM_CAR_OPTIONS";
    public static final String COL_SUGGESTED_NUMBER_OF_COMMENT="ITEM_NUMBER_OF_COMMENT";
    public static final String COL_SUGGESTED_NUMBER_OF_IMAGE="ITEM_NUMBER_OF_IMAGE";
    public static final String COL_SUGGESTED_CITY="ITEM_CITY";
    public static final String COL_SUGGESTED_NEIGHBORHOOD="ITEM_NEIGHBORHOOD";
    public static final String COL_SUGGESTED_TIME_POST="ITEM_TIME_POST";
    public static final String COL_SUGGESTED_USER_PHONE_NUMBER="ITEM_USER_PHONE_NUMBER";
    public static final String COL_SUGGESTED_ITEM_NAME="ITEM_NAME";
    public static final String COL_SUGGESTED_ITEM_IMAGE="ITEM_IMAGE";
    public static final String COL_SUGGESTED_ITEM_DESCRIPTION="ITEM_DESCRIPTION";
    public static final String COL_SUGGESTED_USER_IMAGE="ITEM_USER_IMAGE";
    public static final String COL_SUGGESTED_USER_NAME="ITEM_USER_NAME";
    public static final String COL_SUGGESTED_ITEM_POST_EDIT="ITEM_POST_EDIT";
    public static final String COL_SUGGESTED_ITEM_NEW_PRICE="ITEM_NEW_PRICE";
    public static final String COL_SUGGESTED_ITEM_WHEELS_SIZE="ITEM_WHEELS_SIZE";
    public static final String COL_SUGGESTED_ITEM_CAR_PLATES_CITY="ITEM_CAR_PLATES_CITY";
    public static final String COL_SUGGESTED_ITEM_CAR_PLATES_NUMBER="ITEM_CAR_PLATES_NUMBER";
    public static final String COL_SUGGESTED_ITEM_CAR_PLATES_SPECIAL_OR_NOT="ITEM_CAR_PLATES_SPECIAL_OR_NOT";
    public static final String COL_SUGGESTED_ITEM_BURNED_PRICE="ITEM_BURNED_PRICE";
    public static final String COL_SUGGESTED_ITEM_PRICE="ITEM_PRICE";
    public static final String COL_SUGGESTED_ITEM_ACTIVE_OR_NOT="ITEM_NAME_ACTIVE_OR_NOT";

    public static final String TABLE_NOTIFICATION="notification_table";
    public static final String COL_NOTIFICATION_id="ID";
    public static final String COL_PROCESS= "PROCESS";
    public static final String OPEN_OR_NOT_YET= "OPEN_OR_NOT_YET";
    public static final String NOTIFICATION_TITLE= "NOTIFICATION_TITLE";
    public static final String NOTIFICATION_DES= "NOTIFICATION_DES";
    public static final String PERSON_OR_GALLERY= "PERSON_OR_GALLERY";
    public static final String IMAGE_PATH= "IMAGE_PATH";
    public static final String PROCESS_IMAGE = "PROCESS_IMAGE";
    public static final String TIME_STAMP = "TIME_STAMP";
    public static final String TIME = "TIME";
    public static final String DATE = "DATE";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_ITEM +" (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "BOOST_OR_NOT TEXT" + ",BOOST_TYPE TEXT" + ",TYPE TEXT" + ",PERSON_GALLERY TEXT" + ",ITEM_ID_IN_SERVER TEXT" + ",ITEM_CAR_MAKE TEXT" + ",ITEM_CAR_MODEL TEXT" + ",ITEM_CAR_YEAR TEXT" + ",ITEM_CAR_CONDITION TEXT" + ",ITEM_CAR_KILOMETERS TEXT" + ",ITEM_CAR_TRANSMISSION TEXT" + ",ITEM_CAR_FUEL TEXT" + ",ITEM_CAR_LICENSE TEXT" + ",ITEM_CAR_INSURANCE TEXT" + ",ITEM_CAR_COLOR TEXT" + ",ITEM_CAR_PAYMENT_METHOD TEXT" + ",ITEM_CAR_OPTIONS TEXT" + ",ITEM_NUMBER_OF_COMMENT TEXT" + ",ITEM_NUMBER_OF_IMAGE TEXT" + ",ITEM_CITY TEXT" + ",ITEM_NEIGHBORHOOD TEXT" + ",ITEM_TIME_POST TEXT" + ",ITEM_USER_PHONE_NUMBER TEXT" + ",ITEM_NAME TEXT" + ",ITEM_IMAGE TEXT" + ",ITEM_DESCRIPTION TEXT" + ",ITEM_USER_IMAGE TEXT" + ",ITEM_USER_NAME TEXT" + ",ITEM_POST_EDIT TEXT" + ",ITEM_NEW_PRICE TEXT" + ",ITEM_WHEELS_SIZE TEXT" + ",ITEM_CAR_PLATES_CITY TEXT" + ",ITEM_CAR_PLATES_NUMBER TEXT" + ",ITEM_CAR_PLATES_SPECIAL_OR_NOT TEXT"+ ",ITEM_BURNED_PRICE TEXT"+ ",ITEM_PRICE TEXT" + ",ITEM_NAME_ACTIVE_OR_NOT TEXT)");

        db.execSQL("create table "+TABLE_SUGGESTED +" (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "BOOST_OR_NOT TEXT" + ",BOOST_TYPE TEXT" + ",TYPE TEXT" + ",PERSON_GALLERY TEXT" + ",ITEM_ID_IN_SERVER TEXT" + ",ITEM_CAR_MAKE TEXT" + ",ITEM_CAR_MODEL TEXT" + ",ITEM_CAR_YEAR TEXT" + ",ITEM_CAR_CONDITION TEXT" + ",ITEM_CAR_KILOMETERS TEXT" + ",ITEM_CAR_TRANSMISSION TEXT" + ",ITEM_CAR_FUEL TEXT" + ",ITEM_CAR_LICENSE TEXT" + ",ITEM_CAR_INSURANCE TEXT" + ",ITEM_CAR_COLOR TEXT" + ",ITEM_CAR_PAYMENT_METHOD TEXT" + ",ITEM_CAR_OPTIONS TEXT" + ",ITEM_NUMBER_OF_COMMENT TEXT" + ",ITEM_NUMBER_OF_IMAGE TEXT" + ",ITEM_CITY TEXT" + ",ITEM_NEIGHBORHOOD TEXT" + ",ITEM_TIME_POST TEXT" + ",ITEM_USER_PHONE_NUMBER TEXT" + ",ITEM_NAME TEXT" + ",ITEM_IMAGE TEXT" + ",ITEM_DESCRIPTION TEXT" + ",ITEM_USER_IMAGE TEXT" + ",ITEM_USER_NAME TEXT" + ",ITEM_POST_EDIT TEXT" + ",ITEM_NEW_PRICE TEXT" + ",ITEM_WHEELS_SIZE TEXT" + ",ITEM_CAR_PLATES_CITY TEXT" + ",ITEM_CAR_PLATES_NUMBER TEXT" + ",ITEM_CAR_PLATES_SPECIAL_OR_NOT TEXT"+ ",ITEM_BURNED_PRICE TEXT"+ ",ITEM_PRICE TEXT" + ",ITEM_NAME_ACTIVE_OR_NOT TEXT)");

        db.execSQL("create table "+TABLE_NOTIFICATION +" (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "PROCESS TEXT" + ",OPEN_OR_NOT_YET TEXT" + ",NOTIFICATION_TITLE TEXT" + ",NOTIFICATION_DES TEXT" + ",PERSON_OR_GALLERY TEXT" + ",IMAGE_PATH TEXT" + ",PROCESS_IMAGE TEXT" + ",TIME_STAMP TEXT" + ",TIME TEXT" + ",DATE TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_ITEM);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_SUGGESTED);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NOTIFICATION);

        onCreate(db);
    }

    ///////////////////////insert data//////////////////////////////////////////

    public boolean insertDataItem(String boostOrNot,String itemBoostType
            ,String itemType,String itemPersonGallery,String itemIdInServer,String itemCarMake,String itemCarModel,String itemCarYear,String itemCarCondition,String itemCarKilometers,String itemCarTransmission,String itemCarFuel,String itemCarLicense,String itemCarInsurance,String itemCarColor,String itemCarPaymentMethod,String itemCarOptions,String itemNumberOfComment,String itemNumberOfImage,String itemCity,String itemNeighborhood,String itemTimePost,String itemUserPhoneNumber,String itemName,String itemImage,String itemDescription,String userImage,String userName,String itemPostEdit,String itemNewPrice,String itemWheelsSize,String itemCarPlatesCity,String itemCarPlatesNumber,String itemCarPlatesSpecial,String itemBurnedPrice,String itemPrice,String itemActiveOrNot)
    {
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_ITEM_BOOST_OR_NOT,boostOrNot);
        contentValues.put(COL_ITEM_BOOST_TYPE,itemBoostType);
        contentValues.put(COL_ITEM_TYPE,itemType);
        contentValues.put(COL_ITEM_PERSON_GALLERY,itemPersonGallery);
        contentValues.put(COL_ITEM_ID_IN_SERVER,itemIdInServer);
        contentValues.put(COL_ITEM_CAR_MAKE,itemCarMake);
        contentValues.put(COL_ITEM_CAR_MODEL,itemCarModel);
        contentValues.put(COL_ITEM_CAR_YEAR,itemCarYear);
        contentValues.put(COL_ITEM_CAR_CONDITION,itemCarCondition);
        contentValues.put(COL_ITEM_CAR_KILOMETERS,itemCarKilometers);
        contentValues.put(COL_ITEM_CAR_TRANSMISSION,itemCarTransmission);
        contentValues.put(COL_ITEM_CAR_FUEL,itemCarFuel);
        contentValues.put(COL_ITEM_CAR_LICENSE,itemCarLicense);
        contentValues.put(COL_ITEM_CAR_INSURANCE,itemCarInsurance);
        contentValues.put(COL_ITEM_CAR_COLOR,itemCarColor);
        contentValues.put(COL_ITEM_CAR_PAYMENT_METHOD,itemCarPaymentMethod);
        contentValues.put(COL_ITEM_CAR_OPTIONS,itemCarOptions);
        contentValues.put(COL_ITEM_NUMBER_OF_COMMENT,itemNumberOfComment);
        contentValues.put(COL_ITEM_NUMBER_OF_IMAGE,itemNumberOfImage);
        contentValues.put(COL_ITEM_CITY,itemCity);
        contentValues.put(COL_ITEM_NEIGHBORHOOD,itemNeighborhood);
        contentValues.put(COL_ITEM_TIME_POST,itemTimePost);
        contentValues.put(COL_ITEM_USER_PHONE_NUMBER,itemUserPhoneNumber);
        contentValues.put(COL_ITEM_ITEM_NAME,itemName);
        contentValues.put(COL_ITEM_ITEM_IMAGE,itemImage);
        contentValues.put(COL_ITEM_ITEM_DESCRIPTION,itemDescription);
        contentValues.put(COL_ITEM_USER_IMAGE,userImage);
        contentValues.put(COL_ITEM_ITEM_USER_NAME,userName);
        contentValues.put(COL_ITEM_ITEM_POST_EDIT,itemPostEdit);
        contentValues.put(COL_ITEM_ITEM_NEW_PRICE,itemNewPrice);
        contentValues.put(COL_ITEM_ITEM_WHEELS_SIZE,itemWheelsSize);
        contentValues.put(COL_ITEM_ITEM_CAR_PLATES_CITY,itemCarPlatesCity);
        contentValues.put(COL_ITEM_ITEM_CAR_PLATES_NUMBER,itemCarPlatesNumber);
        contentValues.put(COL_ITEM_ITEM_CAR_PLATES_SPECIAL_OR_NOT,itemCarPlatesSpecial);
        contentValues.put(COL_ITEM_ITEM_BURNED_PRICE,itemBurnedPrice);
        contentValues.put(COL_ITEM_ITEM_PRICE,itemPrice);
        contentValues.put(COL_ITEM_ITEM_ACTIVE_OR_NOT,itemActiveOrNot);

        long result= db.insert(TABLE_ITEM,null,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean insertDataSuggested(String boostOrNot,String itemBoostType
            ,String itemType,String itemPersonGallery,String itemIdInServer,String itemCarMake,String itemCarModel,String itemCarYear,String itemCarCondition,String itemCarKilometers,String itemCarTransmission,String itemCarFuel,String itemCarLicense,String itemCarInsurance,String itemCarColor,String itemCarPaymentMethod,String itemCarOptions,String itemNumberOfComment,String itemNumberOfImage,String itemCity,String itemNeighborhood,String itemTimePost,String itemUserPhoneNumber,String itemName,String itemImage,String itemDescription,String userImage,String userName,String itemPostEdit,String itemNewPrice,String itemWheelsSize,String itemCarPlatesCity,String itemCarPlatesNumber,String itemCarPlatesSpecial,String itemBurnedPrice,String itemPrice,String itemActiveOrNot)
    {
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_SUGGESTED_BOOST_OR_NOT,boostOrNot);
        contentValues.put(COL_SUGGESTED_BOOST_TYPE,itemBoostType);
        contentValues.put(COL_SUGGESTED_TYPE,itemType);
        contentValues.put(COL_SUGGESTED_PERSON_GALLERY,itemPersonGallery);
        contentValues.put(COL_SUGGESTED_ID_IN_SERVER,itemIdInServer);
        contentValues.put(COL_SUGGESTED_CAR_MAKE,itemCarMake);
        contentValues.put(COL_SUGGESTED_CAR_MODEL,itemCarModel);
        contentValues.put(COL_SUGGESTED_CAR_YEAR,itemCarYear);
        contentValues.put(COL_SUGGESTED_CAR_CONDITION,itemCarCondition);
        contentValues.put(COL_SUGGESTED_CAR_KILOMETERS,itemCarKilometers);
        contentValues.put(COL_SUGGESTED_CAR_TRANSMISSION,itemCarTransmission);
        contentValues.put(COL_SUGGESTED_CAR_FUEL,itemCarFuel);
        contentValues.put(COL_SUGGESTED_CAR_LICENSE,itemCarLicense);
        contentValues.put(COL_SUGGESTED_CAR_INSURANCE,itemCarInsurance);
        contentValues.put(COL_SUGGESTED_CAR_COLOR,itemCarColor);
        contentValues.put(COL_SUGGESTED_CAR_PAYMENT_METHOD,itemCarPaymentMethod);
        contentValues.put(COL_SUGGESTED_CAR_OPTIONS,itemCarOptions);
        contentValues.put(COL_SUGGESTED_NUMBER_OF_COMMENT,itemNumberOfComment);
        contentValues.put(COL_SUGGESTED_NUMBER_OF_IMAGE,itemNumberOfImage);
        contentValues.put(COL_SUGGESTED_CITY,itemCity);
        contentValues.put(COL_SUGGESTED_NEIGHBORHOOD,itemNeighborhood);
        contentValues.put(COL_SUGGESTED_TIME_POST,itemTimePost);
        contentValues.put(COL_SUGGESTED_USER_PHONE_NUMBER,itemUserPhoneNumber);
        contentValues.put(COL_SUGGESTED_ITEM_NAME,itemName);
        contentValues.put(COL_SUGGESTED_ITEM_IMAGE,itemImage);
        contentValues.put(COL_SUGGESTED_ITEM_DESCRIPTION,itemDescription);
        contentValues.put(COL_SUGGESTED_USER_IMAGE,userImage);
        contentValues.put(COL_SUGGESTED_USER_NAME,userName);
        contentValues.put(COL_SUGGESTED_ITEM_POST_EDIT,itemPostEdit);
        contentValues.put(COL_SUGGESTED_ITEM_NEW_PRICE,itemNewPrice);
        contentValues.put(COL_SUGGESTED_ITEM_WHEELS_SIZE,itemWheelsSize);
        contentValues.put(COL_SUGGESTED_ITEM_CAR_PLATES_CITY,itemCarPlatesCity);
        contentValues.put(COL_SUGGESTED_ITEM_CAR_PLATES_NUMBER,itemCarPlatesNumber);
        contentValues.put(COL_SUGGESTED_ITEM_CAR_PLATES_SPECIAL_OR_NOT,itemCarPlatesSpecial);
        contentValues.put(COL_SUGGESTED_ITEM_BURNED_PRICE,itemBurnedPrice);
        contentValues.put(COL_SUGGESTED_ITEM_PRICE,itemPrice);
        contentValues.put(COL_SUGGESTED_ITEM_ACTIVE_OR_NOT,itemActiveOrNot);

        long result= db.insert(TABLE_SUGGESTED,null,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    public boolean insertNotification(String process,String openOrNotYet
            ,String notificationTitle,String notificationDes,String personOrGallery,String imagePath,String processImage,String timeStamp,String time,String date)
    {
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_PROCESS,process);
        contentValues.put(OPEN_OR_NOT_YET,openOrNotYet);
        contentValues.put(NOTIFICATION_TITLE,notificationTitle);
        contentValues.put(NOTIFICATION_DES,notificationDes);
        contentValues.put(PERSON_OR_GALLERY,personOrGallery);
        contentValues.put(IMAGE_PATH,imagePath);
        contentValues.put(PROCESS_IMAGE,processImage);
        contentValues.put(TIME_STAMP,timeStamp);
        contentValues.put(TIME,time);
        contentValues.put(DATE,date);

        long result= db.insert(TABLE_NOTIFICATION,null,contentValues);
        if(result == -1)
            return false;
        else
            return true;
    }

    //////////////////////////to get data /////////////////////

    public Cursor descendingItem(){
        SQLiteDatabase db =this.getWritableDatabase();
        Cursor cursor = db.query(TABLE_ITEM, null, null,
                null, null, null, COL_ITEM_id + " DESC", null);
        return cursor;
    }

    public Cursor descendingDataSuggested(){
        SQLiteDatabase db =this.getWritableDatabase();
        Cursor cursor = db.query(TABLE_SUGGESTED, null, null,
                null, null, null, COL_SUGGESTED_id + " DESC", null);
        return cursor;
    }

    public Cursor descendingNotification(){
        SQLiteDatabase db =this.getWritableDatabase();
        Cursor cursor = db.query(TABLE_NOTIFICATION, null, null,
                null, null, null, COL_NOTIFICATION_id + " DESC", null);
        return cursor;
    }

    //////////////////////////////////////delete data////////////////

    public Integer deleteItem(String id){
        SQLiteDatabase db =this.getWritableDatabase();
        return db.delete(TABLE_ITEM, " ID = ?",new String[] {id});
    }

    public Integer deleteDataSuggested(String id){
        SQLiteDatabase db =this.getWritableDatabase();
        return db.delete(TABLE_SUGGESTED, " ID = ?",new String[] {id});
    }

    public Integer deleteNotification(String id){
        SQLiteDatabase db =this.getWritableDatabase();
        return db.delete(TABLE_NOTIFICATION, " ID = ?",new String[] {id});
    }

    public void deleteAllItem(){
        SQLiteDatabase db =this.getWritableDatabase();
        db.execSQL("DELETE FROM item_table"); //delete all rows in a table
        db.close();
    }

}
