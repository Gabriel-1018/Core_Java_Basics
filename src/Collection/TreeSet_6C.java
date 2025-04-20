package Collection;

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_6C
{
    public static void main(String arg[])
    {
        TreeSet<Integer> td = new TreeSet<>(List.of(10,30,50,70,10,40));
        Collection<Integer> tc = new TreeSet<>(List.of(10,30,50,70,10,40));
        SortedSet<Integer> ts = new TreeSet<>(List.of(10,30,50,70,10,40));
        //here from the above we can take the reference of any interface and access the object of tree, but we can call only
        // those method available in the interface

        td.add(25);
        System.out.println(td);
        //it will call the tostring method and print the values.
        System.out.println(td.ceiling(32));
        //this will give the output for the next largest nearest number to the giving number.
        System.out.println(td.floor(29));
        //this wi;; give the next smallest nearest number to the given number

        //A TreeSet in Java is a part of the Java Collections Framework and implements the Set interface. It
        // stores unique elements and maintains them in sorted (ascending) order. Internally,
        // Duplicate, will be ignored

    }
}
