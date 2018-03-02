package com.mi.sort;

/**
 * Created by vijayrathi on 21/12/17.
 */
public class QuickSort
{

    public static void quickSort(int[] arr, int start, int end)
    {
        if (start < end)
        {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end)
    {
        int pivot = arr[end];
        int pIndex = start;

        for (int i = start; i <= end - 1; i++)
        {
            if (arr[i] <= pivot)
            {
                swapA(arr, i, pIndex);
                pIndex = pIndex + 1;
            }
        }
        swapA(arr, pIndex, end);

        return pIndex;
    }

    private static int[] swapA(int[] arr, int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }

    public static void main(String[] args)
    {
        int[] arr = {24, 3, 56, 32, 15, 89, 5, 91, 2, 9};

        QuickSort.quickSort(arr, 0, 9);

        for (int element : arr)
        {
            System.out.println(element);
        }
    }
}
