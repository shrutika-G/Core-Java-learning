interface Printable{    
void print();    
}    
interface Showable extends Printable{    
void show();    
}    
class Example2 implements Showable{    
public void print(){System.out.println("Hello");}    
public void show(){System.out.println("Welcome");}    
    
public static void main(String args[]){    
Example2 obj = new Example2();    
obj.print();    
obj.show();    
 }    
}    