import java.util.*;

class board
{
    String value;
    int count=0;
    int noofstudents=0;

    public void attendance()
    {
        noofstudents++;
    }

    synchronized public void write(String s)
    {
        System.out.println("Teacher is writing "+s);
        while(count!=0)
        {
            try{ wait();} catch (Exception e){};//how we are directly calling the methods
        }
        value=s;
        count = noofstudents;
        notifyAll();//all the students will start reading it
    }
    synchronized public String copy()
    {
        String copied;
        /*this while loop is basically for checking the student thread if it is okay to copy...if the
        condition is true student thread will wait until the condition is false.. once it false then it do the copying work */
        while(count==0)
        {
            try{wait();}catch (Exception e){};
        }
        copied=value;
        count--;
        if(count==0)
        {
            notify();//here in shared data(board),two threads will be communicating withthemself by using this notify and wait
        }
        return  copied;
    }

}

class teacher extends Thread
{
    board d;
    String notes[] ={"Java is lang","It is oops","It is platform independent","It supports Thread","end"};
    public teacher(board dt)
    {
        d=dt;
    }
    public void run()//this thread will wait until the count becomes zero, once the count zero then i will start working
    {
        for(int i=0; i<notes.length;i++)
        {
            d.write(notes[i]);//here whenever teacher get a change he will write
        }
    }
}

class student1 extends Thread
{
    board d;
    String name;
    public student1(board by, String s)
    {
        d=by;
        name=s;
    }
    public void run()
    {
        String text;
        d.attendance();
        do
        {
            text=d.copy();
            System.out.println(name+"copying"+text);
            System.out.flush();// need to know
        }while(!text.equals("end"));
    }

}



public class Syncinterthread2
{
    public static void main(String arg[])
    {
        board d = new board();
        teacher t = new teacher(d);
        student1 s1 = new student1(d,"1.Gabriel");
        student1 s2 = new student1(d,"2.Saran");
        student1 s3 = new student1(d,"3.Kennath");
        student1 s4 = new student1(d,"4.Harish");

        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();


    }
}
//how to debug & understand how multithread waits(after wait once it get notyfied it will start their work)


//Remember in multithreading the order of output will not be same...so don't go on with orders...check if all the students in thread has copied the values....