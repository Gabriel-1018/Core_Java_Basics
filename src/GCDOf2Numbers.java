import java.util.*;
public class GCDOf2Numbers
{
    static int GCDmethod (int x,int y)
    {
        while(x!=y)
        {
            if(x>y)
            {
                x = x-y;
            }
            else
            {
                y = y-x;
            }
        }
        return y;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 GCD numbers: ");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=GCDmethod(a,b);
        System.out.print(c+" is the GCD");
    }
}
