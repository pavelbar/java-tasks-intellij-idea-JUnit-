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
    public void createEmptyArray_canNotCreateArrayWithNegativeLengthIsOne() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    MArrays a = new MArrays(-1);
                });
    }

    @Test
    public void createEmptyArray_canNotCreateArrayWithNegativeLengthIsWwo() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    MArrays a = new MArrays(-2);
                });
    }

    @Test
    public void createEmptyArray_canCreateArrayWithlengthIsOne() {
        MArrays a = new MArrays(1);
        assertEquals(1, a.getLength());
    }

    @Test
    public void createEmptyArray_canCreateArrayWithlengthIsTwo() {
        MArrays a = new MArrays(2);
        assertEquals(2, a.getLength());
    }

    @Test
    public void createNotEmptyArray_IdentityForArraysFromARABIC_NUMERALS() {
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
    public void createArrayFromArrayC_lengthArrayFromARABIC_NUMERALS() {
        MArrays a = new MArrays(CHAR_ARRAY_FROM_ARABIC_NUMERALS);
        assertEquals(10, a.getLength());
    }

    @Test
    public void createArrayFromArrayC_IdentityArrayFromARABIC_NUMERALS() {
        MArrays a = new MArrays(CHAR_ARRAY_FROM_ARABIC_NUMERALS);
        char[] result = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            result[i] = a.getEltAtIndex(i);
        }
        assertArrayEquals(result, CHAR_ARRAY_FROM_ARABIC_NUMERALS);
    }

    @Test
    public void createArrayFromArrayC_lengthArrayFromLOW_ENGLISH_ALPHABET() {
        MArrays a = new MArrays(CHAR_ARRAY_FROM_ENGLISH_ALPHABET);
        assertEquals(18, a.getLength());
    }

    @Test
    public void createArrayFromArrayC_IdentityArrayFromENGLISH_ALPHABET() {
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
    public void createArrayFromArrayI_lengthArrayFromARABIC_NUMERALS() {
        MArrays a = new MArrays(INT_ARRAY_FROM_ARABIC_NUMERALS);
        assertEquals(10, a.getLength());
    }

    @Test
    public void createArrayFromArrayI_IdentityArrayFromARABIC_NUMERALS() {
        MArrays a = new MArrays(INT_ARRAY_FROM_ARABIC_NUMERALS);
        char[] result = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            result[i] = a.getEltAtIndex(i);
        }
        assertArrayEquals(result, CHAR_ARRAY_FROM_ARABIC_NUMERALS);
    }

    @Test
    public void createArrayFromArrayI_CheckLenghtOfArrayFromNullArray() {
        int[] arr = {};
        MArrays a = new MArrays(arr);
        assertEquals(a.getLength(), 0);
    }

    @Test
    public void createArrayFromArrayI_canNotCreateArrayWithNegativeDigits() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    int[] arr = {-1, -2, -3};
                    MArrays a = new MArrays(arr);
                });
    }
    //#################################################################################################
    //##### setRandomSymbolsFromAlphabetToArray #######################################################
    //#################################################################################################

    @Test
    public void setRandomSymbolsFromAlphabetToArray_NotIdentityArrayFromDifferentAlphabets() {
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
    public void setRandomSymbolsFromAlphabetToArray_IdentityArrayFromSameAlphabets() {
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
    public void setRandomSymbolsFromAlphabetToArray_CheckLength() {
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
    public void calcSumArrayElements_CharObject() {
        MArrays a = new MArrays(CHAR_ARRAY_FROM_ARABIC_NUMERALS);
        assertEquals(a.calcSumElements(), 45);
    }

    @Test
    public void calcSumArrayElements_CharFoo() {
        assertEquals(MArrays.calcSumElements(CHAR_ARRAY_FROM_ARABIC_NUMERALS), 45);
    }

    @Test
    public void calcSumArrayElements_IntObject() {
        MArrays a = new MArrays(INT_ARRAY_FROM_ARABIC_NUMERALS);
        assertEquals(a.calcSumElements(), 45);
    }

    @Test
    public void calcSumArrayElements_IntFoo() {
        assertEquals(MArrays.calcSumElements(INT_ARRAY_FROM_ARABIC_NUMERALS), 45);
    }

    @Test
    public void calcSumArrayElements_canNotCalcForCharObject() {
        MArrays a = new MArrays(77);
        a.setRandomSymbolsFromAlphabetToArray(ENGLISH_ALPHABET);
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    a.calcSumElements();
                });
    }

    @Test
    public void calcSumArrayElements_canNotCalcForCharFoo() {
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    MArrays.calcSumElements(CHAR_ARRAY_FROM_ENGLISH_ALPHABET);
                });
    }

    //#################################################################################################
    //##### 1.2  findIndexOfTwoNeighboringNumbers #####################################################
    //#################################################################################################

    @Test
    public void findIndexOfTwoNeighboringNumbers_CharObject() {
        char[] arr1 = {'4', '8', '6', '1', '2', '9', '4'};
        MArrays a = new MArrays(arr1);
        assertEquals(a.findIndexOfTwoNeighboringNumbers(), 3);
    }

    @Test
    public void findIndexOfTwoNeighboringNumbers_CharFoo() {
        char[] arr1 = {'4', '8', '6', '1', '2', '9', '4'};
        assertEquals(MArrays.findIndexOfTwoNeighboringNumbers(arr1), 3);
    }

    @Test
    public void findIndexOfTwoNeighboringNumbers_IntObject() {
        int[] arr1 = {4, 8, 6, 1, 2, 9, 4};
        MArrays a = new MArrays(arr1);
        assertEquals(a.findIndexOfTwoNeighboringNumbers(), 3);
    }

    @Test
    public void findIndexOfTwoNeighboringNumbers_IntFoo() {
        int[] arr1 = {4, 8, 6, 1, 2, 9, 4};
        assertEquals(MArrays.findIndexOfTwoNeighboringNumbers(arr1), 3);
    }

    //#################################################################################################
    //##### 1.3 MulTable ##############################################################################
    //#################################################################################################
    @Test
    public void getArrayWithMulTable_forNisThree() {
        int[] result = {1, 2, 3, 2, 4, 6, 3, 6, 9};
        assertArrayEquals(MArrays.getArrayWithMulTable(3), result);
    }

    @Test
    public void getArrayWithMulTable_forNisFour() {
        int[] result = {1, 2, 3, 4,
                        2, 4, 6, 8,
                        3, 6, 9, 12,
                        4, 8, 12, 16};
        assertArrayEquals(MArrays.getArrayWithMulTable(4), result);
    }

    @Test
    public void printArrayWithMulTable_canNotPrintInvalidArray() {
        int[] arr = {1, 2, 3};
        Throwable exception = assertThrows(IllegalArgumentException.class,
                () -> {
                    MArrays.printArrayWithMulTable(arr);
                });
    }

}