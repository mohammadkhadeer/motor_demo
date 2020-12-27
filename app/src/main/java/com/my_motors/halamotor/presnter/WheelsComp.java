package com.my_motors.halamotor.presnter;

import com.my_motors.halamotor.model.WheelsType;

public interface WheelsComp {

    void onWheelsSize(String wheelsSizeStr);

    void onWheelsType(WheelsType wheelsType);

}
