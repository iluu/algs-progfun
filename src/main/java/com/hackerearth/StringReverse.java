package com.hackerearth;

import java.util.Scanner;

public class StringReverse {

    public static void main(String args[]) throws Exception {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            System.out.println(revert(in.next()));
        }
    }

    private static String revert(String line) {
        StringBuilder sb = new StringBuilder();
        for (int i = line.length() - 1; i >= 0; i--) {
            sb.append(line.charAt(i));
        }
        return sb.toString();
    }
}
