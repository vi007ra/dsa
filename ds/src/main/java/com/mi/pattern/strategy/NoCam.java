package com.mi.pattern.strategy;

/**
 * Created by VI007RA on 1/10/2018.
 */
public class NoCam implements IDisplay
{

    int supportedMP;

    public NoCam(int supportedMP)
    {
        this.supportedMP = supportedMP;
    }

    public String takeSnap()
    {
        String string = "This is a basic cam";
        return string;
    }

    public String recordVideo()
    {
        String string = "This is a basic cam";
        return string;
    }
}
