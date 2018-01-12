package com.mi.pattern.observer;

/**
 * Created by vijayrathi on 12/01/18.
 */
public class CObserver implements IObserver {

    public void update(double price)
    {
        System.out.printf("Updated price to :" + price + " for C" + "\n");
    }
}