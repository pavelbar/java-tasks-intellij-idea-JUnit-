package com.baranov.tests;

import com.baranov.core.MArrays;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class MArraysTest {

    private static final String ENGLISH_ALPHABET = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
    private static final String ARABIC_NUMERALS = "1234567890";

    private static final char[] CHAR_ARRAY_FROM_ARABIC_NUMERALS = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    private static final char[] CHAR_ARRAY_FROM_ENGLISH_ALPHABET = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'J', 'j'};

    private static final int[] INT_ARRAY_FROM_ARABIC_NUMERALS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    //#################################################################################################
    //##### createNewArray ############################################################################
    //#################################################################################################

    @Test
    void createEmptyArray_canNotCreateArrayWithNegativeLengthIsOne() {
        assertThrows(IllegalArgumentException.class,
                () -> new MArrays(-1));
    }

    @Test
    void createEmptyArray_canNotCreateArrayWithNegativeLengthIsWwo() {
        assertThrows(IllegalArgumentException.class,
                () -> new MArrays(-2));
    }

    @Test
    void createEmptyArray_canCreateArrayWithlengthIsOne() {
        MArrays a = new MArrays(1);
        assertEquals(1, a.getLength());
    }

    @Test
    void createEmptyArray_canCreateArrayWithlengthIsTwo() {
        MArrays a = new MArrays(2);
        assertEquals(2, a.getLength());
    }

    @Test
    void createNotEmptyArray_IdentityForArraysFromARABIC_NUMERALS() {
        MArrays a = new MArrays(10);

        a.setEltAtIndex('1', 0);
        a.setEltAtIndex('2', 1);
        a.setEltAtIndex('3', 2);
        a.setEltAtIndex('4', 3);
        a.setEltAtIndex('5', 4);
        a.setEltAtIndex('6', 5);
        a.setEltAtIndex('7', 6);
        a.setEltAtIndex('8', 7);
        a.setEltAtIndex('9', 8);
        a.setEltAtIndex('0', 9);

        char[] result = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            result[i] = a.getEltAtIndex(i);
        }
        assertArrayEquals(result, CHAR_ARRAY_FROM_ARABIC_NUMERALS);
    }

    //#################################################################################################
    //##### createArrayFromArrayC ######################################################################
    //#################################################################################################

    @Test
    void createArrayFromArrayC_lengthArrayFromARABIC_NUMERALS() {
        MArrays a = new MArrays(CHAR_ARRAY_FROM_ARABIC_NUMERALS);
        assertEquals(10, a.getLength());
    }

    @Test
    void createArrayFromArrayC_IdentityArrayFromARABIC_NUMERALS() {
        MArrays a = new MArrays(CHAR_ARRAY_FROM_ARABIC_NUMERALS);
        char[] result = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            result[i] = a.getEltAtIndex(i);
        }
        assertArrayEquals(result, CHAR_ARRAY_FROM_ARABIC_NUMERALS);
    }

    @Test
    void createArrayFromArrayC_lengthArrayFromLOW_ENGLISH_ALPHABET() {
        MArrays a = new MArrays(CHAR_ARRAY_FROM_ENGLISH_ALPHABET);
        assertEquals(18, a.getLength());
    }

    @Test
    void createArrayFromArrayC_lengthArrayFromUP_ENGLISH_ALPHABET() {
        MArrays a = new MArrays(CHAR_ARRAY_FROM_ENGLISH_ALPHABET);
        char[] result = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            result[i] = a.getEltAtIndex(i);
        }
        assertArrayEquals(result, CHAR_ARRAY_FROM_ENGLISH_ALPHABET);
    }

    //#################################################################################################
    //##### createArrayFromArrayI ######################################################################
    //#################################################################################################

    @Test
    void createArrayFromArrayI_lengthArrayFromARABIC_NUMERALS() {
        MArrays a = new MArrays(INT_ARRAY_FROM_ARABIC_NUMERALS);
        assertEquals(10, a.getLength());
    }

    @Test
    void createArrayFromArrayI_IdentityArrayFromARABIC_NUMERALS() {
        MArrays a = new MArrays(INT_ARRAY_FROM_ARABIC_NUMERALS);
        char[] result = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            result[i] = a.getEltAtIndex(i);
        }
        assertArrayEquals(result, CHAR_ARRAY_FROM_ARABIC_NUMERALS);
    }

    @Test
    void createArrayFromArrayI_CheckLenghtOfArrayFromNullArray() {
        int[] arr = {};
        MArrays a = new MArrays(arr);
        assertEquals(a.getLength(), 0);
    }

    @Test
    void createArrayFromArrayI_canNotCreateArrayWithNegativeDigits() {
        assertThrows(IllegalArgumentException.class,
                () -> {
                    int[] arr = {-1, -2, -3};
                    new MArrays(arr);
                });
    }
    //#################################################################################################
    //##### setRandomSymbolsFromAlphabetToArray #######################################################
    //#################################################################################################

    @Test
    void setRandomSymbolsFromAlphabetToArray_NotIdentityArrayFromDifferentAlphabets() {
        MArrays a = new MArrays(1000);
        MArrays b = new MArrays(1000);

        a.setRandomSymbolsFromAlphabetToArray(ENGLISH_ALPHABET);
        b.setRandomSymbolsFromAlphabetToArray(ARABIC_NUMERALS);

        char[] resultA = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            resultA[i] = a.getEltAtIndex(i);
        }

        char[] resultB = new char[b.getLength()];
        for (int i = 0; i < b.getLength(); i++) {
            resultB[i] = b.getEltAtIndex(i);
        }
        assertFalse(Arrays.equals(resultA, resultB));
    }

    @Test
    void setRandomSymbolsFromAlphabetToArray_IdentityArrayFromSameAlphabets() {
        MArrays a = new MArrays(1000);
        MArrays b = new MArrays(1000);

        a.setRandomSymbolsFromAlphabetToArray("AAAAA");
        b.setRandomSymbolsFromAlphabetToArray("AAAAA");

        char[] resultA = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            resultA[i] = a.getEltAtIndex(i);
        }

        char[] resultB = new char[b.getLength()];
        for (int i = 0; i < b.getLength(); i++) {
            resultB[i] = b.getEltAtIndex(i);
        }
        assertArrayEquals(resultA, resultB);
    }

    @Test
    void setRandomSymbolsFromAlphabetToArray_CheckLength() {
        MArrays a = new MArrays(1234);

        a.setRandomSymbolsFromAlphabetToArray(ENGLISH_ALPHABET);

        char[] resultA = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            resultA[i] = a.getEltAtIndex(i);
        }

        assertEquals(resultA.length, 1234);
    }

    //#################################################################################################
    //##### 1.1  calcSumArrayElements #################################################################
    //#################################################################################################

    @Test
    void calcSumArrayElements_CharObject() {
        MArrays a = new MArrays(CHAR_ARRAY_FROM_ARABIC_NUMERALS);
        assertEquals(a.getSumElements(), 45);
    }

    @Test
    void calcSumArrayElements_CharFoo() {
        assertEquals(MArrays.getSumElements(CHAR_ARRAY_FROM_ARABIC_NUMERALS), 45);
    }

    @Test
    void calcSumArrayElements_IntObject() {
        MArrays a = new MArrays(INT_ARRAY_FROM_ARABIC_NUMERALS);
        assertEquals(a.getSumElements(), 45);
    }

    @Test
    void calcSumArrayElements_IntFoo() {
        assertEquals(MArrays.getSumElements(INT_ARRAY_FROM_ARABIC_NUMERALS), 45);
    }

    @Test
    void calcSumArrayElements_canNotCalcForCharObject() {
        MArrays a = new MArrays(77);
        a.setRandomSymbolsFromAlphabetToArray(ENGLISH_ALPHABET);
        assertThrows(IllegalArgumentException.class,
                a::getSumElements);
    }

    @Test
    void calcSumArrayElements_canNotCalcForCharFoo() {
        assertThrows(IllegalArgumentException.class,
                () -> MArrays.getSumElements(CHAR_ARRAY_FROM_ENGLISH_ALPHABET));
    }

    //#################################################################################################
    //##### 1.2  findIndexOfTwoNeighboringNumbers #####################################################
    //#################################################################################################

    @Test
    void findIndexOfTwoNeighboringNumbers_CharObject() {
        char[] arr1 = {'4', '8', '6', '1', '2', '9', '4'};
        MArrays a = new MArrays(arr1);
        assertEquals(a.findIndexOfTwoNeighboringNumbers(), 3);
    }

    @Test
    void findIndexOfTwoNeighboringNumbers_CharFoo() {
        char[] arr1 = {'4', '8', '6', '1', '2', '9', '4'};
        assertEquals(MArrays.findIndexOfTwoNeighboringNumbers(arr1), 3);
    }

    @Test
    void findIndexOfTwoNeighboringNumbers_IntObject() {
        int[] arr1 = {4, 8, 6, 1, 2, 9, 4};
        MArrays a = new MArrays(arr1);
        assertEquals(a.findIndexOfTwoNeighboringNumbers(), 3);
    }

    @Test
    void findIndexOfTwoNeighboringNumbers_IntFoo() {
        int[] arr1 = {4, 8, 6, 1, 2, 9, 4};
        assertEquals(MArrays.findIndexOfTwoNeighboringNumbers(arr1), 3);
    }

    //#################################################################################################
    //##### 1.3 MulTable ##############################################################################
    //#################################################################################################

    @Test
    void getArrayWithMulTable_forNisThree() {
        int[] result = {1, 2, 3, 2, 4, 6, 3, 6, 9};
        assertArrayEquals(MArrays.getArrayWithMulTable(3), result);
    }

    @Test
    void getArrayWithMulTable_forNisFour() {
        int[] result = {1, 2, 3, 4,
                2, 4, 6, 8,
                3, 6, 9, 12,
                4, 8, 12, 16};
        assertArrayEquals(MArrays.getArrayWithMulTable(4), result);
    }

    @Test
    void printArrayWithMulTable_canNotPrintInvalidArray() {
        int[] arr = {1, 2, 3};
        assertThrows(IllegalArgumentException.class,
                () -> MArrays.printArrayWithMulTable(arr));
    }

    //#################################################################################################
    //##### 1.4 getAverage ##############################################################################
    //#################################################################################################
    @Test
    void getAverage_FooForIntArrOne() {
        int[] arr1 = {1, 2, 3, 5, 6};
        assertEquals(MArrays.getAverage(arr1), 3.4);
    }

    @Test
    void getAverage_FooForIntArrTwo() {
        int[] arr1 = {11, 22, 33, 55, 66};
        assertEquals(MArrays.getAverage(arr1), 37.4);
    }

    @Test
    void getAverage_FooForCharArr() {
        char[] arr1 = {'7', '7', '8', '8', '4'};
        assertEquals(MArrays.getAverage(arr1), 6.8);
    }

    @Test
    void getAverage_ObjectForCharArr() {
        char[] arr1 = {'7', '7', '8', '8', '4'};
        MArrays a = new MArrays(arr1);
        assertEquals(a.getAverage(), 6.8);
    }

    //#################################################################################################
    //##### 1.5 getAverage Streams ##############################g##########################################
    //#################################################################################################
    @Test
    void getAverageStreams() {
        int[] arr = {7, 7, 8, 8, 4};
        assertEquals(MArrays.getAverageStreams(arr), 6.8);
    }
}