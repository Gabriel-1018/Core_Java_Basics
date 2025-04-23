package Streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

class person
{
    private String name;
    private List<String> phonenumbers;

    public person(String name,List<String> phonenumbers)
    {
        this.name=name;
        this.phonenumbers=phonenumbers;
    }

    public String getName()
    {
        return name;
    }
    public  List<String> getPhonenumebrs()
    {
        return phonenumbers;
    }
}




public class StreamFlatmapoperation_3S
{
    public static void main(String[] args)
    {
        //using map
        String a[]= {"Easy", "Bytes"};
        Stream<String> s= Arrays.stream(a);// creation of stream
        //Internally, it’s like:
        //Stream<String> s = Stream.of("Hello", "World");

        Stream<String[]>c=s.map(n->n.split(""));// intermediate operation
        //this .split method will return the String array.
        //So s1.map(n -> n.split("")) results in:
        //"Easy" → ["E", "a", "s", "y"]
        //"Bytes" → ["B", "y", "t", "e", "s"]

        c.forEach(n->System.out.println(n));//Terminal operation
        // System.out.println(n) This line prints the object reference of each String[], not the contents. Output would look like:
        // [Ljava.lang.String;@1b6d3586
        //[Ljava.lang.String;@4554617c
        //That's the default toString() representation of an array in Java.

        //using flatmap
        String b[]= {"Easy", "Bytes"};
        Stream<String> s1= Arrays.stream(b);//Creation of Stream
        Stream<String[]> c1=s1.map(n->n.split(""));//Intermediate operation1, c1 steam will have 2 different Arrays.
        Stream<String>c2=c1.flatMap(Arrays::stream);//Intermediate operation2
        //This line would "flatten" the stream of arrays into a stream of individual strings.
        //So Stream<String[]> becomes Stream<String>:
        //Flattened: ["E", "a", "s", "y", "B", "y", "t", "e", "s"]

        //.flatMap() is used to:
        //Transform each element of the stream into a new stream (like map()),
        //And then flatten the resulting streams into a single stream.
        //In contrast, .map() would keep a nested structure (stream of arrays). But .flatMap() "flattens" them — it removes the nested layer.
        c2.forEach(n->System.out.println(n));//Terminal operation.


        List<person> persons = Arrays.asList(new person("Jessi",Arrays.asList("23253656","89678586")),new person("Alice",Arrays.asList("878686","24234532")));
        Stream<person> sp=persons.stream();// creation of stream

        List<List<String>> ls1= sp.map(person::getPhonenumebrs).//intermediate operation and storing in list
        collect(Collectors.toList());//terminal operation
        System.out.println(ls1);//here the output  will be list of list having the phone numbers

        List<String> ls2= persons.stream().flatMap(n->n.getPhonenumebrs().stream()).collect(Collectors.toList());//intermediate operation
        System.out.println(ls2);//Output will have the single list with all phone numbers, that is the benifit of using the flat map


    }
}
