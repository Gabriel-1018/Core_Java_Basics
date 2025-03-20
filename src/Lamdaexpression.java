interface mylamda
{
    void display();//if a interface has single abstarct method then it is called functional interface.
    //by default all the methods in interface are public and abstract.
}

class lamda1 implements mylamda
{
    public void display()
    {
        System.out.println("Lamda");
    }
}

public class Lamdaexpression
{
    public static void main(String arg[])
    {
        mylamda c = new lamda1();
        c.display();

        //anonymous inner class which is overridding the method in the interface..
        mylamda d = new mylamda(){
            @Override
            public void display()
            {
                System.out.println("Expresion");
            }
        };//this is called anonymous inner class...
        d.display();

        //lamda expression
        //for acheving lamda expression a interface should be functional interface(has only single abstract method)
        mylamda e=
                ()->//this is refering to the display method, which is a anonymous method which is acting as object.
                {
                        System.out.println("Lamda Expression");
                };
        e.display();

        //to make a functional interface easy for implementation, java has introduced Lamda expression
        //this can be simple. we can directly override the functional interface whiout creating anyclass..

    }
}
