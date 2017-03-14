package com.hackerrank;

import java.util.Scanner;

public class FindTheMinimumNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String result = "min(int, int)";
        final String before = "min(int, ";
        final String after = ")";
        while (n > 2) {
            result = before + result + after;
            n--;
        }

        System.out.println(result);
    }
}
