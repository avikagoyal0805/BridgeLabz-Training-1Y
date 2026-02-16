class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { if(amount <= balance) balance -= amount; }
    public double getBalance() { return balance; }
}

// Subclass
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(long accountNumber, String accountHolder, double balance, double rate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = rate;
    }

    void displayAccount() {
        System.out.println("Account: " + accountNumber + ", Holder: " + accountHolder +
                           ", Balance: " + getBalance() + ", Rate: " + interestRate);
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(123456, "Alice", 10000, 4.5);
        sa.displayAccount();
    }
}
