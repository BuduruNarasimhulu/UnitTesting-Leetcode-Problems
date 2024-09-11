package org.example;

import junit.framework.TestCase;

public class IntegerToRomanTest extends TestCase {
     private final  IntegerToRoman test=new IntegerToRoman();
     public void testIntToRoman_case1() {
        assertEquals("MMMDCCXLIX",test.intToRoman(3749));
    }
    public void testIntToRoman_case2() {
        assertEquals("LVIII",test.intToRoman(58));
    }
    public void testIntToRoman_case3() {
        assertEquals("MCMXCIV",test.intToRoman(1994));
    }
}