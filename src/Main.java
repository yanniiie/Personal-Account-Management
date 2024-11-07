public class Main {
        public static void main(String[] args) {
            PersonalAccount account = new PersonalAccount(123456, "Nazarova Ayana");

            account.deposit(300.0);
            account.withdraw(250.0);
            account.deposit(500.0);
            account.withdraw(800.0);

            System.out.println("Current Balance: $" + account.getBalance());
            account.printTransactionHistory();
        }
}