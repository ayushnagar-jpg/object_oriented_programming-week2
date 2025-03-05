package Keyword.BankAccountSystem;

class BankAccount {
    // Static variable shared across all accounts
    private static String bankName = "Axis Bank";
    private static int totalAccounts = 0;
    
    // Instance variables
    private String accountHolderName;
    private final int accountNumber;
    private double balance;
    
    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // Final variable cannot be changed later
        this.balance = balance;
        totalAccounts++; // Increment total accounts count
    }
    
    // Static method to get total number of accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        if (this instanceof BankAccount) { // Using instanceof for safe type-checking
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid account type.");
        }
    }
    
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ayush Nagar", 56546, 5000.0);
        BankAccount acc2 = new BankAccount("Ashu Singh", 565635, 7000.0);
        
        // Display account details
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        
        // Display total number of accounts
        System.out.println("Total Bank Accounts: " + BankAccount.getTotalAccounts());
    }
}
