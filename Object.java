public class Object {
    public static void main(String[] args) {
        OopClass object1 = new OopClass();
        object1.name = "John";
        object1.gender = "Male";
        object1.phone = 1234567890;
        object1.salary = 50000.0;

        System.out.println("Name: " + object1.name);
        System.out.println("Gender: " + object1.gender);
        System.out.println("Phone: " + object1.phone);
        System.out.println("Salary: " + object1.salary);
        OopClass object2 = new OopClass();
        object2.name = "Jane";
        object2.gender = "Female";
        object2.phone = 983210;
        object2.salary = 60000.0;

        System.out.println("Name: " + object2.name);
        System.out.println("Gender: " + object2.gender);
        System.out.println("Phone: " + object2.phone);
        System.out.println("Salary: " + object2.salary);
    }
    }