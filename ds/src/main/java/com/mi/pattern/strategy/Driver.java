package com.mi.pattern.strategy;

/**
 * Created by VI007RA on 1/8/2018.
 */
public class Driver
{
    public static void main(String[] args)
    {
        APhone frontCamPhone = new FrontCamPhone();
        frontCamPhone.setTypeOfCam(new FrontCam(10));

        APhone iPhone = new FrontCamPhone();
        iPhone.setTypeOfCam(new RearCam(20));

        System.out.println(frontCamPhone.dispaly());
        System.out.println(iPhone.dispaly());

    }
}
