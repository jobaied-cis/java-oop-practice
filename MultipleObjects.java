public class MultipleObjects {
    int x = 5;
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        final MultipleObjects myObj1 = new MultipleObjects();  // Object 1
        final MultipleObjects myObj2 = new MultipleObjects();  // Object 2
         myObj2.x = 10; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
}
}
