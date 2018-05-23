package com.baranov;

import com.baranov.core.MArrays;
import com.baranov.core.MFiles;
import com.baranov.core.MStrings;

import java.io.IOException;

class main {

    private static final String ARABIC_NUMERALS = "1234567890";

    public static void main(String args[]) throws IOException {

        System.out.print("\n\n================================================================");
        System.out.print("\n==================         FILE          =======================");
        System.out.print("\n================================================================\n");
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 4.1===========================================");
        System.out.print("\n 4.1 Open file and invert:");
        System.out.print("\n Source: ");
        System.out.print("\n1 ");
        System.out.print("\n22: ");
        System.out.print("\n333: ");
        System.out.print("\n4444: ");
        System.out.print("\n55555: ");
        System.out.print("\n\n Result: \n");
        MFiles.readAndInvert("C:/AAA_DEVLOP/HARMAN", "1.txt");
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 4.2===========================================");
        System.out.print("\n List .txt files: \n");
        MFiles.printListFolder("C:/AAA_DEVLOP/HARMAN");
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 4.3===========================================");
        System.out.print("\n The file 1.txt was copied to output.txt \n");
        MFiles.CopyFile("C:/AAA_DEVLOP/HARMAN", "1.txt", "output.txt");
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 4.4===========================================");
        System.out.print("\n Different files for 1.txt to Dresult1.txt and Dresult2.txt \n");
        MFiles.DifferentFiles("1.txt", "Dresult1.txt", "Dresult2.txt");
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 4.5===========================================");
        System.out.print("\n Upping and doublespacing for 'UPPERsource.txt' to 'UPPERresult.txt'  \n");
        MFiles.EdditTextFile("UPPERsource.txt", "UPPERresult.txt");
        //
        //
        //
        //
        //
        System.out.print("\n\n================================================================");
        System.out.print("\n==================        STRINGS          =====================");
        System.out.print("\n================================================================\n");
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 3.1===========================================");
        System.out.printf("\n Character 3 in line 'abcd' %c", MStrings.myCharAt("abcd", 3));
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 3.2===========================================");
        System.out.print("\n Is substring 'bcd' in line 'abcdef'? Answer: ");
        System.out.println(MStrings.checkContainsSubstring("abcdef", "bcd") ? "yes" : "no");
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 3.3===========================================");
        System.out.printf("\n Initial from name 'Pavel Baranov': %s", MStrings.initialFromName("Pavel", "Baranov"));
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 3.4===========================================");
        System.out.print("\n 'lal' is a anagram for 'llb'? Answer: ");
        System.out.println(MStrings.checkIsAnAnagram("lal", "llb") ? "yes" : "no");
        System.out.print("\n 'lal' is a anagram for 'lla'? Answer: ");
        System.out.println(MStrings.checkIsAnAnagram("lal", "lla") ? "yes" : "no");
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 3.5===========================================");
        System.out.printf("\n HEX '22B' to dec (555): %d", MStrings.hexToD("22B"));
        System.out.printf("\n HEX '22B' to dec (666): %d", MStrings.hexToD("29A"));
        //
        //
        //
        //
        //
        System.out.print("\n\n================================================================");
        System.out.print("\n==================        ARRAY        =========================");
        System.out.print("\n================================================================\n");
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 1.1===========================================");
        //
        //
        //
        //
        //
        System.out.print("\n char Array1 = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']");
        char[] arr1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        MArrays a1 = new MArrays(arr1);
        System.out.printf("\n Object: The Sum array is %d", a1.getSumElements());
        System.out.printf("\n Foo: The Sum array is %d", MArrays.getSumElements(arr1));

        System.out.print("\n\n int Array2 = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        MArrays a2 = new MArrays(arr2);
        System.out.printf("\n Object: The Sum array is %d", a2.getSumElements());
        System.out.printf("\n Foo: The Sum array is %d", MArrays.getSumElements(arr2));

        System.out.print("\n\n char random Array3 = [");
        MArrays a3 = new MArrays(10);
        a3.setRandomSymbolsFromAlphabetToArray(ARABIC_NUMERALS);
        for (int i = 0; i < a3.getLength(); i++) {
            System.out.printf("%c", a3.getEltAtIndex(i));
            if (i != a3.getLength() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.printf("\n Object: The Sum array is %d", a3.getSumElements());

        System.out.print("\n\n int Array4 = [11, 22, 33, 44]");
        int[] arr4 = {11, 22, 33, 44};
        System.out.printf("\n Foo: The Sum array is %d", MArrays.getSumElements(arr4));
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 1.2===========================================");
        //
        //
        //
        //
        //
        System.out.print("\n char array1 = ['4', '8', '6', '1', '2', '9', '4']");
        char[] arrB1 = {'4', '8', '6', '1', '2', '9', '4'};
        MArrays b1 = new MArrays(arrB1);
        System.out.printf("\n Object: Index of two neighboring numbers  is %d", b1.findIndexOfTwoNeighboringNumbers());
        System.out.printf("\n Foo: Index of two neighboring numbers is %d", MArrays.findIndexOfTwoNeighboringNumbers(arrB1));

        System.out.print("\n\n int Array2 = [4, 8, 6, 1, 2, 9, 4]");
        int[] arrB2 = {4, 8, 6, 1, 2, 9, 4};
        MArrays b2 = new MArrays(arrB2);
        System.out.printf("\n Object: Index of two neighboring numbers is  %d", b2.findIndexOfTwoNeighboringNumbers());
        System.out.printf("\n Foo: Index of two neighboring numbers is %d", MArrays.findIndexOfTwoNeighboringNumbers(arrB2));

        System.out.print("\n\n char random Array3 = [");
        MArrays b3 = new MArrays(10);
        b3.setRandomSymbolsFromAlphabetToArray(ARABIC_NUMERALS);
        for (int i = 0; i < b3.getLength(); i++) {
            System.out.printf("%c", b3.getEltAtIndex(i));
            if (i != b3.getLength() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.printf("\n Object: Index of two neighboring numbers is %d", b3.findIndexOfTwoNeighboringNumbers());

        System.out.print("\n\n int Array4 = [44, 88, 66, 11, 22]");
        int[] arrB4 = {44, 88, 66, 11, 22};
        System.out.printf("\n Foo: Index of two neighboring numbers is %d", MArrays.findIndexOfTwoNeighboringNumbers(arrB4));

        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 1.3===========================================");
        //
        //
        //
        //
        //
        System.out.print("\n Use method getMulTable then use method printMulTable for N = 6\n");
        MArrays.printArrayWithMulTable(MArrays.getArrayWithMulTable(6));

        System.out.print("\n\n Use method getMulTable then use method printMulTable for N = 7\n");
        MArrays.printArrayWithMulTable(MArrays.getArrayWithMulTable(7));
        //
        //
        //
        //
        //
        System.out.print("\n=======TASK 1.4===========================================");
        //
        //
        //
        //
        //
        System.out.print("\n char Array1 = ['2', '6', '4', '3', '2', '1']");
        char[] arrC1 = {'2', '6', '4', '3', '2', '1'};
        MArrays c1 = new MArrays(arrC1);
        System.out.printf("\n Object: The Average is %f", c1.getAverage());
        System.out.printf("\n Foo: The Average is %f", MArrays.getAverage(arrC1));

        System.out.print("\n\n int Array2 = [2, 6, 4, 3, 2, 1]");
        int[] arrC2 = {2, 6, 4, 3, 2, 1};
        MArrays c2 = new MArrays(arrC2);
        System.out.printf("\n Object: The Average is %f", c2.getAverage());

        System.out.print("\n\n int Array3 = [11, 22, 33, 44, 55, 66]");
        int[] arrC3 = {11, 22, 33, 44, 55, 66};
        System.out.printf("\n Foo: The Average is %f", MArrays.getAverage(arrC3));

        System.out.print("\n\n char random Array4 = [");
        MArrays c4 = new MArrays(10);
        c4.setRandomSymbolsFromAlphabetToArray(ARABIC_NUMERALS);
        for (int i = 0; i < c4.getLength(); i++) {
            System.out.printf("%c", c4.getEltAtIndex(i));
            if (i != c4.getLength() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.printf("\n Object: The Average is %f", c4.getAverage());
        //
        //
        //
        //
        //
    }
}


/*
Java tasks
1.	Arrays
1.	Implement a function that calculates the sum of digits for a given char array consisting of the digits 'O' to '9*. The function should return the digit sum as a long value.
2.	Implement a Java function that finds two neighboring numbers in an array with the smallest distance to each other. The function should return the index of the first number.
Example: In the sequence 4 8 6 1 2 9 4 the minimum distance is 1 (between 1 and 2). The function should return the index 3 (of number 1).
3.	Implement a Java-main-method that prints out the multiplication table for all numbers from
1	to n. Use the tabulator character V to align the values.
Example for n = 3:
12 3
2	4 6
3	6 9
4.	Set up an array and write a program to get the average of all numbers.
Example: Array is [23, 6,47, 35, 2,13]. Average is 21.
5.	Do item 4 using Java 8 streams.
2. Sorts
1.	Implement a Java-method with three local int variables a, b, and c that sorts these three values in ascending order by comparing and exchanging their values. At the end of the program a <= b <= c must hold.
2.	Find the maximum element of an array.
3.	Do item 3 using Java 8 streams.
4.	Sort an integer array without using Arrays.sort().
5.	Write a function to compare two integer arrays. It returns -1 if the first array shorter than the second one, +1 in a backwards case and 0 if arrays are equals.
 */

/*
Задачи Java
1. Массивы

1. Реализуйте функцию, которая вычисляет сумму цифр для заданного массива символов, состоящего
 из цифр от O 'до' 9 *. Функция должна возвращать сумму цифр в виде длинного значения.
2. Реализуйте функцию Java, которая находит два соседних числа в массиве с наименьшим
расстоянием между собой. Функция должна возвращать индекс первого числа.
Пример: в последовательности 4 8 6 1 2 9 4 минимальное расстояние равно 1 (от 1 до 2). Функция
должна возвращать индекс 3 (числа 1).
3. Реализуйте Java-основной метод, который выводит таблицу умножения для всех чисел из 1 до n.
Используйте символ табуляции V, чтобы выровнять значения.
Пример для n = 3:
12 3
2 4 6
3 6 9
4. Настройте массив и напишите программу, чтобы получить среднее значение для всех чисел.
Пример: массив [23, 6,47, 35, 2,13]. Среднее значение равно 21.
5. Сделайте элемент 4 с использованием потоков Java 8.

2. Сортировка
1. Внедрить Java-метод с тремя локальными переменными a, b и c, которые сортируют эти три
 значения в порядке возрастания, сравнивая и обменивая их значения. В конце программы должно
 выполняться условие <= b <= c.
2. Найдите максимальный элемент массива.
3. Сделайте элемент 3, используя потоки Java 8.
4. Сортируйте целочисленный массив без использования Array.sort ().
5. Напишите функцию для сравнения двух целых массивов. Он возвращает -1, если первый массив
 короче второго, +1 в обратном случае и 0, если массивы равны.
 */
