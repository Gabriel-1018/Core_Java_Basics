class mydata
{
    void display(String str)
    {
        // below is the block sync, we can also sync the whole method by writing Sync near the display method
        synchronized (this)//without this both the threads will access the shared object so that output will be printed in the mixed way. this block is the monitor
        {
            //below part is the critical session of the code.
            for (int i = 0; i < str.length(); i++)
            {
                System.out.print(str.charAt(i));
                try{ Thread.sleep(100);}catch (Exception e){};//even though it sleeps the 2nd thread enters once the 1st thread over.
            }
        }
    }
}

class thread8 extends Thread
{
    mydata d;// this is the reference of the shared data (mydata)
    public thread8 (mydata dat)//assigning the object of mydata..this is done using the constructor
    {
        d=dat;
    }//above part is the Synchronisation part, we have to use construtor

    public void run()
    {
        d.display("Hello World ");
    }
}

class thread9 extends Thread
{
    //without this both the threads will access the shared object so that output will be printed in the mixed way
    mydata c;
    public thread9(mydata c)
    {
        this.c=c;
    }
    public void run()
    {
        c.display("Welcome all");
    }
}

public class Synchronisationdemo
{
    public static void main(String arg[])
    {
        mydata d = new mydata();//creating the object of mydata.
        thread8 o = new thread8(d);//passing the object of mydata.
        thread9 k = new thread9(d);
        o.start();
        k.start();
    }
}
