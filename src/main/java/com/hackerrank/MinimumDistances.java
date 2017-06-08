package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int A_i = 0; A_i < n; A_i++) {
            a[A_i] = in.nextInt();
        }
        System.out.println(minimumDistance(a));
    }

    static int minimumDistance(int[] arr) {
        Map<Integer, Integer> entries = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (!entries.containsKey(arr[i])) {
                entries.put(arr[i], i);
            } else {
                int dist = i - (entries.get(arr[i]));
                if (min > dist) {
                    min = dist;
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
