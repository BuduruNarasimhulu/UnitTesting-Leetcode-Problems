package org.example;

import junit.framework.TestCase;

public class BiggestNumberOfTheArrayTest extends TestCase {

    public void testFindBiggestNumber() {
        assertEquals(55, BiggestNumberOfTheArray.findBiggestNumber(new int[]{1, 2, 3, 4, 55, 9}));

    }

    public void testFindMinimumNumber() {
        assertEquals(1, BiggestNumberOfTheArray.findMinimumNumber(new int[]{1, 2, 3, 4, 55, 9}));
        assertEquals(-12, BiggestNumberOfTheArray.findMinimumNumber(new int[]{-12, -1, 1, 2, 3, 5}));

    }
}