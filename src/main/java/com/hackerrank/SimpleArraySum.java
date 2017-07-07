package com.hackerrank;

import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        int result = 0;
        for (int i = 0; i < len; i++) {
            result += in.nextInt();
        }
        System.out.println(result);
    }
}
