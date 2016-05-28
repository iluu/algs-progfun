package com.codefights;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class ClosestNeighbourTest {

    private final ClosestNeighbour cn = new ClosestNeighbour();

    @Test
    public void simpletest() throws Exception {
        assertThat(cn.closestNeighbor(20, 2, 3, 4), is(equalTo(new int[]{12, 24})));
    }

    @Test
    public void simpletest1() throws Exception {
        assertThat(cn.closestNeighbor(20, 10, 10, 10), is(equalTo(new int[]{10, 30})));
    }
}