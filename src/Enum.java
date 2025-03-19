enum dept//enums are defined just like classes..
{
    CS,IT,MECH,ECE,//every identifier we declar under enum is s final and static(properties of the class no need to create object for it..)
    // Same like interface these are public static final...
    //we don't need to assign a value the identifier itself a value..
    //since it is final we should give all this indentifiers in capitial....

    CIVIL("John","Block A"),ICE("Smith","Block B");//Identifiers should be declared initially..
    String head;// this string stores all the values of the identifiers...
    String location;


    private dept()//Constructor are called when the enum are loaded(Same like constructor will be called when the classes are loaded..)
    //constructor must be private...constructors are called for each constant is loaded in enum...
    {
        System.out.println(this.name());
    }

    private dept(String name, String location)//this is overridded constructor for the civil and ICE identifier... in ENUm Constructors are for each identifiers..
    {
        this.head=name;
        this.location=location;
    }

    public void display()
    {
        System.out.println(this.name()+" "+this.ordinal());
    }


    //we can also give some values to the constant..but for that we need a parametarised constructor to get that values..
}

public class Enum
{
    public static void main(String arg[])
    {
        /*dept d=dept.CS;//d is a variable..
        dept e = dept.MECH;
        System.out.println(d.ordinal());
        System.out.println(e.ordinal());
        System.out.println(dept.IT);//we can also call enum identifiers directly ...

        System.out.println(dept.valueOf("IT"));// it will check the enum and give if it has anyconstant values like the string that we given as input..

        dept list []= dept.values();
        for(dept x:list)
        {
            System.out.println(x);
        }*/
        dept d=dept.CIVIL;//whenever we declare a enum we should aasign a constant to it..
        System.out.println(d.head+" "+ d.location);
        dept e = dept.ICE;
        System.out.println(e.head+" "+e.location);

    }
}
