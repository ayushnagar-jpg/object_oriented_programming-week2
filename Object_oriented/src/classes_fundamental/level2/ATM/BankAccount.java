package classes_fundamental.level2.ATM;

public class BankAccount {
	
	    String accountHolder;
	    String accountNumber;
	    double balance;

	    BankAccount(String accountHolder, String accountNumber, double balance) {
	        this.accountHolder = accountHolder;
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Successfully deposited $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount!");
	        }
	    }

	    // Method to withdraw money (only if sufficient balance exists)
	    void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Successfully withdrawn $" + amount);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance!");
	        } else {
	            System.out.println("Invalid withdrawal amount!");
	        }
	    }

	    void displayBalance() {
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Current Balance: $" + balance);
	    }
	}
