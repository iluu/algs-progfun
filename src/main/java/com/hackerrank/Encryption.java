package com.hackerrank;

import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        System.out.println(encrypt(s));
    }

    static String encrypt(String line) {
        String s = line.replaceAll(" ", "");
        double len = s.length();
        int row = (int) Math.floor(Math.sqrt(len));
        int col = (int) Math.ceil(Math.sqrt(len));
        if (row * col < s.length()){
            row = col;
        }

        char[][] arr = new char[row][col];

        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (k < s.length()) {
                    arr[i][j] = s.charAt(k);
                    k++;
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                if (arr[i][j] != '\0') {
                    result.append(arr[i][j]);
                }
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

}
