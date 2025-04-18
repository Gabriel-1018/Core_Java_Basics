
@SuppressWarnings("unchecked")
class myarray<T>
{
    T ary[]=(T[]) new Object[10];
    //we cannot create a object for the generic type t.so we are creating a object for object class then we are
    // typecasting to array..

    //The (T[]) is a type cast. Since T is a generic type, the compiler doesn't know what type T will be, so it can't directly create an array of T. But the cast is used to tell the compiler that "even though new Object[10] creates an array of Object,
    // I am confident that this array will actually hold elements of type T."
    int length=0;

    public void append(T v)
    {
        ary[length++]=v;
    }

    public void display()
    {
        for(int i=0;i<length;i++)
        {
            System.out.print(ary[i]+" ");
        }
    }
}



public class  Generic2
{
    public static void main(String[] args)
    {
        myarray <Integer>o= new myarray();
        //we have to create only object for a class but we have to include the diamond operator with datatype..
        //and we can use the same array for storing the other datatypes as well,it is the advantage of generic..
        o.append(25);
        o.append(35);
        o.append(45);

        o.display();


    }
}
