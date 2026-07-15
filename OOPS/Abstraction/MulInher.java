abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Rectangle");
    }
}

public class MulInher{
    public static void main(String[] args){
        Shape s=new Rectangle();
        s.draw();
    }
}