package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Product1
{
    private String name;
    private int price;

    public Product1(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString()
    {
        return "Product1{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    //The toString() method in Java is a built-in method that returns a string representation of an object. It's defined in the
    // Object class, which is the superclass of all classes in Java, so every class inherits it.
}


public class StreamGroupingbyMethodPartitioningbyMethod_10S
{
    public static void main(String[] args)
    {
        List<Product1> Productlist= Arrays.asList(new Product1("Iphone 15",1200),new Product1("Samsung S25",1000),
                new Product1("Pixel 9",700),new Product1("Vivo V50",700),
                new Product1("Oneplus 14",1300), new Product1("Realme 15",600));

        Map<Integer,List<Product1>> GroupByPriceMap=Productlist.stream().collect(Collectors.groupingBy(Product1::getPrice));
        System.out.println(GroupByPriceMap);


        Map<Boolean,List<Product1>> Partioningbyprice= Productlist.stream().collect(Collectors.partitioningBy(productprice->productprice.getPrice()>1000));
        System.out.println(Partioningbyprice);
    }
}
