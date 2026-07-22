import java.lang.ArithmeticException;
public class Main{
    static void validateAge(int age)throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("not eligible for voting");
        }
        System.out.println("eligible for voting");
    }
    public static void main(String[] args){
        try{
            validateAge(13);
        }
        catch(ArithmeticException e){
            System.out.println("exception caught"+e.getMessage());
        }
    }
}