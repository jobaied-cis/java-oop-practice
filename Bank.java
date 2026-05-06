
public class Bank {

    public static void main(String[] args) {
        Account account = new Account();

        account.setAccNo(1000);
        account.setTitle("seam");
        account.show();
        System.out.println(" deposit 500");
        Transaction t1 = new Transaction();
        t1.setSerialNo(111111111);
        t1.setDescription("deposite from father");
        t1.deposit(account, 500);
        t1.showTransaction();
        //account.show();
        System.out.println(" withdrown 2000");
        Transaction t2 = new Transaction();
        t2.setSerialNo(222);
        t2.setDescription("hose rent ");
        t2.withdraw(account, 2000);
        t2.showTransaction();
        account.show();

    }
}