package com.hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> socks = new HashSet<>();

        int n = in.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            Integer value = in.nextInt();
            if (socks.contains(value)) {
                socks.remove(value);
                result++;
            } else {
                socks.add(value);
            }
        }
        System.out.println(result);
    }
}
