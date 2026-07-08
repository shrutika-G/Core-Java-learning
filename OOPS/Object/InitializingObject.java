class student{
    int id;
    String name;
}
//object initializing through reference variable
public class InitializingObject{
    public static void main(String aargs[]){
        Student s1=new Student();
        s1.id=12;
        s1.name="karan";
        System.out.println(s1.id+" "+s1.name);
    }
}