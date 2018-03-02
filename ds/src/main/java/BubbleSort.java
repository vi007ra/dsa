/**
 * Created by vijayrathi on 14/12/17.
 */
public class BubbleSort
{
    private static int[] swap(int[] arr, int i, int j)
    {
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
        return arr;
    }

    private static int[] bubbleSort(int[] arr)
    {
        int i, j;
        for (i = arr.length - 1; i > 0; i--)
        {
            for (j = 0; j < i; j++)
            {
                if (arr[j] > arr[j + 1])
                    swap(arr, j, j + 1);
            }
        }
        return arr;
    }

    public static void main(String[] args)
    {

        int[] arr = {24, 3, 56, 32, 15, 89, 5, 91, 2, 9};
        BubbleSort.bubbleSortA(arr);

        for (int i : arr)
        {
            System.out.println(i);
        }

    }

    public static int[] bubbleSortA(int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = arr.length - 1; j > i; j--)
            {
                if (arr[j - 1] > arr[j])
                {
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }
}
