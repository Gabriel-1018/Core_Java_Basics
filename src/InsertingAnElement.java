import java.util.*;

public class InsertingAnElement
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        int a[] = new int[10];
        a[0]=2; a[1]=5; a[2]=8; a[3]=23; a[4]=12; a[5]=65;
        int k =6;
        for(int x: a)
        {
            System.out.print(x+",");
        }
        System.out.println();
        System.out.println("Enter the number to insert: ");
        int n = sc.nextInt();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        for(int i =k; i>=index;i--)
        {
            a[i]=a[i-1];
        }
        a[index]=n;
        for(int x: a)
        {
            System.out.print(x+",");
        }

    }
}
