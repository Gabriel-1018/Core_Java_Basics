package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTraverseMethod_6S
{
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Stream<Integer> s= ls.stream();
        s.forEach(System.out::println);
        s.forEach(System.out::println);// we cannot use the same object again once it is used.
    }
}
