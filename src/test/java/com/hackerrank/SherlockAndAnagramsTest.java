package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.SherlockAndAnagrams.countAnagrams;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class SherlockAndAnagramsTest {

    @Test
    public void noAnagrams() {
        assertThat(countAnagrams("abcd")).isEqualTo(0);
    }

    @Test
    public void simpleAnagrams() {
        assertThat(countAnagrams("abba")).isEqualTo(4);
    }

    @Test
    public void simpleAnagrams1() {
        assertThat(countAnagrams("ifailuhkqq")).isEqualTo(3);
    }
}