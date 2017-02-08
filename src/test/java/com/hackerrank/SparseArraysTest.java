package com.hackerrank;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SparseArraysTest {

    @Test
    public void shouldFindOneInstance() {
        final String[] arr = new String[]{"aba", "baba", "aba", "xzxb"};
        final String query = "baba";
        final SparseArrays arrays = new SparseArrays(arr);

        assertThat(arrays.find(query)).isEqualTo(1);
    }

    @Test
    public void shouldNotFindAnyInstance() {
        final String[] arr = new String[]{"aba", "baba", "aba", "xzxb"};
        final String query = "bab";
        final SparseArrays arrays = new SparseArrays(arr);

        assertThat(arrays.find(query)).isEqualTo(0);
    }
}