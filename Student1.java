import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Akash" ;
        student1.rollNo = 101;
        student1.marks = 85.5;
        student1.grade = "A";
        System.out.println("Name: " + student1.name);
        System.out.println("Roll No: " + student1.rollNo);
        System.out.println("Marks: " + student1.marks);
        System.out.println("Grade: " + student1.grade);
        System.out.println();
        Student student2 = new Student();
        student2.insert("Rohit", 102, 78.0, "B");
        student2.displayInfo();
        Student student3 = new Student();
        Scanner input = new Scanner(System.in);
        String name;
        int rollNo;
        double marks;
        String grade;
        System.out.print("Enter Name: ");
        name = input.nextLine();
        System.out.print("Enter Roll No: ");
        rollNo = input.nextInt();
        System.out.print("Enter Marks: ");
        marks = input.nextDouble();
        System.out.print("Enter Grade: ");
        grade = input.next();
        student3.insert(name, rollNo, marks, grade);
        student3.displayInfo();
    }
}
