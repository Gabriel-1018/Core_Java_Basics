package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamLimitMethod_5S
{
    public static void main(String[] args)
    {
        List<Integer>ls= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        ls.stream().limit(5).forEach(System.out::println);

        //in set collection since the order is not maintained this limit will randomly select the limited number
        //Limit
        Stream.generate(new Random()::nextInt).limit(5).map(n->n*2).forEach(System.out::println);
        //Skip
        Stream.iterate(1,n->n+1).skip(5).limit(5).forEach(System.out::println);



    }
}
