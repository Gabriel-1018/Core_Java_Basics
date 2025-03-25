class data<T>
    //<T> to make the class as generic...
{
    private T obj;
    //this class is capabile of storing one object... but anytype of object can be stored..
    public void setdata(T v)
            //getting the value(V) for template(T) type generic
    {
        obj=v;
    }

    public T getdata()
    {
        return obj;//returing the generic type(T)
    }
}



public class Generic1
{
    public static void main(String[] args)
    {
        data <String> d=new data<>();
        //new Data<>(): This is the constructor call that creates a new instance of the Data class.

        //Diamond operator (<>): In Java, you can use the diamond operator (<>) to let the compiler infer the type argument.
        //Since the variable d is already declared as Data<String>, the compiler knows that the type for T is String, so you don't
        // need to explicitly write new Data<String>(). The diamond operator
        // tells the compiler to infer the type from the left-hand side (which is Data<String>).
         d.setdata("Hello");
         System.out.print(d.getdata());

    }
}
