package com.company;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(6.3);
        calculator.setSecondNumber(2.5);
        System.out.println("add= "+ calculator.getAdditionResult());
        System.out.println("substract= "+ calculator.getSubstractionResult());
        /*calculator.setSecondNumber(3);
        calculator.setFirstNumber(4);*/
        System.out.println("multiply= "+calculator.getMultiplicationResult());
        System.out.println("divide = "+calculator.getDivisionResult());
    }
}

