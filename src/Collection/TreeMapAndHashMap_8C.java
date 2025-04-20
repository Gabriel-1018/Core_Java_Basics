package Collection;

import java.util.*;

public class TreeMapAndHashMap_8C
{
    public static void main(String arg[])
    {

        TreeMap<Integer, String> tm= new TreeMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));

        tm.put(4,"E");
        tm.put(5,"F");

        // here if the mentioned key is not there then i will give the next nearest value.
        System.out.println(tm);
        System.out.println(tm.ceilingEntry(3).getValue());
        //above line will only give the value..
        System.out.println(tm.get(4));

        Map.Entry<Integer,String> e= tm.firstEntry();
        System.out.println(e);
        System.out.println(e.getKey()+" "+e.getValue());

        //Tree takes log n time for basic operation
        //Hash takes order of 1, Constant time for all basic operations..


        HashMap<Integer, String> ts= new HashMap<>(Map.of(0,"A",1,"B",2,"C",3,"D"));

        ts.put(4,"E");
        ts.put(5,"F");

        System.out.println(ts);

        //Treemap vs HashMap

        //HashMap
        //Underlying Structure: Hash table (with array + linked list or tree for handling collisions).
        //Ordering: No guaranteed order of keys.
        // Null Keys: Allows one null key and multiple null values.
        // Performance:
        //put, get, remove: O(1) on average, but can degrade to O(n) in worst-case (e.g., hash collisions)
       // Use case: When you want fast access and don’t care about order.

        //TreeMap
        //Underlying Structure: Red-Black Tree (a self-balancing binary search tree).
        //Ordering: Keys are stored in sorted order (natural order or a custom comparator).
        //Null Keys: Allows only one null value, but no null keys.
        //Performance:
        //put, get, remove: O(log n)
        //Use case: When you want to maintain order of keys.
    }
}
