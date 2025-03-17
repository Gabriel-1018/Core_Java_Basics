import java.util.*;

class Rect
{
    private double length;
    private double breath;

    public double getLength()
    {
        return length;
    }

    public double getBreath()
    {
        return breath;
    }

    public void setLength(double l)
    {
        if(length>5)
            length=l;
        else
            length=0;
    }
    public void setBreath(double b)
    {
        if(breath>5)
            breath =b;
        else
            breath=0;

    }

    public double area()
    {
        double a;
        a=getLength()*getBreath();
        return a;
    }
    public double perimeter()
    {
        double p;
        p = 2*(length+breath);
        return p;
    }

    public boolean Square()
    {
        return length==breath;
    }

}

public class ClassRectangle
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breath: ");
        Rect t=new Rect();

        t.setLength(sc.nextDouble());
        t.setBreath(sc.nextDouble());

        System.out.println("Area of rectangle :"+t.area());
        System.out.println("Perimeter of Rectangle: "+ t.perimeter());
        System.out.println("It is square: "+ t.Square());
    }
}
