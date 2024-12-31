package LLD.BuilderPattern.Student;

public class Student {

    String rollNo;
    String name;
    String fatherName;
    String motherName;
    int age;

    public Student(StudentBuilder stb){
        this.rollNo = stb.rollNo;
        this.name = stb.name;
        this.age = stb.age;
        this.fatherName = stb.fatherName;
        this.motherName = stb.motherName;
    }

    
    
}
