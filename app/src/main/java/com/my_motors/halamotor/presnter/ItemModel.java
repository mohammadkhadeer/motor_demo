package com.my_motors.halamotor.presnter;

import com.my_motors.halamotor.model.ItemAccAndJunk;
import com.my_motors.halamotor.model.ItemCCEMT;
import com.my_motors.halamotor.model.ItemPlates;
import com.my_motors.halamotor.model.ItemWheelsRim;

public interface ItemModel {
    void onReceiveCCEMTObject(ItemCCEMT ccemt);

    void onReceiveAccAndJunkObject(ItemAccAndJunk accAndJunk);

    void onReceiveWheelsRimObject(ItemWheelsRim wheelsRim);

    void onReceiveCarPlatesObject(ItemPlates carPlatesModel);

}
