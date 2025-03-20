import java.io.*;

public class IOstreams2
{
    public static void main(String arg[])
    {
        String str;
       try(FileInputStream fos = new FileInputStream("E:\\Java\\Inputoutputfiles\\Source1.txt"))
       {
           byte b[]= new byte[fos.available()];
           fos.read(b);
           str= new String(b).toLowerCase();
           try(FileOutputStream fir= new FileOutputStream("E:\\Java\\Inputoutputfiles\\Source1.txt"))
           {
               fir.write(str.getBytes());
           }
       }
       catch (IOException e) {
           System.out.println(e);
       }
    }
}
