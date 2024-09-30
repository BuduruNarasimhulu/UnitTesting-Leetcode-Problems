package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutDuplicateTest {

    private final LongestSubstringWithoutDuplicate substringFinder = new LongestSubstringWithoutDuplicate();

    @Test
    public void returnsLengthOfLongestSubstring_whenInputHasRepeatedCharacters() {
        assertEquals(3, substringFinder.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void returnsLengthOfLongestSubstring_whenInputHasAllSameCharacters() {
        assertEquals(1, substringFinder.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void returnsLengthOfLongestSubstring_whenInputHasMixedCharacters() {
        assertEquals(3, substringFinder.lengthOfLongestSubstring("pwwkew"));
    }
}
