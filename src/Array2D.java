import java.util.*;

public class Array2D
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int b[][]={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        for(int x[]:b)
        {
            for (int y:x)
            {
                System.out.print(y+",");
            }
            System.out.println();
        }
        for(int i=0; i<b.length;i++)
        {
            System.out.print("[");
            for(int j=0; j<b[0].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("]");
            System.out.println();
        }


        int [][]c = new int[3][3];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                c[i][j]= sc.nextInt();
            }
        }

        for(int x[]:c)
        {
            for(int y:x)
            {
                System.out.print(y+",");
            }
            System.out.println();
        }
    }
}
