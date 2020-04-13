package com.cars.halamotor.presnter;

import com.cars.halamotor.model.AccAndJunk;
import com.cars.halamotor.model.CCEMT;
import com.cars.halamotor.model.CarPlatesModel;
import com.cars.halamotor.model.WheelsRimModel;
import com.cars.halamotor.view.activity.WheelsRim;

public interface ItemModel {
    void onReceiveCCEMTObject(CCEMT ccemt);

    void onReceiveAccAndJunkObject(AccAndJunk accAndJunk);

    void onReceiveWheelsRimObject(WheelsRimModel wheelsRim);

    void onReceiveCarPlatesObject(CarPlatesModel carPlatesModel);

}
