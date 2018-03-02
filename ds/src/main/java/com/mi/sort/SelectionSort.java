package com.mi.sort;

/**
 * Created by vijayrathi on 14/12/17.
 */
public class SelectionSort

{
    private static int[] swap(int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }

    private static int[] selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int largest = 0;
            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] > arr[largest])
                {
                    largest = i;
                }
            }
            swap(arr, largest, lastSortedIndex);
        }
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {24, 3, 56, 32, 15, 89, 5, 91, 2, 9};
        SelectionSort.selectionSortB(arr);
        for (int element : arr)
        {
            System.out.println(element);
        }
    }

    private static int[] swapA(int[] arr, int i, int j)
    {
        if (arr[i] > arr[j])
        {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    private static int[] selectionSortB(int[] arr)
    {

        for (int i = 0; i < arr.length; i++)
        {
            int minValue = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length; j++)
            {
                if (arr[j] < minValue)
                {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            swapA(arr, i, minIndex);

        }
        return arr;
    }

    private static int[] selectionSortA(int[] arr)
    {

        for (int i = 0; i < arr.length; i++)
        {
            int iMin = arr[i];
            int iMinIndex = i;
            for (int j = i; j < arr.length; j++)
            {
                if (arr[j] < iMin)
                {
                    iMin = arr[j];
                    iMinIndex = j;
                }
            }
            swapA(arr, i, iMinIndex);

        }
        return arr;
    }
}
