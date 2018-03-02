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
            tempArr[tempInd++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }

        System.arraycopy(arr, i, arr, startInd + tempInd, midInd - i);
        System.arraycopy(tempArr, 0, arr, startInd, tempInd);
    }

    public static void main(String[] args)
    {
        int[] arr = {20, 35, -15, 7, 55, 1};

        mergeSortA(arr);
//        mergeSort(arr, 0, arr.length);

        for (int i : arr)
        {
            System.out.println(i);
        }

    }

    private static void mergeSortA(int arr[])
    {
        if (arr.length < 2)
        {
            return;
        }
        int mid = arr.length / 2;

        int lArray[] = new int[mid];
        int rArray[] = new int[arr.length - mid];

        for (int i = 0; i < lArray.length; i++)
        {
            lArray[i] = arr[i];
        }
        for (int j = 0; j < rArray.length; j++)
        {
            rArray[j] = arr[mid + j];
        }

        mergeSortA(lArray);
        mergeSortA(rArray);
        mergeA(arr, lArray, rArray);

    }

    private static void mergeA(int[] arr, int[] lArray, int[] rArray)
    {
        int i = 0, j = 0, k = 0;
        while (i < lArray.length && j < rArray.length)
        {
            if (lArray[i] <= rArray[j])
            {
                arr[k] = lArray[i];
                k++;
                i++;
            } else
            {
                arr[k] = rArray[j];
                k++;
                j++;
            }
        }
        while (i < lArray.length)
        {
            arr[k] = lArray[i];
            k++;
            i++;
        }
        while (j < rArray.length)
        {
            arr[k] = rArray[j];
            k++;
            j++;
        }
    }
}
