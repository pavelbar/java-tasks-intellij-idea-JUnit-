package com.baranov.tests;

import com.baranov.core.MArrays;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;


class MArraysTest {

    private static final String ENGLISH_ALPHABET = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
    private static final String ARABIC_NUMERALS = "1234567890";

    private static final char[] ARRAY_FROM_ARABIC_NUMERALS = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
    private static final char[] ARRAY_FROM_ENGLISH_ALPHABET = {'A', 'a', 'B', 'b', 'C', 'c', 'D', 'd', 'E', 'e', 'F', 'f', 'G', 'g', 'H', 'h', 'J', 'j'};

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
        assertArrayEquals(result, ARRAY_FROM_ARABIC_NUMERALS);
    }

    //#################################################################################################
    //##### createArrayFromArray ######################################################################
    //#################################################################################################

    @Test
    public void createArrayFromArray_lengthArrayFromARABIC_NUMERALS() {
        MArrays a = new MArrays(ARRAY_FROM_ARABIC_NUMERALS);
        assertEquals(10, a.getLength());
    }

    @Test
    public void createArrayFromArray_IdentityArrayFromARABIC_NUMERALS() {
        MArrays a = new MArrays(ARRAY_FROM_ARABIC_NUMERALS);
        char[] result = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            result[i] = a.getEltAtIndex(i);
        }
        assertArrayEquals(result, ARRAY_FROM_ARABIC_NUMERALS);
    }

    @Test
    public void createArrayFromArray_lengthArrayFromLOW_ENGLISH_ALPHABET() {
        MArrays a = new MArrays(ARRAY_FROM_ENGLISH_ALPHABET);
        assertEquals(18, a.getLength());
    }

    @Test
    public void createArrayFromArray_IdentityArrayFromENGLISH_ALPHABET() {
        MArrays a = new MArrays(ARRAY_FROM_ENGLISH_ALPHABET);
        char[] result = new char[a.getLength()];
        for (int i = 0; i < a.getLength(); i++) {
            result[i] = a.getEltAtIndex(i);
        }
        assertArrayEquals(result, ARRAY_FROM_ENGLISH_ALPHABET);
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
}