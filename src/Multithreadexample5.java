class thread7 extends Thread
{
    public void run()
    {
        int count=1;
        while (true)
        {
            System.out.println(count++ +" My Thread");
        }
    }
}


public class Multithreadexample5
{
    public static void main(String arg[])
    {
        thread7 t =new thread7();
        t.start();
        int count=1;
        while (true)
        {
            System.out.println(count++ +" Main thread");
            Thread.yield();//this will give other thread for more execution time.
        }

    }
}
