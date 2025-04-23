package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamCreationDemo
{
    public static void main(String[] args)
    {
        //Streams

        //In Java, Streams are mainly used to process collections of data (like List, Set, etc.) in a declarative and functional-style way. So
        // instead of using loops to filter, map, sort, or transform data, you use a pipeline of stream operations.

        List<String> ls = new ArrayList<>();

        ls.add("Supply");
        ls.add("HR");
        ls.add("Sales");
        ls.add("Marketing");

        Stream<String> depstream= ls.stream();

        //The .stream() method is called on that list, and it returns a sequential Stream of the elements in the list.
        //This does not modify the list. It just gives you a new way to work with the elements.
        depstream.forEach(n->System.out.println(n));

        Stream<String> instream= Stream.of("Easy","bytes","Java");
        //creates a stream of strings directly from the given values, without needing a list or array first.
        //This is a static method in the Stream class.
        //Stream.of(...) takes varargs (variable number of arguments).
        //It creates a stream with exactly those elements: "Easy", "bytes", and "Java".
        //Since streams don't hold memory, this Stream will store the given values in a Array at the back end.
        instream.forEach(System.out::println);

        System.out.println("\n");

        Stream<String> parallelstream = ls.parallelStream();
        parallelstream.forEach(System.out::println);
        //printing order will be difficult.

        String a[] = {"Easy", "Bites"};
        Stream<String> st =Arrays.stream(a);
        st.forEach(System.out::println);

        Stream<String> emptyString = Stream.empty();
        //This is a static method provided by the java.util.stream.Stream interface. It returns an empty sequential
        // stream (i.e., a stream with no elements).
        //at sometimes we may be need to create an empty streams..

        //Generating infinite stream.one method...
        Stream.generate(new Random()::nextInt).forEach(System.out::println);
        //this can be used to generate a infinite stream..interview question..
        // in the line we are creating the object for the random class and doing method reference for nextInt method and
        //printing one element by element using the foreach.

        //Generating infinite stream... another method..
        Stream.iterate(1,n->n+1).forEach(System.out::println);


        //A Stream in Java (from java.util.stream) is a view over a data source (like a List, Set, or even generated data).
        //It doesn’t hold data itself. Instead, it processes data as it flows through a sequence of operations (map, filter, etc.).
        //It’s not like a collection, which stores elements in memory.

    }
}
