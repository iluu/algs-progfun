package com.hackerearth.algorithms.graphs.representation;

import java.util.Scanner;

public class MonkAtTheGraphFactory {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += in.nextInt();
        }

        if (sum == 2 * (n - 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
