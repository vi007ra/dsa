package com.mi.pattern.observer;

import java.util.ArrayList;

/**
 * Created by vijayrathi on 12/01/18.
 */
public class CarPrice implements Isubject
{
    ArrayList<IObserver> I_OBSERVERS = new ArrayList<IObserver>();
    private String brand;
    private double price;

    public CarPrice(String brand, double price)
    {
        this.brand = brand;
        this.price = price;
    }

    public void setPrice(double price)
    {
        this.price = price;
        notifyObservers();
    }

    public void registerObserver(IObserver iObserver)
    {
        I_OBSERVERS.add(iObserver);
    }

    public void deRegisterObserver(IObserver iObserver)
    {
        I_OBSERVERS.remove(iObserver);
    }

    public void notifyObservers()
    {
        for (IObserver iObserver : I_OBSERVERS)
        {
            iObserver.update(price);
        }
    }
}
