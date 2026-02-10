public class Widening {
    int a=10;
    double d=a;
    public static void main(String[] args) {
        Widening w=new Widening();
        System.out.println(w.d);
        int a=5;
        System.out.println(a);
        double b= a;
        System.out.println(b);
        double c= 5;
        System.out.println(c);
    }
}
