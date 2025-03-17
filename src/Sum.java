public class Sum
{
    public static void main(String arg[])
    {
        //Command line arguments
        double s=0;
        for(String x:arg)
        {
            s += Double.parseDouble(x);
        }
        System.out.println("Sum of given elements is: "+s);
    }
}
