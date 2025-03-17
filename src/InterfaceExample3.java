interface test
{
    int k=10;
    void meth1();
    void meth2();
    /*private void meth6()//Private methods are created in interfaces for the usage only inside the interface(but only after java 9 version onwards...)
    {
        System.out.println("private");
    }*/

    default void meth4()//This is default method which can be used for not distrubing the existing classes which already implements the test2 class. but it is helpful for update or modify the existing interfaces without distrubing the existing classes.
    {
        System.out.println("af");
    }

    default  void meth7()
    {
       //meth6();
    }
}

interface test2 extends test
{
    void meth3();

}

class my1 implements test2
{
    public void meth1(){}
    public void meth2() {}
    public void meth3() {}
    public void  meth4(){}//newly created default method in test2 interface  is accessed in current my1 class.
}


public class InterfaceExample3
{
    public static void main(String arg[])
    {
        System.out.println(test.k);
        my1 m = new my1();
        m.meth4();

    }
}
