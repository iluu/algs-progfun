package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.ViralAdvertising.*;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ViralAdvertisingTest {

    @Test
    public void simpleTestCase() {
        assertThat(calculate(3)).isEqualTo(9);
    }

    @Test
    public void simpleTestCase2() {
        assertThat(calculate(4)).isEqualTo(15);
    }
}