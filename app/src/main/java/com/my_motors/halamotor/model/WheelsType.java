package com.my_motors.halamotor.model;

public class WheelsType {
    String wheelsTypeStr,wheelsTypeStrS;

    public WheelsType(String wheelsTypeStr, String wheelsTypeStrS) {
        this.wheelsTypeStr = wheelsTypeStr;
        this.wheelsTypeStrS = wheelsTypeStrS;
    }

    public String getWheelsTypeStr() {
        return wheelsTypeStr;
    }

    public void setWheelsTypeStr(String wheelsTypeStr) {
        this.wheelsTypeStr = wheelsTypeStr;
    }

    public String getWheelsTypeStrS() {
        return wheelsTypeStrS;
    }

    public void setWheelsTypeStrS(String wheelsTypeStrS) {
        this.wheelsTypeStrS = wheelsTypeStrS;
    }
}
