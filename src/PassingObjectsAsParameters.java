import java.util.*;


public class PassingObjectsAsParameters
{
    void change(int a[],int index,int value)
    {
        a[index]=value;
    }
    public static void main(String args[])
    {
        int a[] ={2,5,9,3,6,1,7};
        PassingObjectsAsParameters mp =new PassingObjectsAsParameters();
        mp.change(a,2,45);
        for (int x:a)
        {
            System.out.print(x+",");
        }
        System.out.println(" ");
    }

}
