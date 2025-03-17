
class Account
{
    private int accno;
    private String name;
    private String address;
    private String phno;
    private String DOB;
    protected long balance;

    public int getAccno() {return accno;}
    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getPhno() {return phno;}
    public String getDOB() {return DOB;}

    public void setphno(String phno){this.phno=phno;}
    public void setAddress(String address){this.address=address;}

    public Account(int accno, String name, String address, String phno,String DOB)
    {
        this.accno=accno;
        this.name=name;
        this.address=address;
        this.phno=phno;
        this.DOB=DOB;
        balance=0;
    }
    public Account()
    {

    }

}

class SavingsAccount extends Account
{
    public void deposit(long d)
    {
        balance +=d;
    }
    public void Withdraw(long w)
    {
        balance-=w;

    }
}


class LoanAccount extends Account
{
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}




public class BankAccount
{
    public static void main(String arg[])
    {
       Account c = new Account(2115326,"Regex","1/22, paul hauston, Trichy","8346463436","18/09/96");

    }
}
