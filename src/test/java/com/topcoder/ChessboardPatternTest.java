package com.topcoder;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ChessboardPatternTest {

    @Test(timeout=2000)
    public void test0() {
        int rows = 8;
        int columns = 8;
        assertArrayEquals(new String[] {"X.X.X.X.", ".X.X.X.X", "X.X.X.X.", ".X.X.X.X", "X.X.X.X.", ".X.X.X.X", "X.X.X.X.", ".X.X.X.X" }, new ChessboardPattern().makeChessboard(rows, columns));
    }

    @Test(timeout=2000)
    public void test1() {
        int rows = 1;
        int columns = 20;
        assertArrayEquals(new String[] {".X.X.X.X.X.X.X.X.X.X" }, new ChessboardPattern().makeChessboard(rows, columns));
    }

    @Test(timeout=2000)
    public void test2() {
        int rows = 5;
        int columns = 1;
        assertArrayEquals(new String[] {".", "X", ".", "X", "." }, new ChessboardPattern().makeChessboard(rows, columns));
    }

    @Test(timeout=2000)
    public void test3() {
        int rows = 5;
        int columns = 13;
        assertArrayEquals(new String[] {".X.X.X.X.X.X.", "X.X.X.X.X.X.X", ".X.X.X.X.X.X.", "X.X.X.X.X.X.X", ".X.X.X.X.X.X." }, new ChessboardPattern().makeChessboard(rows, columns));
    }
}
