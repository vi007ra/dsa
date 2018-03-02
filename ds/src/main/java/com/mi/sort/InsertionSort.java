package com.mi.sort;

/**
 * Created by vijayrathi on 16/12/17.
 */
public class InsertionSort
{

    private static int[] insertioSort(int[] arr)
    {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex++)
        {
            int tmpElement = arr[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && arr[i - 1] > tmpElement; i--)

            {
                arr[i] = arr[i - 1];
            }

            arr[i] = tmpElement;

        }
        return null;
    }

    public static void main(String[] args)
    {

        int[] arr = {24, 3, 5, 56, 32, 15, 89, 5, 91, 2, 9};

        InsertionSort.insertioSortA(arr);
        for (int i : arr)
        {
            System.out.println(i);
        }

    }

    private static int[] insertioSortA(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int tmp;
            for (int j = i + 1; j > 0; j--)
            {
                tmp = arr[j];
                if (tmp < arr[j - 1])
                {
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;

                }
            }
        }
        return arr;
    }

}
