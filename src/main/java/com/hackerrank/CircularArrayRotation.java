package com.hackerrank;

import java.util.*;

public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(getValueAfterRotation(a, k, m));
        }
    }

    static int getValueAfterRotation(int[] arr, int rot, int idx) {
        if(idx - rot >= 0){
            return arr[idx - rot];
        }
        return arr[arr.length + (idx - rot)];
    }
}
