abstract class Shape
{
    public Shape()
    {
        System.out.println("Super Constructor");
    }
    abstract public void Perimeter();
    abstract public void area();
}

class Rectangle2 extends Shape
{
    int length;
    int breath;
    public void Perimeter()
    {
        System.out.println("Perimeter "+2*(length+breath));
    }
    public void area()
    {
        System.out.println("Area "+ length*breath);
    }
    public void Totalarea()
    {
        System.out.println("Totalarea");
    }
}

class Circle1 extends Shape
{
    float radius;
    public void area()
    {
        System.out.println("Area "+Math.PI*radius*radius);
    }
    public void Perimeter()
    {
        System.out.println("Perimeter "+2*Math.PI*radius);
    }
}

public class AbstractExample1
{
    public static void main(String arg[])
    {
        Rectangle2 r = new Rectangle2();
        r.length=5;
        r.breath=8;
        Shape s =r;//Shape class reference(s) pointing on rectangle object(r)
        s.Perimeter();
        s.area();
        //s.Totalarea Because super class reference can hold only it's method not the sub class methods. but it can hold both the class

        Circle1 k = new Circle1();
        k.area();
        k.Perimeter();
        //k.Totalarea Because super class reference can hold only it's method not the sub class methods. but it can hold both the class objects.
    }
}
