package com.company;

public class Main {

    public static void main(String[] args) {
/*	bankAccount bobsAccount = new bankAccount();
	bobsAccount.setAccountNumber("123455");
	bobsAccount.setBalance(3521);
	bobsAccount.setCustomerName("Vjeko Vjekic");
	bobsAccount.setEmail("necutireci.gmail");
	bobsAccount.setPhoneNumber("011924901");
	bobsAccount.customerDeposit(400);
	bobsAccount.withdrawal(100.0);*/

    VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "emailaddres.email.com");
        System.out.println(person3.getName() + " email: "+person3.getEmailAddress());

    }
}
