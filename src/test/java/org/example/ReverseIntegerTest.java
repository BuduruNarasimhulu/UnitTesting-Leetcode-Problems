package org.example;

import junit.framework.TestCase;

public class ReverseIntegerTest extends TestCase {

     private  final ReverseInteger test=new ReverseInteger();
    public void testReverse_case1() {
        assertEquals(321,test.reverse(123));
    }
    public void testReverse_case2() {
        assertEquals(-321,test.reverse(-123));
    }
    public void testReverse_case3() {
        assertEquals(21,test.reverse(120));
    }
}