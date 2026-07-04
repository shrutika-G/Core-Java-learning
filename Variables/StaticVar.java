public class StaticVar{
    static int age;
    public static void main(String[] args){
        StaticVar s1=new StaticVar();
        StaticVar s2=new StaticVar();
        s1.age=23;
        s2.age=24;
        StaticVar.age=25;
        System.out.println("s1 age is:"+s1.age);
        System.out.println("s2 age is:"+s2.age);

    }
}