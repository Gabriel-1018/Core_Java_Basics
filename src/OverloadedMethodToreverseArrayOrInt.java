import java.util.*;
public class OverloadedMethodToreverseArrayOrInt
{
     String Reverse(int x)
    {
        int y;
        String k="";
        while(x>0)
        {
            y=x%10;
            x=x/10;
            k+=y;
        }
        return k;
    }

     int[] Reverse(int x[])
    {
        int b[]= new int[x.length];
        for (int i=x.length-1,j=0; i>=0;i--,j++)
        {
            b[j]=x[i];
        }
        return b;
    }


    public static void main(String arg[])
    {
        int i= 4528;
        int a[] = {5,2,8,9,2,4,7};
        int b[] = new int[a.length];
        OverloadedMethodToreverseArrayOrInt ov = new OverloadedMethodToreverseArrayOrInt();
        System.out.println("Reverse of given int is "+ov.Reverse(i));
         b = ov.Reverse(a);
        for (int j=0;j<b.length;j++)
        {
            System.out.print(b[j]+",");
        }

    }

}
