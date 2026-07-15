class Calculation{
    int add (int a,int b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
}
    public class ComPoly{
        public static void main(String[] args){
           Calculation c=new Calculation();
           System.out.println(c.add(1,2));
           System.out.println(c.add(1,2,3));
        }
    }