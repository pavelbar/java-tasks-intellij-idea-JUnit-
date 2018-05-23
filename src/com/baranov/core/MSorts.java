package com.baranov.core;

import java.util.stream.IntStream;

public class MSorts {

    private int a, b, c;

    /*##### Constructors ########################################################################*/

    public MSorts(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /*##### standard methods ###################################################################*/

    public void setVariableA(int A) {
        a = A;
    }

    public void setVariableB(int B) {
        b = B;
    }

    public void setVariableC(int C) {
        c = C;
    }


    public int getVariableA() {
        return a;
    }

    public int getVariableB() {
        return b;
    }

    public int getVariableC() {
        return c;
    }
    /*##### tasks methods ######################################################################

    1. Реализовать метод с тремя локальными переменными int a b c,
    который сортирует эти три значения в порядке возрастания, сравнивая и обменивая их значения.
    В конце программы выполняется a <= b <= c
    */

    public void sortLocalVariables() {
        int temp;
        boolean flag = true;
        while (flag) {
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
                flag = false;
            }

            if (b > c) {
                temp = b;
                b = c;
                c = temp;
                flag = false;
            }

        }
    }

    /*
    2. Найти максимальный элемент в массиве
    */

    public static int findMax(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException("The length must be => 1");
        }

        int max = arr[0];

        for (int anArr : arr)
            if (anArr > max) {
                max = anArr;
            }
        return max;
    }

    /*
    3.
    */


    public static int findMaxStreams(int[] arr) {
        if (arr.length < 1) {
            throw new IllegalArgumentException("The length must be => 1");
        }

        return IntStream.of(arr).max().getAsInt();
    }
    /*
    4. Сортировать инт массив
    */

    public static void sortAscendingly(int[] arr) {
        int t;
        if (arr.length < 1) {
            throw new IllegalArgumentException("The length must be => 1");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
    }

    /*
    5. Написать функцию, которая сравнивает два инт массива.
    Возвращает -1, если первый массив короче второго
    Возвращает 1, в обратном случае
    Возвращает 0, если массивы равны
    */

    public static int compareTwoArraysLenghts(int[] arrA, int[] arrB) {
        int result = 0;

        if (arrA.length < arrB.length)
            result = -1;

        if (arrA.length > arrB.length)
            result = 1;

        return result;
    }
}