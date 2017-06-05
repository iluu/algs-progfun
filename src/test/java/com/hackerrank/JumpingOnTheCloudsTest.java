package com.hackerrank;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JumpingOnTheCloudsTest {

    @Test
    public void firstTestCase() {
        int[] arr = new int[]{0, 0, 1, 0, 0, 1, 0};
        assertThat(JumpingOnTheClouds.countJumps(arr)).isEqualTo(4);
    }

    @Test
    public void secondTestCase() {
        int[] arr = new int[]{0, 0, 0, 1, 0, 0};
        assertThat(JumpingOnTheClouds.countJumps(arr)).isEqualTo(3);
    }
}