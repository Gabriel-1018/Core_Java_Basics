interface mylamda1
{
    void display(String str);
}
interface  mylamda2
{
    int display(int i, int j);
}

public class Lamdaexpression1
{
    public static void main(String arg[])
    {
        mylamda1 m = (s)->{System.out.println(s);};
        m.display("Hello");

        mylamda2 n = (k,l)->k+l;//here we can directly write a+b(anonymous  Expression) instead of returning..
        int r= n.display(20,30);
        System.out.println(r);

    }
}
