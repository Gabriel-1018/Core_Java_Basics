package Collection;

import java.util.*;

public class ArrayList_1C
{
    public static void main(String arg[])
    {
        java.util.ArrayList <Integer> al1 = new java.util.ArrayList <>(20);
        java.util.ArrayList <Integer> al2= new java.util.ArrayList <>(List.of(1,2,3,4,5,6,7,8,9,10));

        al1.add(25);
        al1.add(1,78);
        al1.addAll(1,al2);
        al1.add(5);
        System.out.println(al1);
        System.out.println(al1.lastIndexOf(5));
        System.out.println(al1.retainAll(al2));
        al1.set(5,34);
        System.out.println(al1);
        //iterator
        for(int i=0;i< al1.size();i++)
        {
            System.out.println(al1.get(i));
        }
        System.out.println("Next is for each");

        for(Integer x:al1)
        {
            System.out.println(x);
        }

        System.out.println("Next is Iterator");

        Iterator<Integer> it=al1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("For each");

        //below is a lamda expression
        al1.forEach(n->System.out.println(n));//this is consumer(functional interface) interface lamda expression
        //inside the for each loop we can also use lamda expression.

        al1.forEach(System.out::println);
        //Here Println is a method of System class and we passing the method reference to the for each method of arraylist.

        al1.forEach((n)->show(n));
        // we can also use lamda expression to call another method within the for each method.
        //n will have the arry list elements one by one and it will be passsed to show method
    }
    static void show(int n)
    {
        if (n>5)
        {
            System.out.println(n);
        }
    }
}
