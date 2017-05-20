package com.codefights;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortByHeightTest {

    @Test
    public void firstTestCase() {
        final SortByHeight s = new SortByHeight();
        int[] input = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};
        int[] result = new int[]{-1, 150, 160, 170, -1, -1, 180, 190};

        assertThat(s.sortByHeight(input)).isEqualTo(result);
    }
}