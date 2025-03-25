class myarray2<T>
{
    T ary[] = (T[]) new Object[10];

    int length=0;
    public void append(T v)
    {
        ary[length++]=v;
    }
    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.println(ary[i]);
        }
    }
}
//Sub type type
class myarray3<T> extends myarray2<T>
//when we extend from generic class our class should made as generic otherwise we should mention the parameter...
{

}
//Bound type
class myarray4<E extends Number>
    //we can also extend a Number like classes so it will get (Int,float,double and others only from number class)
{

}


/*Bound type
interface A{}
class b implements A{}
class c implements A{}

Class myarray5 <T extends b>
{
}
we can also extent our own return class, for interface also we should use extends only..
*/

public class Generic4
{

    //Generic method
    static <E> void show(E[] list)
    //just before the return type we have to mentions it and we can use it as parameter as well inside the method
    {
        for(E x:list)
        {
            System.out.println(x);
        }
    }

    //Generic method with aruguments
    static <F> void show1(F...list1)
    //just before the return type we have to mentions it and we can use it as parameter as well inside the method
    // we also write bound type(<F extends Number>) in the method, so it allows only the given Number type alone..
    {
        for(F x:list1)
        {
            System.out.println(x);
        }
    }

    public static void main(String[] args)
    {
        String n []= {"Hi","Hello","Who","is","this"};
        show(new String[]{"Hi","Hello","Who","is","this"});
        //we can also pass an array like this to a method...

        show1(10,20,30,40);
        show1("Hi","Hello","Who","is","this");
        //we can also pass the variable arugunments instead of an array..
    }
}
