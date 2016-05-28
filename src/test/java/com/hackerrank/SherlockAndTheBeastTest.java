package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.SherlockAndTheBeast.findLargestDecentNumber;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class SherlockAndTheBeastTest {

    @Test
    public void canHandleMissingValue() {
        assertThat(findLargestDecentNumber(1), is(equalTo("-1")));
    }

    @Test
    public void canHandleTestCase1() {
        assertThat(findLargestDecentNumber(3), is(equalTo("555")));
    }

    @Test
    public void canHandleTestCase2() {
        assertThat(findLargestDecentNumber(11), is(equalTo("55555533333")));
    }

    @Test
    public void canHandleTestCase3() {
        assertThat(findLargestDecentNumber(5), is(equalTo("33333")));
    }
}