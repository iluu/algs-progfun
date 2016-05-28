package com.codefights;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistSameLettersTest {

    @Test
    public void exampleTest() throws Exception {
        DistSameLetters dist = new DistSameLetters();
        String result = dist.distSameLetter("fffffahhhhhhaaahhhhbhhahhhhabxx");

        assertEquals(result, "a23");
    }
}