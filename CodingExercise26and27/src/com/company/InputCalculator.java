package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);


        int counter = 0;
        int sum = 0;
        long average = 0;

        while (true) {
            System.out.println("Enter number:");
            boolean isAValidInt = scanner.hasNextInt();

            if (isAValidInt){
                int number = scanner.nextInt();
                sum += number;
                counter ++;
            } else {
                break;
            }
        }
        if (counter > 0) {
            average = Math.round((double) sum / (double)counter);
        } else {
            average = 0;
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}