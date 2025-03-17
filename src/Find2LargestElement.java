import java.util.*;

public class Find2LargestElement
{
    public static void main(String arg[])
    {
        int a[] = {4,8,35,39,8,29};
        int max1,max2;
        max1=max2=a[0];
        for(int x: a)
        {
            if(max1<x)
            {
                max2=max1;
                max1= x;
            }
            else if(max2<x)
            {
              max2=x;
            }

        }
        System.out.println(max2);
    }
}
