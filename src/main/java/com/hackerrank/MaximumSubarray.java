package com.hackerrank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumSubarray {

    public static void main(String[] args) throws FileNotFoundException {

        fromFile();
        //System.out.println(findAnswer(new long[]{1, -1, -1, -1, -1, 5}));
    }

    private static void fromFile() throws FileNotFoundException {
        File f = new File("maximum-subarray.txt");
        System.out.println(f.getAbsolutePath());


        Scanner in = new Scanner(new FileInputStream(f));
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            int size = in.nextInt();
            long arr[] = new long[size];
            for (int j = 0; j < size; j++) {
                arr[j] = in.nextLong();
            }

            System.out.println(findAnswer(arr));
        }
    }

    static String findAnswer(long[] a) {
        long current = a[0];
        long maxCont = a[0];
        long max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > 0) {
                max += a[i];
            }

            current = Math.max(a[i], current + a[i]);
            maxCont = current > maxCont ? current : maxCont;
            max = a[i] > max ? a[i] : max;

        }
        return maxCont + " " + max;
    }
}
