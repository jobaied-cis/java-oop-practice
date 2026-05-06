public abstract class Abstract {
    // Abstract method (does not have a body)
    public abstract void abstractMethod();
    
    // Regular method
    public void regularMethod() {
        System.out.println("This is a regular method in an abstract class.");
    }
}

public class ConcreteClass extends Abstract {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstract method.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Cannot create an instance of an abstract class
        // Abstract obj = new Abstract(); // This will cause a compile-time error

        ConcreteClass concreteObj = new ConcreteClass();
        concreteObj.abstractMethod();
        concreteObj.regularMethod();
    }
}
