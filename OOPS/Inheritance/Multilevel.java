class Animal{
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class ChildDog extends Dog{
    void weep(){
        System.out.println("weeping");
    }
}
public class Multilevel{
    public static void main(String[] args){
        ChildDog cd=new ChildDog();
        cd.weep();
        cd.bark();
        cd.eat();
    }
}