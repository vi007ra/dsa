package com.mi.pattern.solid.di;

/**
 * Created by VI007RA on 1/15/2018.
 */
public class Animal {

    SpeakBehaviour speakBehaviour;

    public Animal(SpeakBehaviour speakBehaviour)
    {
        this.speakBehaviour = speakBehaviour;
    }
}
