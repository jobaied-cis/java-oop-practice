public class StaticVarriable
{
    String name;
    int id;
    static String University ="Daffodil international University";
    StaticVarriable(String n, int i)
    {
        name = n;
        id = i;
    }
    void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("University: " + University);
    }
     public static void main(String[] args) {
        StaticVarriable student1 = new StaticVarriable("Alice", 101);
        StaticVarriable student2 = new StaticVarriable("Bob", 102);
        
        student1.displayInfo();
        student2.displayInfo();
    }
}