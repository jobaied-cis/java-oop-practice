public class EncapsulationBankAccount {
    private int accountNo;
    private double balance;

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance)
            System.out.println("Not enough balance");
        else
            balance -= amount;
    }

    public static void main(String[] args) {
        EncapsulationBankAccount account = new EncapsulationBankAccount();
        account.setAccountNo(12345);
        account.setBalance(1000.0);

        System.out.println("Account Number: " + account.getAccountNo());
        System.out.println("Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}

