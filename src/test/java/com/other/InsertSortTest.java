package com.other;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertSortTest {

    @Test
    public void shouldSortUnsortedArray() {
        int[] arr = {2, 3, 1, 0, 8, 5};
        assertThat(InsertionSort.sort(arr)).isEqualTo(new int[]{0, 1, 2, 3, 5, 8});
    }
}
