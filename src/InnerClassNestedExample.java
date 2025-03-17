class Outer
{
    private int k;
    public Outer()
    {
       k=1;
    }
    public int get()
    {
        return k;
    }
   class Inner
    {
        int y=10;
        public void innerdisplay()
        {
            System.out.println(get()+" "+y);
        }
    }
    Inner c = new Inner();//Object can be created outside the method for inner class, so that it can be used by all.
    void outerdisplay()
    {
        c.innerdisplay();
    }

}

public class InnerClassNestedExample
{
    public static void main(String arg[])
    {
        Outer c = new Outer();
        c.outerdisplay();
        Outer.Inner c1 = new Outer().new Inner();
    }

}
