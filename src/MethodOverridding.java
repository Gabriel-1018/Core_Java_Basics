class Super
{
    public void display()
    {
        System.out.println("Super class is displayed");
    }


}

class Sub extends Super
{
    public void display()
    {
        System.out.println("Sub class is displayed");
    }
}

public class MethodOverridding
{
    public static void main(String args[])
    {
        Super su =new Super();
        su.display();

        Sub sb =new Sub();
        sb.display();

        Super su1 = new Sub();
        su1.display();

    }
}
