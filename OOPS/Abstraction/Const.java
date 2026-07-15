abstract class Bike{
    Bike(){
        System.out.println("Bike is created");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear change");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("running");
    }
}
public class Const{
    public static void main(String[] args){
        Bike b=new Honda();
        b.run();
        b.changeGear();
    }
}