package com.hackerrank;

import java.util.Scanner;

public class InsertionSortPart2 {

    private static void insertionSortPart2(int[] ar) {
        for (int i = 0; i < ar.length - 1; i++) {
            int number = ar[i + 1];
            int j = i;
            while (j >= 0 && number < ar[j]) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = number;
            printArray(ar);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertionSortPart2(ar);

    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

}
