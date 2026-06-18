public class TypeCasting{
    public static void main(String[] args){
       //Implicit Typecasting
        int a=10;
        double d=a;
        System.out.println(a);
        System.out.println(d);
        //Explicit Typecasting-we use typecast operator
        double b=10.6;
        int e=(int)b;
        System.out.println(e);

        //calculate sum of different datatype
        byte f=10;
        int g=20;
        short h=30;
        double sum=f+g+h;
        System.out.println(sum);
    }
}