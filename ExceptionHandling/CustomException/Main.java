class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
public class Main{
    static void validateAge(int age)throws InvalidAgeException{
        if(age<18){
        throw new InvalidAgeException("not eligible");
        }
        System.out.println("Eligible");
    }

    public static void main(String[] args){
        try{
        validateAge(13);
        }
        catch(InvalidAgeException ex){
            System.out.println("caught exception"+ex);
        }
    }
}