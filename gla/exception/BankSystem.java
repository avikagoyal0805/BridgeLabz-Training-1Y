package com.gla.exception;

    class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount)
                throws InsufficientBalanceException {

            if (amount < 0) {
                throw new IllegalArgumentException("Invalid amount!");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance!");
            }

            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }

    // Main class
    public class BankSystem {
        public static void main(String[] args) {
            BankAccount account = new BankAccount(1000);

            try {
                account.withdraw(500);   // valid
                account.withdraw(600);   // exceeds balance
                account.withdraw(-100);  // negative amount
            }
            catch (InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

