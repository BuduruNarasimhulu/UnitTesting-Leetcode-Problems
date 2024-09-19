package org.example;

import java.util.*;

public class ThreeSumFinder {

    public List<List<Integer>> findThreeSumTriplets(int[] numbers) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(numbers); // Sort the input array
        int length = numbers.length;

        // Iterate through the array to find triplets
        for (int i = 0; i < length - 2; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue; // Skip duplicate elements
            }

            int leftPointer = i + 1;
            int rightPointer = length - 1;

            // Use two pointers to find pairs that sum with numbers[i]
            while (leftPointer < rightPointer) {
                int currentSum = numbers[i] + numbers[leftPointer] + numbers[rightPointer];

                if (currentSum == 0) {
                    triplets.add(Arrays.asList(numbers[i], numbers[leftPointer], numbers[rightPointer]));
                    leftPointer++;
                    rightPointer--;

                    // Skip duplicates for left and right pointers
                    while (leftPointer < rightPointer && numbers[leftPointer] == numbers[leftPointer - 1]) {
                        leftPointer++;
                    }
                    while (leftPointer < rightPointer && numbers[rightPointer] == numbers[rightPointer + 1]) {
                        rightPointer--;
                    }
                } else if (currentSum < 0) {
                    leftPointer++;
                } else {
                    rightPointer--;
                }
            }
        }
        return triplets;
    }
}



