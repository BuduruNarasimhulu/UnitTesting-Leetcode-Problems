package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class ThreeSumTest {
    private  final ThreeSum threeSum = new ThreeSum();

    @Test
    public void testExample1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -1, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = threeSum.threeSum(nums);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }

    @Test
    public void testExample2() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> result = threeSum.threeSum(nums);

        assertTrue(result.isEmpty());
    }

    @org.junit.Test
    @Test
    public void testExample3() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 0, 0)
        );
        List<List<Integer>> result = threeSum.threeSum(nums);

        assertEquals(expected.size(), result.size());
        assertTrue(result.containsAll(expected) && expected.containsAll(result));
    }
}

