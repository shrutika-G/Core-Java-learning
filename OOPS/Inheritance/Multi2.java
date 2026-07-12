interface Marks {  
    void showMarks();  
}  
// Top-level class in multilevel inheritance  
class Lecturer {  
    void showLecturer() {  
        System.out.println("Lecturer: Dr. Smith");  
    }  
}  
// Mid-level class in multilevel inheritance  
class Department extends Lecturer {  
    void showDepartment() {  
        System.out.println("Department: Computer Science");  
    }  
}  
// Bottom-level class using both multilevel and multiple inheritance  
class Student extends Department implements Marks {  
    void showStudent() {  
        System.out.println("Student: Alice");  
    }  
    // Implementing method from Mark's interface  
    public void showMarks() {  
        System.out.println("Marks: 85%");  
    }  
}  
// Main class to run the program  
public class Multi2 {  
    public static void main(String[] args) {  
        Student student = new Student();  
        // Multilevel inheritance  
        student.showLecturer();     // From Lecturer  
        student.showDepartment();   // From Department  
        student.showStudent();      // From Student  
        // Multiple inheritance via interface  
        student.showMarks();        // From Marks interface  
    }  
}  