public class Simple{
    public static void sum(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
    void sum1(){
        int a=2;int b=4;
        System.out.println(a+b);
    }
    public static void main(String args[]){
        Simple s=new Simple();
        sum();//calling static method
        s.sum1();//calling non static method
    }
}