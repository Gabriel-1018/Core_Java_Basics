import java.util.*;
public class FibonacciSeries
{
    public static void main(String arg[])
    {
        System.out.print("Enter the Nth term: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+","+b+",");
        for(int i= 0; n-2>i; i++)
          {
              c = a+b;
              System.out.print(c +",");
              a=b;
              b=c;
          }
    }
}
