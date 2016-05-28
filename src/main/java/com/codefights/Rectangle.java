package com.codefights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Rectangle {

    boolean formRectangle(int[] a, int[] b, int[] c, int[] d) {
        List<Integer> x = new ArrayList<>(Arrays.asList(b[0], c[0], d[0]));
        List<Integer> y = new ArrayList<>(Arrays.asList(b[1], c[1], d[1]));

        if (x.contains(a[0]) && y.contains(a[1])) {
            int ix = x.indexOf(a[0]);
            int iy = y.indexOf(a[1]);
            int valueX = x.remove(iy);
            int valueY = y.remove(ix);
            return y.contains(valueY) && x.contains(valueX);
        }
        return false;
    }
}
