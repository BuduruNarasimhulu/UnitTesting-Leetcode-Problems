package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianofTwoSortedArraysTest {

    private final MedianofTwoSortedArrays medianFinder = new MedianofTwoSortedArrays();

    @Test
    void testFindMedianSortedArrays_ValidArraysOddLength() {
        int[] firstArray = {1, 3};
        int[] secondArray = {2};
        double expectedMedian = 2.0;
        assertEquals(expectedMedian, medianFinder.findMedianSortedArrays(firstArray, secondArray));
    }

    @Test
    void testFindMedianSortedArrays_ValidArraysEvenLength() {
        int[] firstArray = {1, 2};
        int[] secondArray = {3, 4};
        double expectedMedian = 2.5;
        assertEquals(expectedMedian, medianFinder.findMedianSortedArrays(firstArray, secondArray));
    }

    @Test
    void testFindMedianSortedArrays_OneEmptyArray() {
        int[] firstArray = {};
        int[] secondArray = {1, 2, 3, 4, 5};
        double expectedMedian = 3.0;
        assertEquals(expectedMedian, medianFinder.findMedianSortedArrays(firstArray, secondArray));
    }

    @Test
    void testFindMedianSortedArrays_BothEmptyArrays() {
        int[] firstArray = {};
        int[] secondArray = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            medianFinder.findMedianSortedArrays(firstArray, secondArray);
        });
        assertEquals("Both arrays are empty", exception.getMessage());
    }

    @Test
    void testFindMedianSortedArrays_NullFirstArray() {
        int[] secondArray = {1, 2, 3};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            medianFinder.findMedianSortedArrays(null, secondArray);
        });
        assertEquals("Input arrays cannot be null", exception.getMessage());
    }

    @Test
    void testFindMedianSortedArrays_NullSecondArray() {
        int[] firstArray = {1, 2, 3};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            medianFinder.findMedianSortedArrays(firstArray, null);
        });
        assertEquals("Input arrays cannot be null", exception.getMessage());
    }

    @Test
    void testFindMedianSortedArrays_IdenticalElements() {
        int[] firstArray = {2, 2};
        int[] secondArray = {2, 2};
        double expectedMedian = 2.0;
        assertEquals(expectedMedian, medianFinder.findMedianSortedArrays(firstArray, secondArray));
    }

    @Test
    void testFindMedianSortedArrays_NegativeAndPositiveNumbers() {
        int[] firstArray = {-3, -1, 0};
        int[] secondArray = {1, 2, 3};
        double expectedMedian = 0.5;
        assertEquals(expectedMedian, medianFinder.findMedianSortedArrays(firstArray, secondArray));
    }

    @Test
    void testFindMedianSortedArrays_LargeNumbers() {
        int[] firstArray = {Integer.MAX_VALUE};
        int[] secondArray = {Integer.MIN_VALUE};
        double expectedMedian = -0.5;
        assertEquals(expectedMedian, medianFinder.findMedianSortedArrays(firstArray, secondArray));
    }
}
