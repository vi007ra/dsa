package com.mi.com.mi.thread;

/**
 * Created by vijayrathi on 05/02/18.
 */
public class SequentialProb
{
    public static void main(String[] args)
    {

        Thread thread1 = new Thread(new Runner1());
        Thread thread2 = new Thread(new Runner2());

        thread1.start();

        thread2.start();


    }
}
