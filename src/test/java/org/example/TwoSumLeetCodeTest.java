package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumLeetCodeTest extends TestCase {

    public void testTwoSum_case1() {
        int[] arrayOne = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = TwoSumLeetCode.twoSum(arrayOne, target);
        assertArrayEquals(expected, result);
    }
    public void testTwoSum_case2(){
        int[] arrayTwo = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] result = TwoSumLeetCode.twoSum(arrayTwo, target);
        assertArrayEquals(expected, result);
    }
    public void testTwoSum_case3(){
        int[] arrayThree = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = TwoSumLeetCode.twoSum(arrayThree, target);
        assertArrayEquals(expected, result);
    }

}