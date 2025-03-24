import java.io.*;
import java.util.Scanner;

class Customer3 implements Serializable
{
    String custID;
    String name;
    String phone;
    static int count=1;
    public Customer3(){}
    public Customer3(String n, String ph)
    {
        custID="C"+count;
        count++;
        name=n;
        phone=ph;
    }

    public String toString()
    {
        return "Customer Details"+"\n"+
                "Customer ID "+custID+"\n"+
                        "Name "+name+"\n"+
                "Phone Number "+phone+"\n";
    }
}


public class IOstreams13
{
    /*public static void main(String arg[])throws Exception
    {
        FileOutputStream fos = new FileOutputStream("E:\\Java\\Inputoutputfiles\\Studentchalenge2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Customer3 list []={new Customer3("Nippa","8242440843"),new Customer3("Fenis","8258740843"),new Customer3("Kick","9875158935")};
        //This line declares and initializes an array of Customer3 objects named list. The array is created with three elements.
        //Each element in the array is an instance of the Customer3 class, created by calling
        //the constructor of Customer3 with two arguments: a name and a phone number.
        oos.writeInt(list.length);
        for(Customer3 s:list)
        {
            oos.writeObject(s);
        }
        //When you're serializing an array of Customer3 objects, you write the length of the array first with oos.writeInt(list.length) and then write
        // each object using oos.writeObject(s) and the ntains an array of objects...
        //on  Deserializing we have to read for array of objects..
        oos.close();
        fos.close();

    }*/

   public static void main(String arg[])throws Exception
    {
        FileInputStream fis = new FileInputStream("E:\\Java\\Inputoutputfiles\\Studentchalenge2.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        int length =ois.readInt();
        Customer3 list[]= new Customer3[length];
        //This line is creating an array of Customer3 objects with a length of length
        for(int i=0;i<length;i++)
        {
            list[i]=(Customer3)ois.readObject();
            //This line reads an object from the ObjectInputStream using ois.readObject(), which deserializes the next object from the file.
            //The object that is read is then cast to a Customer3 object, because readObject() returns a Object type, and you need to cast it to the appropriate type (Customer3 in this case).
            //After casting, the deserialized Customer3 object is stored in the list array at index i.
        }
        System.out.print("Enter the name of the customer: ");
        Scanner sc = new Scanner(System.in);
        String Name = sc.next();
        for(int i=0; i<length;i++)
        {
            if(Name.equalsIgnoreCase(list[i].name))
            {
                System.out.println(list[i]);
            }

        }
        ois.close();
        fis.close();

    }

}
