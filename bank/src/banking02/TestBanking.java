package banking02;/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */

import banking.*;

public class TestBanking {

  public static void main(String[] args) {
    Customer customer;
    Account  account;

    // Create an account that can has a 500.00 balance.
    System.out.println("Creating the customer Jane Smith.");
    customer=new Customer("Jane","Smith");
    account=new Account(500);
    System.out.println("Creating her account with a 500.00 balance.");
    customer.setAccount(account);
    System.out.println("Withdraw 150.00");
    customer.getAccount().withdraw(150);
    System.out.println("Deposit 22.50");
    customer.getAccount().deposit(22.5);
    System.out.println("Withdraw 47.62");
    customer.getAccount().withdraw(47.62);
    // Print out the final account balance
    System.out.println("Customer [" + customer.getLastName()
		       + ", " + customer.getFirstName()
		       + "] has a balance of " + account.getBalance());
  }
}
