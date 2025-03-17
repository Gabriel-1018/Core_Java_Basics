
class lowbalanceeception extends Exception
{
    public String toString()// just creating a customized exception
    {
        return "Your balance is too low";
    }
}

public class Exceptioncheckedunchecked
{
    static void Customizenexception()
    {
        try
        {
            throw new lowbalanceeception();// creating a object for the created class.
        }
        catch ( lowbalanceeception e)
        {
            System.out.println(e);//calling the variable which has the created error.
        }
    }
    static void fun1()
    {
        try
        {
            System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());// it will show only the exact message of the exception
           System.out.println(e.toString());// give the whole exception
            e.printStackTrace();//to know the sequence of method call when the exception was raised.
        }

    }
    static void fun2()
    {
        fun1();
    }
    static void fun3()
    {
        fun2();
    }
    public static void main(String arg[])
    {
        fun3();
        //Customizenexception();
    }

}
