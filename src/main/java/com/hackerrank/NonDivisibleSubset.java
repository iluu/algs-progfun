package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonDivisibleSubset {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.println(findMaxSubset(a, k));

    }

    static int findMaxSubset(int[] a, int k) {
        List<Integer> subset = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % k != 0) {
                subset.add(a[i]);
            }
            if (subset.size() > 0 && divisible(subset, k)) {
                List<Integer> alter = new ArrayList<>();
                alter.addAll(subset);
                alter.remove(i - 1);

                if (!divisible(alter, k)) {
                    subset = alter;
                } else {
                    subset.remove((Integer) a[i]);
                }
            }

        }
        return subset.size();
    }

    private static boolean divisible(List<Integer> arr, int k) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if ((arr.get(i) + arr.get(j)) % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
