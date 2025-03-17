class Student
{
    public int roll;
    public String name;
    public String Course;
    public int m1,m2,m3;

    public int total()
    {
        return m1+m2+m3;
    }
    public float average()
    {
        return (float)total()/3;
    }
    public char grade()
    {
        if(average()>60)
            return 'A';
        else
            return 'B';
    }
    public String toString()
    {
        return "Name:"+name+"\n"+"Roll number: "+roll+"\n"+"Course: "+Course;
    }
}


public class ClassStudent
{
    public static void main(String arg[])
    {
        Student c =new Student();
        c.roll=2115326;
        c.name="Gabriel I";
        c.Course="Physics";
        c.m1=56;
        c.m2=65;
        c.m3=79;

        System.out.println("Total marks occurred: "+ c.total()+"/300");
        System.out.println("Average is: "+c.average());
        System.out.println("Grade is:"+c.grade());
        System.out.println("Student Details: \n"+c);
    }
}
