package Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class Property_12C
{
    public static void main(String arg[]) throws Exception
    {
        //Properties class is inheriting from HashTable,
        //In Hashtable we can store any type of value..
        //but in Properties we can store only string for both the key and the values

        //The Properties class is a subclass of Hashtable and is used to maintain lists of key-value pairs.
        // It's commonly used for configuration settings (like .properties files).

        Properties pt = new Properties();
        /*
        pt.setProperty("Brand","Dell");
        pt.setProperty("Processor","i7");
        pt.setProperty("os","Windows");
        pt.setProperty("Model","Latitude");

        //pt.store(new FileOutputStream("E:\\Java\\Inputoutputfiles\\MYData.txt"),"Laptop");
        pt.storeToXML(new FileOutputStream("E:\\Java\\Inputoutputfiles\\MYData.xml"),"Laptop");
        */
        //pt.loadFromXML(new FileInputStream("E:\\\\Java\\\\Inputoutputfiles\\MYData.xml"));

        pt.load(new FileInputStream("E:\\Java\\Inputoutputfiles\\MYData.txt"));
        System.out.println(pt);
        System.out.println(pt.getProperty("Brand"));
    }
}
