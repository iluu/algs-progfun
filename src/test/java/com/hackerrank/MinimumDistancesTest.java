package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.MinimumDistances.minimumDistance;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class MinimumDistancesTest {

    @Test
    public void firstTestCase() {
        assertThat(minimumDistance(new int[]{7, 1, 3, 4, 1, 7})).isEqualTo(3);
    }

    @Test
    public void shouldNotFindAnyDistance() {
        assertThat(minimumDistance(new int[]{7, 1, 3, 4, 2, 8})).isEqualTo(-1);
    }
}