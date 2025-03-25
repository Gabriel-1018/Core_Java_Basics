
@SuppressWarnings("unchecked")
class myarray6<T>
{
    private T List[]= (T[]) new Object[10];
    int length=0;

    void setdata(T v)
    {
        List[length++]=v;
    }

    void getdata()
    {
        for(int i=0;i<length;i++)
        {
            System.out.print(List[i]);
        }

    }

}

interface k{}
class l implements k{}
class m implements k{}

public class Generic5
{
    static void fun(myarray6<? extends Number> obj)
    //this ? is similar to (myarray6 obj) does nothing that is unbounded wildcard. but it can be used
    // to define a generic for an argument
    {
        obj.getdata();
    }

    static void fun1(myarray6<? super m> obj)
    //this ? is similar to (myarray6 obj) does nothing that is unbounded wildcard. but it can be used
    // to define a generic for an argument
    {
        obj.getdata();
    }

    public static void main(String[] args)
    {
        myarray6 <String> v= new myarray6<>();
        v.setdata("Hi");
        v.setdata("Hello");

        myarray6<Integer> c = new myarray6<>();
        c.setdata(10);
        c.setdata(18);
        fun(c);

        myarray6<l> d = new myarray6<>();
        //fun1(d);//it will give error since the method accept only the m and super of m k..

        myarray6<m> f= new myarray6<>();
        fun1(f);
    }
}
