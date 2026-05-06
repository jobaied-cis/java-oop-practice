public class MethodOverloding {
    void sum(int a, int b) {
        System.out.println("The sum of two numbers is: " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("The sum of three numbers is: " + (a + b + c));
    }

    public static void main(String[] args) {
        MethodOverloding obj = new MethodOverloding();
        obj.sum(5, 10); // Calls the first method
        obj.sum(5, 10, 15); // Calls the second method
    }
}
