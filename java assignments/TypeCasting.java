public class TypeCasting
{
    public static void main(String args[])
    {
        double d=8.76;
        int i=(int)d;
        System.out.println("DOUBLE VALUE IS:" +d);
        System.out.println("AFTER CONVERT DOUBLE TO INT VALUE IS:"+ i);
        
        
        float f = 130.5f;
        byte b = (byte) f;
        System.out.println("Float value: " + f);
        System.out.println("After casting to byte: " + b);

        long l = 32768;
        short s = (short) l;
        System.out.println("Long value: " + l);
        System.out.println("After casting to short: " + s);
    
    }
}