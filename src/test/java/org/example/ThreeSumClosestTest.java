package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeSumClosestTest {

    private final ThreeSumClosest threeSumClosestSolver = new ThreeSumClosest();

    @Test
    public void returnsClosestSum_whenTargetIsPositiveWithMixedNumbers() {
        int[] numbers = {-1, 2, 1, -4};
        int target = 1;
        int expectedClosestSum = 2; // The closest sum to target is 2 (-1 + 2 + 1)
        int actualClosestSum = threeSumClosestSolver.threeSumClosest(numbers, target);

        assertEquals(expectedClosestSum, actualClosestSum);
    }

    @Test
    public void returnsClosestSum_whenAllNumbersAreZero() {
        int[] numbers = {0, 0, 0};
        int target = 1;
        int expectedClosestSum = 0; // The closest sum to target is 0 (0 + 0 + 0)
        int actualClosestSum = threeSumClosestSolver.threeSumClosest(numbers, target);

        assertEquals(expectedClosestSum, actualClosestSum);
    }

    @Test
    public void returnsClosestSum_whenTargetIsNegativeWithAllNegativeNumbers() {
        int[] numbers = {-1, -2, -3, -4};
        int target = -6;
        int expectedClosestSum = -6; // The closest sum to target is -6 (-1 + -2 + -3)
        int actualClosestSum = threeSumClosestSolver.threeSumClosest(numbers, target);

        assertEquals(expectedClosestSum, actualClosestSum);
    }

    @Test
    public void returnsClosestSum_whenMixedPositiveAndNegativeNumbersGiven() {
        int[] numbers = {-5, -2, 1, 4, 7};
        int target = 3;
        int expectedClosestSum = 3; // The closest sum to target is 3 (-5 + 1 + 7)
        int actualClosestSum = threeSumClosestSolver.threeSumClosest(numbers, target);

        assertEquals(expectedClosestSum, actualClosestSum);
    }

    @Test
    public void returnsClosestSum_whenAllNumbersArePositive() {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 10;
        int expectedClosestSum = 10; // The closest sum to target is 10 (2 + 3 + 5)
        int actualClosestSum = threeSumClosestSolver.threeSumClosest(numbers, target);

        assertEquals(expectedClosestSum, actualClosestSum);
    }
}


