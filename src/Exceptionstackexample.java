class stackoverflow extends  Exception
{
    public String toString()
    {
        return "Stackoverflow";
    }
}

class stackunderflow extends Exception
{
    public String toString()
    {
        return "Stackunderflow";
    }
}

class stack
{
    private int a[];
    private int top =-1;
    private int size;

    public stack(int s)
    {
        a=new int[s];
        size=s;
    }
    public void push(int e)throws stackoverflow
    {
        if(top==size-1)
        {
            throw  new stackoverflow();//after throwing exception other below lines in the program will not executed.
        }
        top++;
        a[top]=e;
    }
    public int pop(int f) throws stackunderflow
    {
        int top1=size-1;
        int x;
        if(top1==-1)
        {
            throw new stackunderflow();
        }
        x=a[top1];
        top1--;
        return x;

    }
}



public class Exceptionstackexample
{
    public static void main(String arg[])
    {
        stack n= new stack(5);
        try
        {
            n.push(2);
            n.push(1);
            n.push(7);
            n.push(4);
            n.push(5);
            n.push(9);
        }
        catch (stackoverflow e)
        {
            System.out.println(e);
        }

    }
}
