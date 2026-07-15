// Interface  
interface Animal {  
    void eat();  
    void sleep();  
}  
  
// Implementation class  
class Dog implements Animal {  
    public void eat() {  
        System.out.println("Dog is eating");  
    }  
    public void sleep() {  
        System.out.println("Dog is sleeping");  
    }  
}  
  
// Main class  
public class Main {  
    public static void main(String[] args) {  
        // Interface reference pointing to Dog object  
        Animal myAnimal = new Dog();  
        myAnimal.eat();  
        myAnimal.sleep();  
    }  
}  