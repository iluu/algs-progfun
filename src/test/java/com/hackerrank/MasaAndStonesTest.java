package com.hackerrank;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static com.hackerrank.MasaAndStones.calculateLastStone;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MasaAndStonesTest {

    @Test
    public void sampleTest1() {
        assertThat(calculateLastStone(3, 1, 2),
                equalTo(new HashSet<>(Arrays.asList(2, 3, 4))));
    }

    @Test
    public void sampleTest2() {
        assertThat(calculateLastStone(4, 10, 100),
                equalTo(new HashSet<>(Arrays.asList(30, 120, 210, 300))));
    }
}