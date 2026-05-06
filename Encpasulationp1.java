public class Encpasulationp1 {
    String name;
    int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age > 0){
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
    public int getAge(){
        return age;
    }
     public static void main(String[] args) {
         Encpasulationp1 person = new Encpasulationp1();
         person.setName("Alice");
         person.setAge(30);
 
         System.out.println("Name: " + person.getName());
         System.out.println("Age: " + person.getAge());
     }
}
