


public class BankAccount {
    private String name;
    private String accountNumber;
    private String email;
    private double balance;

    public BankAccount(String name, String accountNumber, String email, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.email = email;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                '}';
    }

    public BankAccount() {
    }

    public static  BankAccountBuilder builder() {
        return new BankAccountBuilder();
    }

    public static class BankAccountBuilder {
    BankAccount bankAccount = new BankAccount();

        public BankAccountBuilder accountNumber(String accountNumber) {
            bankAccount.accountNumber = accountNumber;
            return this;
        }
        public BankAccountBuilder name(String name) {
            bankAccount.name = name;
            return this;
        }

        public BankAccountBuilder email(String email) {
            bankAccount.email = email;
            return this;
        }
        public BankAccountBuilder balance(double balance) {
            bankAccount.balance = balance;
            return this;
        }
        public BankAccount build() {
            return bankAccount;
        }
    }
}
