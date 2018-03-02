package com.mi.com.mi.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by vijayrathi on 05/02/18.
 */
public class SyncBlock
{
    Random randomGen = new Random();

    List<Integer> randomList1 = new ArrayList<>();
    List<Integer> randomList2 = new ArrayList<>();

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void producer()
    {
        synchronized (lock1)
        {
            try
            {
                Thread.sleep(1);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            randomList1.add(randomGen.nextInt(100));
        }
    }

    public void consumer()
    {
        synchronized (lock2)
        {
            try
            {
                Thread.sleep(1);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }


            randomList2.add(randomGen.nextInt(100));
        }
    }

    public void doOperation()
    {

        for (int i = 0; i < 1000; i++)
        {
            producer();
            consumer();
        }
    }

    public void main(String[] args)
    {
        System.out.println("Starting............");

        long start = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                doOperation();
            }
        });
        Thread thread2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                doOperation();
            }
        });


        thread1.start();
        thread2.start();


        try
        {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("Time Taken..." + (end - start));
        System.out.println("List1: " + randomList1.size() + ":::" + "List2: " + randomList2.size());

    }
}
