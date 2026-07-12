class Employee{
    float sal=34567.98f;
}
class Programmer extends Employee{
    int bonus=2000;
}

public class Simple{
    public static void main(String[] args){
        Programmer p=new Programmer();
        System.out.println(p.bonus);
        System.out.println(p.sal);
    }
}