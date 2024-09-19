package org.example;

import java.util.*;

public class LargestNumber {
    public String largestNumber(int[] numbers) {
        ArrayList<String> stringArrayList = new ArrayList<>();

        for (var number : numbers)
            stringArrayList.add(Integer.toString(number));

        Collections.sort(stringArrayList, (a, b) -> (a + b).compareTo(b + a));

        StringBuilder resultBuilder = new StringBuilder();

        for (int index = stringArrayList.size() - 1; index >= 0; index--)
            resultBuilder.append(stringArrayList.get(index));

        if (resultBuilder.charAt(0) == '0')
            return "0";

        return resultBuilder.toString();
    }
}

