package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void returnsReversedPositiveInteger_whenInputIsPositive() {
        assertEquals(321, reverseInteger.reverse(123));
    }

    @Test
    public void returnsReversedNegativeInteger_whenInputIsNegative() {
        assertEquals(-321, reverseInteger.reverse(-123));
    }

    @Test
    public void returnsReversedIntegerIgnoringTrailingZero_whenInputHasTrailingZero() {
        assertEquals(21, reverseInteger.reverse(120));
    }
}
