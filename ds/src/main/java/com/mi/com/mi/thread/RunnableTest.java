package com.mi.com.mi.thread;

/**
 * Created by vijayrathi on 04/02/18.
 */
public class RunnableTest
{

    private int count = 0;

    public static void main(String[] args)
    {
        RunnableTest runnableTest = new RunnableTest();
        runnableTest.doWork();
    }

    public synchronized void doIncrement()
    {
        count++;
    }

    public void doWork()
    {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
            {
                doIncrement();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++)
            {
                doIncrement();
            }
        });

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        System.out.println("Count is: " + count);

    }
}
