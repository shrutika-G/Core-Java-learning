class Vehicle{
    void run(){
        System.out.println("vehicle running");
    }
}
class Bike extends Vehicle{

}
public class WithoutMethOverr{
    public static void main(String[] args){
        Bike b=new Bike();
        b.run();
    }
}