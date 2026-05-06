public class MethodOverlodingp1 {
    void StaticCalculate(int a){
        System.out.println("The square of "+a+" is: "+(a*a));
    }
    void StaticCalculate(int a, int b){
        System.out.println("The sum of "+a+" and "+b+" is: "+(a+b));
    }
    void StaticCalculate(int a, int b, int c){
        System.out.println("The sum of "+a+", "+b+" and "+c+" is: "+(a+b+c));
    }
    public static void main(String[] args) {
        MethodOverlodingp1 obj = new MethodOverlodingp1();
        obj.StaticCalculate(5); // Calls the first method
        obj.StaticCalculate(5, 10); // Calls the second method
        obj.StaticCalculate(5, 10, 15); // Calls the third method
    }
}
