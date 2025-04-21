package Collection;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizer_13C
{
    public static void main(String arg[]) throws  Exception
    {
        /*
        String data="name=vijay;address=delhi;country=India;dept=cse";
        //A delimiter is a character (or set of characters) that separates parts of a string into meaningful chunks, or tokens.
        StringTokenizer st= new StringTokenizer(data,"=;");
        //The ; (semicolon) separates each key-value pair.
        //The = (equals sign) separates the key from its value.
        // we can give any delimiter (\n,;,:," ")
        String s;
        while (st.hasMoreTokens())
        // we can use hasmoreTokens or Hasmorelements, both are same.
        {
            s=st.nextToken();
            System.out.println(s);
        }*/

        FileInputStream fi= new FileInputStream("E:\\Java\\Inputoutputfiles\\MYData.txt");
        byte b[]= new byte[fi.available()];
        fi.read(b);
        String v= new String(b);
        StringTokenizer sn= new StringTokenizer(v,"=");
        String t;
        ArrayList<String> as= new ArrayList<>();
        while(sn.hasMoreTokens())
        {
            t=sn.nextToken();
            as.add(t);
        }
        System.out.println(as);
        // we are taking data from a txt file and we are tokenizing using the tokenizer and we are storing it a String and then storing it in aa Array List.

    }
}
