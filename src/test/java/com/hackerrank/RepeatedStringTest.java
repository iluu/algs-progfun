package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.RepeatedString.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class RepeatedStringTest {

    @Test
    public void simpleTestCase() {
        assertThat(solve("aba", 10), is(equalTo(7L)));
    }
}