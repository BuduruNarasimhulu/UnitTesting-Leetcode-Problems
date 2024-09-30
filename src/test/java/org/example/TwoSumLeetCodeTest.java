package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumLeetCodeTest {

    @Test
    public void returnsIndicesOfTwoNumbers_whenTargetIsSumOfTwoElements_case1() {
        int[] inputArray = {2, 7, 11, 15};
        int target = 9;
        int[] expectedIndices = {0, 1};
        int[] actualIndices = TwoSumLeetCode.twoSum(inputArray, target);

        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    public void returnsIndicesOfTwoNumbers_whenTargetIsSumOfTwoElements_case2() {
        int[] inputArray = {3, 2, 4};
        int target = 6;
        int[] expectedIndices = {1, 2};
        int[] actualIndices = TwoSumLeetCode.twoSum(inputArray, target);

        assertArrayEquals(expectedIndices, actualIndices);
    }

    @Test
    public void returnsIndicesOfTwoNumbers_whenTargetIsSumOfIdenticalElements() {
        int[] inputArray = {3, 3};
        int target = 6;
        int[] expectedIndices = {0, 1};
        int[] actualIndices = TwoSumLeetCode.twoSum(inputArray, target);

        assertArrayEquals(expectedIndices, actualIndices);
    }
}
