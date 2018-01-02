/**
 * Created by vijayrathi on 16/12/17.
 */
public class InsertionSort
{

    private static int[] insertioSort(int [] arr)
    {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < arr.length; firstUnsortedIndex ++)
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

        int[] arr = {20, 35, -15, 7, 55, 1, -22};

        InsertionSort.insertioSort(arr);
        InsertionSort.insertioSort(arr);

        InsertionSort.insertioSort(arr);
        InsertionSort.insertioSort(arr);
        for (int i : arr)
        {
            System.out.println(i);
        }

    }

}
