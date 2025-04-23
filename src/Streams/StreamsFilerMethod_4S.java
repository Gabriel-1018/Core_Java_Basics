package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFilerMethod_4S
{
    public static void main(String[] args)
    {
        List<String> al= new ArrayList<>();
        al.add("Supply");
        al.add("HR");
        al.add("Sales");
        al.add("Marketing");
        //System.out.println(al);

        al.stream()
                .map(n->n.toUpperCase()).//intermediate operation 1
                                filter(n->n.startsWith("S")).//intermediate operation 2
                                                 forEach(System.out::println);

        //List<String> sp= al.stream().filter(n->n.startsWith("S")).collect(Collectors.toList());
        //System.out.println(sp);
    }
}
