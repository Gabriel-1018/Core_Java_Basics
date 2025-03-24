import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOstreams12
{
    public static void main(String arg[]) throws Exception
    {
        float list[]={7.2f,12.3f,56.4f,89.6f};

        FileOutputStream fos = new FileOutputStream("E:\\Java\\Inputoutputfiles\\Studentchalenge1.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(list.length);
        for(float x:list)
        {
            dos.writeFloat(x);
        }
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("E:\\Java\\Inputoutputfiles\\Studentchalenge1.txt");
        DataInputStream dis = new DataInputStream(fis);
        int k=dis.readInt();
        System.out.println(k);
        while(k>0)
        {
            System.out.println(dis.readFloat()+ " ");
            k--;
        }
        //For the bytes value in the file we can read until we get -1, but for other than bytes while storing 1st we have to store the count of the variables that we are storing
        //and that will be used for printing one by one untill we reach the count like above...
        fis.close();
        dis.close();
    }
}
