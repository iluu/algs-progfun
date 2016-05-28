package com.codefights;

import org.junit.Test;

import static com.codefights.BrokenJigsaw.brokenJigsaw;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class BrokenJigsawTest {

    @Test
    public void name() throws Exception {
        String[] puzzle = new String[]{
                "XXXXOOOOOOOOXXXX",
                "XXXXXXXXXXXXXXXX"
        };

        assertThat(brokenJigsaw(puzzle), is(equalTo(8)));
    }
}