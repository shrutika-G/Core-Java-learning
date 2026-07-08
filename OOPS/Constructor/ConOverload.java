class Student{
    int id;
    String name;

    Student(int id){
        this.id=id;
    }
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);
    }
}

class ConOverload{
    public static void main(String args[]){
    Student s1=new Student(1);
    Student s2=new Student(2,"karan");
    s1.display();
    s2.display();
    }
}