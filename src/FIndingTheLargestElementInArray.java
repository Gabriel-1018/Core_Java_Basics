import java.util.*;

public class FIndingTheLargestElementInArray
{
    public static void main(String arg[])
    {
        int a[] = {4,8,35,34,8,29};
        int max = a[0];
        for(int x: a)
        {
           if(max<x)
           {
               max = x;
           }
        }
       System.out.println("Maximum number in Array"+" "+max);
    }
}
