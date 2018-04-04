package com.baranov;

import com.baranov.core.MArrays;

class main {
    public static void main(String args[]) {
        System.out.printf("\n\n==============================================================");
        System.out.printf("\n===ARRAY========================================================");
        System.out.printf("\n================================================================\n");

        System.out.printf("\n=======TASK 1.1===========================================");

        System.out.printf("\n char Array1 = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']");
        char[] arr1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        MArrays a1 = new MArrays(arr1);
        System.out.printf("\n Object: The Sum array is %d", a1.calcSumElements());
        System.out.printf("\n Foo: The Sum array is %d", MArrays.calcSumElements(arr1));

        int[] arr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        MArrays a2 = new MArrays(arr2);

        //System.out.printf("\n Foo: The Sum array is %d", MArrays.calcSumElements(arr2));

        System.out.printf("\n=======TASK 1.2===========================================");

        System.out.printf("\n char array2 = ['4', '8', '6', '1', '2', '9', '4']");
        char[] arr3 = {'4', '8', '6', '1', '2', '9', '4'};
        MArrays a3 = new MArrays(arr3);
        System.out.printf("\n Object: Index of two neighboring numbers %d", a3.findIndexOfTwoNeighboringNumbers());
        System.out.printf("\n Foo: Index of two neighboring numbers %d", MArrays.findIndexOfTwoNeighboringNumbers(arr3));

        System.out.printf("\n=======TASK 1.3===========================================");
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

