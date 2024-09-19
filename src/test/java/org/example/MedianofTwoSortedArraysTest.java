package org.example;

import junit.framework.TestCase;

public class MedianofTwoSortedArraysTest extends TestCase {

    private final MedianofTwoSortedArrays testMedianOfTwoSortedArraysWithPositiveTesting =new MedianofTwoSortedArrays();


    public void testFindMedianSortedArrays_case1() {
        int [] arrayOne={1,3};
        int [] arrayTwo={2};
        assertEquals(2.00,testMedianOfTwoSortedArraysWithPositiveTesting.findMedianSortedArrays(arrayOne,arrayTwo));

    }
    public void testFindMedianSortedArrays_case2() {
        int [] arrayOne={1,2};
        int [] arrayTwo={3,4};
        assertEquals(2.5000,testMedianOfTwoSortedArraysWithPositiveTesting.findMedianSortedArrays(arrayOne,arrayTwo));

    }

}