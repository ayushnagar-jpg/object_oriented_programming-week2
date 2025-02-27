package Constructors.AccessModifier.BankAccountManagement;

//Main class to test the implementation
public class Main{
public static void main(String[] args) {
   // Creating a BankAccount object
   BankAccount acc1 = new BankAccount("123456789", "John Doe", 5000.00);
   acc1.displayAccountDetails();

   // Performing deposit and withdrawal operations
   acc1.deposit(1000.00);
   acc1.withdraw(1500.00);
   System.out.println("Updated Balance: $" + acc1.getBalance());
   System.out.println("----------------------");

   // Creating a SavingsAccount object
   SavingsAccount savingsAcc = new SavingsAccount("987654321", "Alice Smith", 8000.00, 3.5);
   savingsAcc.displaySavingsAccountDetails();
}
}
