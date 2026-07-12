class GrandFather{
    public void showG(){
        System.out.println("Grand father");
    }
}
class Father extends GrandFather{
    public void showF(){
        System.out.println("Father");
    }
}
class Son extends Father{
    public void showS(){
        System.out.println("Son");
    }
}
public class MultiLHier extends Father{
    public void showD(){
        System.out.println("daughter");
    }
    public static void main(String[] args){
        MultiLHier d=new MultiLHier();
        d.showD();
        d.showF();
        Son s= new Son();
        s.showS();
        s.showF();
        s.showG();
    }
}