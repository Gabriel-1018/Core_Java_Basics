import java.util.*;

public class SumOfAllElementsUsingVarargs
{
   static int Sumall(int...x)
    {
        int s =0;
       for(int i=0;i<x.length;i++)
       {
           s +=x[i];
       }
       return s;
    }

    public static void main(String args[])
    {
        int k;
        System.out.println(Sumall(4,5,7,1,9,2));
        System.out.println(Sumall());

    }
}

