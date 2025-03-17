import java.util.*;

public class IncreasingTheSizeOfArray
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[2*a.length];
        System.out.println("Enter the numbers in array: ");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int x:a)
        {
            System.out.print(x+",");
        }
        System.out.println();
        System.out.println("Length of a array: "+a.length);

        for(int i =0; i<a.length;i++)
        {
            b[i]=a[i];
        }

        for(int x:b)
        {
            System.out.print(x+",");
        }
        System.out.println();
        System.out.println("Length of a array: "+b.length);
    }
}
