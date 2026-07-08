class Student{
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    void display(){
        System.out.println(id+" "+name);
    }
}
    public class IniObjCon{
        public static void main(String[] args){
            Student s1=new Student(1,"karan");
            s1.display();
        }
    }