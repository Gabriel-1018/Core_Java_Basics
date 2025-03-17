import java.util.*;

public class MaximumNumbersUsingVarargs
{
    static int MAX(int ...x)
    {
        if(x.length==0)
        {
            return Integer.MIN_VALUE;
        }
        int m = x[0];
        for(int i=1;i<x.length;i++)
        {
            if(x[i]>m)
            {
                m=x[i];
            }
        }
        return m;
    }
    public static void main(String arg[])
    {
        System.out.println(MAX());
        System.out.println(MAX(10));
        System.out.println(MAX(10,20,30,40,50));

    }

}
