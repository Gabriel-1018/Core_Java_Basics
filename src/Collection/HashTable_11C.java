package Collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable_11C
{
    public static void main(String arg[])
    {
        Hashtable ht= new Hashtable<>();
        // This HashTable is a legacy class which is not recomended to use now
        ht.put(1,"A");
        ht.put(2,"B");
        ht.put(3,"C");
        ht.put(4,"D");

        String s=(String) ht.get(3);
        //In hashtable everything will be stored as an Object, since object cannot be assigned to a string so we are typecasting to a String.
        //this "HashTable" is not a generic type and so it doest contain Iterator. instead we can use Enumerator

        /*Enumeration e= ht.elements();
        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());

        }*/
        // we can use this instead of Iterator...
        ht.compute(3,(k,v)->k+"Z"+v);

        ht.computeIfAbsent(5,(v)->v+"Z");
        System.out.println(ht);
    }
}
