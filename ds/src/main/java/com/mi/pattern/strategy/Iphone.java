package com.mi.pattern.strategy;

/**
 * Created by VI007RA on 1/8/2018.
 */
public class Iphone extends APhone{

    public Iphone(){}
    public Iphone(IDisplay iDisplay)
    {
        this.iDisplay = iDisplay;
    }

    public String dispaly()
    {
        return iDisplay.takeSnap();
    }

    public void setTypeOfCam(IDisplay iDisplay)
    {
        this.iDisplay = iDisplay;
    }
}
