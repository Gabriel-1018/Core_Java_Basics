public class Wrapperclass2
{
    public static void main(String arg[])
    {
        //Float methods
        float a= 12.5f;
        Float b= 12.5f/0;//For float it will not cause division by Exception

        System.out.println(b.isInfinite());//this is one of the method available for float to check if the value is infinite..
        System.out.println(b==Float.POSITIVE_INFINITY);//checking the positive infinity..give boolean value as the result..

        Float c =(float)Math.sqrt(-1);//Typecasting the double to float..and squareroot of -1 is an imaginary number
        System.out.println(c.isNaN());//isnotanumber method..to check if a number is number or not..

        //Character
        Character d='A';
        //Character.//There are many number of methods available under Character and every other clasess..

    }
}
