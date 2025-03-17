class Samplexecption extends Exception
{
    public String toString()
    {
        return "Sample one";//this is customized exception that we created.
    }
}


public class Exceptionthrowthrowsexample2
{
    int area(int l, int b) throws Samplexecption {
        if (l < 0 || b < 0) {
            throw new Samplexecption();//we can use this throw anywhere if we want to set any exception to the user..in this there is no error but we are testing the exception throw
        }
        return l * b;
    }

    void meth1() throws Samplexecption
    {
        System.out.println("Area is: " + area(-10, 5));
    }

    public static void main(String arg[]) {
        Exceptionthrowthrowsexample2 mp = new Exceptionthrowthrowsexample2();
        try
        {
            mp.meth1();
        } catch (Samplexecption e)
        {
            System.out.println(e);//this exception is just showing
        }

    }
}
