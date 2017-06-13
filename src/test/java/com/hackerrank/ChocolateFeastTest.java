package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.ChocolateFeast.chocolatesEaten;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ChocolateFeastTest {

    @Test
    public void simpleTestCase() {
        assertThat(chocolatesEaten(10, 2, 5)).isEqualTo(6);
    }

    @Test
    public void simpleTestCase2() {
        assertThat(chocolatesEaten(12, 4, 4)).isEqualTo(3);
    }

    @Test
    public void simpleTestCase3() {
        assertThat(chocolatesEaten(6, 2, 2)).isEqualTo(5);
    }
}
