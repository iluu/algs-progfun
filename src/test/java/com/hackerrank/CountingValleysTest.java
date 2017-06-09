package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.CountingValleys.countValleys;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CountingValleysTest {


    @Test
    public void firstTestCase() {
        assertThat(countValleys("UDDDUDUU")).isEqualTo(1);
    }
}