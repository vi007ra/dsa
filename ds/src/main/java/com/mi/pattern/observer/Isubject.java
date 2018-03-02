package com.mi.pattern.observer;

/**
 * Created by vijayrathi on 12/01/18.
 */
public interface Isubject
{
    void registerObserver(IObserver iObserver);

    void deRegisterObserver(IObserver iObserver);

    void notifyObservers();
}
