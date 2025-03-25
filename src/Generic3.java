class myarray1<T>
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



public class Generic3
{
    public static void main(String[] args)
    {
        myarray1 c = new myarray1();
        //here we are not giving any generic paramenters, by default it will support any type of object.
        //if any parameters are not given it will become objects..

        // we can also pass multiple parameters...

        c.append("Hello");
        c.append(10);
        c.append("bye");

        c.display();
    }
}
