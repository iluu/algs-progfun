package com.hackerrank;

import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int idx = 0;
        int result = 1;
        while (idx < s.length()) {
            if (s.charAt(idx++) < 97) {
                result++;
            }
        }
        System.out.println(result);
    }
}
