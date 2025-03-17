import java.util.*;
public class Multiplying2Matrices
{
    public static void main(String arg[])
    {
        int a[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int b[][] = {{1,0,0},{0,1,0},{0,0,1}};
        int c[][] = new int[3][3];

        for(int i=0; i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=0;
                for(int k=0; k<3;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }

        }

        for(int x[]:c)
        {
            for(int y:x)
            {
                System.out.format("%02d ",y);
            }
            System.out.println();
        }
    }
}
