package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.TheTimeInWords.*;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class TheTimeInWordsTest {

    @Test
    public void simpleTestCase() {
        assertThat(time(5, 47))
                .isEqualTo("thirteen minutes to six");
    }
}