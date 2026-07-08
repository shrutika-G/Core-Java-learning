class Student{
    int id;
    String name;
    void insertRec(int i,String n){
        id=i;
        name=n;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}
    public class IniObjMethod{
    public static void main(String[] args){
        Student s1=new Student();
        s1.insertRec(1,"karan");
          
        s1.display();
    }
}