public class GSave implements BankAccountDecorator{
    private BankAccount bankAccount;

    public GSave(BankAccount account){
        bankAccount = account;
    }

    public String showAccountType() {
        return "GSave";
    }

    public Double getInterestRate() {
        return 0.025;
    }

    public Double getBalance() {
        return bankAccount.getBalance();
    }

    public String showBenefits() {
        return bankAccount.showBenefits() + ", GCash Transfer";
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