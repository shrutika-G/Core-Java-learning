public class Palindrome{
    public static void main(String[] args){
        int n=121;
        int temp=n;
        int rev=0;
        while(temp>0){
            int last=temp%10;
            rev=rev*10+last;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("Give number is palindrome");
        }
        else{
            System.out.println("it is not palindrome");
        }
    }
}