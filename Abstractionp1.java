public class Abstractionp1 {//Creating a Main class to create object and call methods 
    public static void main(String args[]){    
 Bike obj = new Honda();    
 obj.run();    
}    
}   
    abstract class Bike{    
  abstract void run();    
}    
//Creating a child class and override abstract method  
class Honda extends Bike{    
void run(){System.out.println("running safely");}    
}  

