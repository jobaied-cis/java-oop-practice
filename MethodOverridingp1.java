public class MethodOverridingp1 {
    String car() {
        return "This is a car.";
    }
    String bike() {
        return "This is a bike.";
    }
    String truck() {
        return "This is a truck.";
    }
    public static void main(String[] args) {
        MethodOverridingp1 vehicle = new MethodOverridingp1();
        System.out.println(vehicle.car());
        System.out.println(vehicle.bike());
        System.out.println(vehicle.truck());
    }
}
