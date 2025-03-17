
public class Exceptionthowthrowsexample
{
     int area(int l, int b) throws Exception
    {
        if(l<0||b<0)
        {
            throw new Exception();//we can use this throw anywhere if we want to set any exception to the user..in this there is no error but we are testing the exception throw
        }
        return l*b;
    }
     void meth1() throws Exception
     {
         System.out.println("Area is: "+area(-10,5));
     }

    public static void main(String arg[])
    {
        Exceptionthowthrowsexample mp = new Exceptionthowthrowsexample();
        try
        {
            mp.meth1();
        }
        catch (Exception e)
        {
            System.out.println(e);//this exception is just showing
        }

    }
}
