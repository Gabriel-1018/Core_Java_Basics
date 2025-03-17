import java.util.*;
public class ArraySort
{
    public static void main(String arg[])
    {
        String arr[]={"java","python","pascal","smalltalk","ada","basic"};
        java.util.Arrays.sort(arr);
        for(String x:arr)
        {
          System.out.print(x+" ");
        }
    }
}
