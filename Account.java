

import java.util.ArrayList;

public class Account {
    
   private int accNo;
   private String title;
   private double balance;
    ArrayList<Transaction> transactions=new ArrayList<>();

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
   
public Account(){
        System.out.println("call from deafult ");
        accNo=2222;
        title="test";
        balance=4000;
        }

    public Account(int accNo, String title, double balance) {
        System.out.println(" call from agrs constructor ");
        this.accNo = accNo;
        this.title = title;
        this.balance = balance;
    }

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
   public void deposit(double amount){
   balance=balance+amount;
    }
   public void withdraw(double amount){
       if (amount>balance)
           System.out.println("Taka ni");
       else balance=balance-amount;
    }
   public void show(){
       System.out.println("accounts number "+accNo);
       System.out.println("account title   "+title);
       System.out.println("accounts balance "+balance);
   }
   public void showBlance(){
       show();
       for (Transaction transaction : transactions) {
              System.out.println(transaction.getSerialNo() +" "+transaction.getDescription()+
                      transaction.getAmount()+transaction.getType());
       }
   } 
}