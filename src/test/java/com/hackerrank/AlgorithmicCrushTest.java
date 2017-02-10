package com.hackerrank;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AlgorithmicCrushTest {

    private AlgorithmicCrush crush;

    @Before
    public void setUp() throws Exception {
        crush = new AlgorithmicCrush();
    }

    @Test
    public void returnsMaximumValueForEmptyState() {
        crush.performOperation(1, 2, 100);

        assertThat(crush.getMaxValue()).isEqualTo(100);
    }

    @Test
    public void returnsMaximumValueForTwoOperationsCommonIndexes() {
        crush.performOperation(1, 2, 100);
        crush.performOperation(2, 5, 100);

        assertThat(crush.getMaxValue()).isEqualTo(200);
    }

}