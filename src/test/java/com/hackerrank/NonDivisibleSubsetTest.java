package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.NonDivisibleSubset.findMaxSubset;
import static org.junit.Assert.assertEquals;

public class NonDivisibleSubsetTest {

    @Test
    public void maxSubset() throws Exception {
        assertEquals(findMaxSubset(new int[]{1, 7, 2, 4}, 3), 3);
    }

    @Test
    public void subset() throws Exception {
        assertEquals(findMaxSubset(new int[]{2, 7, 1, 4}, 3), 3);
    }

    @Test
    public void noSubset() throws Exception {
        assertEquals(findMaxSubset(new int[]{2}, 3), 1);
    }

    @Test
    public void singleSubset() throws Exception {
        assertEquals(findMaxSubset(new int[]{3}, 3), 0);
    }

}