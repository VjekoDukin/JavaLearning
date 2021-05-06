package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Deluxe","Sausage & Beacon", 14.54, "White Roll" );
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("You cannot add any item for Deluxe");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("You cannot add any item for deluxe");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("You cannot add any item for deluxe");
    }
    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("You cannot add any item for deluxe");
    }
}