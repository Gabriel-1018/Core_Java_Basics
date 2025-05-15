package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamCollectMethod_8S
{
    public static void main(String[] args)
    {
        List<String> ls1= new ArrayList<>();
        ls1.add("Supply");
        ls1.add("HR");
        ls1.add("Sales");
        ls1.add("Marketing");

        List<String> newdepartmentlist =ls1.stream()
                                           .filter(n->n.startsWith("S"))
                                           .collect(Collectors.toList());

        newdepartmentlist.forEach(System.out::println);

        long newdepartmenlistcount =ls1.stream()
                .filter(n->n.startsWith("S"))
                .collect(Collectors.counting());//count output will be long so save it in long..

        System.out.println(newdepartmenlistcount);


        Set newdepartmenlistset =ls1.stream()
                .filter(n->n.startsWith("S"))
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(newdepartmenlistset);
    }
}
