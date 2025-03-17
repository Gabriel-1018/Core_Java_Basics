class Circle
{
   public double r;

   public double area()
   {
       return Math.PI * r*r;
   }
   public double perimeter()
   {
       return 2* Math.PI*r *r;
   }
   public double circumference()
   {
       return perimeter();
   }
}



public class ClassCircle
{
    public static void main(String arg[])
    {
        Circle t = new Circle();
        Circle t1 = new Circle();

         t.r=3.4;
         t1.r=7;
        System.out.println("Area" +t.area());
        System.out.println("Perimeter"+t.perimeter());
        System.out.println(t.circumference());
        System.out.println();

        System.out.println("Area" +t1.area());
        System.out.println("Perimeter"+t1.perimeter());
        System.out.println(t1.circumference());

    }
}
