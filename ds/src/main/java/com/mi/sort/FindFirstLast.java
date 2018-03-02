package com.mi.sort;

/**
 * Created by vijayrathi on 11/12/17.
 */
public class FindFirstLast

{
    private static long FindFirst(long a)
    {
        while (a >= 10)
        {
            a = a / 10;
        }
        return a;
    }

    private static long FindLast(long a)
    {
        a = a % 10;
        return a;
    }

    public static void main(String[] args)
    {
        System.out.println(FindFirst(767565981));
        System.out.println((FindLast(767565984)));
    }
}
