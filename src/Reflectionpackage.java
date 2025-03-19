import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class My4
{
    private int a;
    protected int b;
    public int c;
    int d;

    public My4() {}

    public My4(int x,int y) {}

    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}

}


public class Reflectionpackage
{
    public static void main(String arg[])
    {
        Class c = My4.class;//c will get the discreption of MY4 class..this getting description without object

        My4 m=new My4();//creating object for my4 class
        Class c1=m.getClass();//getting the description from the object of my4 class...


        System.out.println(c.getName());
        System.out.println(c.getClass());

        Field f[] = c.getDeclaredFields();//Just like class is a class, Field is also a class
        for(Field x:f)
        {
            System.out.println(x);
        }

        Constructor con[]=c.getConstructors();//getconstructor is a method available and Constructor is a class available inside a class.it wll give the constructor details to the con[]
        for(Constructor x:con)
        {
            System.out.println(x);
        }

        Method mt[]=c.getMethods();//method  under class
        for(Method x:mt)
        {
            System.out.println(x);//Output will get many methods other then we defined.. because Every class in java inherits from object class so we are getting other methods from object class..
        }

        Parameter parm[]= mt[0].getParameters();//just like method,constructor, param is also available..
        for(Parameter x:parm)
        {
            System.out.println(x);//it will just give the type of the passes arguments..
        }
        //above each(Constructor,Field,Method,Parameter) they will just give the description about the class my4.. this class can be used when we want to
        //know any descrption about the written class..
    }
}
