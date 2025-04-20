package Collection;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMap_9C
{
    public static void main(String arg[])
    {
        LinkedHashMap<Integer,String> lh= new LinkedHashMap<>(5,0.75f,true)
        {
            protected boolean removeEldestEntry(Map.Entry e)
            {
                return size()>5;
            }
        };
        //In above line if we put order access is true then the keys will be shown in the order of they accessed not in the order of insertion.
        //In order to limit the size we have to override the "removeEldestEntry" method, This will remove the Least recently used element if in the case of accessOrder is true.
        //if the Linkedhashmap is stored based on the insertion order then the first element will be removed.
        lh.put(1,"A");
        lh.put(2,"B");
        lh.put(3,"C");
        lh.put(4,"D");
        lh.put(5,"E");

        String s= lh.get(2);
        s= lh.get(5);
        s=lh.get(1);
        lh.put(6,"F");
        lh.forEach((k,v)->System.out.println(k+" "+v));
        //it will print them in the same order which we inserted.

    }
}
