import java.lang.ArithmeticException;
public class UncheckedExce{
    public static void validateAge(int age){
        if(age<18){
            throw new ArithmeticException("not eligible for voting");
        }
        else{
            System.out.println("eligible for voting");
        }
    }
    public static void main(String[] args){
        validateAge(13);
        System.out.println("rest of code");
    }
}