package com.hackerrank;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        int m = in.nextInt();
        Map<Integer, Integer> all = new TreeMap<>();
        for (int i = 0; i < m; i++) {

            final Integer num = in.nextInt();
            if (!all.containsKey(num)) {
                all.put(num, 0);
            }
            all.put(num, all.get(num) + 1);
        }

        Set<Integer> result = missingNumbers(arr1, all);
        for (int num : result) {
            System.out.println(num + " ");
        }
    }

    private static Set<Integer> missingNumbers(int[] in, Map<Integer, Integer> all) {
        for (int val : in) {
            if (all.get(val) == 1) {
                all.remove(val);
            } else {
                all.put(val, all.get(val) - 1);
            }
        }
        return all.keySet();
    }
}
