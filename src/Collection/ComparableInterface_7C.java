package Collection;


import java.util.TreeSet;

class point implements Comparable
{
    int x;
    int y;
    public point(int x, int y)
    {
        this.x =x;
        this.y =y;
    }
    public String toString()
    {
        return x+"and"+y;
    }
    //I have to understand the below code part
    @Override
    public int compareTo(Object o)
    {
        point p=(point)o;

        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
            if(this.y<p.y)
                return -1;
            else if(this.y>p.y)
                return 1;
            else
                return 0;

        }
    }
}

public class ComparableInterface_7C
{
    public static void main(String arg[])
    {
        TreeSet<point> ts= new TreeSet<>();
        //Tree set is a sorted set we should arrange the elements in increasing order.
        // TreeSet class doesn't know about sorting...without using the comparable interface Java doesn't know how to compare two point objects (for sorting, ordering, etc.).
        //so we should define which one is smaller and which one is larger..so that tree will sort accordingly.

        // whenever we go for set and sorted set we should implement comparable interface
        ts.add(new point(1,1));
        ts.add(new point(5,5));
        ts.add(new point(5,2));

        System.out.println(ts);

    }
}
