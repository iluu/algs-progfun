package com.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineTests {

    @Test
    public void test1() {
        assertEquals("YES", Line.Tickets(new int[]{25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", Line.Tickets(new int[]{25, 100}));
    }

    @Test
    public void test3() throws Exception {
        assertEquals("YES", Line.Tickets(new int[]{25, 25, 50, 25}));
    }

    @Test
    public void test4() {
        assertEquals("NO", Line.Tickets(new int[]{25, 50, 50}));
    }

    @Test
    public void test5() throws Exception {
        assertEquals("YES", Line.Tickets(new int[]{25, 25, 50, 100}));
    }

    @Test
    public void test6() throws Exception {
        assertEquals("YES", Line.Tickets(new int[]{25, 25, 25, 100}));
    }

    @Test
    public void testEmpty() throws Exception {
        assertEquals("YES", Line.Tickets(new int[]{}));
    }

}