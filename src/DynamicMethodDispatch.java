class Super1
{
    public void meth1(){System.out.println(1);}
    public void meth2(){System.out.println(2);}
}

class Sub1 extends Super1
{
    public void meth2(){System.out.println(3);}
    public void meth3(){System.out.println(4);}
}



public class DynamicMethodDispatch
{
    public static void main(String arg[])
    {
        Super1 s = new Super1();
        Super1 k =new Sub1();
        s.meth2();
        k.meth2();
    }
}
