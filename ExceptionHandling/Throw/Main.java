class Main{
    public static void main(String[] args){
        int age=15;
        if(age<18){
            throw new ArithmeticException("not eligible for voting");
        }
        System.out.println("eligable for voting");
    }
}