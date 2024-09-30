package org.example;

public class ThreeSumClosest {
    public int threeSumClosest(int[] integerArray, int target) {
        // Create an array to count occurrences of numbers, offset by 1000
        byte[] numberFrequencies = new byte[2001]; // Range of -1000 to 1000

        // Count occurrences of each number in the input array
        for (int number : integerArray) {
            numberFrequencies[number + 1000]++; // Offset the number to fit in the array
        }

        // Reconstruct the nums array based on the occurrences
        for (int indexInOccurrences = 0, index = 0; indexInOccurrences < 2001; indexInOccurrences++) {
            // Fill nums with numbers based on their occurrences
            for (int frequency = numberFrequencies[indexInOccurrences]; frequency-- > 0; ) {
                integerArray[index++] = indexInOccurrences - 1000; // Offset back to original range
            }
        }

        int leftPointer = 0; // Left pointer
        int rightPointer = integerArray.length - 1; // Right pointer
        int closestSum = Integer.MAX_VALUE; // Initialize closest sum to maximum value

        // Adjust the low pointer to find a suitable starting point
        for (int minimumDifference = target - integerArray[rightPointer - 1] - integerArray[rightPointer], end = rightPointer - 2;
             leftPointer < end && integerArray[leftPointer + 1] <= minimumDifference; leftPointer++) {
            // This loop advances the low pointer while keeping a valid minimum difference
        }

        // Adjust the high pointer to find a suitable ending point
        for (int maximumDifference = target - integerArray[leftPointer] - integerArray[leftPointer + 1], end = leftPointer + 2;
             rightPointer > end && integerArray[rightPointer - 1] >= maximumDifference; rightPointer--) {
            // This loop advances the high pointer while keeping a valid maximum difference
        }

        // Iterate through the array to find the closest sum
        for (int rangeLimit = rightPointer - 1; leftPointer < rangeLimit; leftPointer++) {
            for (int sum, i = rightPointer, j = leftPointer + 1; j < i; ) {
                // Calculate the current sum of the triplet
                sum = integerArray[leftPointer] + integerArray[i] + integerArray[j];

                // If the sum matches the target, return it immediately
                if (sum == target) {
                    return sum;
                }
                // Update closestSum if the current sum is closer to the target
                else if ((sum > target ? sum - target - i + i-- : target - sum - j + j++) <
                        Math.abs(closestSum - target)) {
                    closestSum = sum; // Update the closest sum found
                }
            }
        }

        // Return the closest sum found
        return closestSum;
    }
}
