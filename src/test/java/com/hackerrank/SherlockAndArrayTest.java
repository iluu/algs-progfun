package com.hackerrank;

import org.junit.Test;

import static com.hackerrank.SherlockAndArray.findIndex;
import static org.junit.Assert.assertEquals;

public class SherlockAndArrayTest {

    @Test
    public void test1() throws Exception {
        int[] arr = new int[]{1};
        assertEquals(findIndex(arr), "YES");
    }

    @Test
    public void test2() throws Exception {
        int[] arr = new int[]{1, 2};
        assertEquals(findIndex(arr), "NO");
    }

    @Test
    public void test3() throws Exception {
        int[] arr = new int[]{6, 23, 6};
        assertEquals(findIndex(arr), "YES");
    }

    @Test
    public void test4() throws Exception {
        int[] arr = new int[]{1,2, 3, 3};
        assertEquals(findIndex(arr), "YES");
    }
}