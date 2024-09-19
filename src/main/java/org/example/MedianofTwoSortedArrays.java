package org.example;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] firstArray, int[] secondArray) {
        int firstArrayLength = firstArray.length;
        int secondArrayLength = secondArray.length;
        int[] mergedArray= new int[firstArrayLength + secondArrayLength];

        int currentIndex = 0;
        for (int number : firstArray) {
            mergedArray[currentIndex++] = number;
        }
        for (int number : secondArray) {
            mergedArray[currentIndex++] = number;
        }

        for (int i : mergedArray) {
            System.out.println(i);
        }

        Arrays.sort(mergedArray);
        int mergedArrayLength = mergedArray.length;
        if (mergedArrayLength % 2 != 0) {
            return mergedArray[mergedArrayLength / 2];

        } else
            return ((mergedArray[mergedArrayLength / 2 - 1] + mergedArray[mergedArrayLength / 2]) / 2.0);
    }


}
