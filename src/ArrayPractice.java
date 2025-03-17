import java.util.*;

public class ArrayPractice
{
    public static void main(String args[])
    {
        int a[] = new int[10];
        int b[] = {2,5,6,9,4};
        int c[];
        c = new int[10];
        b[2]=15;

        for(int i = 0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }

        for(int x: b)
        {
            System.out.println(x);
        }
    }

}
