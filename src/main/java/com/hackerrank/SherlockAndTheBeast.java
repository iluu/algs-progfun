package com.hackerrank;

import java.util.Scanner;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();
        for (int i = 0; i < cases; i++) {
            System.out.println(findLargestDecentNumber(scanner.nextInt()));
        }
    }

    static String findLargestDecentNumber(int input) {
        int temp = input;
        String result = "";
        while (temp > 0) {
            if (temp / 3 > 0) {
                int d = (temp / 3) * 3;
                result += new String(new char[d]).replace("\0", "5");
                temp = temp - d;
            } else if (temp / 5 > 0) {
                int d = (temp / 5) * 5;
                result += new String(new char[d]).replace("\0", "3");
                temp = temp - d;
            } else {
                return "-1";
            }
        }
        return result;
    }
}
