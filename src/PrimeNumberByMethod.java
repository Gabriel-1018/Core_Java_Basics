import java.util.*;
public class PrimeNumberByMethod
{
    static int Prime (int x)
    {
        int count = 0;
        if(x==0|x==1)
        {
            count=0;
        }

        for(int k=1;k<=x;k++)
        {
            if(x%k==0)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a,c;
        a = sc.nextInt();
        c = Prime(a);
        if(c==2)
        {
            System.out.println(a+" is a prime number");
        }
        else
        {
            System.out.println(a+" is not a prime number");
        }
    }
}
