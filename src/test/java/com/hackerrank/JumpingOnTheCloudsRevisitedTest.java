package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.JumpingOnTheCloudsRevisited.calculateEnergy;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class JumpingOnTheCloudsRevisitedTest {

    @Test
    public void baseTestCase() {
        assertThat(calculateEnergy(new byte[]{0, 0, 1, 0, 0, 1, 1, 0}, 2)).isEqualTo(92);
    }
}