import java.util.*;

public class ReverseCopyingAnArray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int [5];
        int b[] = new int[a.length];
        System.out.println("Enter the numbers in array: ");

        for(int i=0;i<a.length; i++)
        {
            a[i]= sc.nextInt();
        }
        for (int x: a)
        {
            System.out.print(x+",");
        }
        System.out.println();
        for(int i = a.length-1,j=0; i>=0; i--,j++)
        {
            b[j]=a[i];
        }
        for (int x: b)
        {
            System.out.print(x+",");
        }
    }

}
