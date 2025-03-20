import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOstreams
{
    public static void main(String arg[])
    {
        try
        {
            FileOutputStream fos =new FileOutputStream("E:\\Java\\Inputoutputfiles\\Test.txt");
            //This line attempts to create a FileOutputStream object, which will write bytes to a file located at E:\\Java\\Inputoutputfiles\\Test.txt.
            //If the file doesn't exist, it will be created. If it exists, the file will be overwritten.
            //The file path must be valid and accessible from the program's running environment.
            String str ="Learn java programming";
            fos.write(str.getBytes());
            //The getBytes() method converts the string into a byte array. Since FileOutputStream works with bytes, this step is necessary to write the string's byte representation to the file.
            //The write() method of FileOutputStream writes the byte data to the file.
            //The write() method in FileOutputStream converts the string into a byte array using getBytes().
            //It then writes each byte to the file. The byte values correspond to characters in the string.
            //When you open the file, the editor reads the bytes and interprets them as characters (e.g., 'L', 'e', 'a', etc.) based on the encoding (usually UTF-8).
            fos.close();

            // above methods can also be done with try with resources..

            //another method of writing in the file..
            String s="New java";
            byte []b = s.getBytes();
            for(byte c:b)
            {
                fos.write(c);
            }
            //fos.close();

            //another method using offset
            String k ="Offset java programming";
            byte c[]= k.getBytes();
            fos.write(c,6,k.length()-6);//len--total length-oofsetlength
            fos.close();

        }

        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException f)
        {
            System.out.println(f);
        }

    }
}
