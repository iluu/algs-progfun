package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.BiggerIsGreater.nextPermutation;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class BiggerIsGreaterTest {

    @Test
    public void simpleRearrange() {
        assertThat(nextPermutation("ab")).isEqualTo("ba");
    }

    @Test
    public void singleLetter() {
        assertThat(nextPermutation("t")).isEqualTo("no answer");
    }

    @Test
    public void noAnswer() {
        assertThat(nextPermutation("bb")).isEqualTo("no answer");
    }

    @Test
    public void nextPermutation1() {
        assertThat(nextPermutation("hefg")).isEqualTo("hegf");
    }

    @Test
    public void nextPermutation2() {
        assertThat(nextPermutation("dkhc")).isEqualTo("hcdk");
    }

    @Test
    public void nextPermutation3() {
        assertThat(nextPermutation("zxkjhfa")).isEqualTo("no answer");
    }

    @Test
    public void nextPermutation4() {
        assertThat(nextPermutation("croxwwemyvlwuybznvvp")).isEqualTo("croxwwemyvlwuybzpnvv");
    }

    @Test
    public void nextPermutation5() {
        assertThat(nextPermutation("bfbpwzcgwaujodfuzuq")).isEqualTo("bfbpwzcgwaujodfzquu");
    }

}