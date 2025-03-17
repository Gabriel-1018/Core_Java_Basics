import java.util.*;

public class MaxElementInAnArray
{
    static int Max(int a[])
    {
       int max;
       max=a.length;
       return max;
    }

    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int a[] = new int[10];
        int c;
        for(int i=0;i<10;i++)
        {
            a[i]=sc.nextInt();
        }
        c= Max(a);
        System.out.println(c);

    }
}
