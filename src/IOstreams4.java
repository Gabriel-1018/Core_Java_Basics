import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;

public class IOstreams4
{
    public static void main(String arg[]) throws Exception
    {

        byte b[] = {'a','b','c','e','f','g','h'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        //the ByteArrayInputStream class is used to read data from a byte array as if it were an input stream.
        // bis.markSupported();//in bytearrayinputstream marking is supported....
        int x;
        while((x=bis.read())!=-1)
        {
            System.out.println((char) x);
        }

        ByteArrayOutputStream bos =new ByteArrayOutputStream();
        //ByteArrayOutputStream is a subclass of OutputStream that allows you to write data to a byte array, instead of writing to a file, console, or network socket.
        // The written data is stored in an internal byte array that grows as needed to accommodate the data being written.
        bos.write(10);
        bos.write(30);
        bos.write('a');

        byte c[]=bos.toByteArray();
        for(byte y:c)
        {
            System.out.println(y);
        }
        bos.close();

        bis.close();
        char d [] = {'a','b','c','e','f','g','h'};
        CharArrayReader crs= new CharArrayReader(d);
        int e;
        while((e=crs.read())!=-1)
        {
            System.out.print((char) e);
        }
        crs.close();

    }
}
