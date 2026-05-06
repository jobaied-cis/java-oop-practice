public class Addmethod {
    int id;
    String name;
    double salary;
    String grade;
    void Displayinfo(){
        System.out.println("NAME="+name);
        System.out.println("id="+id);
        System.out.println("salary="+salary);
        System.out.println("Grade="+grade);
        System.out.println("");
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        Addmethod Akash= new Addmethod();
        Akash.name="Akash Chowdhury";
        Akash.id=251-16-031;
        Akash.salary=600000;
        Akash.grade= "A" ;
        Akash.Displayinfo();
        Addmethod Employ1= new Addmethod();
        Employ1.name="Sakib";
        Employ1.id=25112;
        Employ1.Displayinfo();

    }
    
}
