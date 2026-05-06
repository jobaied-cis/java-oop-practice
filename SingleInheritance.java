public class SingleInheritance {

    class Parent {
        void display() {
            System.out.println("This is the parent class.");
        }
    }

    class Child extends Parent {
        void show() {
            System.out.println("This is the child class.");
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.display(); // Inherited method from Parent
        child.show();    // Method of Child
    }
}
