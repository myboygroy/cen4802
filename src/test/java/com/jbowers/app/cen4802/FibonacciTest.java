package com.jbowers.app.cen4802;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    void shouldGivePositiveInteger() {
        int fib = Fibonacci.fibonacci(10);
        // Should be greater than or equal to 0
        Assertions.assertTrue(fib >= 0);
    }
}
