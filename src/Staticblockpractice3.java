class static5
{
    static
    {
        System.out.println("Block3");
    }
}
public class Staticblockpractice3
{
    static//when we run the program..the class get loaded it will executed in the order..
    {
        System.out.println("Block1");
        static5 n = new static5();
    }

    public static void main(String arg[])
    {

        System.out.println("Main method");
    }

    static
    {
        System.out.println("Block2");
    }
}
