package com.company;

public class HealthyBurger extends Hamburger{
    private double healthyExtra1Price;
    private double healthyExtra2Price;
    public HealthyBurger(String meat, double price) {
        super("Healthy ", meat, price, "Brown rye");
    }
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Price = price;
        System.out.println("Added " + name + " for an extra "
                + this.healthyExtra1Price);
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Price = price;
        System.out.println("Added " + name + " for an extra "
                + this.healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {

        return this.healthyExtra1Price + this.healthyExtra2Price + super.itemizeHamburger();
    }
}
