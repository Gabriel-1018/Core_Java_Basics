interface mylamda3
{
    void display();
}


class Demo2
{
    int temp =10;
    public void method()
    {
        int i=2;
        mylamda3 d=()->{
            int count=0;//we can use variable inside lamda expression
            //and we can use local variables which are declared as final or that variables are not modified within the method..
            //but this can capture instance variable(Variables belongs to class)that are may or may not be final...
            System.out.println("hi");
            System.out.println("bye"+ count+i);
            System.out.println(++temp);
        };
        d.display();
    }
}

interface mylamda4
{
    void show();
}

class demo3
{
    public void calllamda(mylamda4 ml)
    {
        ml.show();
    }
}

class demo4
{
    demo3 k = new demo3();
    mylamda4 l;
    public void method2()
    {
        k.calllamda(l=()->{System.out.println("hi");});
        //In the above line, the lambda expression () -> { System.out.println("hi"); } is assigned to the reference variable l (of type mylamda4), and then it is passed as an argument to the calllamda() method of the demo3 class.
        //The calllamda() method receives the mylamda4 object (l) and calls l.show(), which executes the lambda expression.


        //here we are passing lamda expression as a parameteror or lamda expression as a method or lamda expression as a object..it will be passed in calllamda method
        //
    }
}

public class Lamdaexpression2
{
    public static void main(String arg[])
    {
        Demo2 d= new Demo2();
        d.method();
    }
}
