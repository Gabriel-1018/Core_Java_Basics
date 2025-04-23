package Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class StreamReduceMethod_7S
{
    public static void main(String[] args)
    {

        List<String> al= new ArrayList<>();
        al.add("Supply");
        al.add("HR");
        al.add("Sales");
        al.add("Marketing");
        System.out.println(al.stream().count());// count is a terminal operation used to count the stream elements


        List<Integer> ls= List.of(1,2,3,4,5,6,7);
        int sum=ls.stream().reduce(0,Integer::sum);
        //stream().reduce(0, (a, b) -> a + b);/this is how the above part will work
        //stream.reduce(identity, accumulator);
        //accumulator: a function that takes two arguments:
        //*the current accumulated value
        //*the next element of the stream
        //and returns a new accumulated value.
        System.out.println(sum);

        int v=ls.stream().filter(n->n%2==0)//this will filter the even number
                .mapToInt(n->n).sum();
        //This is special case of redution and which is equalent to above reduce(0,Integer::sum);
        System.out.println(v);

        OptionalInt m=ls.stream().filter(n->n%2==0)//this will filter the even number
                .mapToInt(n->n).max();//this max give the optinal int as the output, which may give output or maynot.
        System.out.println(m);
        System.out.println(m.getAsInt());

    }
}
