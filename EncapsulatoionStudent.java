public class EncapsulatoionStudent {
    private String name;
    private int id;
    private double cgpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0)
            System.out.println("Invalid ID");
            else
        this.id = id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0 && cgpa <= 4.0)
            this.cgpa = cgpa;
        else
            System.out.println("Invalid CGPA");
    }
    public static void main(String[] args) {
        EncapsulatoionStudent student = new EncapsulatoionStudent();
        student.setName("Akash");
        student.setId(100);
        student.setCgpa(3.5);

        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getId());
        System.out.println("CGPA: " + student.getCgpa());
    }
} 