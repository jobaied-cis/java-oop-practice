public class Encapsulationp2 {

    private int accNo;
    private String title;
    private double balance;
    public int getAccNo() {
        return accNo;
    }
    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
public static void main(String[] args) {
    Encapsulationp2 e1 = new Encapsulationp2();
    e1.setAccNo(12345);
    e1.setTitle("Akash");
    e1.setBalance(1000.50);
    System.out.println("Account Number: " + e1.getAccNo());
    System.out.println("Title: " + e1.getTitle());
    System.out.println("Balance: " + e1.getBalance());
}
}
