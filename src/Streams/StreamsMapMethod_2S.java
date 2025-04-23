package Streams;

import java.util.ArrayList;

public class StreamsMapMethod_2S
{
    public static void main(String[] args)
    {
        ArrayList<String> al= new ArrayList<>();
        al.add("Supply");
        al.add("HR");
        al.add("Sales");
        al.add("Marketing");
        al.stream().//stream creation
                map(n->n.toUpperCase()).//Intermediate operation..This intermediate operation will not mutate the orginal source or the orginal Stream instead it will give the new stream
                                               forEach(n->System.out.println(n));//Terminal Operation.

        //Map---
        //In Java Streams, the map function is used to transform elements of a stream. It takes a Function as an argument
        // and applies this function to each element in the stream, producing a new stream with the transformed elements.


        al.stream().//stream creation
                map(n->n.toUpperCase()).//We can add one more intermedidate operations
                map(n->"Hi "+n).
                forEach(n->System.out.println(n));
    }
}
