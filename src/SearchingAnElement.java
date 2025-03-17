import java.util.*;
public class SearchingAnElement
{
    public static void main(String arg[])
    {
        int a[] = {5,2,8,9,4,7};
        System.out.print("Enter the search element: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int key = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                System.out.println("Index of "+ n+ " "+ "is"+" "+ i);
                System.exit(0);
            }
        }
        System.out.print("Element not found");
    }
}
