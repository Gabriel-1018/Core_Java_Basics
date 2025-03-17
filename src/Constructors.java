import java.sql.PreparedStatement;

class rectangle
{
    private int l;
    private int b;
//default constructor
    public rectangle()
    {
        l=1;
        b=2;
    }
//constructor can access the private property directly from the main method. here were are using getxxx() and setxxx() for just usage
    public rectangle(int x,int y)
    {
        setl(x);
        setb(y);
    }

    public void setl(int i)
    {
        if(i<=0)
            l=1;
        else
            l=i;
    }

    public int getl()
    {
        return l;
    }

    public int getb()
    {
        return b;
    }

    public void setb(int i)
    {
        if(i<=0)
            b=1;
        else
            b=i;
    }


    public rectangle(int i)
    {
        l=b=i;
    }
    public int area()
    {
        return getl()*getb();
    }
}

public class Constructors
{
    public static void main(String args[])
    {
        rectangle t = new rectangle(-10,-5);
        rectangle t1= new rectangle();
        rectangle t2=new rectangle(5);
        System.out.println(t.area());
        System.out.println(t1.area());
        System.out.println(t2.area());
    }
}
