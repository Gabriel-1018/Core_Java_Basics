public class MethodPractice
{
    static int max(int x,int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }

    int min(int x, int y)
    {
        if(x<y)
            return x;
        else
            return y;
    }

    public static void main(String args[])
    {
        int a=10,b=12,c,d;
        //Calling static method Max
        c= max(a,b);
        System.out.print(c);

        //calling non static method min
        MethodPractice mp = new MethodPractice();
        d=mp.min(a,b);
        System.out.println(d);

    }
}
