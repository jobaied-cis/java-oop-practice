public class Teacherconstructor {
    String name;
    int age;
    String subject;
    Teacherconstructor(String n, int a, String s) {
        name = n;
        age = a;
        subject = s;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
    void evenodd() {
        if (age % 2 == 0) {
            System.out.println(name + " is " + age + " years old, which is an even number.");
        } else {
            System.out.println(name + " is " + age + " years old, which is an odd number.");
        }
    }
}
