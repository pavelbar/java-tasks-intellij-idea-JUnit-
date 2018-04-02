package com.baranov.core;

public class MArrays {

    public static long sumAll(char[] arr){ //1.1
        long sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += Character.getNumericValue(arr[i]);
        }
        return sum;
    }

}
