package org.example;

import java.util.Arrays;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] inputNumber) {
        int missingNumber = 1;
        Arrays.sort(inputNumber);
        for (int number : inputNumber) {
            if (number > 0) {
                if (number == missingNumber) {
                    missingNumber++;
                } else if (number > missingNumber) {
                    break;
                }
            }
        }
        return missingNumber;
    }
}

