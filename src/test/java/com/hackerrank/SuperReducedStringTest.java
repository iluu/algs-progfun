package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.SuperReducedString.superReducedString;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SuperReducedStringTest {

    @Test
    public void simpleTestCase() {
        assertThat(superReducedString("aaabccddd")).isEqualTo("abd");
    }

    @Test
    public void returnsEmptyStringString() {
        assertThat(superReducedString("aa")).isEqualTo("Empty String");
    }

    @Test
    public void shouldContinueReplacing() {
        assertThat(superReducedString("abba")).isEqualTo("Empty String");
    }
}