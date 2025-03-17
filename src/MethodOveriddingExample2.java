
class Car
{
    public void start(){System.out.println("Car Started");}
    public void accelerate(){System.out.println("Car is Accelerated");}
    public void changeGear(){System.out.println("Car Gear Changed");}

}

class LuxaryCar extends Car
{
    public void changeGear(){System.out.println("Automatic Gear");}
    public void openRoof(){System.out.println("Sun Roof is Opened");}

}


public class MethodOveriddingExample2
{
    public static void main(String args[])
    {
        Car c =new LuxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();
        //c.openRoof(); Because super class reference can hold only it's method not the sub class methods. but it can hold both the class objects.

    }
}
