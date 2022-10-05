package Bank.entities;

public class Bank {

    private int numberAccount;
    private String holderAccount;
    private double balance;

    public Bank(int numberAccount, String holderAccount, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
        this.balance = initialDeposit;
    }

    public Bank(int numberAccount, String holderAccount) {
        this.numberAccount = numberAccount;
        this.holderAccount = holderAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getHolderAccount() {
        return holderAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withDraw(double amount){
        this.balance -= amount + 5.00;
    }

    @Override
    public String toString() {
        return  "Acccount " + numberAccount +
                ", Holder: " + holderAccount + '\'' +
                ", Balance: $ " + balance
                ;
    }
}
