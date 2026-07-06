public class PrimeNumber{
    public static void main(String[] args){
        int n=5;
        boolean isPrime=true;
        if(n<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    isPrime=false;

                }
            }
        }
        if(isPrime){
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("not a prime number");
        }

    }
}