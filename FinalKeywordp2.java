public class FinalKeywordp2 {
    final int x = 10; // This variable cannot be changed
    void display() {
        System.out.println("Value of x: " + x);
    }
    public static void main(String[] args) {
        FinalKeywordp2 obj = new FinalKeywordp2();
        obj.display();
        // obj.x = 20; // This will cause a compile-time error
    }
}
