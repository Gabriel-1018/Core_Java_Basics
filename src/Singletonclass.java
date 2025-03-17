class coffeeMachine
{
    private float coffeqty;
    private float waterqty;
    private float milkqty;
    private float sugarqty;

    static private coffeeMachine n = null;// a private reference of coffee machine is created. here it is given as static because it is accessed by a static getinstance method and it is private so it should not be directly accessible but indirectly accessible if getinstances is returning it's reference
    private coffeeMachine()
    {
        coffeqty=1;
        waterqty=1;
        milkqty=1;
        sugarqty=1;
    }

    public void fillwater(float qty)
    {
        waterqty=qty;
    }
    public void fillsugar(float qty)
    {
        sugarqty=qty;
    }
    public float getcoffee()
    {
        return 5.67f;
    }
    static coffeeMachine getInstance()// getinstance is a default method available
    {
        if (n==null)
        {
            n = new coffeeMachine();
        }
        return n;
    }

}

class watercan
{
    static int count=1;
    static watercan n = null;

    static watercan getInstance()
    {
        if(count<=5)
        {
            n = new watercan();
            count++;
        }
        return n;
    }

    static void totalobjects()
    {
        System.out.println(count);
    }
}


public class Singletonclass
{
    public static void main(String arg[])
    {
       // coffeeMachine m = new coffeeMachine();//here we cannot create a object for coffee machine because it is created only once inside the class
        coffeeMachine m1 =coffeeMachine.getInstance();
        coffeeMachine m2 =coffeeMachine.getInstance();
        coffeeMachine m3 =coffeeMachine.getInstance();
        System.out.println(m1+" "+m2+" "+m3+" ");
        if(m1==m2 && m1==m3)// here all the 3 references are same..because they are referring to same object..if different objects are created then reference should not be same.
        {
            System.out.println("same");
        }


        watercan w1 = watercan.getInstance();
        watercan w2 =watercan.getInstance();
        watercan w3 =watercan.getInstance();
        watercan w4 = watercan.getInstance();
        watercan w5 = watercan.getInstance();
        watercan w6 = watercan.getInstance();// here w6 is having the same object of w5


        System.out.println(w1+" "+w2+" "+w3+" "+w4+" "+w5+" "+w6);
        watercan.totalobjects();
    }
}
