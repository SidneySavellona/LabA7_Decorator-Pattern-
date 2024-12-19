public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(BankAccount account) {
        this.bankAccount = account;
    }

    public String showAccountType() {
        return "UpSave";
    }

    public Double getInterestRate() {
        return 0.04;
    }

    public Double getBalance() {
        return bankAccount.getBalance();
    }

    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }

    public Double computeBalanceWithInterest() {
        return bankAccount.getBalance() + bankAccount.getBalance() * getInterestRate();
    }

    public String showInfo() {
        return bankAccount.showInfo();
    }

    public void setBankAccount() {

    }
}
