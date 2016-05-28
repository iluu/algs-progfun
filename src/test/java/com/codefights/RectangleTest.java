package com.codefights;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void exampleTest() throws Exception {
        assertEquals(new Rectangle().formRectangle(
                new int[]{0, 0},
                new int[]{0, 5},
                new int[]{7, 0},
                new int[]{7, 5}), true);
    }

    @Test
    public void exampleTest2() throws Exception {
        assertEquals(new Rectangle().formRectangle(
                new int[]{9, 3},
                new int[]{-1, 3},
                new int[]{-1, 7},
                new int[]{9, 7}), true);
    }

    @Test
    public void exampleTest3() throws Exception {
        assertEquals(new Rectangle().formRectangle(
                new int[]{-5, 5},
                new int[]{5, -5},
                new int[]{5, 5},
                new int[]{-5, -5}), true);
    }


}