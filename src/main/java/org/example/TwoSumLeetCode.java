package org.example;

import java.util.*;

public class TwoSumLeetCode {
    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store numbers and their indices
        Map<Integer, Integer> m = new HashMap<>();

        // Iterate through the array
        for (int i = 0; ; i++) {
            int x = nums[i]; // Current number
            int y = target - x; // Complementary number needed to reach the target

            // Check if the complementary number is already in the map
            if (m.containsKey(y)) {
                // If found, return the indices of the two numbers
                return new int[]{m.get(y), i};
            }

            // If not found, add the current number and its index to the map
            m.put(x, i);
        }
    }

    public static void main(String[] args) {
        int[] arrayOne = {2,7,11,15};
        int targetOne=9;

        int[] arrayTwo = {3,2,4};
        int targetTwo=6;

        int[] arrayThree = {3,3};
        int targetThree=6;

        System.out.println(Arrays.toString(twoSum(arrayOne, targetOne)));
        System.out.println(Arrays.toString(twoSum(arrayTwo,targetTwo)));
        System.out.println(Arrays.toString(twoSum(arrayThree,targetThree)));
    }
}
