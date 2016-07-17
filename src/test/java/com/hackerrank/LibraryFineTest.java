package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.LibraryFine.calculateFine;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class LibraryFineTest {

    @Test
    public void sampleTest() {
        assertThat(calculateFine(9, 6, 2015, 6, 6, 2015), equalTo(45));
    }

    @Test
    public void returnedBefore() {
        assertThat(calculateFine(5, 6, 2015, 6, 6, 2015), equalTo(0));
    }

    @Test
    public void returnedOnExpectedDate() {
        assertThat(calculateFine(6, 6, 2015, 6, 6, 2015), equalTo(0));
    }



}