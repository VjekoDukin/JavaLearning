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

    /*VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "emailaddres.email.com");
        System.out.println(person3.getName() + " email: "+person3.getEmailAddress());
*/

    Carpet carpet = new Carpet(3.5);
    Floor floor = new Floor(2.75, 4.0);
    Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total = "+ calculator.getTotalCost());


        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.substract(one);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.substract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

    }
}
