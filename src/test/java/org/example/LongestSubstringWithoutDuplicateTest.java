package org.example;

import junit.framework.TestCase;

public class LongestSubstringWithoutDuplicateTest extends TestCase {
    private  final  LongestSubstringWithoutDuplicate test=new LongestSubstringWithoutDuplicate();

    public void testLengthOfLongestSubstring_case1() {
        assertEquals(3,test.lengthOfLongestSubstring("abcabcbb"));
    }
    public void testLengthOfLongestSubstring_case2(){
        assertEquals(1,test.lengthOfLongestSubstring("bbbbb"));
    }
    public void testLengthOfLongestSubstring_case3(){
        assertEquals(3,test.lengthOfLongestSubstring("pwwkew"));

    }

}