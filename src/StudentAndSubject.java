
/*class Students
{

    private int rollno;
    private String name;
    private String dept;
    private String Subject [];

    public int getroll() {return rollno;}
    public String getName() { return  name;}
    public String getDept() {return dept;}
    public String [] getSubject(){return Subject;}
    public Students(String name,String dept)
    {

        this.name=name;
        this.dept=dept;
    }

    public void setDept(String dept) {this.dept = dept;}

    public void setSubject(String...s)
    {
        for(int i=0;i<s.length;i++)
        {
            this.Subject[i]= s[i];
        }

    }


    public String toString()
        {

        }

}*/

class Subject
{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtains;

    public Subject(String subID,String name,int maxMarks)
    {
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
    }

    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtains(){return marksObtains;}

    public void setMaxMarks(int mm)
    {
        maxMarks=mm;
    }

    public void setMarksObtain(int m)
    {
        marksObtains=m;
    }

    boolean isQualified()
    {
        return marksObtains>=maxMarks/10*4;
    }

    public String toString()
    {
        return"\n SubjectID: "+subID+"\n Name "+name+"\n MarksObtained "+marksObtains;
    }
}

public class StudentAndSubject
{
    public static void main(String arg[])
    {

       /* Students subs[] = new Students[3];
        subs[0]= new Students("Shiva","Mech");
        subs[1]=new Students("Gabriel", "Mech");
        subs[2]= new Students("Kishore","Mech");



        for(Students s:subs)
        {
            System.out.println(s);
        }*/

        Subject sub[]=new Subject[3];
        sub[0]=new Subject("s101","DS",100);
        sub[1]=new Subject("s102","Algorithms",100);
        sub[2]=new Subject("s103","Operating Systems",100);

        for(Subject s:sub)
            System.out.println(s);


    }
}
