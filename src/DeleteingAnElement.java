import java.util.*;
public class DeleteingAnElement
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = {2,5,3,7,3,8,4,5,9};
        for(int x: a)
        {
            System.out.print(x+",");
        }
        System.out.println();
        System.out.println("Enter the Index number: ");
        int n = sc.nextInt();
        for (int i=n;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        for(int x: a)
        {
            System.out.print(x+",");
        }
    }
}
