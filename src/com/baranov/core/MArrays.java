package com.baranov.core;

import java.security.SecureRandom;

public class MArrays {
    private static final String ARABIC_NUMERALS = "1234567890";
    private static final int RADIX_DEC = 10;

    private char array[];

    /*##### Constructors ########################################################################*/

    public MArrays(int len) {//createEmptyArray +tested
        if (len < 0) {
            throw new IllegalArgumentException("Array dimensions cannot have a negative size");
        }
        array = new char[len];
    }

    public MArrays(char arr[]) {//createArrayFromArrayC +tested
        if (arr == null) {
            array = null;
        } else {
            array = new char[arr.length];
            for (int i = 0; i < arr.length; i++) {
                array[i] = arr[i];
            }
        }
    }

    public MArrays(int arr[]) {//createArrayFromArrayI
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] < 0) || (arr[i] > 9)) throw new IllegalArgumentException("Number is not single-valued");
        }

        if (arr == null) {
            array = null;
        } else {
            array = new char[arr.length];
            for (int i = 0; i < arr.length; i++) {
                array[i] = Character.forDigit(arr[i], RADIX_DEC);
            }
        }
    }

    /*##### standard methods ###################################################################*/

    public int getLength() {
        if (array == null) {
            return 0;
        } else {
            return array.length;
        }
    }

    public void setEltAtIndex(char c, int pos) {
        if ((pos < 0) || (pos > array.length - 1)) {
            throw new IllegalArgumentException("Index out of range");
        }
        array[pos] = c;
    }

    public char getEltAtIndex(int i) {
        if ((i < 0) || (i > array.length - 1)) {
            throw new IllegalArgumentException("Index out of range");
        }
        return array[i];
    }

    /*##### random methods ###################################################################*/

    protected char getRandomSymbolFromAlphabet(String Alphabet) {//FOR: setRandomSymbolsFromAlphabetToArray
        SecureRandom rnd = new SecureRandom();
        return Alphabet.charAt(rnd.nextInt(Alphabet.length()));
    }

    public boolean setRandomSymbolsFromAlphabetToArray(String Alphabet) {// +tested
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomSymbolFromAlphabet(Alphabet);
        }
        return true;
    }

    /*##### tasks methods ######################################################################

    1. Реализуйте функцию, которая вычисляет сумму цифр для заданного массива символов, состоящего
    из цифр от O 'до' 9 *. Функция должна возвращать сумму цифр в виде длинного значения.

    EN: Implement a function that calculates the sum of digits for a given char array consisting of
    the digits 'O' to '9*. The function should return the digit sum as a long value.
    */

    protected static boolean isArabicSymbol(Character c) {//FOR: isArrayOfArabicSymbols
        for (int i = 0; i < ARABIC_NUMERALS.length(); i++) {
            if (c == ARABIC_NUMERALS.charAt(i)) return true;
        }
        return false;
    }

    protected static boolean isArrayOfArabicSymbols(char arr[]) {//FOR: task
        for (int i = 0; i < arr.length; i++) {
            if (isArabicSymbol(arr[i]) == false) {
                return false;
            }
        }
        return true;
    }

    public static long calcSumElements(char[] arr) {//1.1 FOO +tested
        if (isArrayOfArabicSymbols(arr) == false) {
            throw new IllegalArgumentException("The array does not contain an Arabic character");
        }

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += Character.getNumericValue(arr[i]);
        }
        return sum;
    }

    public long calcSumElements() {//1.1 OBJECT +tested
        if (isArrayOfArabicSymbols(array) == false) {
            throw new IllegalArgumentException("The array does not contain an Arabic character");
        }
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Character.getNumericValue(array[i]);
        }
        return sum;
    }

    /*
    2. Реализуйте Java функцию, которая находит два соседних числа в массиве с наименьшим расстоянием
    между собой. Функция должна возвращать индекс первого числа.
    Пример: в последовательности 4 8 6 1 2 9 4 минимальное расстояние равно 1 (от 1 до 2).
    Функция должна возвращать индекс 3 (числа 1).

    EN: Implement a Java function that finds two neighboring numbers in an array with the smallest distance
    to each other. The function should return the index of the first number.
    Example: In the sequence 4 8 6 1 2 9 4 the minimum distance is 1 (between 1 and 2).
    The function should return the index 3 (of number 1).
    */

    public static int findIndexOfTwoNeighboringNumbers(char[] arr) { //1.2 FOO +tested
        if (arr.length <= 1) {
            throw new IllegalArgumentException("The length must be > 1");
        }

        int sum = arr[0] + arr[1];
        int index = 0;

        for (int i = 2; i < arr.length; i++) {
            if (arr[i - 1] + arr[i] < sum) {
                sum = arr[i - 1] + arr[i];
                index = i - 1;
            }
        }
        return index;
    }

    public int findIndexOfTwoNeighboringNumbers() { //1.2 OBJECT +tested
        if (array.length <= 1) {
            throw new IllegalArgumentException("The length must be > 1");
        }

        int sum = array[0] + array[1];
        int index = 0;

        for (int i = 2; i < array.length; i++) {
            if (array[i - 1] + array[i] < sum) {
                sum = array[i - 1] + array[i];
                index = i - 1;
            }
        }
        return index;
    }


}
