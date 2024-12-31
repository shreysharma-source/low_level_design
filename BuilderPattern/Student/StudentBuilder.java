package LLD.BuilderPattern.Student;

public class StudentBuilder {
   
    String rollNo;
    int age;
    String name;
    String fatherName;
    String motherName;
   
    public StudentBuilder setAge(int iAge){
        this.age = iAge;
        return this;
    }

    public StudentBuilder setRollNo(String iRollNo){
        this.rollNo = iRollNo;
        return this;
    }

    public StudentBuilder setName(String iName){
        this.name = iName;
        return this;
    }

    public StudentBuilder setFatherName(String iFatherName){
        this.fatherName = iFatherName;
        return this;
    }

    public StudentBuilder setMotherName(String iMotherName){
        this.motherName = iMotherName;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
