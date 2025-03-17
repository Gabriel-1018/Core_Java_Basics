import java.util.*;

public class Adding2Matrices
{
    public static void main(String arg[])
    {
        int a[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int b[][] = {{1,5,2},{6,8,4},{3,9,7}};
        int c[][]=new int[3][3];

        for (int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }

        for(int x[]:c)
        {
            for (int y:x)
            {
                System.out.format("%02d ",y);
            }
            System.out.println();
        }

    }
}
