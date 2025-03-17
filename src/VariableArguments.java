import java.util.*;

public class VariableArguments
{
    static void Show(int ...x)
    {
        for(int i:x)
        {
            System.out.println(i);
        }
    }

    static void ShowList(int start,String ...s)
    {
      for(int i=0;i<s.length;i++)
      {
          System.out.println(start+"."+s[i]);
          start++;
      }
    }

    public static void main(String args[])
    {
        Show();
        Show(10,20,30);
        Show(new int[] {4,3,9,6,8,1,9});
        ShowList(5,"Jhon","Ahmed","Bhuvan","Kennu","Saran");
    }

}
