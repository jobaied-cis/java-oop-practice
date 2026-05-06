class Static_Variable{    
   int rollno;//instance variable    
   String name;    
   static String college ="ITS";//static variable    
   //constructor    
   Static_Variable(int r, String n){    
   rollno = r;    
   name = n;    
   }    
   //method to display the values    
   void display (){System.out.println(rollno+" "+name+" "+college);}    
}    
//Main class to show the values of objects    
public class Main{    
 public static void main(String args[]){    
 Static_Variable s1 = new Static_Variable(111,"Karan");    
 Static_Variable s2 = new Static_Variable(222,"Aryan");    
 //we can change the college of all objects by the single line of code    
 //Static_Variable.college="BBDIT";    
 s1.display();    
 s2.display();    
 }    
}  