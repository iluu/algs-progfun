package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.MaximumSubarray.findAnswer;
import static org.junit.Assert.assertEquals;

public class MaximumSubarrayTest {

    @Test
    public void sampleTest1() {
        assertEquals("10 10", findAnswer(new long[]{1, 2, 3, 4}));
    }

    @Test
    public void sampleTest2() {
        assertEquals("10 11", findAnswer(new long[]{2, -1, 2, 3, 4, -5}));
    }

    @Test
    public void sampleTest3() {
        assertEquals("-1 -1", findAnswer(new long[]{-1, -2, -3, -4, -5, -6}));
    }

    @Test
    public void sampleTest4() {
        assertEquals("-10 -10", findAnswer(new long[]{-10}));
    }

    @Test
    public void sampleTest5() {
        assertEquals("5 6", findAnswer(new long[]{1, -1, -1, -1, -1, 5}));
    }
}