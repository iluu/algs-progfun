package com.hackerrank;

import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println(rotateLeft(a, d));
    }

    static String rotateLeft(int[] a, int d) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            int rIdx = rotatedIdx(i, d, a.length);
            sb.append(a[rIdx]);
            if (i != a.length - 1) {
                sb.append(" ");
            }

        }
        return sb.toString();
    }

    private static int rotatedIdx(int idx, int d, int len) {
        return idx + d < len ? idx + d : (idx + d) - len;
    }
}
