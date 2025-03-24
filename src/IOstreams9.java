import java.io.*;

class student3
{
    int rollno;
    String name;
    String dept;
}
public class IOstreams9
{
    public static void main(String arg[]) throws Exception
    {
        //1st method of sending the data to the file...(Storing all the data as a string to the file..)
        FileOutputStream fo = new FileOutputStream("E:\\Java\\Inputoutputfiles\\Student1.txt");
        PrintStream po = new PrintStream(fo);
        //PrintStream ps = new PrintStream("");
        //a PrintStream is a type of output stream used for writing data to a destination (such as a file or the console). It is a subclass of the OutputStream class and is part of the java.io package. It is specifically designed to print representations
        // of various data types (such as strings, integers, and other objects) in a human-readable format.using printstream we can store only a string..

        student3 s3= new student3();
        s3.rollno=10;
        s3.name= "Edward";
        s3.dept="Mech";

        //System.out.//System is a class and it has a static out is a object and which will have all the methods same as printstream..
        po.println(s3.rollno);//it will write int as a string to the file.
        po.println(s3.name);
        po.println(s3.dept);



        FileInputStream fi = new FileInputStream("E:\\Java\\Inputoutputfiles\\Student1.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fi));//it required reader as a input so we converted the stream to reader by using InputStreamReader..

        //InputStreamReader is a class in Java that acts as a bridge between byte streams and character streams. Specifically, it is used to convert an InputStream (a byte stream) into a character stream.
        //In Java, byte streams (such as InputStream and OutputStream) are designed for reading and writing raw binary data, while character streams (such as Reader and Writer) are designed for reading and writing text data, which is more common in
        // programs that deal with human-readable content (e.g., text files, network data).
        //The InputStreamReader class provides an easy way to convert bytes into characters by applying a specific character encoding (e.g., UTF-8, ASCII).

        student3 s4= new student3();
        s3.rollno=Integer.parseInt(br.readLine());//this readline method will return String so we have to convert the staring to the INT for roll number.
        //The parseInt() method is part of the Integer class in Java and is specifically used to
        // convert a String representing an integer value to an int data type.
        s3.name=br.readLine();
        s3.dept=br.readLine();

        System.out.println(s3.rollno);
        System.out.println(s3.name);
        System.out.println(s3.dept);
    }
}
