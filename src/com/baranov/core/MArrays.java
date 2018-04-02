package com.baranov.core;

import java.security.SecureRandom;

public class MArrays {
    private static final String ENGLISH_ALPHABET_AND_ARABIC_NUMERALS = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz1234567890";

    private char array[];

    protected char getRandomSymbolFromAlphabet(String Alphabet) {//---in
        SecureRandom rnd = new SecureRandom();
        return ENGLISH_ALPHABET_AND_ARABIC_NUMERALS.charAt(rnd.nextInt(ENGLISH_ALPHABET_AND_ARABIC_NUMERALS.length()));
    }

    public boolean createRandomArray(int len) {//---out
        if (len < 0) {
            throw new IllegalArgumentException("Array dimensions cannot have a negative size");
        }
        if (len == 0) {
            array = null;
            return true;
        }

        array = new char[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomSymbolFromAlphabet(ENGLISH_ALPHABET_AND_ARABIC_NUMERALS);
        }
        return true;
    }

    /*
    ##############################################################################################

    1. Реализуйте функцию, которая вычисляет сумму цифр для заданного массива символов, состоящего
    из цифр от O 'до' 9 *. Функция должна возвращать сумму цифр в виде длинного значения.
    */
    public static long calcSumArrayElements(char[] arr) {//---out---//1.1
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Character.getNumericValue(arr[i]);
        }
        return sum;
    }

    public long calcSumArrayElements() {//---out---//1.1
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Character.getNumericValue(array[i]);
        }
        return sum;
    }

}
