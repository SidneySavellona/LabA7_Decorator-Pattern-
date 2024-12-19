public class SavingsAccount implements BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String showAccountType() {
        return "Savings Account";
    }
    public Double getInterestRate() {
        return 0.01;
    }
    public Double getBalance() {
        return balance;
    }
    public String showBenefits() {
        return "Standard Savings Account";
    }
    public Double computeBalanceWithInterest() {
        return balance + balance * getInterestRate();
    }
    public String showInfo() {
        String output = "Account number: " + accountNumber;
        output += "\nAccount name: " + accountName;
        output += "\nBalance: " + balance;
        return output;
    }
    
}