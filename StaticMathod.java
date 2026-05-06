public class StaticMathod {
     int rollno;
     String name;
     static String college = "ITS";
     //static method to change the value of static variable
     static void change(){
        college = "BBDIT";
     }
     //constructor to initialize the variable
     StaticMathod(int r, String n){
        rollno = r;
        name = n;
     }
     //method to display values
     void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Main class to create and display the values of object
public class Main{
    public static void main(String args[]){
        StaticMathod.change();//calling change method
        //creating objects
        StaticMathod s1 = new StaticMathod(111,"Karan");
        StaticMathod s2 = new StaticMathod(222,"Aryan");
        StaticMathod s3 = new StaticMathod(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
