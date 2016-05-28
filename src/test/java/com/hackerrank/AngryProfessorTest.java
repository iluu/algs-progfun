package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.AngryProfessor.isClassCancelled;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class AngryProfessorTest {

    @Test
    public void handlesSampleCase1() {
        int[] arrivals = {-1, -3, 4, 2};
        assertThat(isClassCancelled(3, arrivals), is(equalTo("YES")));
    }

    @Test
    public void handlesSampleCase2() {
        int[] arrivals = {0, -1, 2, 1};
        assertThat(isClassCancelled(2, arrivals), is(equalTo("NO")));
    }
}