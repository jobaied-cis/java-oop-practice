public class StaticCounter {

    static int count=0;//will get memory only once when the class is loaded

    StaticCounter(){
        count++;//incrementing value
        System.out.println(count);
    }
}
public class Main{
    public static void main(String args[]){
        //Creating objects
        StaticCounter c1=new StaticCounter();
        StaticCounter c2=new StaticCounter();    
        StaticCounter c3=new StaticCounter();    
    }    
}    
