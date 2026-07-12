class A{
    void m(){
        System.out.println("hello m");
    }
    void n(){
        //this.m();
        m();
    }

}
public class ThisMethod{
    public static void main(String[] args){
        A a=new A();
        a.n();
    }
}