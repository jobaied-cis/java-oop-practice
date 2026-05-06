public class Polymorphim1 {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Polymorphim1 {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Polymorphim1 {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

