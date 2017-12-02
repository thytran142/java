package com.thy;

public class Main {
    public static void main(String[] args){
        //Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email, phone number
        //Create getters and setters for each field
        //Create 2 additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field)
        // 2. To allow the customer to withdraw funds . This should deduct from the balance field but not
        //allow the withdrawal to complete if their are insufficient funds.
        //You will want to create various code in the Main class to confirm your code is working
        //Add some system out printlnn in 2 methods above as well.
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBalance(100.00);
        Double amount = 20.00;
        bankAccount.depositFunds(amount);
        bankAccount.deductFunds(amount);
        amount = 120.00;
        bankAccount.deductFunds(amount);
    }
}
