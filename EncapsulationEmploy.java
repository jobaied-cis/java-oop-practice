public class EncapsulationEmploy {
    private String name;
    private double salary;
    private double bonus;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

   public double getTotalSalary() {
       return salary + bonus;
   }
   
    public static void main(String[] args) {
        EncapsulationEmploy emp = new EncapsulationEmploy();
        emp.setName("Akash");
        emp.setSalary(50000);
        emp.setBonus(5000);

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("Total Salary: " + emp.getTotalSalary());
    }

}
