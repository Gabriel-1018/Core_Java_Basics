import java.util.Scanner;

class Cylinderconstrutor
{
    private double radius;
    private double height;

   void setradius(double i)
   {
       if(i>0)
           radius = i;
       else
           radius=1;
   }

   double getRadius()
   {
       return radius;
   }

   void setHeight(Double i)
   {
       if(i>0)
           height=i;
       else
           height=1;
   }

   double getHeight()
   {
       return height;
   }

   public Cylinderconstrutor()
   {
       radius =0;
       height = 0;
   }

   public Cylinderconstrutor(int r)
   {
       radius =r;
       height =1;
   }
   public Cylinderconstrutor(int r, int h)
   {
       radius = r;
       height = h;
   }

   public double area()
   {
       return radius *height;
   }


}
public class Cylinderproperty
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height: ");
        Cylinderconstrutor t = new Cylinderconstrutor();

        Cylinderconstrutor t1 = new Cylinderconstrutor(2);
        Cylinderconstrutor t2 =new Cylinderconstrutor(2,6);
        t.setradius(sc.nextDouble());
        t.setHeight(sc.nextDouble());

        System.out.println(t2.area());
    }
}
