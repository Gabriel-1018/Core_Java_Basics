class thread3 extends Thread
{
    public thread3(String s)
    {
        //all the met
        super(s);//We are calling super thread class constructor to assign a name for it.
        setPriority(Thread.MAX_PRIORITY);//we are calling setPriority method available in the Thread class to set the priority
    }
    //Thread.//here we can't able to access the class properties and methods but it is available only inside the construct  ot method why?

    public long getid()
    {
        return getId();
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            try
            {
                Thread.sleep(1000);//this sleep method will raise some exception so this should be put inside the try catch block
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
            System.out.println(count+" Hello");
            count++;
        }
    }

}

class thread4 implements Runnable
{
    public void run() {}//since thread4 implements interface we have to override the only method(run) available in the runnable interface

}


public class Multithreadexample2
{
    public static void main(String arg[])
    {
        //thread4
        Thread g = new Thread( new thread4(),"Mike1");//anonymous object for thread4 class has been created and given to Thread class constructor and we are giving the name as well.
        String s1 = g.getName();
        //thread3
        thread3 t = new thread3("Mike2");//we have to pass the string to thread3 class constructor.that class will call the super thread class constructor.
        t.start();
        t.interrupt();//if we interrupt then the exception will be catched by the catch block.

        //t.setPriority(10);//we can also set the priority by calling the reference and set the priority.
        /*System.out.println("Name: "+t.getName());
        System.out.println("Priority: "+t.getPriority());
        System.out.println("Id: "+t.getid());
        System.out.println("State: "+t.getState());
        System.out.println("Alive: "+t.isAlive());*/


    }
}
