class atm
{
    synchronized public void checkbalance(String name)// Here without Sync both harish and Saran will access this shared object atm. once we use sync then it is accessed one after another
    {
        System.out.print(name +" is checking the balance...");
        try {Thread.sleep(2000);}catch(Exception e){};
        System.out.println(name+"'s Balance");

    }
    synchronized public void withdraw(String name, int n)
    {
        System.out.print(name+"is withdrawing...");
        try {Thread.sleep(2000);}catch(Exception e){};
        System.out.println("Withdrawn: "+n);
    }
}

class customer2 extends Thread
{
    atm a;
    String name;
    int amount;

    public customer2(String name, int amount, atm at)
    {
        this.name=name;
        this.amount=amount;
        a=at;
    }

    public void run()
    {
        a.checkbalance(name);
        a.withdraw(name,amount);
    }
}



public class Synchronisationdemo2
{
    public static void main(String arg[])
    {
        atm a = new atm();
        customer2 c = new customer2("Harish", 25000,a);
        customer2 c2 = new customer2("Saran",5000,a);
        c.start();
        c2.start();
    }

}
