class A{
    A(){
        this(10);
        System.out.println("hello a");
    }
    A(int x){
        System.out.println(x);
    }

}
public class ParaCon{
    public static void main(String[] args){
        A a=new A();
    }
}