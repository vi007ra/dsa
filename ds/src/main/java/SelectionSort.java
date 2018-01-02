/**
 * Created by vijayrathi on 14/12/17.
 */
public class SelectionSort

{
    private static int [] swap(int[] arr, int i, int j)
    {
            int tmp = arr[i];
            arr[i]  = arr[j];
            arr[j]  = tmp;
        return arr;
    }

    private static int[] selectionSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex --)
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
        int[] arr = {24, 56, 32, 89, 1, 43, 93};
        SelectionSort.selectionSort(arr);
        for (int element : arr)
        {
            System.out.println(element);
        }
    }
}
