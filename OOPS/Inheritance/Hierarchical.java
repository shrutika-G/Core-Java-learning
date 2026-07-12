class A{
    void A(){
        System.out.println("class A");
    }
}
class B extends A{
    void B(){
        System.out.println("class B");
    }
}
class C extends A{
    void C(){
        System.out.println("class c");
    }
}
class D extends A{
    void D(){
        System.out.println("class D");
    }
}
public class Hierarchical{
    public static void main(String[] args){
        B b=new B();
        b.B();
        b.A();
        C c=new C();
        c.C();
        c.A();
    }
}