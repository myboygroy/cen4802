package com.jbowers.app.cen4802;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class FibonacciTest {
    @Test
    public void shouldGivePositiveInteger() {
        int fib = Fibonacci.fibonacci(10);
        // Should be greater than or equal to 0
        assertTrue(fib >= 0);
    }
    public void shouldReturnFalse
}
