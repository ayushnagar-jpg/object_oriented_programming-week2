package ObjectRelationships.AssistedProblems.BankCustomerAssociation;
import java.util.ArrayList;

//Bank class
class Bank {
 String bankName;
 private ArrayList<Customer> customers;
 
 public Bank(String bankName) {
     this.bankName = bankName;
     this.customers = new ArrayList<>();
 }
 
 public void openAccount(Customer customer) {
     customers.add(customer);
     System.out.println("Account opened for " + customer.getName() + " at " + bankName);
 }
 
 public void displayCustomers() {
     System.out.println("Customers of " + bankName + ":");
     for (Customer customer : customers) {
         System.out.println("- " + customer.getName());
     }
 }
}

//Customer class
class Customer {
 private String name;
 private double balance;
 private Bank bank;
 
 public Customer(String name, double balance, Bank bank) {
     this.name = name;
     this.balance = balance;
     this.bank = bank;
 }
 
 public String getName() {
     return name;
 }
 
 public void viewBalance() {
     System.out.println("Customer: " + name + " | Bank: " + bank.bankName + " | Balance: $" + balance);
 }
}

public class BankCustomerAssociation {
 public static void main(String[] args) {
     // Creating a bank
     Bank bank1 = new Bank("National Bank");
     
     // Creating customers
     Customer customer1 = new Customer("Ayush Nagar", 5000.0, bank1);
     Customer customer2 = new Customer("Ashu Singh", 10000.0, bank1);
     
     // Associating customers with the bank
     bank1.openAccount(customer1);
     bank1.openAccount(customer2);
     
     // Displaying bank customers
     bank1.displayCustomers();
     
     // Viewing customer balances
     customer1.viewBalance();
     customer2.viewBalance();
 }
}


