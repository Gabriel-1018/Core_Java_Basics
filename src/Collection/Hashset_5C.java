package Collection;

import java.util.HashSet;

public class Hashset_5C
{
    public static void main(String arg[])
    {
        HashSet<Integer> hs = new HashSet<>(20, 0.25f);
        //If we add more vaules the size will increase
        // when we use hashtable the space will be wasted. because of that extra space only we can able to perform the operations at constant time.
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(10);

        //10 will be stored only once and the order will be according to the rule (h(x)=x%10)
        System.out.println(hs);
    }
}
