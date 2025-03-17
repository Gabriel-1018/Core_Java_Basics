abstract class Super2
{
    public Super2(){System.out.println("Super Constructor");}
    public void meth1(){System.out.println("meth1 of Super2");}
    abstract public void  meth2();
}

class Sub2 extends Super2
{
    public void meth2()
    {
        System.out.println("Sub meth2");
    }
}



public class AbstractExample
{
    public static void main(String arg[])
    {
        Super2 s =new Sub2();
        s.meth1();
        s.meth2();

    }
}
