public class AccessMethodsWithanObject {
    // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
  public void minspeed(int minSpeed) {
    System.out.println("Min speed is: " + minSpeed);
  }
 public void Avaragespeend(int avarageSpeed) {
    System.out.println("Avarage speed is: " + avarageSpeed);
  }
  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    AccessMethodsWithanObject myCar = new AccessMethodsWithanObject();   // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
    myCar.minspeed(50);       // Call the minspeed() method
    myCar.Avaragespeend(100); // Call the Avaragespeed() method
  }
}
