import java.io.*;

class student5 implements Serializable
{
    int rollno;
    String name;
    String dept;
    float avg;
    public static int data=10;
    public transient int t;
    //transient and static are not serialized,volatile may be serialized..

    public student5(){}
    //Default Constructor: It is needed for deserialization because it allows the JVM to create an object
    // before it populates its fields with the serialized data.
    public student5(int rol,String n,String d, float av)
    {
        rollno=rol;
        name=n;
        dept=d;
        avg=av;
        data=300;
        t=200;
    }
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+data+
                "\nTransient "+t+"\n";
    }
}



public class IOstreams11
{
    //serialization
    /*
    public static void main(String arg[]) throws Exception
    {
        FileOutputStream fos = new FileOutputStream("E:\\Java\\Inputoutputfiles\\Student5.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);//basically we are just connecting the fos with oos
        //oos will serialize but it will be stored in binary() and only ObjectInputStream can able to read it...
        student5 st = new student5(1018,"Gabriel","Mech",80.7f);
        oos.writeObject(st);
        System.out.print(st);

        fos.close();
        oos.close();
    }*/

    //deserialization
    public static void main(String arg[]) throws Exception
    {
        FileInputStream fis = new FileInputStream("E:\\Java\\Inputoutputfiles\\Student5.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);//basically we are just connecting the fos with oos
        //oos will serialize but it will be stored in binary() and only ObjectInputStream can able to read it...

        student5 st = (student5) ois.readObject();//student reference st requires only student so we are typecasting...
        System.out.print(st);

        fis.close();
        ois.close();

        //why default constructors required?
        //when we were serializing we used parametarised constructor, but while deserializing it was not using its own mechanism so it will give exception
        //if a class has a parent class then a default constructor is required,
    }
}
