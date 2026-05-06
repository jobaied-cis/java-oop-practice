public class InheritanceSalary {
    protected double salary = 40000;

}

class Employee extends InheritanceSalary {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public void displaySalary() {
        System.out.println("Salary of " + name + ": " + salary);
    }
}
