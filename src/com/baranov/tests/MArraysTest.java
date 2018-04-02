package com.baranov.tests;

import com.baranov.core.MArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MArraysTest {
    @Test
    void test() {
        char[] x = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        assertEquals(45, MArrays.sumAll(x));
    }
}