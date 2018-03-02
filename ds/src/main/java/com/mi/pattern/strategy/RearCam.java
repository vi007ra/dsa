package com.mi.pattern.strategy;

/**
 * Created by VI007RA on 1/8/2018.
 */
public class RearCam implements IDisplay
{
    int supportedMP;

    public RearCam(int supportedMP)
    {
        this.supportedMP = supportedMP;
    }

    public String takeSnap()
    {
        String string = "Take snap from Rear Camera with " + supportedMP;
        return string;
    }

    public String recordVideo()
    {
        String string = "Record video from Rear Camera" + supportedMP;
        return string;
    }
}
