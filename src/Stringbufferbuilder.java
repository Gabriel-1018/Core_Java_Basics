public class Stringbufferbuilder
{
    public static void main(String arg[])
    {
        //String
        String s="Hello";
        String s1 = new String("Hello");
        s.concat(" world");// Since String is immutable it cannot be modified but.. the Stringbuilder and String Buffer can be modified..
        s1.concat(" World");// Since String is immutable it cannot be modified but.. the Stringbuilder and String Buffer can be modified..
        System.out.println(s);
        System.out.println(s1);

        //StringBuffer
        //String builder is Thread safe, it will not allow two threads to enter inside the same method at same time that is thread safe
        // so it will be little slower so we use
        //when we want threads to be controlled by String object then go for string buffer...
        StringBuffer s2 = new StringBuffer("Hello");//
        s2.append("World");
        System.out.println(s2);


        //StringBuilder
        //It is same as String buffer, But it will allow more than one thread to enter inside or call same methods..
        //it is faster..
        StringBuilder s3 = new StringBuilder("Hello");
        s3.append("World");
        System.out.println(s3);

    }
}
