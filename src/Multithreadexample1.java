/*class thread1 extends Thread
{
    public void run()//run method is the start point of the thread, we can write this run on the same class or we can write on different class.
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }

    }
}*/

class thread2 implements Runnable//since here implementation is done so we have to override all the methods from Runnable.
{
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+" Hello");
            i++;
        }
    }
}

public class Multithreadexample1
{
    public static void main(String arg[])
    {
        //thread1 c =new thread1();//creating object for the class that we extends thread
        //c.start();

        thread2 c = new thread2();
        Thread t = new Thread(c);//creating object for the thread class and passing the reference of the thread2 class.. Thread class object will act as hourse and thread2 reference passed act like a cart hokked to the hourse..so this horse will carry the cart..
        t.start();
        int i=1;
        while(true)
        {
            System.out.println(i+ " World");
            i++;
        }

    }
}
