package Streams;


import java.util.*;
import java.util.stream.Collectors;

class Product
{
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class StreamCollectAndThenMethod_9S
{
    public static void main(String[] args)
    {
        List<Product> Productlist= Arrays.asList(new Product("Iphone 15",1200),new Product("Samsung S25",1000),
                                          new Product("Pixel 9",700),new Product("Vivo V50",1000),
                                          new Product("Oneplus 14",1300), new Product("Realme 15",600));

        String MaxPriceProduct=Productlist.stream()//Creation of Stream
                .collect(Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Product::getPrice)), (Productoptional->Productoptional.isPresent()?Productoptional.get().getName():"None")));//.get() method will get the product object
        //No terminal operation there for CollectAndThen so we use collect(Collectors.collectingAndThen())
        //Optional was introduces in JAVA 8 to avoid null pointer exception
        //this above method can be used when we want to perform any operation on the list or any other collections,
        // 1- we have to convert to stream, 2- performing the operation, 3- storing the value in the Variable.
        System.out.println(MaxPriceProduct);
    }
}
