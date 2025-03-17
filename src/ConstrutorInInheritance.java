class Parent
{
    public Parent()
    {
        System.out.println("parent Constructor");
    }
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child constructor");
    }
}

class Grandchild extends Child
{
    public Grandchild()
    {
        System.out.println("GrandChild constructor");
    }
}


public class ConstrutorInInheritance
{
    public static void main(String a[])
    {
        Grandchild c =new Grandchild();
    }
}
