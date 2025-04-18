interface mylamda5
{
    void display(String str);
}
interface mylamda6
{
    int display(String s,String k);
}
class lamdademo
{
    public static void reverse(String s)
    {
        StringBuilder k= new StringBuilder(s);
        k.reverse();
        System.out.println(k);

    }
}

class lamdademo1
{
    public void reverse(String s)
    {
        StringBuilder k= new StringBuilder(s);
        k.reverse();
        System.out.println(k);

    }
}

public class Lamdaexpression3
{
    public Lamdaexpression3(String str)//just creating constructor for passing the reference to the lamda expression
    {
        System.out.println(str.toUpperCase());
    }
    public static void main(String arg[])
    {
        mylamda5 f =System.out::println;//Since println is static method that is written using scope resolution"::"
        //in the above line println method is assigned to the mylamda5 interface display method
        //System.out::println is a (method reference) that refers to the println method of the System.out object, which is of type PrintStream.
        //The method reference System.out::println is equivalent to the lambda expression
        //(String x) -> System.out.println(x);
        //Essentially, it refers to the println method that takes a String argument and prints it to the console.
        f.display("hello");//display method act as a println method


        mylamda5 e =lamdademo::reverse;// here we are reffering the reverese method to lamda expression
        e.display("Hello");

        lamdademo1 g =new lamdademo1();
        mylamda5 h =g::reverse;//For non static methods we have to create object and have to pass..


        mylamda5 i=Lamdaexpression3::new;//just creating a object so that the construtor passes the string to the display()method in interface..
        i.display("Lambo");

        mylamda6 j =String::compareTo;
        System.out.println(j.display("Hello","hp"));

        //1.String::compareTo is a method reference in Java, which refers to the compareTo method of the String class.
        //2.compareTo compares two strings lexicographically (i.e., based on the Unicode values of the characters in the string). It returns an int.
        //3.By assigning String::compareTo to the variable j of type mylamda6, you're effectively creating a reference to the compareTo method that matches the signature of the display method in the mylamda6 interface.
        // The display method takes two String arguments and returns an int, which matches the signature of compareTo perfectly.
    }
}
