package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.CircularArrayRotation.getValueAfterRotation;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class CircularArrayRotationTest {

    @Test
    public void shouldRotateShortArray() {
        int arr[] = new int[]{1, 2};
        int value = getValueAfterRotation(arr, 1, 0);

        assertThat(value, is(equalTo(2)));
    }

    @Test
    public void shouldRotateLongArray() {
        int arr[] = new int[]{1, 2, 3};
        int value = getValueAfterRotation(arr, 1, 1);

        assertThat(value, is(equalTo(1)));
    }

    @Test
    public void shouldRotateLongArray2() {
        int arr[] = new int[]{1, 2, 3};
        int value = getValueAfterRotation(arr, 1, 0);

        assertThat(value, is(equalTo(3)));
    }

}