public class ObjPass{
    void m(ObjPass obj){
        System.out.println("method invoked");
    }
    void p(){
        m(this);
    }
    public static void main(String[] args){
        ObjPass m=new ObjPass();
        m.p();
    }
}