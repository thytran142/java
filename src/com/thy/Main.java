package com.thy;

public class Main {
    public static void main(String[] args){
        //create a new class for a bank account
        //create fields for the account umber, balance, customer name, email and phone number

        // Create a new class VipCustomer
        //It should have 3 fields name, credit limit, and email address
        //create 3 constructors
        // 1st constructor : empty, call with 3 parameters as default values
        // 2nd constructor: pass 2 values it receives and add a default value for the 3rd
        //3rd constructor: save all


        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());
        VipCustomer vipCustomer1 = new VipCustomer("Vanessa Tran","thytran142@gmail.com");
        System.out.println(vipCustomer1.getName());
        VipCustomer vipCustomer2 = new VipCustomer("Vanessa Tran",100.00,"thytran142@gmail.com");
        System.out.println(vipCustomer2.getName());
    }
}
