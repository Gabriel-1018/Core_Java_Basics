interface member
{
    void callback();
    member mem[]= new member[100];
}

class store
{
    //array of member objects;
    int count = 0;
    void register(member m)
    {
        member.mem[count++]=m;
    }

    void offer()
    {
        for (int i = 0; i<count; i++)
        {
            member.mem[i].callback();
        }
    }
}

class customer1 extends store implements member
{
    String name;
    customer1(String name)
    {
        this.name=name;
    }

    @Override
    public void callback()
    {System.out.println("Calling the customer"+name);}
}

public class InterfaceExample2
{
    public static void main(String arg[])
    {
        store c = new store();
        customer1 c1 = new customer1("John");
        customer1 c2 = new customer1("Smith");
        c.register(c1);
        c.register(c2);
        c.offer();
    }
}
