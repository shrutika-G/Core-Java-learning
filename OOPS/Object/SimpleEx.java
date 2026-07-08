public class SimpleEx{
    int a=10;
    void show(){
        System.out.println("Welecome");
    }
    public static void main(String args[]){
        SimpleEx s1=new SimpleEx();
        s1.show();
        System.out.println(s1.a);
    }
}