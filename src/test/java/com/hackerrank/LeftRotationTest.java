package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.LeftRotation.rotateLeft;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class LeftRotationTest {

    @Test
    public void simpleTestCase() {
        assertThat(rotateLeft(new int[]{1, 2, 3, 4, 5}, 4))
                .isEqualTo("5 1 2 3 4");
    }
}