package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RegularExpressionMatchingTest {
    private  final  RegularExpressionMatching regex=new RegularExpressionMatching();
    @Test
    public void testExample1() {
        String s = "aa";
        String p = "a";
        boolean expected = false;
        boolean result = regex.isMatch(s, p);

        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        String s = "aa";
        String p = "a*";
        boolean expected = true;
        boolean result = regex.isMatch(s, p);

        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        String s = "ab";
        String p = ".*";
        boolean expected = true;
        boolean result = regex.isMatch(s, p);

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyStringAndPattern() {
        String s = "";
        String p = "";
        boolean expected = true;
        boolean result = regex.isMatch(s, p);

        assertEquals(expected, result);
    }

    @Test
    public void testEmptyStringWithAsteriskPattern() {
        String s = "";
        String p = "a*";
        boolean expected = true;
        boolean result = regex.isMatch(s, p);

        assertEquals(expected, result);
    }

    @Test
    public void testComplexPattern() {
        String s = "aab";
        String p = "c*a*b";
        boolean expected = true;
        boolean result = regex.isMatch(s, p);

        assertEquals(expected, result);
    }

    @Test
    public void testNoMatch() {
        String s = "mississippi";
        String p = "mis*is*p*.";
        boolean expected = false;
        boolean result = regex.isMatch(s, p);

        assertEquals(expected, result);
    }
}
