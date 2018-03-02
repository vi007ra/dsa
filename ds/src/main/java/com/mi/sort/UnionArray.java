package com.mi.sort;

/**
 * Created by vijayrathi on 17/12/17.
 */
public class UnionArray
{
    private static int[] unionArray;
    private static int[] interSectionArray;

    private static int[] createUnionArray(int[] arr1, int[] arr2)
    {
        int i = 0, j = 0, k = 0, l = 0;
        int[] unianArray = new int[7];
        int[] interSectioArray = new int[2];
        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] < arr2[j])
            {
                unianArray[k] = arr1[i];

                k++;
                i++;
            } else if (arr2[j] < arr1[i])
            {
                unianArray[k] = arr2[j];
                k++;
                j++;
            } else
            {
                unianArray[k] = arr1[i];
                interSectioArray[l] = arr1[i];
                k++;
                l++;
                i++;
                j++;

            }
        }

        while (i < arr1.length)
        {
            unianArray[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length)
        {
            unianArray[k] = arr2[j];
            k++;
            j++;
        }

        unionArray = unianArray;
        interSectionArray = interSectioArray;

        return unianArray;
    }

    public static void main(String[] args)
    {

        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};

        UnionArray.createUnionArray(arr1, arr2);

        System.out.print("com.mi.sort.UnionArray : ");

        for (int i : unionArray)
        {
            System.out.print(i + ", ");
        }
        System.out.println();
        System.out.print("InterSectionArray : ");
        for (int i : interSectionArray)
        {
            System.out.print(i + ", ");
        }
    }
}
