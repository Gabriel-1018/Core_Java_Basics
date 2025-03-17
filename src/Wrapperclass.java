public class Wrapperclass
{
    public static void main(String arg[])
    {
        //All of the below are Wrapper class....
        //Integer.......
        int a1=10;
        //i.//here i is not an object if it is object when we use "." we can see the methods under the object..here i is a primitive type of variable.
        Integer a=10;//we can directly assign the value.
        Integer b =new Integer(10);//this method of using the Constructor is not recommended.
        Integer b1 =Integer.valueOf(10);//We can use this method of creating the object..



        //Byte........
        Byte c=15;//We can diretly assing it.
        Byte d = Byte.valueOf("20");//This will create the object of the class byte by converting the String to the byte.
        //Byte e=Byte.valueOf(15);//we cannot directly use it since 15 is a integer literal..so we have follow like below
        Byte ee= 15;
        Byte e =Byte.valueOf(ee);


        //Short.......
        Short ff=13;//We can diretly assing it.
        Short f =Short.valueOf("123");
       // Short g = Short.valueOf(13);//Same like byte, we cannot directly use it since 13 is a integer literal..so we have follow like below
        Short g= Short.valueOf(ff);


        //Float......
        Float h =12.5f;
        Float i=Float.valueOf("234");
        Float j= Float.valueOf(h);

        //Double....
        Double k=12.5;
        Double l = Double.valueOf(k);
        Double m=Double.valueOf("123.56");

        //Character....
        Character n = Character.valueOf('h');

        //Boolean.....
        Boolean o= Boolean.valueOf("true");

        ///Wrapped explanation
        byte p= 15;//here p is a byte type variable.
        Byte pp =Byte.valueOf(p);//pp is a reference to an object(Just like a Box)
        //Unboxing
        Float q =Float.valueOf("123.5");
        float qqq=q.floatValue();//"qqq" is a primitve..here by using the object "q" we are calling the "floatvalue()" method and which gives the primitive value..It is called as unboxing..
        //Autounboxing
        float qq=q;//here object q is Converted into a primitive..we write only variable but it automatically call the "floatValue()"..It is autounboxing..

        //Boxing
        int r=25;
        Integer rr=Integer.valueOf(r);//This is boxing we are calling the method "valueof()" and puting the primitve varibale r..we are putting the wrapper over the r
        //Autoboxing
        int rrr=r;//here we write only variable but it automatically call the "Valueof()"..It is autoboxing..



    }
}
