class HumanBody{
    public void human(){
        System.out.println("human");
    }
}
interface Male{
    public void show();
}
interface Female{
    public void show();
}

public class SinglMulti extends HumanBody implements Male,Female{
    public void show(){
        System.out.println("implemented show method of male and femal");
    }
    public void display(){
        System.out.println("hybrid inheritanc");
    }
    public static void main(String[] args){
        SinglMulti ob=new SinglMulti();
        ob.show();
        ob.display();
    }
}