public class Factorial{
    public static void main(String[] args){
        int fact=1;
        int i=1;
        do{
            fact=fact*i;
            i++;
        }while(i<=5);
        System.out.println(fact);
    }
}