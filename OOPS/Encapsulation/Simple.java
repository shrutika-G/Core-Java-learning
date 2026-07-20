public class Simple{
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args){
        Simple s=new Simple();
        s.setName("shru");
        System.out.println(s.getName());
    }
}