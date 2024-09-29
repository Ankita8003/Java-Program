package com.UserDefineException;

//BankAccount.java
import java.util.Scanner;

public class BankAccount {
 private double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public void withdraw(double amount) throws WithdrawalException {
     if (amount > balance) {
         throw new WithdrawalException("Insufficient balance for withdrawal.");
     }
     balance -= amount;
     System.out.println("Withdrawal successful. New balance: " + balance);
 }

 public double getBalance() {
     return balance;
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     // Create a bank account with an initial balance of 1000
     BankAccount account = new BankAccount(1000.0);

     System.out.print("Enter amount to withdraw: ");
     double amount = scanner.nextDouble();

     try {
         account.withdraw(amount);
     } catch (WithdrawalException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
