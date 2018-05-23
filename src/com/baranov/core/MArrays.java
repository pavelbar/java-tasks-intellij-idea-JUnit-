package com.baranov.core;

import java.security.SecureRandom;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class MArrays {
    private static final String ARABIC_NUMERALS = "1234567890";
    private static final int MAX_ARABIC_NUMERALS = 9;
    private static final int RADIX_DEC = 10;

    private char array[];

    /*##### Constructors ########################################################################*/

    public MArrays(int len) {//createEmptyArray +tested
        if (len < 0) {
            throw new IllegalArgumentException("Array dimensions cannot have a negative size");
        }
        array = new char[len];
    }

    public MArrays(char arr[]) {//createArrayFromArrayChar +tested
        if (arr == null) {
            array = null;
        } else {
            array = new char[arr.length];
            System.arraycopy(arr, 0, array, 0, arr.length);
        }
    }

    public MArrays(int arr[]) {//createArrayFromArrayInt +tested
        for (int anArr : arr) {
            if ((anArr < 0) || (anArr > MAX_ARABIC_NUMERALS))
                throw new IllegalArgumentException("Number is not single-valued");
        }

        array = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            array[i] = Character.forDigit(arr[i], RADIX_DEC);
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

    private char getRandomSymbolFromAlphabet(String Alphabet) {//FOR: setRandomSymbolsFromAlphabetToArray
        SecureRandom rnd = new SecureRandom();
        return Alphabet.charAt(rnd.nextInt(Alphabet.length()));
    }

    public void setRandomSymbolsFromAlphabetToArray(String Alphabet) {// +tested
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomSymbolFromAlphabet(Alphabet);
        }
    }

    /*##### tasks methods ######################################################################

    1. Реализуйте функцию, которая вычисляет сумму цифр для заданного массива символов, состоящего
    из цифр от O 'до' 9 *. Функция должна возвращать сумму цифр в виде длинного значения.

    EN: Implement a function that calculates the sum of digits for a given char array consisting of
    the digits 'O' to '9*. The function should return the digit sum as a long value.
    */

    private static boolean isArabicSymbol(Character c) {//FOR: isArrayOfArabicSymbols
        for (int i = 0; i < ARABIC_NUMERALS.length(); i++) {
            if (c == ARABIC_NUMERALS.charAt(i)) return true;
        }
        return false;
    }

    private static boolean isArrayOfArabicSymbols(char arr[]) {//FOR: tasks
        for (char anArr : arr) {
            if ( /*!!!*/ !isArabicSymbol(anArr)) {
                return true;
            }
        }
        return false;
    }

    public static long getSumElements(char[] arr) {//1.1 char FOO +tested
        if ( /*!!!*/ isArrayOfArabicSymbols(arr)) {
            throw new IllegalArgumentException("The array does not contain an Arabic character");
        }

        long sum = 0;
        for (char anArr : arr) {

            sum += Character.getNumericValue(anArr);
        }
        return sum;
    }

    public static long getSumElements(int[] arr) {//1.1 int FOO +tested
        long sum = 0;
        for (int anArr : arr) {
            sum += anArr;
        }
        return sum;
    }

    public long getSumElements() {//1.1 OBJECT +tested
        if ( /*!!!*/ isArrayOfArabicSymbols(array)) {
            throw new IllegalArgumentException("The array does not contain an Arabic character");
        }
        long sum = 0;
        for (char anArray : array) {
            sum += Character.getNumericValue(anArray);
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
    public int findIndexOfTwoNeighboringNumbers() { //1.2 OBJECT +tested
        return MArrays.findIndexOfTwoNeighboringNumbers(array);
    }

    public static int findIndexOfTwoNeighboringNumbers(char[] arr) { //1.2 FOO +tested
        if (arr.length <= 1) {
            throw new IllegalArgumentException("The length must be > 1");
        }

        if ( /*!!!*/ isArrayOfArabicSymbols(arr)) {
            throw new IllegalArgumentException("The array does not contain an Arabic character");
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

    public static int findIndexOfTwoNeighboringNumbers(int[] arr) { //1.2 FOO +tested
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

    /*
    3. Реализуйте Java-основной метод, который выводит таблицу умножения для всех чисел из 1 до n.
    Используйте символ табуляции V, чтобы выровнять значения.
    Пример для n = 3:
    1 2 3
    2 4 6
    3 6 9

    EN: Implement a Java-main-method that prints out the multiplication table for all numbers from
    1	to n. Use the tabulator character V to align the values.
    Example for n = 3:
    1 2 3
    2 4 6
    3 6 9
     */

    public static int[] getArrayWithMulTable(int n) {//1.3 +tested
        if (n <= 0) {
            throw new IllegalArgumentException("The N must be > 0");
        }
        int[] result = new int[n * n];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                result[index] = i * j;
                index++;
            }
        }
        return result;
    }

    public static void printArrayWithMulTable(int arr[]) {//1.3 +tested
        if (arr == null) {
            throw new IllegalArgumentException("The print array is empty");
        }

        double lengthCheck = arr.length;
        if (Math.sqrt(lengthCheck) % 1 != 0) {
            throw new IllegalArgumentException("Invalid length. The multiplication table must be square");
        }

        int count = 0;
        for (int anArr : arr) {
            count++;
            System.out.printf("%d\t", anArr);
            if (count == Math.sqrt(lengthCheck)) {
                System.out.print("\n");
                count = 0;
            }
        }
    }

    /*
    4. Настройте массив и напишите программу, чтобы получить среднее значение для всех чисел.
    Пример: массив [23, 6,47, 35, 2,13]. Среднее значение равно 21.

    EN: 4.	Set up an array and write a program to get the average of all numbers.
    Example: Array is [23, 6,47, 35, 2,13]. Average is 21.
     */

    public double getAverage() {//1.4
        if (array.length < 1) {
            throw new IllegalArgumentException("The length must be >= 1");
        }

        return this.getSumElements() / (double) array.length;
    }

    public static double getAverage(char[] arr) {//1.4
        if (arr.length < 1) {
            throw new IllegalArgumentException("The length must be >= 1");
        }
        return MArrays.getSumElements(arr) / (double) arr.length;
    }

    public static double getAverage(int[] arr) {//1.4
        if (arr.length < 1) {
            throw new IllegalArgumentException("The length must be >= 1");
        }
        return MArrays.getSumElements(arr) / (double) arr.length;
    }

    /*
    5. Average Streams
     */

    public static double getAverageStreams(int[] arr) {//1.4
        if (arr.length < 1) {
            throw new IllegalArgumentException("The length must be >= 1");
        }
        IntStream i = IntStream.of(arr);
        OptionalDouble d = i.average();
        return d.getAsDouble();
    }

}