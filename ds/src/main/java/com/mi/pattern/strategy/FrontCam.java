package com.mi.pattern.strategy;

/**
 * Created by VI007RA on 1/8/2018.
 */
public class FrontCam implements IDisplay
{
    int supportedMP;

    public FrontCam(int supportedMP)
    {
        this.supportedMP = supportedMP;
    }

    public String takeSnap()
    {
        String string = "Take snap from Front with " + supportedMP;
        return string;
    }

    public String recordVideo()
    {
        String string = "Record video from Front" + supportedMP;
        return string;
    }
}
