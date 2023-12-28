
public class BankTransaction {
    public static void main(String[] args) {
       
        BankAccount accountA = new BankAccount(12344, "Account A", 5000);
        BankAccount accountB = new BankAccount(56789, "Account B", 2500);
        accountA.transferTo(accountB, 1500);
        System.out.println("After transferring 1500 from Account A to B:");
        accountA.printReceipt();
        accountB.printReceipt();
        accountB.transferTo(accountA, 3000);
        System.out.println("After transferring 3000 from Account B to A:");
        accountA.printReceipt();
        accountB.printReceipt();
    }
}
class BankAccount {
    int accountId;
    String name;
    double balance;

    BankAccount(int accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    void transferTo(BankAccount receiver, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            receiver.balance += amount;
        } else {
            System.out.println("Invalid transaction: Insufficient funds.");
        }
    }

    void printReceipt() {
        System.out.println("Account id: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Account Balance: Rs." + balance);
        System.out.println();
    }
}

