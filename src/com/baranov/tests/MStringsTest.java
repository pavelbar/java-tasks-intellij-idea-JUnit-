package com.baranov.tests;

import com.baranov.core.MStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MStringsTest {

    @Test
    void characterInLine_d() {
        assertEquals('d', MStrings.myCharAt("abcd", 3));
    }

    @Test
    void characterInLine_W() {
        assertEquals('W', MStrings.myCharAt("abcdW", 4));
    }

    @Test
    void checkContainsSubstring_yes() {
        assertTrue(MStrings.checkContainsSubstring("abcdef", "bcd"));
    }

    @Test
    void checkContainsSubstring_no() {
        assertFalse(MStrings.checkContainsSubstring("abcdef", "aaa"));
    }

    @Test
    void initialFromName_PB() {
        assertEquals("P.B.", MStrings.initialFromName("Pavel", "Baranov"));
    }

    @Test
    void initialFromName_II() {
        assertEquals("I.I.", MStrings.initialFromName("Ivanov", "Ivan"));
    }

    @Test
    void checkIsAnAnagram_yes() {
        assertTrue(MStrings.checkIsAnAnagram("lal", "lla"));
    }

    @Test
    void checkIsAnAnagram_no() {
        assertFalse(MStrings.checkIsAnAnagram("lal", "llb"));
    }

    @Test
    void hexToD_555() {
        assertEquals(555, MStrings.hexToD("22B"));
    }

    @Test
    void hexToD_666() {
        assertEquals(666, MStrings.hexToD("29A"));
    }
}