interface mine
{
    void meth1();
    void meth2();
}

 class my implements mine
{
    public void meth1()
    {
       System.out.println("meth1-my");
    }
    public void meth2()
    {
        System.out.println("Meth2-my");
    }
    public void meth3()
    {
        System.out.println("meth3");
    }
}



public class InterfaceExample
{
    public static void main(String arg[])
    {
        mine c = new my();//we cannot create a object for interface
        c.meth1();
        c.meth2();
    }
}
