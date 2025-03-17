import java.util.*;
import java.io.*;


public class Exceptiontryandfinally
{
    static FileInputStream fi;//this is used to get the input from the folder
    static Scanner sc;
    static void divide() throws Exception
    {
        fi = new FileInputStream("Enter the file path");//creating the object for the selected file.
        try
        {
            sc= new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("write the logic calculation for the variables in the file");
        }
        finally
        {
            fi.close();// this is used to close the opened file.
            sc.close();//close the scanner class.
        }

    }
    public static void main(String arg[]) //throws Exception
    {
        try
        {
            divide();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        int x =sc.nextInt();//since the scanner class is close we can't access the variables in the file.
    }
}
