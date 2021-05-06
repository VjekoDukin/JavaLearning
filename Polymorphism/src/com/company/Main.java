package com.company;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
        public String startEngine(){
            return "Engine is starting";
        }
        public String accelerate(){
            return "The car is accelerating.";
        }
        public String brake(){
            return "Car is braking";
        }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsu starting";
    }

    @Override
    public String accelerate() {
        return "Micu accelerate";
    }

    @Override
    public String brake() {
        return "Micu brake";
    }
}

class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford starting";
    }

    @Override
    public String accelerate() {
        return "Ford accelerate";
    }

    @Override
    public String brake() {
        return "Ford brake";
    }
}

class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden starting";
    }

    @Override
    public String accelerate() {
        return "Holden accelerate";
    }

    @Override
    public String brake() {
        return "Holden brake";
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
