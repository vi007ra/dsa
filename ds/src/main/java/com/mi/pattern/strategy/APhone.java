package com.mi.pattern.strategy;

/**
 * Created by VI007RA on 1/8/2018.
 */

public abstract class APhone
{
    IDisplay iDisplay;
    public abstract String dispaly();
    public abstract void setTypeOfCam(IDisplay iDisplay);
    public String makeCall(String destNumber)
    {
        return destNumber;
    }
    public String sendSMS(String destNumber)
    {
        return destNumber;
    }

}
