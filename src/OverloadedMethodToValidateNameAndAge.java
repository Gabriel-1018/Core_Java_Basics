import java.util.*;

public class OverloadedMethodToValidateNameAndAge
{
    static boolean Validate(int x)
    {
        return x>3&&x<15;

    }
    static boolean Validate(String name)
    {
        return name.matches("[a-zA-Z\\s]*");
    }

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name and age: ");
        String name = sc.next();
        int age= sc.nextInt();
        System.out.println(Validate(name));
        System.out.println(Validate(age));


    }
}
