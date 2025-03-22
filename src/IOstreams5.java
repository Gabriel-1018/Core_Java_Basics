import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class IOstreams5
{
    public static void main(String arg[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("E:\\Java\\Inputoutputfiles\\Source2.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        //it is same like fileinput stream but the values are received from the inputfile and then stored inside buffer area
        //buffer is temporary memory area for ho;ding the data..

        /*int x;
        while((x=bis.read())!=-1)
        {
            System.out.println((char)x);
        }
        System.out.println(fis.markSupported());
        System.out.println(bis.markSupported());*/

        System.out.println((char) bis.read());//once the data is read from the buffer, it is no longer available (the buffer is emptied).
        System.out.println((char) bis.read());
        bis.mark(10);
        //This method marks the current position in the input stream. The argument 10 indicates that the mark is valid for the next 10 bytes.
        // In other words, you can return to this position after reading up to 10 bytes.
        System.out.println((char) bis.read());
        //This reads another character from the buffer after the mark has been set.
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.reset();
        //The reset() method returns the stream to the last marked position. After calling reset(),the next read
        // operation will return to the position where the mark was set.
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        System.out.println((char) bis.read());
        bis.close();
        fis.close();


        FileReader fr = new FileReader("E:\\Java\\Inputoutputfiles\\Source2.txt");
        BufferedReader br = new BufferedReader(fr);

        System.out.println((char) br.read());
        System.out.println((char) br.read());
        br.mark(10);
        System.out.println((char) br.read());
        System.out.println((char) br.read());
        System.out.println((char) br.read());
        System.out.println((char) br.read());
        br.reset();
        System.out.println((char) br.read());
        System.out.println((char) br.read());
        System.out.println((char) br.read());
        System.out.println((char) br.read());
       System.out.println( br.readLine());//Here readline method is available for bufferreader because set of character makes a string so it is used
        //but for bufferinputstream it doesnot have it..

        //this readers are really used if we have uniq codes other wise we can use inputstreams for all..
        //Inputstream are used if we have ASCII codes or bytes..

    }
}
