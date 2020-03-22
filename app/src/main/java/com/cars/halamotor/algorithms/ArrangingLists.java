package com.cars.halamotor.algorithms;

import com.cars.halamotor.model.AccAndJunkFirstCase;
import com.cars.halamotor.model.CCEMTFirestCase;
import com.cars.halamotor.model.CarPlatesFirstCase;
import com.cars.halamotor.model.SuggestedItem;
import com.cars.halamotor.model.WheelsRimFirstCase;

import java.util.ArrayList;

public class ArrangingLists {

    public static ArrayList<CCEMTFirestCase> setEditTextFirstItemCCEMTFirstCase
            (ArrayList<CCEMTFirestCase> ccemtFirstCaseArrayList) {

        ArrayList<CCEMTFirestCase> ccemtFCContainerArrayList = new ArrayList<>();
        for (int i =0 ; i <ccemtFirstCaseArrayList.size();i++)
        {
            if (ccemtFirstCaseArrayList.get(i).getItemPostEdit().equals("1"))
            {
                ccemtFCContainerArrayList.add(ccemtFirstCaseArrayList.get(i));
                ccemtFirstCaseArrayList.remove(i);
            }
        }

        for (int j = 0;j<ccemtFCContainerArrayList.size();j++)
        {
            ccemtFirstCaseArrayList.add(j,ccemtFCContainerArrayList.get(j));
        }

        return ccemtFirstCaseArrayList;
    }

    public static ArrayList<WheelsRimFirstCase> setEditTextFirstItemWheelsRim
            (ArrayList<WheelsRimFirstCase> wheelsRimFirstCaseArrayList) {

        ArrayList<WheelsRimFirstCase> wheelsRimContainerArrayList = new ArrayList<>();
        for (int i =0 ; i <wheelsRimFirstCaseArrayList.size();i++)
        {
            if (wheelsRimFirstCaseArrayList.get(i).getItemPostEdit().equals("1"))
            {
                wheelsRimContainerArrayList.add(wheelsRimFirstCaseArrayList.get(i));
                wheelsRimFirstCaseArrayList.remove(i);
            }
        }

        for (int j = 0;j<wheelsRimContainerArrayList.size();j++)
        {
            wheelsRimFirstCaseArrayList.add(j,wheelsRimContainerArrayList.get(j));
        }

        return wheelsRimFirstCaseArrayList;
    }

    public static ArrayList<CarPlatesFirstCase> setEditTextFirstCarPlates
            (ArrayList<CarPlatesFirstCase> carPlatesFirstCaseArrayList) {

        ArrayList<CarPlatesFirstCase> carPlatesContainerArrayList = new ArrayList<>();
        for (int i =0 ; i <carPlatesFirstCaseArrayList.size();i++)
        {
            if (carPlatesFirstCaseArrayList.get(i).getItemPostEdit().equals("1"))
            {
                carPlatesContainerArrayList.add(carPlatesFirstCaseArrayList.get(i));
                carPlatesFirstCaseArrayList.remove(i);
            }
        }

        for (int j = 0;j<carPlatesContainerArrayList.size();j++)
        {
            carPlatesFirstCaseArrayList.add(j,carPlatesContainerArrayList.get(j));
        }

        return carPlatesFirstCaseArrayList;
    }

    public static ArrayList<AccAndJunkFirstCase> setEditTextFirstAccAndJunk
            (ArrayList<AccAndJunkFirstCase> accAndJunkFirstCaseArrayList) {

        ArrayList<AccAndJunkFirstCase> accAndJunkContainerArrayList = new ArrayList<>();
        for (int i =0 ; i <accAndJunkFirstCaseArrayList.size();i++)
        {
            if (accAndJunkFirstCaseArrayList.get(i).getItemPostEdit().equals("1"))
            {
                accAndJunkContainerArrayList.add(accAndJunkFirstCaseArrayList.get(i));
                accAndJunkFirstCaseArrayList.remove(i);
            }
        }

        for (int j = 0;j<accAndJunkFirstCaseArrayList.size();j++)
        {
            accAndJunkFirstCaseArrayList.add(j,accAndJunkFirstCaseArrayList.get(j));
        }

        return accAndJunkFirstCaseArrayList;
    }


}
