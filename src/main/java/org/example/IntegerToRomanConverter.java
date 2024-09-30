package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRomanConverter {

    private static final Map<Integer, String> ROMAN_NUMERAL_MAPPINGS = new LinkedHashMap<>();

    static {
        ROMAN_NUMERAL_MAPPINGS.put(1000, "M");
        ROMAN_NUMERAL_MAPPINGS.put(900, "CM");
        ROMAN_NUMERAL_MAPPINGS.put(500, "D");
        ROMAN_NUMERAL_MAPPINGS.put(400, "CD");
        ROMAN_NUMERAL_MAPPINGS.put(100, "C");
        ROMAN_NUMERAL_MAPPINGS.put(90, "XC");
        ROMAN_NUMERAL_MAPPINGS.put(50, "L");
        ROMAN_NUMERAL_MAPPINGS.put(40, "XL");
        ROMAN_NUMERAL_MAPPINGS.put(10, "X");
        ROMAN_NUMERAL_MAPPINGS.put(9, "IX");
        ROMAN_NUMERAL_MAPPINGS.put(5, "V");
        ROMAN_NUMERAL_MAPPINGS.put(4, "IV");
        ROMAN_NUMERAL_MAPPINGS.put(1, "I");
    }

    public String transformIntegerToRomanNumeral(int numberToConvert) {
        // StringBuilder to construct the Roman numeral string
        StringBuilder constructedRomanStringBuilder = new StringBuilder();

        // Loop through each mapping in the ROMAN_NUMERAL_MAPPINGS
        for (Map.Entry<Integer, String> entry : ROMAN_NUMERAL_MAPPINGS.entrySet()) {
            // While numberToConvert is greater than or equal to the current integer value
            while (numberToConvert >= entry.getKey()) {
                // Subtract the integer value from numberToConvert
                numberToConvert -= entry.getKey();
                // Append the corresponding Roman numeral to the StringBuilder
                constructedRomanStringBuilder.append(entry.getValue());
            }
        }

        // Convert the StringBuilder to a String and return it
        return constructedRomanStringBuilder.toString();
    }


}


  /*  public String intToRoman(int num) {
        // Arrays holding the integer values and their corresponding Roman numerals
        int[] integerNumbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] RomanNumbers = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        // StringBuilder to construct the Roman numeral string
        StringBuilder stringBuilder = new StringBuilder();

        // Loop through each value in the integerNumbers array
        for (int index = 0; index < integerNumbers.length; index++) {
            // While num is greater than or equal to the current integer value
            while (num >= integerNumbers[index]) {
                // Subtract the integer value from num
                num -= integerNumbers[index];
                // Append the corresponding Roman numeral to the StringBuilder
                stringBuilder.append(RomanNumbers[index]);
            }
        }

        // Convert the StringBuilder to a String and return it
        return stringBuilder.toString();
    }*/


