public class Exceptionnestedcatchexample
{
    public static void main(String arg[])
    {
        int a[]={30,20,10,40,0};
        try
        {
            int c = a[0]/a[4];
            System.out.println("Division is "+c);
            try
            {
                System.out.println(a[5]);
            }
            catch (ArrayIndexOutOfBoundsException l)
            {
                System.out.println(l);
            }

        }
        catch (ArithmeticException k)
        {
            System.out.println(k);
        }
        System.out.println("Bye");
    }
}
