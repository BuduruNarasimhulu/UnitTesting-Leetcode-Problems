package org.example;
import java.util.*;

public class ThreeSum {

        public List<List<Integer>> threeSum(int[] nums) {
            // Create an anonymous subclass of AbstractList to implement the required methods
            return new AbstractList<>() {
                List<List<Integer>> ans; // To store the final result

                // Override the size method to return the number of triplets found
                public int size() {
                    if (ans == null) init(); // Initialize the result if it's not done yet
                    return ans.size(); // Return the size of the answer list
                }

                // Override the get method to return the triplet at index i
                public List<Integer> get(int i) {
                    if (ans == null) init(); // Initialize if necessary
                    return ans.get(i); // Return the triplet at the specified index
                }

                // Method to initialize and find the triplets that sum to zero
                private void init() {
                    Set<List<Integer>> res = new HashSet<>(); // Use a Set to avoid duplicates
                    Arrays.sort(nums); // Sort the input array
                    int n = nums.length; // Store the length of the array

                    // Iterate through the array to find triplets
                    for (int i = 0; i < n - 2; i++) {
                        int left = i + 1; // Left pointer starts just after i
                        int right = n - 1; // Right pointer starts at the end of the array

                        // Use two pointers to find pairs that sum with nums[i]
                        while (left < right) {
                            int sum = nums[i] + nums[left] + nums[right]; // Calculate the sum

                            if (sum == 0) { // If the sum is zero, we found a triplet
                                res.add(Arrays.asList(nums[i], nums[left], nums[right])); // Add the triplet to the set
                                left++; // Move the left pointer to the right
                                right--; // Move the right pointer to the left
                            } else if (sum < 0) {
                                left++; // Increase the sum by moving the left pointer right
                            } else {
                                right--; // Decrease the sum by moving the right pointer left
                            }
                        }
                    }
                    ans = new ArrayList<>(res); // Convert the Set to a List for the final answer
                }
            };
        }
    }


