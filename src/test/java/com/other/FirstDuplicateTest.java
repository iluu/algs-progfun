package com.other;

import org.junit.Test;

import static com.other.FirstDuplicate.firstDuplicate;
import static org.assertj.core.api.Assertions.assertThat;

public class FirstDuplicateTest {

    @Test
    public void failingCase13() {
        int[] a = new int[]{28, 19, 13, 6, 34, 48, 50, 3, 47, 18, 15, 34, 16, 11, 13, 3, 2, 4, 46, 6, 7, 3, 18, 9, 32, 21, 3, 21, 50, 10, 45, 13, 22, 1, 27, 18, 3, 27, 30, 44, 12, 30, 40, 1, 1, 31, 6, 18, 33, 5};
        assertThat(firstDuplicate(a)).isEqualTo(34);
    }
}