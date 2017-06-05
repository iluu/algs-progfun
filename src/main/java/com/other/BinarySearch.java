package com.other;

class BinarySearch {

    static int findIndexOf(int[] a, int key) {
        int l = 0;
        int r = a.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (key > a[m]) l = m + 1;
            else if (key < a[m]) r = m - 1;
            else return m;
        }
        return -1;
    }
}
