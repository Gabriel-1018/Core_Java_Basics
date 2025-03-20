import java.io.*;

public class IOstreams3
{
    public static void main(String arg[])
    {
        try
        {
            FileInputStream fis1 = new FileInputStream("E:\\Java\\Inputoutputfiles\\Source1.txt");
            FileInputStream fis2 = new FileInputStream("E:\\Java\\Inputoutputfiles\\Source2.txt");
            FileOutputStream fo= new FileOutputStream("E:\\Java\\Inputoutputfiles\\Destination.txt");
            SequenceInputStream f = new SequenceInputStream(fis1,fis2);
            int b;
            while((b=f.read())!=-1)
            {
                fo.write(b);
            }
            fis1.close();
            fis2.close();
            f.close();
            fo.close();
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
