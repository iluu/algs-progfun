package com.codefights;

class SortByHeight {

    int[] sortByHeight(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                int j = i+1;
                while (j < a.length) {
                    if (a[i] > a[j] && a[j] != -1) {
                        swap(a, i, j);
                    }
                    j++;
                }
            }
        }
        return a;
    }

    private void swap(int[] a, int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

}
