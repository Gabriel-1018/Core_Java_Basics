package Collection;
import java.util.List;

public class LinkedList_2C
{
    public static void main(String arg[])
    {
        java.util.LinkedList<Integer> al1 = new java.util.LinkedList<>();
        // we can mention the fixed size for linked list.
        java.util.LinkedList<Integer> al2 = new java.util.LinkedList(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);

        al1.addFirst(22);
        al1.addLast(200);

        System.out.println(al1);
        al1.forEach(n->show(n));

    }
    static void show(int n)
    {
        System.out.println(n);
    }
}
