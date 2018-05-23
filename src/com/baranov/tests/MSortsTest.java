package com.baranov.tests;

import com.baranov.core.MSorts;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MSortsTest {

    //#################################################################################################
    //##### init three local variables ################################################################
    //#################################################################################################

    @Test
    void MSorts_canInitThreeLocalVariablesWithValuesIsOne() {
        MSorts a = new MSorts(1, 1, 1);
        assertEquals(1, a.getVariableA());
        assertEquals(1, a.getVariableB());
        assertEquals(1, a.getVariableC());
    }

    @Test
    void MSorts_canInitThreeLocalVariablesWithValuesIsTwo() {
        MSorts a = new MSorts(2, 2, 2);
        assertEquals(2, a.getVariableA());
        assertEquals(2, a.getVariableB());
        assertEquals(2, a.getVariableC());
    }

    @Test
    void MSorts_canInitThreeLocalVariablesWithDifferentValues() {
        MSorts a = new MSorts(1, 2, 3);
        assertEquals(1, a.getVariableA());
        assertEquals(2, a.getVariableB());
        assertEquals(3, a.getVariableC());
    }

    //#################################################################################################
    //##### set local variables ################################################################
    //#################################################################################################

    @Test
    void setVariableA_canSetLocalVariableWithValuesIsSeven() {
        MSorts a = new MSorts(1, 1, 1);
        a.setVariableA(7);
        assertEquals(7, a.getVariableA());
    }

    @Test
    void setVariableB_canSetLocalVariableWithValuesIsSeven() {
        MSorts a = new MSorts(1, 1, 1);
        a.setVariableB(7);
        assertEquals(7, a.getVariableB());
    }

    @Test
    void setVariableC_canSetLocalVariableWithValuesIsSeven() {
        MSorts a = new MSorts(1, 1, 1);
        a.setVariableC(7);
        assertEquals(7, a.getVariableC());
    }

    //#################################################################################################
    //##### 2.1  sortLocalVariables #################################################################
    //#################################################################################################

    @Test
    void sortLocalVariables_WithValuesIsOneTwoThree() {
        MSorts a = new MSorts(3, 1, 2);
        a.sortLocalVariables();
        assertEquals(1, a.getVariableA());
        assertEquals(2, a.getVariableB());
        assertEquals(3, a.getVariableC());
    }

    @Test
    void sortLocalVariables_WithNegativeValues() {
        MSorts a = new MSorts(-3, -7, -1);
        a.sortLocalVariables();
        assertEquals(-7, a.getVariableA());
        assertEquals(-3, a.getVariableB());
        assertEquals(-1, a.getVariableC());
    }

    @Test
    void sortLocalVariables_WithDifferentValues() {
        MSorts a = new MSorts(55, -53, 661);
        a.sortLocalVariables();
        assertEquals(-53, a.getVariableA());
        assertEquals(55, a.getVariableB());
        assertEquals(661, a.getVariableC());
    }

    //####################################################################################
    //##### 2.2  findMax #################################################################
    //####################################################################################

    @Test
    void findMax_Foo() {
        int[] arr1 = {1, 2, 77, 3, 5, 1, -1};
        assertEquals(77, MSorts.findMax(arr1));
    }

    //####################################################################################
    //##### 2.4  sortAscendingly #########################################################
    //####################################################################################

    @Test
    void sortAscendingly_Foo() {
        int[] arr1 = {3, 2, 1, 11, -11, 100, 200};
        int[] arr2 = {-11, 1, 2, 3, 11, 100, 200};
        MSorts.sortAscendingly(arr1);
        assertArrayEquals(arr2, arr1);
    }

    //####################################################################################
    //##### 2.5  compareTwoArraysLenghts #################################################
    //####################################################################################
    @Test
    void compareTwoArraysLenghts_NegativeOne() {
        int[] arr1 = {3, 2, 1, 11, -11, 100, 200};
        int[] arr2 = {-11, 1, 2};
        assertEquals(-1, MSorts.compareTwoArraysLenghts(arr2, arr1));
    }

    @Test
    void compareTwoArraysLenghts_Null() {
        int[] arr1 = {-11, 1, 2};
        int[] arr2 = {3, 2, 1};
        assertEquals(0, MSorts.compareTwoArraysLenghts(arr2, arr1));
    }

    @Test
    void compareTwoArraysLenghts_One() {
        int[] arr1 = {-11, 1, 2};
        int[] arr2 = {3, 2, 1, 11, -11, 100, 200};
        assertEquals(1, MSorts.compareTwoArraysLenghts(arr2, arr1));
    }

    //streammax

    @Test
    void findMaxStream_Foo() {
        int[] arr1 = {1, 2, 77, 3, 5, 1, -1};
        assertEquals(77, MSorts.findMaxStreams(arr1));
    }
}