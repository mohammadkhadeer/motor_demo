package com.my_motors.halamotor.model;

public class CarProcess {
    String process,processS;

    public CarProcess(String process, String processS) {
        this.process = process;
        this.processS = processS;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getProcessS() {
        return processS;
    }

    public void setProcessS(String processS) {
        this.processS = processS;
    }
}
