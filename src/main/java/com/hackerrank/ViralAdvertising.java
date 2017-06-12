package com.hackerrank;

import java.util.Scanner;

public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(calculate(n));
    }

    static int calculate(int n) {
        int people = 5;
        int result = 2;
        for (int i = 1; i < n; i++) {
            people = people / 2 * 3;
            result += people / 2;
        }
        return result;
    }
}
