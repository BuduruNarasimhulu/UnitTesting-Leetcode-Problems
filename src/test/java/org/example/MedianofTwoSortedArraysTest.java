package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MedianofTwoSortedArraysTest {

    private final MedianofTwoSortedArrays medianFinder = new MedianofTwoSortedArrays();

    @Test
    public void returnsMedian_whenFirstArrayHasOneElementAndSecondArrayHasTwo() {
        int[] arrayOne = {1, 3};
        int[] arrayTwo = {2};
        assertEquals(2.00, medianFinder.findMedianSortedArrays(arrayOne, arrayTwo), 0.0001);
    }

    @Test
    public void returnsMedian_whenBothArraysHaveEvenNumberOfElements() {
        int[] arrayOne = {1, 2};
        int[] arrayTwo = {3, 4};
        assertEquals(2.5, medianFinder.findMedianSortedArrays(arrayOne, arrayTwo), 0.0001);
    }
}
