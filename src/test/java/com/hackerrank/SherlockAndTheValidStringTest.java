package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.SherlockAndTheValidString.isValid;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SherlockAndTheValidStringTest {

    @Test
    public void shouldBeValid() {
        assertThat(isValid("aabbcc")).isEqualTo("YES");
    }

    @Test
    public void shouldBeValidAfterRemovingOneLetter() {
        assertThat(isValid("aabbccc")).isEqualTo("YES");
    }

    @Test
    public void shouldBeValidAfterRemovingOneLetter2() {
        assertThat(isValid("aaabbbcccn")).isEqualTo("YES");
    }

    @Test
    public void shouldNotBeValid() {
        assertThat(isValid("aabbcccc")).isEqualTo("NO");
    }

    @Test
    public void shouldNotBeValid2() {
        assertThat(isValid("a")).isEqualTo("YES");
    }

    @Test
    public void shouldAlsoBeValid() {
        assertThat(isValid("hfchdkkbfifgbgebfaahijchgeeeiagkadjfcbekbdaifchkjfejckbiiihegacfbchdihkgbkbddgaefhkdgccjejjaajgijdkd")).isEqualTo("YES");
    }


}