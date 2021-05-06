package com.company;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("Reverse array = " + Arrays.toString(array));
    }

    public static void reverse2(int[] array){
         int maxIndex = array.length - 1;
         int halfLength = array.length / 2;

         for (int i = 0; i < halfLength; i ++){
             int temp = array[i];
             array[i] = array[maxIndex - i];
             array[maxIndex - i] = temp;
         }
    }
}
