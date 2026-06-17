public class GlobalVar{
     static int a=10;//static var
     int b=20;//non static var
     public static void main(String[] args){
        int a=30;//if local var and global var declared with same name then priority will e give to the local var
        System.out.println(a);
        GlobalVar gb=new GlobalVar();
        System.out.println(gb.b);
     }
}