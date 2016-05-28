package com.hackerrank;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TimeConversionTest {

    @Test
    public void handlesSampleInput() {
        assertThat("19:05:45", is(equalTo(TimeConversion.convert("07:05:45PM"))));
    }

    @Test
    public void handlesAMTime() {
        assertThat("07:05:45", is(equalTo(TimeConversion.convert("07:05:45AM"))));
    }

    @Test
    public void handlesMidnight() {
        assertThat("00:00:00", is(equalTo(TimeConversion.convert("12:00:00AM"))));
    }

    @Test
    public void handlesNoon() {
        assertThat("12:00:00", is(equalTo(TimeConversion.convert("12:00:00PM"))));
    }
}