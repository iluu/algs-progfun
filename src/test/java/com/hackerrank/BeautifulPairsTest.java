package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.BeautifulPairs.*;
import static org.assertj.core.api.Assertions.assertThat;

public class BeautifulPairsTest {

    @Test
    public void simpleTestCase1() {
        assertThat(beautifulPairs(new int[]{1, 2, 2}, new int[]{1, 2, 3})).isEqualTo(3);
    }

    @Test
    public void simpleTestCase2() {
        assertThat(beautifulPairs(new int[]{1, 2, 3}, new int[]{1, 2, 2})).isEqualTo(3);
    }

    @Test
    public void simpleTestCase3() {
        assertThat(beautifulPairs(new int[]{1}, new int[]{1})).isEqualTo(0);
    }
}
