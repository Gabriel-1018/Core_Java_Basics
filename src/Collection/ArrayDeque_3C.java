package Collection;

public class ArrayDeque_3C
{
    public static void main(String arg[])
    {
        java.util.ArrayDeque<Integer> dq= new java.util.ArrayDeque<>();

        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        //similar to addLast() but this does not throws exception

        System.out.println(dq);
        dq.forEach(n->System.out.println(n));

        dq.offerFirst(1);
        //similar to addFirst() but this does not throws exception
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.offerLast(50);
        System.out.println(dq);

        //Stack - A Stack allows elements to be added and removed from the same end, known as the "top."
        // The most recently added element is the first to be removed.
        //Stack follows the LIFO (Last In, First Out) principle

        //Queue - A Queue allows elements to be added at the rear and removed from the front,
        // adhering to the FIFO principle.
        //Queue follows the FIFO (First In, First Out) principle.
    }
}
