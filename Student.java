
public class Student{
    String name;
    int rollNo;
    double marks;
    String grade;
    void insert(String name, int rollNo, double marks, String grade){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        this.grade = grade;
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}