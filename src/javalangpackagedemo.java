class myobject// when we define a class it will automatically extending from object class.
{
    public String toString()
    {
        return "Hello";
    }
    public int hashCode()
    {
        return 100;//when we override we take the responsiblity of genrating unique code...//for every object of this class will have 100 as the hashcode.
    }

    public boolean equals(Object o)
    {
        return (this.hashCode()==o.hashCode());
    }
}



public class javalangpackagedemo
{

    public static void main(String arg[])
    {
        Object o1 = new Object();
        Object o2=o1;
        System.out.println(o1);// when we print object it will call tostring method by deafault.
        System.out.println(o1.toString());
        System.out.println(o1.equals(o2));//here o1 & o2 both the refference are holding the same object.
        System.out.println(o2.hashCode());//this hashcode is given using internal address of an object. In java we can access internal address of an object.but hash code is generated using that address..

        myobject c= new myobject();
        myobject c1= new myobject();
        System.out.println(c.equals(c1));
        //this c & c1 are 2 different objects they are not refering to the same object, we can also compare the object based on hashcode..
       // c.//this myobject will defaultly extends object class so all the methods will be available..

    }
}
