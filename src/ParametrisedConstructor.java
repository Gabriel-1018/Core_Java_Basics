class Rectangle1
{
    int length,breath;

   public Rectangle1()
   {
       length=breath=1;
   }
   public Rectangle1(int h)
   {
       length=breath=h;
   }
   public Rectangle1(int x,int y)
   {
       length=x;
       breath=y;
   }
}

class cuboid extends Rectangle1
{
    int height;
    public cuboid()
    {
        height=1;
    }
    public cuboid(int h)
    {
        super(h);
        height=h;
    }
    public cuboid(int x, int y, int z )
    {
        super(x,y);
        height=z;
    }
    int volume()
    {
        return length*breath*height;
    }


}


public class ParametrisedConstructor
{
    public static void main(String arg[])
    {
        cuboid c = new cuboid();
        cuboid e = new cuboid(30);
        cuboid d =new cuboid(1,2,20);

        System.out.println(c.volume());
        System.out.println(e.volume());
        System.out.println(d.volume());
    }
}
