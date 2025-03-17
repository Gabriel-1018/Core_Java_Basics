public class ExceptionFfinallyblock
{
    public static void meth1() throws Exception
    {
        try
        {
           throw new Exception();
        }
        finally//even there is a execption in the above try block this finally block will executed.
        {
            System.out.println("Final Message");
        }
    }
    public static void main(String arg[])throws Exception
    {
        meth1();
    }
}
