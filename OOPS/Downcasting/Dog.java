class Animal{}
class Dog extends Animal{
    static void method(Animal a){
        if(a instanceof Animal){
            Dog d=(Dog)a;
            System.out.println("Downcasting performed");
        }
    }
    public static void main(String[] args){
        Animal a= new Dog();
        Dog.method(a);
    }
}