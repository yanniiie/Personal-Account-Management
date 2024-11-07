public class Amount {
        private double amount;
        private TransactionType transactionType;

        public Amount(double amount, TransactionType transactionType) {
            this.amount = amount;
            this.transactionType = transactionType;
        }

        public double getAmount() {
            return amount;
        }

        public TransactionType getTransactionType() {
            return transactionType;
        }

        @Override
        public String toString() {
            return "Type: " + transactionType + ", Amount: " + amount;
        }
}
