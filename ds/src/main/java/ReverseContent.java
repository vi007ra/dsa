/**
 * Created by vijayrathi on 11/12/17.
 */
public class ReverseContent
{
    private static int[] reverseMethod(int[] a)
    {
        for (int i = 0; i < a.length / 2; i++)
        {
            int other  = a.length - i - 1;
            int tmp = a[i];

            a[i] = a[other];
            a[other] = tmp;
        }

        return a;
    }
    public static void main(String[] args)
    {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Before :");
        for (int i : a)
        {
            System.out.print(i);
        }
        ReverseContent.reverseMethod(a);
        System.out.println("\n");
        System.out.print("After :");
        for (int i : a)
        {
            System.out.print(i);
        }
    }
}
