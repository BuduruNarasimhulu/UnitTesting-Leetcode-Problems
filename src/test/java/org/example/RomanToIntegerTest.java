package org.example;

import junit.framework.TestCase;

public class RomanToIntegerTest extends TestCase {
     private final  RomanToInteger test=new RomanToInteger();
    public void testRomanToInt_case1() {
      assertEquals(3,test.romanToInt("III"));

    }
    public void testRomanToInt_case2() {
     assertEquals(58,test.romanToInt("LVIII"));

    }
    public void testRomanToInt_case3() {
     assertEquals(1994,test.romanToInt("MCMXCIV"));

    }
}