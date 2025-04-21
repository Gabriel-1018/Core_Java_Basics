package Collection;
import java.util.BitSet;

public class BitSet_14C
{
    public static void main(String arg[])
    {
        BitSet bs= new BitSet();
        bs.set(0);
        //Initially, all bits in a new BitSet are set to false (or 0). This sets the bit at index 0 to true (or 1).
        bs.set(2);
        bs.set(4);
        bs.set(6);
        bs.set(8);

        BitSet bs1= new BitSet();
        bs1.set(1);
        bs1.set(2);
        bs1.set(5);
        bs1.set(7);
        bs1.set(8);

        //bs.or(bs1);
        bs.flip(0,bs.length());
        //This method inverts (flips) the bits from fromIndex (inclusive) to toIndex (exclusive).
        //true (1) becomes false (0)
        //false (0) becomes true (1)

        System.out.println(bs);
    }
}
