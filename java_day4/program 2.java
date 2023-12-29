
public class BankingApplication {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(0.05);
        savingsAccount.deposit(1000);
        savingsAccount.applyInterest();

        CheckingAccount checkingAccount = new CheckingAccount(500);
        checkingAccount.deposit(800);
        checkingAccount.withdraw(700);
        checkingAccount.setOverdraftLimit(1000);

        LoanAccount loanAccount = new LoanAccount(0.1);
        loanAccount.deposit(2000);
        loanAccount.applyInterest();
    }
}
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}

class BaseAccount implements Account {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public double checkBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }
}

class SavingsAccount extends BaseAccount {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interestAmount = checkBalance() * interestRate;
        deposit(interestAmount);
        System.out.println("Interest applied: " + interestAmount);
    }
}
class CheckingAccount extends BaseAccount {
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
        System.out.println("Overdraft limit set to: " + overdraftLimit);
    }
}

class LoanAccount extends BaseAccount {
    private double interestRate;

    public LoanAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interestAmount = checkBalance() * interestRate;
        deposit(interestAmount);
        System.out.println("Interest applied: " + interestAmount);
    }
}
