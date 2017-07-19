package com.hackerrank;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        for (int i = 0; i < cases; i++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            print(calculateLastStone(n, a > b ? a : b, a > b ? b : a));
        }
    }

    static Set<Integer> calculateLastStone(int n, int a, int b) {
        Set<Integer> result = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            result.add(i * a + (n - i - 1) * b);
        }
        return result;
    }

    private static void print(Set<Integer> arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
