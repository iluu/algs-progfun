package com.hackerrank;

import java.util.Scanner;

import static java.lang.Math.abs;

public class FunnyString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(isFunny(sc.next()) ? "Funny" : "Not Funny");
        }
    }

    private static boolean isFunny(String line) {
        for (int i = 1; i < line.length(); i++) {
            if (abs(line.charAt(i) - line.charAt(i - 1)) !=
                    abs(line.charAt(line.length() - i) - line.charAt(line.length() - (i + 1)))) {
                return false;
            }
        }
        return true;
    }
}
