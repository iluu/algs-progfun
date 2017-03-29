package com.codefights;

import org.junit.Test;

import static com.codefights.AlmostIncreasingSequence.isAlmostIncreasing;
import static org.assertj.core.api.Assertions.assertThat;

public class AlmostIncreasingSequenceTest {

    @Test
    public void shouldReturnFalseForSequenceWithDuplicates() {
        int[] sequence = new int[]{1, 2, 1, 2};

        assertThat(isAlmostIncreasing(sequence)).isFalse();
    }

    @Test
    public void shouldBeAbleToRemoveFirstIncorrectValue() {
        int[] sequence = new int[]{10, 1, 2, 3, 4, 5};

        assertThat(isAlmostIncreasing(sequence)).isTrue();
    }

    @Test
    public void shouldBeAbleToRemoveIncorrectValue() {
        int[] sequence = new int[]{1, 2, 3, 4, 3, 6};

        assertThat(isAlmostIncreasing(sequence)).isTrue();
    }

    @Test
    public void noIdeaWhatsUpWithThat() {
        int[] sequence = new int[]{1, 2, 3, 4, 99, 5, 6};

        assertThat(isAlmostIncreasing(sequence)).isTrue();
    }

    @Test
    public void shouldBeAbleToIgnoreLastIncorrectValue() {
        int[] sequence = new int[]{1, 3, 2};

        assertThat(isAlmostIncreasing(sequence)).isTrue();
    }

    @Test
    public void shouldBeAbleToCorrectOnlyOnce() {
        int[] sequence = new int[]{10, 1, 3, 2};

        assertThat(isAlmostIncreasing(sequence)).isFalse();
    }
}