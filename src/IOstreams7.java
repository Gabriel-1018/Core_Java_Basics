import java.io.RandomAccessFile;

public class IOstreams7
{
    public static void main(String arg[]) throws Exception
    {
        RandomAccessFile r = new RandomAccessFile("E:\\Java\\Inputoutputfiles\\Source2.txt","rw");//here we have to mention the mode of operations(r or w) that needs to be performed by the operator..
        System.out.println((char) r.read());
        System.out.println((char) r.read());
        System.out.println((char) r.read());
        r.seek(5);//this will move the pointer next to the given position number...
        r.write('k');
        System.out.println((char) r.read());
        System.out.println((char) r.read());
        r.seek(3);
        r.write(' ');
        r.seek(5);//It will move the pointer to the mentioned position
        r.write('a');
        System.out.println(r.getFilePointer());
        System.out.println((char) r.read());
        r.skipBytes(3);//It will skip the mentioned no of bytes from the current pointer..
        System.out.println((char)r.read());
        r.seek(r.getFilePointer()+2);//we can also do like this to move the pointer..
    }
}
