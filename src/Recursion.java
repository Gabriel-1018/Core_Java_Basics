public class Recursion
{
    static void fun(int x)
    {
        if(x>0)
        {
            //Change the order and try
            fun(x-1);
            System.out.println(x);


        }

    }
    public static void main(String args[])
    {
        fun(3);

    }
}
