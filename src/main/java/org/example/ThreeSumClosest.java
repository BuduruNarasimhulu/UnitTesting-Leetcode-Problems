package org.example;

public class ThreeSumClosest {
        public int threeSumClosest(int[] nums, int target) {
            // Create an array to count occurrences of numbers, offset by 1000
            byte[] occurrences = new byte[2001]; // Range of -1000 to 1000

            // Count occurrences of each number in the input array
            for (int num : nums) {
                occurrences[num + 1000]++; // Offset the number to fit in the array
            }

            // Reconstruct the nums array based on the occurrences
            for (int count = 0, index = 0; count < 2001; count++) {
                // Fill nums with numbers based on their occurrences
                for (int repetitions = occurrences[count]; repetitions-- > 0;) {
                    nums[index++] = count - 1000; // Offset back to original range
                }
            }

            int low = 0; // Left pointer
            int high = nums.length - 1; // Right pointer
            int closestSum = Integer.MAX_VALUE; // Initialize closest sum to maximum value

            // Adjust the low pointer to find a suitable starting point
            for (int minDiff = target - nums[high - 1] - nums[high], end = high - 2;
                 low < end && nums[low + 1] <= minDiff; low++) {
                // This loop advances the low pointer while keeping a valid minimum difference
            }

            // Adjust the high pointer to find a suitable ending point
            for (int maxDiff = target - nums[low] - nums[low + 1], end = low + 2;
                 high > end && nums[high - 1] >= maxDiff; high--) {
                // This loop advances the high pointer while keeping a valid maximum difference
            }

            // Iterate through the array to find the closest sum
            for (int end = high - 1; low < end; low++) {
                for (int sum, i = high, j = low + 1; j < i;) {
                    // Calculate the current sum of the triplet
                    sum = nums[low] + nums[i] + nums[j];

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
