package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

class com implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2)
    {
        if(o1<o2) return 1;//checking 1st integer is smaller than 2nd value, if it is small then it should return -1.but here we are returing 1
        if(o1>o2) return -1;//checking 1st integer is larger than 2nd value, if it is large then it should return 1.but here we are returing -1
        return 0;
        //have to look how this works.

    }
}

public class PriorityQueue_4C
{
    public static void main(String arg[])
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new com());

        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        pq.add(15);
        pq.add(3);

        System.out.println(pq);
        System.out.println(pq.peek());
        pq.forEach(n->System.out.println(n));
        pq.poll();
        System.out.println(pq);
        //This priority queue is worked based on the data structure called heap..
        //Here small values will have high priority and large values have less priority.
    }
}
