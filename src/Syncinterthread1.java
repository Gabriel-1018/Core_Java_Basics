class mydata1
{
    int value;
    boolean flag=true;

    synchronized public void set(int y)
    {
        while(flag!=true)
        {
           try{ wait();} catch (Exception e){};
        }
        value=y;
        flag=false;
        notify();
    }

    synchronized public int get()
    {
        int x=0;
        while(flag!=false)
        {
            try{wait();} catch (Exception e) {}
        }
        x=value;
        flag=true;
        notify();
        return x;

    }
}

class producer extends Thread
{
    mydata1 d;
    public producer(mydata1 dt)
    {
        d=dt;
    }
    public void run()
    {
        int count=0;
        while(true)
        {
            d.set(count);
            System.out.println("Producer"+count);
            count++;
        }
    }
}

class consumer extends Thread
{
    mydata1 k;
    public consumer (mydata1 dat)
    {
        k=dat;
    }
    public void run()
    {
        int value;
        while(true)
        {
            value = k.get();
            System.out.println("Customer"+value);
        }
    }
}



public class Syncinterthread1
{
    public static void main(String arg[])
    {
        mydata1 d = new mydata1();
        producer p =new producer(d);
        consumer c = new consumer(d);
        p.start();//why I can't debug properly
        c.start();

    }
}
