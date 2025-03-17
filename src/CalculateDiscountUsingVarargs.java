import java.util.*;
public class CalculateDiscountUsingVarargs
{
    static double Discount(double...x)
    {
        double y=0;
        for(int i=0; i<x.length;i++)
        {
            y+=x[i];
        }
        if (y>100&&y<500)
        {
            y = y-(y/10);
        }
        else if(y>501&&y<1000)
        {
            y= y-(y/20);
        }
        return y;
    }
    public static void main(String arg[])
    {
        double c=0;
        c = Discount(45,80,230,300);

        System.out.print("Discounted value is "+c);

    }



}
