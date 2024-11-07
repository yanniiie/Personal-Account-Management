import java.util.ArrayList;
import java.util.List;

public class PersonalAccount {

        private int accountNumber;
        private String accountHolder;
        private double balance;
        private List<Amount> transactions;

        public PersonalAccount(int accountNumber, String accountHolder) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = 0.0;
            this.transactions = new ArrayList<>();
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Deposit amount must be positive.");
                return;
            }
            Amount depositTransaction = new Amount(amount, TransactionType.DEPOSIT);
            transactions.add(depositTransaction);
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        public void withdraw(double amount) {
            if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
                return;
            }
            if (amount > balance) {
                System.out.println("Insufficient balance for withdrawal.");
                return;
            }
            Amount withdrawalTransaction = new Amount(amount, TransactionType.WITHDRAWAL);
            transactions.add(withdrawalTransaction);
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }

        public void printTransactionHistory() {
            System.out.println("Transaction History for Account #" + accountNumber);
            for (Amount transaction : transactions) {
                System.out.println(transaction);
            }
        }

        public double getBalance() {
            return balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolder() {
            return accountHolder;
        }
    }

