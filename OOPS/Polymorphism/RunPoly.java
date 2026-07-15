class Bank{
    float getinterest(){
       return 0;
    }
}
class SBI extends Bank{
    float getinterest(){
       return 8;
    }
}
class ICICI extends Bank{
    float getinterest(){
       return 7;
    }
}
class AXIS extends Bank{
    float getinterest(){
       return 5;
    }
}
public class RunPoly{
    public static void main(String[] args){
        Bank b;
        b=new SBI();
        System.out.println(b.getinterest());
        b=new ICICI();
        System.out.println(b.getinterest());
        b=new AXIS();
        System.out.println(b.getinterest());
    }
}