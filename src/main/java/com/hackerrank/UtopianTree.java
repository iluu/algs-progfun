package com.hackerrank;

import java.util.Scanner;

public class UtopianTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(calculateTreeHeight(sc.nextInt()));
        }
    }

    private static int calculateTreeHeight(int cycles) {
        int result = 1;
        for (int i = 0; i < cycles; i++) {
            if (i % 2 == 1) {
                result += 1;
            } else {
                result *= 2;
            }
        }
        return result;
    }
}
