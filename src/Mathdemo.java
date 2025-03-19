public class Mathdemo
{
    public static void main(String arg[])
    {
        /*System.out.println("Absolute");
        System.out.println(Math.abs(-123));//gives values without the sign..


        System.out.print("Absolute :");
        System.out.println(StrictMath.abs(-123));


        System.out.print("Cube Root :");
        System.out.println(Math.cbrt(27));


        System.out.print("Exact Decrement :");
        // System.out.println(Math.decrementExact(Integer.MIN_VALUE));//This will decrement one value at the same time it will throw exception if we decrement the min integer value...

        int i=Integer.MIN_VALUE;//to get the minimum integer value..
        i--;
        System.out.println(i);


        System.out.print("Exponent value in Floating Point Rep. :");
        System.out.println(Math.getExponent(123.45));//need to study..




        System.out.print("Round Division :");//like integer division.. gives only the rounded value..
        System.out.println(Math.floorDiv(50, 9));


        System.out.print("e power x :");
        System.out.println(Math.exp(1));//Math class methods may or my not use the Strictmath class, but it will use the oven native method...


        System.out.print("e power x :");
        System.out.println(StrictMath.exp(1));


        System.out.print("Log base 10 :");
        System.out.println(Math.log10(100));


        System.out.print("Maximum :");
        System.out.println(Math.max(100, 50));


        System.out.print("Tan :");
        System.out.println(Math.tan(45*Math.PI/180));


        System.out.print("Convert to Radians :");
        System.out.println(Math.toRadians(90));

        System.out.print("Convert to Degree :");//Arc tan
        System.out.println(Math.toDegrees(Math.atan(1)));


        System.out.print("Convert To Degree :");//Hyperbolic tan
        System.out.println(StrictMath.toDegrees(StrictMath.tanh(1)));*/



        System.out.print("Random :");//gives random number between zero to 1.. it gives the float number..
        System.out.println(Math.random()*100);


        System.out.print("Power :");
        System.out.println(Math.pow(2, 3));


        System.out.print("Excact Product :");//If we multiply 2 big integers if the output is more than the integer value then it will become negative..This exactmultiply means if the result is within the range it gives the result otherwise it throws exception..
        System.out.println(Math.multiplyExact(100, 200));

        System.out.print("Next Float Value :");
        System.out.println(Math.nextAfter(12.5, 13));

        System.out.print("Next Float Value :");
        System.out.println(Math.nextAfter(12.5, 11));//If we give previous value in the 2nd value..then this will give result previous  number

    }
}
