class teststatic//outer class cannot be made as static
{
    static int n=5;
    int k=7;

    static void display()
    {
        System.out.println(n);//k=7 inside static method we cannot access the nonstatic members
    }
    void display1()
    {
        System.out.println(n);// a non static member can access the static member..
    }

    static class innerstatic//inner class can only be made as static
    {
        int k =12;//here we don't need to declare static in front for every identifier.
        void meth1()//here we no need to enter static in front because we have declared the whole class as ststic.
        {
            int s =5;
            s+=k;
        }
        void meth2()
        {
            int m=10;
            m+=k;
        }
    }

}




public class Staticpractice1
{
    public static void main(String arg[])
    {
        int l =teststatic.n;//static member or method can be accessed by calling it classname.member or method name directly without creating object for it.
        teststatic.display();
        teststatic t =new teststatic();


    }
}
