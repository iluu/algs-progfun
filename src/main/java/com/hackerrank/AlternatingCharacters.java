package com.hackerrank;

import java.util.Scanner;

public class AlternatingCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            System.out.println(deletions(in.next()));
        }
    }

    private static int deletions(String line) {
        int d = 0;
        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i - 1) == (line.charAt(i))) {
                d++;
            }
        }
        return d;
    }
}
