package com.hackerrank;

import java.util.Scanner;

public class IceCreamParlor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[] prices = new int[n];
            for (int j = 0; j < n; j++) {
                prices[j] = in.nextInt();
            }
            int[] res = find(prices, m);
            System.out.println(res[0] + " " + res[1]);
        }
    }

    private static int[] find(int[] prices, int m) {
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] + prices[j] == m) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
