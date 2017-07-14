package com.hackerrank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CircularArrayRotation {

    private final static boolean READ_FILE = true;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = getScanner();
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        for (int a0 = 0; a0 < q; a0++) {
            int m = in.nextInt();
            System.out.println(getValueAfterRotation(a, k, m));
        }
    }

    private static Scanner getScanner() throws FileNotFoundException {
        if (READ_FILE) {
            return new Scanner(new FileInputStream(new File("inputs/circular-array-rotation.txt")));
        }
        return new Scanner(System.in);
    }

    static int getValueAfterRotation(int[] arr, int rot, int idx) {
        return arr[(arr.length + (idx - rot % arr.length)) % arr.length];
    }
}
