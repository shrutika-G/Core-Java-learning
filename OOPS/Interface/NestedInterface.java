// Outer interface  
interface Printable {    
    void print();    
      
    // Nested interface  
    interface MessagePrintable {    
        void msg();    
    }    
}    
  
// Class implementing the outer interface  
class Printer implements Printable {    
    public void print() {    
        System.out.println("Printing document...");    
    }    
}    
//Class implementing the nested interface  
class MessagePrinter implements Printable.MessagePrintable {    
    public void msg() {    
        System.out.println("Printing message...");    
    }    
}    
  
// Main class to test the implementation  
public class NestedInterface {    
    public static void main(String[] args) {    
        Printable p = new Printer();    
        p.print();    
  
        Printable.MessagePrintable mp = new MessagePrinter();    
        mp.msg();    
    }    
}    