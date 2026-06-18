public class RangeOfDataype{
    public static void main(String[] args){
        System.out.println("byte value:"+Byte.MIN_VALUE +" to "+Byte.MAX_VALUE);
        System.out.println("Short value:"+Short.MIN_VALUE +" to "+Short.MAX_VALUE);
        System.out.println("Int value:"+Integer.MIN_VALUE +" to "+Integer.MAX_VALUE);
        System.out.println("Long value:"+Long.MIN_VALUE +" to "+Long.MAX_VALUE);
        // Why is Float.MIN_VALUE positive?
        //Because in Java, MIN_VALUE for floating-point types represents the smallest positive non-zero value that can be represented, not the most negative value.
        System.out.println("Float value:"+Float.MIN_VALUE +" to "+Float.MAX_VALUE);//smallest positive non-zero value.
        System.out.println("Double value:"+Double.MIN_VALUE +" to "+Double.MAX_VALUE);//smallest positive non-zero value.
        //If we want negative value
        System.out.println(-Float.MAX_VALUE);
        System.out.println(-Double.MAX_VALUE);
         System.out.println(-Float.MIN_VALUE);
        System.out.println(-Double.MIN_VALUE);
        System.out.println("Char value:"+Character.MIN_VALUE +" to "+Character.MAX_VALUE);
        System.out.println("Boolean value:true or false");
    }
}