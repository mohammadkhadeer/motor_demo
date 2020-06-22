package com.cars.halamotor.functions;

import android.content.Context;
import android.os.Handler;
import android.util.Log;

import com.cars.halamotor.dataBase.DBHelper;
import com.cars.halamotor.model.CarMakeAndCarModel;
import com.cars.halamotor.model.CityWithNeighborhood;
import com.cars.halamotor.model.ItemCCEMT;

import java.util.ArrayList;
import java.util.Locale;

import static com.cars.halamotor.dataBase.DataBaseInstance.getDataBaseInstance;
import static com.cars.halamotor.fireBaseDB.FireBaseDBPaths.getUserPathInServerFB;
import static com.cars.halamotor.fireBaseDB.InsertToFireBase.addCarForExchangeStore;
import static com.cars.halamotor.fireBaseDB.InsertToFireBase.addCarForRentStore;
import static com.cars.halamotor.fireBaseDB.InsertToFireBase.addCarForSaleStore;
import static com.cars.halamotor.fireBaseDB.InsertToFireBase.addNewItemToFireStore;
import static com.cars.halamotor.functions.FillCarModel.fillAllCarArrayL;
import static com.cars.halamotor.functions.FillNeighborhood.fillCityAndNeighborhoodArrayL;
import static com.cars.halamotor.functions.Functions.getDAY;
import static com.cars.halamotor.functions.Functions.getMONTH;
import static com.cars.halamotor.functions.Functions.getTime;
import static com.cars.halamotor.functions.Functions.getTimeStamp;
import static com.cars.halamotor.functions.Functions.getYEAR;
import static com.cars.halamotor.sharedPreferences.SharedPreferencesInApp.getUserIdInServerFromSP;


public class UploadDamiData {
//don't forget to re clean array list in said cityWithNeighborhoodsArrayList
    public static void uploadDamiDataForTest(Context context)
    {
        String userIDOnServer ="-M4mXhiJ23WMSoskNiMX";
        ItemCCEMT itemCCEMT;
        ArrayList<CarMakeAndCarModel> allCarArrayList = new ArrayList<>();
        ArrayList<CityWithNeighborhood> cityWithNeighborhoodsArrayList = new ArrayList<>();

        allCarArrayList = fillAllCarArrayL(context);
        cityWithNeighborhoodsArrayList = fillCityAndNeighborhoodArrayL(cityWithNeighborhoodsArrayList,context);

        Log.i("TAG","all Cars Size "+String.valueOf(allCarArrayList.size()));
        Log.i("TAG","all Citys Size "+String.valueOf(cityWithNeighborhoodsArrayList.size()));

                for (int i =25;i<50;i++)
                {
//                    Log.i("TAG","Car Make: "+allCarArrayList.get(i).getCarMakeStr()+" Car MakeS: "+allCarArrayList.get(i).getCarMakeSStr()+" Car Model: "+allCarArrayList.get(i).getCarModelStr()+" Car ModelS: "+allCarArrayList.get(i).getCarModelSStr());
                    Log.i("TAG","I NUMBER "+String.valueOf(i)+" City: "+cityWithNeighborhoodsArrayList.get(i).getCityStr()+" CityS: "+cityWithNeighborhoodsArrayList.get(i).getCityStrS()+" Neighborhood: "+cityWithNeighborhoodsArrayList.get(i).getNeighborhoodStr()+" NeighborhoodS: "+cityWithNeighborhoodsArrayList.get(i).getNeighborhoodStrS());
                    itemCCEMT = createItemCCEMT(allCarArrayList.get(i).getCarMakeStr(),allCarArrayList.get(i).getCarMakeSStr(),allCarArrayList.get(i).getCarModelStr(),allCarArrayList.get(i).getCarModelSStr(),cityWithNeighborhoodsArrayList.get(i).getCityStr(),cityWithNeighborhoodsArrayList.get(i).getCityStrS(),cityWithNeighborhoodsArrayList.get(i).getNeighborhoodStr(),cityWithNeighborhoodsArrayList.get(i).getNeighborhoodStrS(),context,String.valueOf(i));
                    addNewItemToFireStore(itemCCEMT,"Car_For_Rent",getUserIdInServerFromSP(context),i,context);

                }
    }

    private static ItemCCEMT createItemCCEMT(String carMakeStr, String carMakeSStr, String carModelStr
            , String carModelSStr, String cityStr, String cityStrS
            , String neighborhoodStr, String neighborhoodStrS,Context context,String numberOfObject) {

        String category = "Car for rent";
        ArrayList<String> imagePathsArrayL = new ArrayList<>();
        imagePathsArrayL = fillImagePath(imagePathsArrayL);
        String userImage = "https://firebasestorage.googleapis.com/v0/b/hala-motor-8ff46.appspot.com/o/images%2FimageSat%20Apr%2011%2016%3A31%3A44%20GMT%2B04%3A00%2020200?alt=media&token=8b1c130b-2fc1-4f93-97b2-c2b618972779";
        String userToken = "https://firebasestorage.googleapis.com/v0/b/hala-motor-8ff46.appspot.com/o/images%2FimageSat%20Apr%2011%2016%3A31%3A44%20GMT%2B04%3A00%2020201?alt=media&token=258f666a-fc10-4a79-8bb7-b9514fa84d7e";

        ItemCCEMT itemCCEMT = new ItemCCEMT(
                "NOTYET"
                ,cityStr
                ,neighborhoodStr
                ,userToken
                ,getTime(), "0547590624"
                , carModelStr +" "+numberOfObject
                , carMakeStr +" " +carModelStr +" "+category+" " + cityStr +" "+neighborhoodStr
                , userImage
                ,"Mohammad"
                ,"0","123","0","0"
                ,category, category
                , carMakeStr
                , carModelStr

                , "2019"
                , "Used"
                , "10,000 - 69,999"
                , "Automatic"
                , "Diesel"
                , "Licensed"
                , "Compulsory Insurance"
                , "Grey"
                , "Cash or Installments"
                , "Sunroof | Electric Mirrors | Touch Screen | Cruise Control | Keyless Entry | Rear View Camera | Leather Seats | "

                ,"person", getTimeStamp()
                , getUserIdInServerFromSP(context)
                ,imagePathsArrayL
                ,0
                ,0,Integer.parseInt(getYEAR()), Integer.parseInt(getMONTH())
                , Integer.parseInt(getDAY())
                ,26000.0
                , 1000.0, 50000.0
                ,"1"
                ,category
                ,cityStrS
                ,neighborhoodStrS
                ,carMakeSStr
                ,carModelSStr
                ,"person"
                ,"Cash or Installments"
                ,"Diesel"
                ,"Used"
                ,"Compulsory Insurance"
                ,"Licensed"
                ,Integer.parseInt(getYEAR())
                , Locale.getDefault().getLanguage()
        );
        return itemCCEMT;
    }

    public static ArrayList<String> fillImagePath(ArrayList<String> imagePathsArrayL)
    {
        imagePathsArrayL = new ArrayList<>();
        String imagePath1 = "https://firebasestorage.googleapis.com/v0/b/hala-motor-8ff46.appspot.com/o/images%2FimageSun%20Jun%2007%2009%3A28%3A57%20GMT%2B04%3A00%2020200?alt=media&token=adf63d2c-2332-44ee-9903-38ea48d234f1";
        String imagePath2 = "https://firebasestorage.googleapis.com/v0/b/hala-motor-8ff46.appspot.com/o/images%2FimageSun%20Jun%2007%2009%3A28%3A57%20GMT%2B04%3A00%2020201?alt=media&token=ffcba575-99ca-4966-ac00-0252c8102be5";
        imagePathsArrayL.add(imagePath1);
        imagePathsArrayL.add(imagePath2);
        return imagePathsArrayL;
    }

}
