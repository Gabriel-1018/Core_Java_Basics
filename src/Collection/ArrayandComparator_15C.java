package Collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;


class my implements Comparator<Integer>
{
    public int compare(Integer i1, Integer i2)
    {
        if(i1<i2)
            return 1;
        if(i1>i2)
            return -1;
        else
            return 0;
    }
}

public class ArrayandComparator_15C
{
    public static void main(String arg[])
    {
        int a[]={2,4,6,8,1,3,5,7};
        int b[]={2,4,6,8,1,3,5,6};
        //System.out.println(Arrays.compare(a,b));
        //this compare both the arrays element by element if any one value is larger than the comparing array then
        // it will return 1,if small then returns -1.
        int c[] =Arrays.copyOf(a,a.length);
        //Arrays.fill(c,10);//fill the array with 10 value
        Arrays.sort(c);//It will sort the array.
        //If we sort the class objects then we should define to compare the objects.for sorting comparison is important.
        System.out.println(Arrays.binarySearch(c,2));
        //under these Arrays class there are many methods, these deepequal method will compare both objects

        Integer d[]={2,5,8,10,4,6,7,9};

        Arrays.sort(d, new my());// we are asking the comparator to sort the array
        for(int x:d)
            System.out.println(x);

    }
}
