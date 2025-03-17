import java.util.*;
public class Patterns
{
    public static void main(String arg[])
    {
        char k = '*';
        for (int i=0;i<=5;i++)
        {
            for (int j = 0; j <= 5; j++)
            {
                System.out.print("(" + k + "," + k + ")");
            }
            System.out.println(" ");
        }
    }
}
