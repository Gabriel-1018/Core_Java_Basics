import java.util.*;
public class Patterns2
{
    public static void main(String arg[])
    {
        //Pattern -1
        for (int i=0;i<=4;i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern -2
        for (int i=1;i<=5;i++)
        {
            for (int j = 1; j <= 5;j++ )
            {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern - 3
        for (int i=2;i<=6;i++)
        {
            int k =i;
            for (int j = 1; j <= 5;j++,k++)
            {
                System.out.print(k+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern - 4
        int k =1;
        for (int i=2; i<=6;i++)
        {
            for (int j = 1; j <= 5;j++,k++)
            {
                System.out.format("%02d ",k);
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern - 5
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j < i+1; j++)
            {
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern - 6
        int n=1;
        for (int i=1; i<=5; i++)
        {
            for (int j=1; j < i+1; j++)
            {
                System.out.print(n+" ");
                n++;
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern - 7
        for (int i=5; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println(" ");
        }
        System.out.println(" ");

        //Pattern - 7
        for (int i=5; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");


        //Pattern - 8

        for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5; j++)
            {
                if (j>=i)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    }
}
