import java.util.*;

public class SumOFAllElements
{
    public static void main(String arg[])
    {
        int k = 0;
        int a[] = {2,5,3,6,8};
        for(int x: a)
        {
            k +=x;
        }
        System.out.println(k);
    }
}
