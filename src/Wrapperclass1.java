public class Wrapperclass1
{
    public static void main(String arg[])
    {
        int m1=15;
        Integer m2= m1;
        Integer m3=15;
        System.out.println(m2.equals(m3));//just like in object class it is checking whether the both reference are holding the same object..here it will check for the value

        Integer a = Integer.valueOf("123");
        Integer b= Integer.valueOf("1010",2);//here it is printing the binary form of 10
        Integer c = Integer.valueOf("11111", 2);
        Integer d = Integer.valueOf("A7", 16);

        Integer e = Integer.decode("0xA7");//this decode is similar to the value of method(String, raddix)
        System.out.println(e);

        System.out.println(Integer.parseInt("1234"));//This is converting String into integer..same as valueof()
        //while passing the string it should be in the proper number format...if we give anything like("asffa123" ,"0xA7") then it will give number format Exception...
        System.out.println(Integer.reverseBytes(128));
    }
}
