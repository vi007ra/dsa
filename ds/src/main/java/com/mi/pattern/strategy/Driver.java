package com.mi.pattern.strategy;

/**
 * Created by VI007RA on 1/8/2018.
 */
public class Driver
{
    public static void main(String[] args) {


        APhone aPhone = new FrontCamPhone(new FrontCam(10));

    }
}