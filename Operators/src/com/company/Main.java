package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 3; // 1+2=3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResoult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = "+result);
        System.out.println("previousResoult = " + previousResult);


        result = result * 10;
        System.out.println("2 * 10 = "+ result);

        result = result / 5;
        System.out.println("20 / 5 = "+result);

        result = result % 3; //the remainder of (4 % 3)  = 1
        System.out.println("4 % 3 = "+result);

        result++;
        System.out.println("1+1 = "+result);

        result--;
        System.out.println("2 - 1 = "+result);

        //result = result + 2
        result += 2; // 1+2 = 3
        System.out.println("1 + 2 = "+result);

        // result = resoult *10
        result *= 10;
        System.out.println("3 * 10 = "+result);

        // resoult = resoult / 3
        result /= 3;
        System.out.println("30 / 3 = "+result);

        // resoult = resoult -2
        result -= 2;
        System.out.println("10 - 2 = "+result);

        double var_1 = 20.00;
        double var_2 = 80.00;

        double var_3 = (var_1 + var_2) * 100.00;
        System.out.println("Var_3 =  " + var_3);

        double var_4 = var_3 % 40.00;
        System.out.println("var_4 = " + var_4);

        boolean isNoRemainder = (var_4 == 0.00) ? true : false;
        System.out.println("isNoRemainder = "+ isNoRemainder);

        if (var_4 == 0.00) {
            System.out.println("Var_4_1 is true");
        }
       }
}