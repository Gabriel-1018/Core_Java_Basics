import javax.swing.plaf.PanelUI;

abstract class My
{
    abstract void meth1();
}

interface My2
{
    void meth4();
}

class outer1
{
    int i;
    public void display1()//Anonymous class for abstract class
    {
        new My(){public void meth1() {System.out.println("Abstarct method overridded");}}.meth1();//Anonymous class & Anonymous object inherits from MY amd also calling the method meth1. This is not a object of My class it is a object of anonymous class
        My m = new My(){public void meth1() {System.out.println("Abstarct method overridded");}};//with reference
        m.meth1();
    }


    public void display3()//Anonymous class for interface
    {
        My2 m = new My2(){public void meth4(){System.out.println("Anonymous class");}};
        m.meth4();
    }

    public void display()
    {
        class inner//local inner class
        {
            int k;
            public void show()
            {System.out.println("Hello");};
        }
        new inner().show();//only object is created without reference and the method inside it is called.
        inner n = new inner();
        n.show();
    }

}


class staticinner
{
    static int i=10;
    int j=25;
    static class staticinner1
    {
        void meth5()
        {
            System.out.println(i);
            //System.out.println(j); here not static indentifier "j" cannot be called.
        }
    }

}


public class InnerClassLocalandStatic
{
    public static void main(String arg[])
    {
        outer1 c =new outer1();
        c.display();
        staticinner.staticinner1 m =new staticinner.staticinner1();//here only object is created for inner static class(staticinner1)not for outerclass(staticinner)
        m.meth5();

    }
}
