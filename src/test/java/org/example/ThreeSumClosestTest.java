package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThreeSumClosestTest {
    private  final  ThreeSumClosest testThreeSumClosestWithPositiveTesting=new ThreeSumClosest();
    @Test
    public void testExample1() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int expected = 2; // The closest sum to target is 2 (-1 + 2 + 1)
        int result = testThreeSumClosestWithPositiveTesting.threeSumClosest(nums, target);

        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        int[] nums = {0, 0, 0};
        int target = 1;
        int expected = 0; // The closest sum to target is 0 (0 + 0 + 0)
        int result = testThreeSumClosestWithPositiveTesting.threeSumClosest(nums, target);

        assertEquals(expected, result);
    }

    @Test
    public void testNegativeTarget() {
        int[] nums = {-1, -2, -3, -4};
        int target = -6;
        int expected = -6; // The closest sum to target is -6 (-1 + -2 + -3)
        int result = testThreeSumClosestWithPositiveTesting.threeSumClosest(nums, target);

        assertEquals(expected, result);
    }

    @Test
    public void testPositiveTargetWithMixedNumbers() {
        int[] nums = {-5, -2, 1, 4, 7};
        int target = 3;
        int expected = 3; // The closest sum to target is 3 (-5 + 4 + 4 or other similar combinations)
        int result = testThreeSumClosestWithPositiveTesting.threeSumClosest(nums, target);

        assertEquals(expected, result);
    }

    @Test
    public void testAllPositiveNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 10;
        int expected = 10; // The closest sum to target is 10 (3 + 4 + 3 or other similar combinations)
        int result = testThreeSumClosestWithPositiveTesting.threeSumClosest(nums, target);

        assertEquals(expected, result);
    }
}
