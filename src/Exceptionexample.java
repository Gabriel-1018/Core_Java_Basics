import java.util.Scanner;

public class Exceptionexample
{
    public static void main(String arg[])
    {
        int a,b,c;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the 2 numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();
        try
        {
            c=a/b;
            System.out.println("Division is "+c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Demominator cannot be zero"+e);
        }

        System.out.println("bye");

    }
}
