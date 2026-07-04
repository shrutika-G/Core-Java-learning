public class GradingSystem{
    public static void main(String[] args){
        int marks=89;
        if(marks<35){
            System.out.println("fail");
        }
        else if(marks>=35&&marks<55){
            System.out.println("C");
        }
        else if(marks>=55&&marks<70){
            System.out.println("B");
        }
        else if(marks>=70&&marks<90){
            System.out.println("A");
        }
        else if(marks>=90&&marks<=100){
            System.out.println("A+");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}