
class TV
{
    public void switchON(){ System.out.println("TV is Switched ON"); }

    public void changeChannel() { System.out.println("TV Channel is Changed "); }

}

class SmartTV extends TV
{
    @Override
    public void switchON(){ System.out.println("Smart TV is Switched ON"); }

    @Override
    public void changeChannel() { System.out.println("SmartTV Channel is Changed "); }

    public void browse(){ System.out.println("Smart Tv Browsing"); }

}

public class MethodOveriddingExample1
{
    public static void main(String arg[])
    {
        TV t =new SmartTV();

        t.switchON();
        t.changeChannel();
        //t.browse is not possible. Because super class reference can hold only it's method not the sub class methods. but it can hold both the class objects.
    }
}
