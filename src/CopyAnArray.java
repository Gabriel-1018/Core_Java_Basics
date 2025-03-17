import java.util.*;
public class CopyAnArray
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[a.length];
        System.out.println("Enter the numbers in array: ");
        //getting input from keyboard for an array
        for (int i=0; i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        //Copping a to b array
        for(int i =0; i<b.length;i++)
        {
            b[i]=a[i];
        }
        //Printing the b array
        for(int x:b)
        {
            System.out.print(x+",");
        }

    }
}
