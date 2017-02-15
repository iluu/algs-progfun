package com.hackerrank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Index.atIndex;

public class DynamicArrayTest {

    @Test
    public void executeType1QueryOnEmptyState() {
        final List<Long> expected = singletonList(5L);
        final DynamicArray arr = new DynamicArray(2);

        arr.executeType1Query(0, 5);

        assertThat(arr.lastAns).isEqualTo(0);
        assertThat(arr.values).contains(expected, atIndex(0));
    }

    @Test
    public void executeType1QueryWithPreviousState() {
        final List[] values = new List[2];
        values[0] = singletonList(5L);

        final List<Long> expected = singletonList(7L);
        final DynamicArray arr = new DynamicArray(values, 0);
        arr.executeType1Query(1L, 7L);

        assertThat(arr.values).contains(values[0], atIndex(0));
        assertThat(arr.values).contains(expected, atIndex(1));
        assertThat(arr.lastAns).isEqualTo(0);
    }

    @Test
    public void executeType1QueryAppendsValueCorrectly() {
        final List[] values = new List[2];
        values[0] = new ArrayList<Long>();
        values[0].add(5L);

        final DynamicArray arr = new DynamicArray(values, 0);
        arr.executeType1Query(0L, 3L);

        assertThat(arr.values).contains(Arrays.asList(5L, 3L), atIndex(0));
        assertThat(arr.lastAns).isEqualTo(0);
    }

    @Test
    public void executeType2QueryUpdatesLastAns() {
        final List[] values = new List[2];
        values[0] = new ArrayList<Long>();
        values[0].add(5L);
        values[0].add(3L);

        values[1] = new ArrayList<Long>();
        values[1].add(7L);

        DynamicArray arr = new DynamicArray(values, 0);
        assertThat(arr.executeType2Query(1, 0)).isEqualTo(7);
        assertThat(arr.lastAns).isEqualTo(7);

    }
}