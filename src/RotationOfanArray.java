import java.util.*;
public class RotationOfanArray
{
    public static void main(String arg[])
    {
        int a[] ={5,9,6,10,12,1,4,6,34,23};
        int b[] ={5,9,6,10,12,1,4,6,34,23};
        int t = a[0];

        //left rotation
        for(int x: a)
        {
            System.out.print(x+",");
        }
        System.out.println(" ");
        for(int i=1; i<a.length;i++)
        {
            a[i-1]=a[i];
        }
       a[a.length-1]=t;
        for(int x: a)
        {
            System.out.print(x+",");
        }
       System.out.println();
        //Right rotation
        for(int x: b)
        {
            System.out.print(x+",");
        }
        System.out.println(" ");
        int l = b[b.length-1];

        for(int i =b.length-2 ;i>=0;i--)
        {
            b[i+1]=b[i];
        }
        b[0]=l;
        for(int x: b)
        {
            System.out.print(x+",");
        }
    }
}
