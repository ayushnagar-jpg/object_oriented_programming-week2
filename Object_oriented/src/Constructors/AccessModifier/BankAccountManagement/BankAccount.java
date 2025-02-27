package Constructors.AccessModifier.BankAccountManagement;

//Parent class: BankAccount
class BankAccount {
 // Public variable (accessible everywhere)
 public String accountNumber;

 // Protected variable (accessible in subclasses)
 protected String accountHolder;

 // Private variable (only accessible via methods)
 private double balance;

 // Constructor
 public BankAccount(String accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Public getter for balance
 public double getBalance() {
     return balance;
 }

 // Public method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Public method to withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn: $" + amount);
     } else {
         System.out.println("Invalid withdrawal amount or insufficient balance.");
     }
 }

 // Method to display account details
 public void displayAccountDetails() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Balance: $" + balance);
     System.out.println("----------------------");
 }
}

//Subclass: SavingsAccount (inherits from BankAccount)
class SavingsAccount extends BankAccount {
 private double interestRate; // Interest rate for savings account

 // Constructor
 public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
     super(accountNumber, accountHolder, balance);
     this.interestRate = interestRate;
 }

 // Method to display Savings Account details
 public void displaySavingsAccountDetails() {
     System.out.println("Savings Account Details:");
     System.out.println("Account Number: " + accountNumber); // Public variable (accessible)
     System.out.println("Account Holder: " + accountHolder); // Protected variable (accessible in subclass)
     System.out.println("Balance: $" + getBalance()); // Accessing private balance via public getter
     System.out.println("Interest Rate: " + interestRate + "%");
     System.out.println("----------------------");
 }
}

