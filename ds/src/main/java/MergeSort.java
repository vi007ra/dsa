/**
 * Created by vijayrathi on 18/12/17.
 */
public class MergeSort
{
    public static void mergeSort(int[] arr, int startInd, int endInd)
    {
        if ((endInd - startInd) < 2)
        {
            return;
        }

        int midInd = (startInd + endInd) / 2;

        mergeSort(arr, startInd, midInd);
        mergeSort(arr, midInd, endInd);
        merge(arr, startInd, midInd, endInd);
    }

    private static void merge(int[] arr, int startInd, int midInd, int endInd)
    {
        if (arr[midInd - 1] <= arr[midInd])
        {
            return;
        }

        int i = startInd;
        int j = midInd;
        int tempInd = 0;
        int[] tempArr = new int[endInd - startInd];

        while (i < midInd && j < endInd)
        {
            tempArr[tempInd ++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, startInd + tempInd, midInd - i);
        System.arraycopy(tempArr, 0, arr, startInd, tempInd);
    }

    public static void main(String[] args)
    {
        int[] arr = {20, 35, -15, 7, 55, 1};

        mergeSort(arr, 0, arr.length);

        for (int i : arr)
        {
            System.out.println(i);
        }

    }
}
