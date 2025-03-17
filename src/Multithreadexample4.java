class thread6 extends Thread
{
    public void run()
    {
        int count=1;
        while (true)
        {
            System.out.println(count++ +" Hello");
        }
    }
}



public class Multithreadexample4
{
    public static void main(String arg[]) throws Exception
    {
        thread6 t =new thread6();
        t.setDaemon(true);//here the thread6 will be terminated once the main method ends since it Daemon true.
        t.start();
        Thread mainthread = Thread.currentThread();

        /* Thread.currentThread(): This method is a static method in the Thread class,
        and it returns a reference to the currently executing thread. Since this line is inside the main method,
        and the main method is executed by the main thread (the thread that starts when the program is executed),
        this method will return the main thread.

        Thread mainthread =: The returned Thread object (which refers to the main thread in this case) is assigned
        to the variable mainthread.*/
        mainthread.join();//this join method will also thorws exception
    }
}
