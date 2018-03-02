package com.mi.pattern.strategy;

/**
 * Created by VI007RA on 1/10/2018.
 */
public class NoCamPhone extends APhone
{
    public String dispaly()
    {
        return iDisplay.takeSnap();
    }


    public void setTypeOfCam(IDisplay iDisplay)
    {
        this.iDisplay = iDisplay;
    }
}
