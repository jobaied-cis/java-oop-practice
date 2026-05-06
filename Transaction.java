
import java.util.Date;

public class Transaction {

    public int serialNo;
    public Date date;
    public double amount;
    public String type;
    public String description;
    public Account account=new Account();

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public Transaction() {
    }

    public Transaction(int serialNo, Date date, double amount, String type, String description) {
        this.serialNo = serialNo;
        this.date = date;
        this.amount = amount;
        this.type = type;
        this.description = description;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void deposit(Account a, double amount) {
        a.deposit(amount);//add to account
        setAmount(amount);//set to transaction
        setType("Deposit");
        setAccount(a);
        setDate(new Date());
        a.getTransactions().add(this);
    }
    public void withdraw(Account a, double amount) {
        a.withdraw(amount);//add to account
        setAmount(amount);//set to transaction
        setType("Withdrawn");
        setAccount(a);
        setDate(new Date());
        a.getTransactions().add(this);
    }
    public void showTransaction(){
        System.out.println(" Serial "+serialNo);
        System.out.println(" date "+date);
        System.out.println(" type "+type);
        System.out.println(" description "+description);
        System.out.println(" Amount "+amount);
        account.show();
        
    }
    
}