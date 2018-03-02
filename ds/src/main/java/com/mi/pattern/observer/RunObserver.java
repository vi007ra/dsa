package com.mi.pattern.observer;

/**
 * Created by vijayrathi on 12/01/18.
 */
public class RunObserver
{
    public static void main(String[] args)
    {

        IObserver aIObserver = new AObserver();
        IObserver bIObserver = new BObserver();
        IObserver cIObserver = new CObserver();

        CarPrice isubject = new CarPrice("JeepCompass", 2000000.5);

        isubject.registerObserver(aIObserver);
        isubject.registerObserver(bIObserver);
        isubject.registerObserver(cIObserver);

        isubject.setPrice(2500000.5);

        isubject.deRegisterObserver(cIObserver);
        isubject.setPrice(1800000.5);
    }
}
