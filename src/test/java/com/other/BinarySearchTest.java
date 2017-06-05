package com.other;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BinarySearchTest {

    @Test
    public void shouldFindCorrectIndex() {
        int a[] = new int[]{1, 2, 3, 4, 5};
        assertThat(BinarySearch.findIndexOf(a, 4)).isEqualTo(3);
    }

    @Test
    public void shouldReturnWhenValueMissing() {
        int a[] = new int[]{1, 2, 3, 4, 5};
        assertThat(BinarySearch.findIndexOf(a, 6)).isEqualTo(-1);
    }
}