package com.other;

class FirstDuplicate {

    static int firstDuplicate(int[] a) {
        boolean[] duplicates = new boolean[(int) (Math.pow(10, 5)+1)];
        int i = 0;
        while(i < a.length && !duplicates[a[i]]){
            duplicates[a[i++]] = true;
        }
        return i < a.length && duplicates[a[i]] ? a[i] : -1;
    }
}
