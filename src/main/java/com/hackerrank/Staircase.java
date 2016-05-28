package com.hackerrank;

import java.util.Scanner;

public class Staircase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stairs = scanner.nextInt();

        for (int i = 1; i < stairs + 1; i++) {
            System.out.println(new char[33]);
            String empty = new String(new char[stairs - i]).replace("\0", " ");
            String stair = new String(new char[i]).replace("\0", "#");
            System.out.println(empty + stair);
        }
    }
}
