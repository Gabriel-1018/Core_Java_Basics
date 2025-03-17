class teststatic1
{
    static int x=10;
    int y=20;

    void show()
    {
        System.out.println(x+" "+y);
    }

    static void display()
    {
        System.out.println(x);
    }
}

public class Staticpractice2
{
    public static void main(String[] args)
    {

        teststatic1 t1=new teststatic1();
        t1.x=30;
        t1.y=50;
        t1.show();

        teststatic1 t2=new teststatic1();// here static x holds the value...
        t2.show();

    }

}
