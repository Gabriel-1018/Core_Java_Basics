import java.util.*;

class student2
{
    private String rollno;
    private static int count=1;// here without static count is always 1

    private String generateRollno()
    {
        Date d = new Date();
        String rn = "Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }
    public student2() //this constructor is made as public and so if a object is created then the generateRollno() method is called.
    {
        rollno=generateRollno();
    }
    public String getRollno()
    {
        return rollno;
    }
}



public class Staticexample
{
    public static void main(String arg[])
    {
        int n=5;
        int i=1;
        while(i<=n)
        {
            student2 k = new student2();
            System.out.println(k.getRollno());
            i++;
        }
    }
}
