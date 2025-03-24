import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class student4
{
    int rollno;
    String name;
    String dept;
    float avg;
}
public class IOstreams10
{
    public static void main(String arg[]) throws Exception
    {
        //2nd method of sending the data to the file..(Before storing in a file we are converting according to the datatype and storing )
        FileOutputStream fos = new FileOutputStream("E:\\Java\\Inputoutputfiles\\Student2.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        student4 st = new student4();

        st.rollno=18;
        st.name="Gabriel";
        st.dept="Mech";
        st.avg=80.7f;

        dos.writeInt(st.rollno);//Since it is a int data will be stored in the file as in the binary format
        dos.writeUTF(st.name);
        dos.writeUTF(st.dept);//Since it is a string we can read the string..in the file..
        dos.writeFloat(st.avg);


        FileInputStream fis = new FileInputStream("E:\\Java\\Inputoutputfiles\\Student2.txt");
        DataInputStream dis = new DataInputStream(fis);
        //whatever written by the dataoutputstream can only be read by the datainput stream...and it should me read by the same order..
        //if we change the order then it will cause the exception..


        st.rollno=dis.readInt();
        st.name=dis.readUTF();
        st.dept=dis.readUTF();
        st.avg= dis.readFloat();

        System.out.print(st.rollno);
        System.out.print(st.name);
        System.out.print(st.dept);
        System.out.print(st.avg);

        fis.close();
        dis.close();

    }
}
