import java.io.FileInputStream;
import java.util.Scanner;

public class Exceptiontrywithresources
{
    static void divide() throws Exception
    {
        try(FileInputStream fi = new FileInputStream("Enter the file path");Scanner sc = new Scanner(fi))//try with resources, this is used to get the input from the folder, and closing of resource will be taken care by try so don't need of finally
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("write the logic calculation for the variables in the file");
        }

    }
    public static void main(String arg[]) //throws Exception
    {
        try
        {
            divide();
        } catch (Exception e) {
            System.out.println(e);
        }

        //int x = sc.nextInt();//since the scanner class is close we can't access the variables in the file.
    }
}
