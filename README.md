# LabA7_Decorator-Pattern-

CIMB is a digital bank that offers GSave and UpSave savings accounts. As with a typical Savings Account, it contains accountNumber, accountName, and a balance for that account.

The typical savings account offers an interest rate of 1%. The benefits of the typical savings account is the same with the "Standard Savings Account" as compared to other banks.

The GSave account offers an interest rate of 2.5%. Benefits include the "Standard Savings Account" plus access to "GCash transfer".

The UpSave account offers the highest interest rate of 4.0%. Benefits include the "Standard Savings Account" plus "with Insurance".

Develop a decorator pattern approach that will implement the given UML diagram:
![image](https://github.com/user-attachments/assets/05963dbc-c972-41c7-bfeb-031e29246483)

The content of your Cimb.java should ONLY contain the following codes with the exception of inserting your own package name :

    public class Cimb {
    
    	public static void main(String[] args) {
    		
    		SavingsAccount account = new SavingsAccount();
    		
    		account.setAccountNumber(1234);
    		account.setAccountName("Juan Dela Cruz");
    		account.setBalance(10000.0);
    		
    		System.out.println(account.showInfo());
    		System.out.println("Account type: " + account.showAccountType());
    		System.out.println("Interest rate: " + account.getInterestRate());
    		System.out.println("New balance: " + account.computeBalanceWithInterest());
    		System.out.println("Benefits: " + account.showBenefits());
    		
    		System.out.println("----------------------");
    		
    		GSave gSave = new GSave(account);
    		System.out.println(gSave.showInfo());
    		System.out.println("Account type: " + gSave.showAccountType());
    		System.out.println("Interest rate: " + gSave.getInterestRate());
    		System.out.println("New balance: " + gSave.computeBalanceWithInterest());
    		System.out.println("Benefits: " + gSave.showBenefits());
    		
    		System.out.println("----------------------");
    		
    		UpSave upSave = new UpSave(account);
    		System.out.println(upSave.showInfo());
    		System.out.println("Account type: " + upSave.showAccountType());
    		System.out.println("Interest rate: " + upSave.getInterestRate());
    		System.out.println("New balance: " + upSave.computeBalanceWithInterest());
    		System.out.println("Benefits: " + upSave.showBenefits());
    	}
    }

You should display the following output:

![image](https://github.com/user-attachments/assets/99beb52d-d603-4a15-9494-bf0465c64ec4)

Description of the following methods:

1. `showAccountType()` - Either returns "Savings Account", "GSave" or "UpSave".
2. `getInterestRate()` - Either returns 1% for Savings Account; 2.5% for GSave; 4.0% for UpSave.
3. `getBalance()` - Returns the balance of the account set.
4. `showBenefits()` - Either returns:
   - "Standard Savings Account" for Savings Account;
   - Benefits offered by savings account + "GSave Transfer";
   - Benefits offered by savings account + "With Insurance".
5. `computeBalanceWithInterest()` - Returns new balance by computing the balance plus the interest depending on the interest rate.
6. `showInfo()` - Returns details of account number, account name, and balance.

**BankAcountDecorator** must be an interface.

Follow instructions. You are not allowed to insert other methods except what is stated in the diagram (setters and getters are allowed).


In your solution, you must provide the following in your GitHub repository:

- **Problem statement** (description of the problem. Just copy what is stated here).
- **UML Class Diagram**.
- **Uploaded Java codes** for the solution.


Upload your GitHub repository to the designated NEUVLE assignment link.
