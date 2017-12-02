package com.thy;

public class BankAccount {
    private String accountNumber;
    private Double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void depositFunds(Double amount)
    {
        this.balance += amount;
        System.out.println("New Balance is "+this.balance);
    }
    public void deductFunds(Double amount){
        if(this.balance < amount)
        {
            System.out.println("Insufficient amount balance");
        }else{
            this.balance -= amount;
            System.out.println("New Balance is "+this.balance);
        }
    }
}
