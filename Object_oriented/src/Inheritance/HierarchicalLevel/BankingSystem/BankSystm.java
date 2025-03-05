package Inheritance.HierarchicalLevel.BankingSystem;

//Superclass: BankAccount
class BankAccount {
 String accountNumber;
 double balance;
 
 // Constructor
 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
 }
 
 // Method to display account details
 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: " + balance);
 }
}

//Subclass: SavingsAccount (inherits from BankAccount)
class SavingsAccount extends BankAccount {
 double interestRate;
 
 // Constructor
 public SavingsAccount(String accountNumber, double balance, double interestRate) {
     super(accountNumber, balance);
     this.interestRate = interestRate;
 }
 
 // Overriding displayAccountType method
 public void displayAccountType() {
     System.out.println("This is a Savings Account with an interest rate of " + interestRate + "%.");
 }
}

//Subclass: CheckingAccount (inherits from BankAccount)
class CheckingAccount extends BankAccount {
 double withdrawalLimit;
 
 // Constructor
 public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
     super(accountNumber, balance);
     this.withdrawalLimit = withdrawalLimit;
 }
 
 // Overriding displayAccountType method
 public void displayAccountType() {
     System.out.println("This is a Checking Account with a withdrawal limit of $" + withdrawalLimit + ".");
 }
}

//Subclass: FixedDepositAccount (inherits from BankAccount)
class FixedDepositAccount extends BankAccount {
 int lockInPeriod;
 
 // Constructor
 public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
     super(accountNumber, balance);
     this.lockInPeriod = lockInPeriod;
 }
 
 // Overriding displayAccountType method
 public void displayAccountType() {
     System.out.println("This is a Fixed Deposit Account with a lock-in period of " + lockInPeriod + " months.");
 }
}

//Main class to demonstrate hierarchical inheritance
public class BankSystm {
 public static void main(String[] args) {
     SavingsAccount savings = new SavingsAccount("SA123", 5000, 3.5);
     CheckingAccount checking = new CheckingAccount("CA456", 3000, 1000);
     FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000, 12);
     
     savings.displayAccountDetails();
     savings.displayAccountType();
     System.out.println();
     
     checking.displayAccountDetails();
     checking.displayAccountType();
     System.out.println();
     
     fixedDeposit.displayAccountDetails();
     fixedDeposit.displayAccountType();
 }
}

