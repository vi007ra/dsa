package com.mi.thread;

/**
 * Created by vijayrathi on 05/02/18.
 */

class Runner2 implements Runnable
{
    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Runner2: " + i);
        }
    }
}