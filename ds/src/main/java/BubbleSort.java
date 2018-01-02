/**
 * Created by vijayrathi on 14/12/17.
 */
public class BubbleSort
{
    private static int[] swap(int[] arr, int i, int j)
    {
            int tmp = arr[j];
            arr[j]  = arr[i];
            arr[i]  = tmp;
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

    int[] arr = {1000, 9, 1, 7, 10, 100, 100000} ;
    BubbleSort.bubbleSort(arr);

    for (int i : arr)
    {
        System.out.println(i);
    }

}
}
