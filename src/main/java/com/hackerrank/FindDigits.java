package com.hackerrank;

import java.util.Scanner;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            int number = in.nextInt();
            System.out.println(divisibleDigits(number));
        }
    }

    private static int divisibleDigits(int no) {
        int iter = no;
        int result = 0;
        while (iter > 0) {
            int digit = iter % 10;
            if (digit != 0 && no % digit == 0) {
                result++;
            }
            iter = iter / 10;
        }
        return result;
    }
}
