package classes_fundamental.level2.ATM;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BankAccount account = new BankAccount("Ayush Nagar", "1234567890", 1000.00);
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	           
	            System.out.println("\nATM Menu:");
	            System.out.println("1. Deposit Money");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Display Balance");
	            System.out.println("4. Exit");
	            System.out.print("Choose an option: ");
	            
	            int choice = scanner.nextInt();
	            
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to deposit: $");
	                    double depositAmount = scanner.nextDouble();
	                    account.deposit(depositAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter amount to withdraw: $");
	                    double withdrawAmount = scanner.nextDouble();
	                    account.withdraw(withdrawAmount);
	                    break;
	                case 3:
	                    account.displayBalance();
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option! Please try again.");
	            }
	        }
	    }
	}


