package com.baranov.core;

import java.security.SecureRandom;

public class MArrays {
    private char x;
    private static final String ARABIC_NUMERALS = "1234567890";

    private char array[];

    /*##### Constructors ########################################################################*/

    public MArrays(int len) {//createEmptyArray +tested
        if (len < 0) {
            throw new IllegalArgumentException("Array dimensions cannot have a negative size");
        }
        array = new char[len];
    }

    public MArrays(char arr[]) {//createArrayFromArray +tested
        if (arr.length == 0) {
            array = null;
        } else {
            array = new char[arr.length];
            for (int i = 0; i < arr.length; i++) {
                array[i] = arr[i];
            }
        }
    }

    /*##### public methods ###################################################################*/

    public int getLength() {
        return array.length;
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

    public boolean setRandomSymbolsFromAlphabetToArray(int len, String Alphabet) {//---out
        if (len < 0) {
            throw new IllegalArgumentException("Array dimensions cannot have a negative size");
        }
        if (len == 0) {
            array = null;
            return true;
        }

        array = new char[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomSymbolFromAlphabet(Alphabet);
        }
        return true;
    }

    /*##### protected methods ###################################################################*/

    protected char getRandomSymbolFromAlphabet(String Alphabet) {
        SecureRandom rnd = new SecureRandom();
        return Alphabet.charAt(rnd.nextInt(Alphabet.length()));
    }

    protected boolean isArabicSymbol(Character c) {
        for (int i = 0; i < ARABIC_NUMERALS.length(); i++) {
            if (c == ARABIC_NUMERALS.charAt(i)) return true;
        }
        return false;
    }

    protected boolean isArrayOfArabicSymbols(char arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (isArabicSymbol(arr[i]) == false) {
                return false;
            }
        }
        return true;
    }

    /*##########################################################################################

    1. Реализуйте функцию, которая вычисляет сумму цифр для заданного массива символов, состоящего
    из цифр от O 'до' 9 *. Функция должна возвращать сумму цифр в виде длинного значения.
    */
    public long calcSumArrayElements(char[] arr) {//---out---//1.1
        if (isArrayOfArabicSymbols(arr) == false) {
            throw new IllegalArgumentException("The array does not contain an Arabic character");
        }

        long sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += Character.getNumericValue(arr[i]);
        }
        return sum;
    }

    public long calcSumArrayElements() {//---out---//1.1
        if (isArrayOfArabicSymbols(array) == false) {
            throw new IllegalArgumentException("The array does not contain an Arabic character");
        }
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Character.getNumericValue(array[i]);
        }
        return sum;
    }

}
