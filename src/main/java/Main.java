import bank.BankAccount;
import inventory.Inventory;
import inventory.Product;
import inventory.Warehouse;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAcc = new BankAccount();
        Product product = new Product();
        Inventory inventories = new Inventory();
        Warehouse warehouse = new Warehouse();

        bankAcc.setAccountNumber(10111);
        bankAcc.setBalance(300);
        bankAcc.setAccountHolder("DEYEMS");
        System.out.println("The bank comprise of " + bankAcc.getAccountNumber() + " number" + ", balance of " + bankAcc.getBalance() + " and holder is " + bankAcc.getAccountHolder());


    }
}
