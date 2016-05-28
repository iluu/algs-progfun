package com.hackerrank;

import java.util.Scanner;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(countPairs(a, k));
    }

    static int countPairs(int[] arr, int k) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % k == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
