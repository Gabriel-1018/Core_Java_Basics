import java.io.*;

class producer1 extends Thread
{
    OutputStream os;
    public producer1(OutputStream pi)
    {
        os=pi;
    }
    public void run()
    {
        try
        {
            int count = 0;
            while(true)
            {
                os.write(count);
                System.out.println("Producer"+ count);
                os.flush();
                //os.flush(): Forces the OutputStream to immediately write any data currently in the
                // buffer to the target (such as a file, socket, or piped stream).
                Thread.sleep(100);
                count++;
            }
        }
        catch(Exception e) {}
    }
}

class consumer1 extends Thread
{
    InputStream io;
    //The variable os is of type OutputStream(abstract class), which means it can reference any class that
    // extends OutputStream (like PipedOutputStream, FileOutputStream, BufferedOutputStream, etc.).
    public consumer1(InputStream i)
    {
        io=i;
    }
    public void run()
    {
        int receive;
        try
        {
            while(true)
            {
                receive= io.read();
                System.out.println("Consumer"+receive);
                System.out.flush();
                //System.out.flush(): Forces the console output (via System.out) to display any buffered text
                // immediately on the screen.
            }


        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

}



public class IOstreams6
{
    public static void main(String arg[]) throws Exception
    {
        PipedInputStream ps = new PipedInputStream();
        PipedOutputStream po = new PipedOutputStream();
        ps.connect(po);
        producer1 pr = new producer1(po);
        consumer1 cr = new consumer1(ps);
        pr.start();
        cr.start();


    }

}
