class Vehicle{
    void run(){
        System.out.println("vehicle running");
    }
}
class Bike extends Vehicle{
    void run(){
        System.out.println("Bike running");
    }
}
public class WithMethOverr{
    public static void main(String[] args){
        Bike b=new Bike();
        b.run();
    }
}