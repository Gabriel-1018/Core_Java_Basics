package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_10C
{
    public static void main(String arg[])
    {
        LinkedHashSet<String> ls=new LinkedHashSet<>();
        //for linked hash set we cannot set Limit
        ls.add("B");
        ls.add("D");
        ls.add("E");
        ls.add("F");
        ls.add("K");
        ls.add("V");
        ls.add("D");
        //ls.forEach(System.out::println);

        Iterator<String> it= ls.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }



        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.forEach(System.out::println);

        //HashSet does not maintain any order of elements, while LinkedHashSet preserves the insertion order.
        //HashSet is backed solely by a hash table, whereas LinkedHashSet is backed by both a hash table and a linked list.
    }
}
