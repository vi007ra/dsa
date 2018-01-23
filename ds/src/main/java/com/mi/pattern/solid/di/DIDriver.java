package com.mi.pattern.solid.di;

/**
 * Created by VI007RA on 1/15/2018.
 */
public class DIDriver
{
    public static void main(String[] args) {

        Animal cat = new Animal(new CatSpeakBehaviour());
        Animal dog = new Animal(new DogSpeakBehaviour());
        Animal cow = new Animal(new CowSpeakBehaviour());


        System.out.println(cat.speakBehaviour.speak() + "\n");
        System.out.println(dog.speakBehaviour.speak() + "\n");
        System.out.println(cow.speakBehaviour.speak() + "\n");
    }
}
