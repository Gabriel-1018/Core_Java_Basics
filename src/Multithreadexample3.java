class thread5 extends Thread
{
    public thread5(boolean s)
    {
        setDaemon(s);//why we could able to call the Daemon method directly inside the constructor alone
        //and Daemon threads are dependent threads if the main method is terminating then it will also terminate
    }

    public void run()
    {
        int count=1;
        while (true)
        {
            System.out.println(count+++" Hello");
        }
    }
}



public class Multithreadexample3
{
    public static  void main(String arg[])
    {
        thread5 t = new thread5(true);
        t.start();
        //t.setDaemon(true);// we can set any method by using the reference or we can set this Daemon inside the constructor.
        try
        {
            Thread.sleep(10);//here we are keeping the main method sleep 10 millisecond before it terminates so the another thread which contains daemon method will run till main methods ends.
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
