import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOstreams1
{
    public static void main(String arg[])
    {
        try(FileInputStream fis = new FileInputStream("E:\\Java\\Inputoutputfiles\\Test.txt"))
        {
          byte c[] = new byte[fis.available()];
          fis.read(c);
          //The read(byte[] b) method reads bytes from the FileInputStream into the byte array c[].
            //It reads the bytes from the file and stores them in the array c. After this call, the entire file content (in byte format) will be stored in c[].
          String str=new String(c);
          //After reading the file contents into the byte array c[], this line creates a new String object by passing the byte array c[] to the String constructor.
            // The String constructor that takes a byte array converts the bytes into characters using the system's default character encoding (usually UTF-8).
            //So, if the file contains text data, this will convert the bytes back into the original string (assuming the encoding matches).
         System.out.println(str);

          //another method
          int x;
          do
          {
              x=fis.read();
              //This read method return a single byte from the file and returns it as an integer value (which can be cast to a byte or character).
              System.out.print((char) x);// this char will convert the bytes to the charter at last box will be printed for -1
          }while(x!=-1);

        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        //Filereader is same as fileinputstreams..
        try(FileReader fr=new FileReader("E:\\Java\\Inputoutputfiles\\Test.txt"))
        {
            int x;
            while((x=fr.read())!=-1)
            {
               System.out.print((char)x);
            }

            //This is a while loop that reads one byte at a time from fis1 using the read() method. The read() method returns the byte value read as an integer, or -1 if the end of the
            // file (EOF) is reached. The loop continues as long as the file has more data to read (i.e., until read() returns -1).
        }
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }

        //dont run alla at once it not print properly..because the 1st openned file cursor will go to the end...
    }
}
