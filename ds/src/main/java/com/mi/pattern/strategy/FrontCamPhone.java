package com.mi.pattern.strategy;

/**
 * Created by VI007RA on 1/8/2018.
 */
public class FrontCamPhone extends APhone {


    public FrontCamPhone()
    {

    }
    public FrontCamPhone(IDisplay iDisplay)
    {
        this.iDisplay = iDisplay;
    }

    public void setTypeOfCam(IDisplay iDisplay)
    {
        this.iDisplay = iDisplay;
    }

    public String dispaly()
    {
        return iDisplay.takeSnap();
    }


}
