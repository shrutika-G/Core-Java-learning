public class Fibonacci{
    public static void main(String[] args){
        int a=0;
        int b=1;
        int fib;
        for(int i=2;i<=5;i++){
            fib=a+b;
            System.out.println(fib);
            a=b;
            b=fib;
        }
    }
}