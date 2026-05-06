public class MethodOverriding {
    void display() {
        System.out.println("This is the parent class.");
    }
}

class Child extends MethodOverriding {
    void display() {
        System.out.println("This is the child class.");
    }

}
public class Main {
    public static void main(String[] args) {
        MethodOverriding parent = new MethodOverriding();
        parent.display(); // Calls the method from the parent class

        Child child = new Child();
        child.display(); // Calls the overridden method from the child class
    }
}   