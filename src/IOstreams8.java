import java.io.*;
import java.util.List;

public class IOstreams8
{
    public static void main(String arg[]) throws Exception
    {
        File f = new File("E:\\Java\\Java notes");
        System.out.println(f.canExecute());
        String List[] = f.list();//this will list the files under the folder
        //In Java, you don't need to explicitly create an object of the String class in most cases. The String
        // class is special in that it handles object creation automatically under the hood in several scenarios.
        for(String s:List)
        {
            System.out.println(s);
        }
        File s[]=f.listFiles();//this will list the Pathes
        for(File m:s)
        {
            System.out.print(m.getName()+" ");
            System.out.print(m.getPath()+" ");//it will get the file Path...
            System.out.println(m.getParent());//this will get the parent file name..
        }


        File n= new File("E:\\Java\\Java notes\\Annotations.pdf");
        //n.setReadOnly();//we can set a file readyonly by this method...
        //n.setWritable(true);//we can set a method writeable back...
        //n.setLastModified();//we can set the file Last modified time..
        //n.lastModified();//we can also get the last modified time..there are many methods under the file class..
        //f.isHidden();//we can also see if the file is hidden or not..

        FileOutputStream fos = new FileOutputStream("E:\\Java\\Java notes\\Annotations.pdf");
   }
}
