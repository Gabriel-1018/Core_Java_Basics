import java.util.Scanner;

class Cylinder
{
    public double r;
    public double h;

    public double lidarea()
    {
        return Math.PI*r*r;
    }

    public double totalSurfacearea()
    {
        return 2*lidarea()+h*Circumference();
    }
    public double Circumference()
    {
        return 2*Math.PI*r;
    }

    public double volume()
    {
        return lidarea()*h;
    }
}


public class ClassCylinder
{
    public static void main(String arg[])
    {
        System.out.println("Enter the radius and height: ");
        Scanner sc = new Scanner(System.in);
        Cylinder c = new Cylinder();
        c.r = sc.nextDouble();
        c.h = sc.nextDouble();

        System.out.format("Lid Area: "+"%.2f",c.lidarea());
        System.out.format("Total SurfaceArea: "+"%.2f",c.totalSurfacearea());
        System.out.format("Volume: "+"%.2f",c.volume());
    }
}
