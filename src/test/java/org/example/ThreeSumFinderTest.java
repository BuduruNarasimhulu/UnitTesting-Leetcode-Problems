package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.Stream;

class ThreeSumFinderTest {

    private final ThreeSumFinder threeSumFinder = new ThreeSumFinder();

    // Method Source for various test cases
    static Stream<Arguments> tripletCases() {
        return Stream.of(
                // No valid triplets
                Arguments.of(new int[]{1, 2, 3, 4}, List.of()),

                // Single valid triplet
                Arguments.of(new int[]{-1, 0, 1, 2}, List.of(Arrays.asList(-1, 0, 1))),

                // Multiple valid triplets
                Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1))),

                // Array with duplicates (all zeros)
                Arguments.of(new int[]{0, 0, 0, 0}, List.of(Arrays.asList(0, 0, 0))),

                // Empty array
                Arguments.of(new int[]{}, List.of()),

                // Array with no valid triplets (all positive numbers)
                Arguments.of(new int[]{3, 4, 5}, List.of())
        );
    }

    @ParameterizedTest
    @MethodSource("tripletCases")
    void testFindThreeSumTriplets(int[] numbers, List<List<Integer>> expectedTriplets) {
        List<List<Integer>> result = threeSumFinder.findThreeSumTriplets(numbers);
        List<List<Integer>> sortedResult = sortTripletList(result);
        List<List<Integer>> sortedExpected = sortTripletList(expectedTriplets);
        assertEquals(sortedExpected, sortedResult, "Triplet lists do not match");
    }

    // Helper method to sort each triplet and the list of triplets
    private List<List<Integer>> sortTripletList(List<List<Integer>> triplets) {
        return triplets.stream()
                .map(triplet -> triplet.stream().sorted().toList()) // Sort each triplet
                .sorted((t1, t2) -> {
                    for (int i = 0; i < t1.size(); i++) {
                        int compare = t1.get(i).compareTo(t2.get(i));
                        if (compare != 0) {
                            return compare;
                        }
                    }
                    return 0;
                })
                .toList();
    }
}


