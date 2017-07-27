package com.hackerrank;

import java.util.Scanner;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            System.out.println(findLargestDecentNumber(in.nextInt()));
        }
    }

    static String findLargestDecentNumber(int digits) {
        for (int i = digits / 3; i >= 0; i--) {
            if ((digits - 3 * i) % 5 == 0) {
                String result = new String(new char[3 * i]).replace("\0", "5");
                result += new String(new char[digits - 3 * i]).replace("\0", "3");
                return result;
            }
        }
        return "-1";
    }
}
