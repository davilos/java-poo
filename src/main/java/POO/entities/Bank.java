package POO.entities;

public class Bank {

    private final int accountNumber;
    public String accountName;
    double deposit;
    public static final double tax = 5.00;

    public Bank(int accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public Bank(int accountNumber, String accountName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.deposit = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getDeposit() {
        return deposit;
    }

    public void depositValue(double value) {
        deposit += value;
    }

    public void withdrawValue(double value) {
        if (value <= deposit) {
            deposit -= value + tax;
        } else {
            System.out.println("You don't have all that amount in your account!");
        }
    }

    public String toString() {
        return "Account " + getAccountNumber() + ", Holder: " + getAccountName() + ", Balance: $ " +
                String.format("%.2f", getDeposit());
    }
}
