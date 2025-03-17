import java.util.*;

public class OverloadedMethodForArea
{
    static int Area(int x, int y)
    {
        int a;
        a=x*y;
        return a;
    }

    static double Area(double x)
    {
        double a;
        a = Math.PI * x * x;
        return a;
    }
    static double Area(double x,double y, double z )
    {
        double c;
        c = 0.5*(x+y)*z;
        return c;
    }

    public static void main(String arg[])
    {
        int l=10,b=5,areaR;
        double r =7.6,circle,i=15,j=30,h=12,areaT;
        areaR =Area(l,b);
        circle =Area(r);
        areaT=Area(i,j,h);

        System.out.println("Area of rectangle is "+areaR);
        System.out.println("Area of circle is "+circle);
        System.out.println("Area of Trepizium is "+areaT);


    }

}
